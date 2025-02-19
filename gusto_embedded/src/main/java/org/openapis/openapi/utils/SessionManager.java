/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.utils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.openapis.openapi.models.errors.AuthException;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class SessionManager<T extends SessionManager.HasSessionKey> {

    // VisibleForTesting
    public static final int REFRESH_BEFORE_EXPIRY_SECONDS = 60;
    
    private final Map<String, Session<T>> sessions = new HashMap<>();

    public interface HasSessionKey {
        String sessionKey();
    }

    public final static class Session<T> {
        private final T credentials;
        private final Optional<String> token;
        private final List<String> scopes;
        private final Optional<OffsetDateTime> expiresAt;

        public Session(T credentials, Optional<String> token, List<String> scopes, Optional<OffsetDateTime> expiresAt) {
            this.credentials = credentials;
            this.token = token;
            this.scopes = scopes;
            this.expiresAt = expiresAt;
        }

        public T credentials() {
            return credentials;
        }

        public Optional<String> token() {
            return token;
        }

        public List<String> scopes() {
            return scopes;
        }

        public Optional<OffsetDateTime> expiresAt() {
            return expiresAt;
        }

    }

    public Session<T> getSession(T credentials, Optional<List<String>> scopes, Function<List<String>, Session<T>> tokenProvider ) {
        final String sessionKey = credentials.sessionKey();

        Optional<Session<T>> currentSession = Optional.ofNullable(sessions.get(sessionKey));
        final Session<T> session;
        if (shouldCreateNewSession(currentSession, scopes)) {
            // note that we accumulate scopes. For example if a session existed
            // for scope 'read' and this request requires scope 'write' then we
            // request a new token for `read, write`.

            // TODO it may be better to rather make `sessions` a Map<String, List<Session>>
            // where the none of the Session scope lists fully contains another in the same
            // map value.
            // This would ensure that an operation is always called with a token with the
            // minimum
            // permissions required and also would ensure that a token request is not
            // rejected
            // because of disallowed scope combinations (yet to see that in the wild).
            // For the example above with `read` and `write` scoped requests we would get a
            // token
            // for `read` scope, and then get a token for `write` scope and store both
            // tokens in separate
            // Session objects in the map value list for the credential pair.

            List<String> accumulatedScopes = accumulateScopes(scopes, currentSession);
            session = tokenProvider.apply(accumulatedScopes);
            sessions.put(sessionKey, session);
        } else {
            session = currentSession.get();
        }
        return session;
    }
    
    // VisibleForTesting
    public static <T extends HasSessionKey> boolean shouldCreateNewSession(Optional<Session<T>> currentSession, Optional<List<String>> oauthScopes) {
        return !currentSession.isPresent() //
                || !hasRequiredScopes(currentSession.get().scopes, oauthScopes) //
                || hasTokenExpired(currentSession.get().expiresAt, OffsetDateTime.now());
    }

    
    private static < T extends HasSessionKey> List<String> accumulateScopes(Optional<List<String>> requiredScopes, Optional<Session<T>> session) {
        if (session.isPresent()) {
            List<String> scopes = new ArrayList<>(requiredScopes.orElse(Collections.emptyList()));
            scopes.addAll(session.get().scopes);
            return scopes.stream() //
                    .distinct() //
                    .collect(Collectors.toList());
        } else {
            return requiredScopes.orElse(Collections.emptyList());
        }
    }

    // VisibleForTesting
    public static boolean hasTokenExpired(Optional<OffsetDateTime> expiresAt, OffsetDateTime now) {
        return expiresAt.isEmpty() //
                || now.plusSeconds(REFRESH_BEFORE_EXPIRY_SECONDS).isAfter(expiresAt.get());
    }

    // VisibleForTesting
    public static boolean hasRequiredScopes(List<String> sessionScopes, Optional<List<String>> requiredScopes) {
        return sessionScopes.containsAll(requiredScopes.orElse(Collections.emptyList()));
    }

    public void remove(String sessionKey) {
        sessions.remove(sessionKey);
    }
    
    public static <T extends HasSessionKey> Session<T> requestOAuth2Token(HTTPClient client, T credentials, List<String> scopes,
            Map<String, String> payload, URI tokenUri) {
        try {
            HttpRequest request = HttpRequest //
                    .newBuilder(tokenUri) //
                    .header("Content-Type", "application/x-www-form-urlencoded") //
                    .POST(RequestBody.serializeFormData(payload).body()) //
                    .build();
            HttpResponse<InputStream> response = client.send(request);
            if (response.statusCode() != HttpURLConnection.HTTP_OK) {
                String responseBody = Utils.toUtf8AndClose(response.body());
                throw new AuthException(response.statusCode(),
                        "Unexpected status code " + response.statusCode() + ": " + responseBody);
            }
            TokenResponse t = Utils.mapper().readValue(response.body(), TokenResponse.class);
            if (!t.tokenType.orElse("").equals("Bearer")) {
                throw new AuthException("Expected 'Bearer' token type but was '" + t.tokenType.orElse("") + "'");
            }
            final Optional<OffsetDateTime> expiresAt = t.expiresInMs
                    .map(x -> OffsetDateTime.now().plus(x, ChronoUnit.MILLIS));
            return new Session<T>(credentials, t.accessToken, scopes, expiresAt);
        } catch (IOException | IllegalArgumentException | IllegalAccessException | InterruptedException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    
    final static class TokenResponse {

        @JsonProperty("access_token")
        Optional<String> accessToken;

        @JsonProperty("token_type")
        Optional<String> tokenType;

        @JsonProperty("expires_in")
        Optional<Long> expiresInMs;

    }

}
