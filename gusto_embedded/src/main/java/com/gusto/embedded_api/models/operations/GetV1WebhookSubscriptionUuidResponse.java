/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.WebhookSubscription;
import com.gusto.embedded_api.utils.Response;
import com.gusto.embedded_api.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class GetV1WebhookSubscriptionUuidResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Example response
     */
    private Optional<? extends WebhookSubscription> webhookSubscription;

    @JsonCreator
    public GetV1WebhookSubscriptionUuidResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends WebhookSubscription> webhookSubscription) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(webhookSubscription, "webhookSubscription");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.webhookSubscription = webhookSubscription;
    }
    
    public GetV1WebhookSubscriptionUuidResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Example response
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<WebhookSubscription> webhookSubscription() {
        return (Optional<WebhookSubscription>) webhookSubscription;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetV1WebhookSubscriptionUuidResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetV1WebhookSubscriptionUuidResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetV1WebhookSubscriptionUuidResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public GetV1WebhookSubscriptionUuidResponse withWebhookSubscription(WebhookSubscription webhookSubscription) {
        Utils.checkNotNull(webhookSubscription, "webhookSubscription");
        this.webhookSubscription = Optional.ofNullable(webhookSubscription);
        return this;
    }

    /**
     * Example response
     */
    public GetV1WebhookSubscriptionUuidResponse withWebhookSubscription(Optional<? extends WebhookSubscription> webhookSubscription) {
        Utils.checkNotNull(webhookSubscription, "webhookSubscription");
        this.webhookSubscription = webhookSubscription;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetV1WebhookSubscriptionUuidResponse other = (GetV1WebhookSubscriptionUuidResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.webhookSubscription, other.webhookSubscription);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            webhookSubscription);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1WebhookSubscriptionUuidResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "webhookSubscription", webhookSubscription);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends WebhookSubscription> webhookSubscription = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Example response
         */
        public Builder webhookSubscription(WebhookSubscription webhookSubscription) {
            Utils.checkNotNull(webhookSubscription, "webhookSubscription");
            this.webhookSubscription = Optional.ofNullable(webhookSubscription);
            return this;
        }

        /**
         * Example response
         */
        public Builder webhookSubscription(Optional<? extends WebhookSubscription> webhookSubscription) {
            Utils.checkNotNull(webhookSubscription, "webhookSubscription");
            this.webhookSubscription = webhookSubscription;
            return this;
        }
        
        public GetV1WebhookSubscriptionUuidResponse build() {
            return new GetV1WebhookSubscriptionUuidResponse(
                contentType,
                statusCode,
                rawResponse,
                webhookSubscription);
        }
    }
}

