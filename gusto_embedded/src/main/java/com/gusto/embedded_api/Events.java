/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.Event;
import com.gusto.embedded_api.models.errors.APIException;
import com.gusto.embedded_api.models.operations.GetEventsRequest;
import com.gusto.embedded_api.models.operations.GetEventsRequestBuilder;
import com.gusto.embedded_api.models.operations.GetEventsResponse;
import com.gusto.embedded_api.models.operations.GetEventsSecurity;
import com.gusto.embedded_api.models.operations.SDKMethodInterfaces.*;
import com.gusto.embedded_api.utils.HTTPClient;
import com.gusto.embedded_api.utils.HTTPRequest;
import com.gusto.embedded_api.utils.Hook.AfterErrorContextImpl;
import com.gusto.embedded_api.utils.Hook.AfterSuccessContextImpl;
import com.gusto.embedded_api.utils.Hook.BeforeRequestContextImpl;
import com.gusto.embedded_api.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class Events implements
            MethodCallGetEvents {

    private final SDKConfiguration sdkConfiguration;

    Events(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get all events
     * 
     * <p>Fetch all events, going back up to 30 days, that your partner application has the required scopes for. Note that a partner does NOT have to have verified webhook subscriptions in order to utilize this endpoint.
     * 
     * <p>&gt; 📘 System Access Authentication
     * &gt;
     * &gt; This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access).
     * 
     * <p>scope: `events:read`
     * 
     * @return The call builder
     */
    public GetEventsRequestBuilder get() {
        return new GetEventsRequestBuilder(this);
    }

    /**
     * Get all events
     * 
     * <p>Fetch all events, going back up to 30 days, that your partner application has the required scopes for. Note that a partner does NOT have to have verified webhook subscriptions in order to utilize this endpoint.
     * 
     * <p>&gt; 📘 System Access Authentication
     * &gt;
     * &gt; This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access).
     * 
     * <p>scope: `events:read`
     * 
     * @param request The request object containing all of the parameters for the API call.
     * @param security The security details to use for authentication.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetEventsResponse get(
            GetEventsRequest request,
            GetEventsSecurity security) throws Exception {
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/events");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetEventsRequest.class,
                request, 
                null));
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));

        // hooks will be passed method level security only
        Optional<SecuritySource> _hookSecuritySource = Optional.of(SecuritySource.of(security));
        Utils.configureSecurity(_req, security);
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      _baseUrl,
                      "get-events", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "get-events",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "get-events",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "get-events",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetEventsResponse.Builder _resBuilder = 
            GetEventsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetEventsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<Event> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<Event>>() {});
                _res.withEventList(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
