/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.Compensation;
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

public class PostV1CompensationsCompensationIdResponse implements Response {

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
    private Optional<? extends Compensation> compensation;

    @JsonCreator
    public PostV1CompensationsCompensationIdResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends Compensation> compensation) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(compensation, "compensation");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.compensation = compensation;
    }
    
    public PostV1CompensationsCompensationIdResponse(
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
    public Optional<Compensation> compensation() {
        return (Optional<Compensation>) compensation;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public PostV1CompensationsCompensationIdResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PostV1CompensationsCompensationIdResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PostV1CompensationsCompensationIdResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public PostV1CompensationsCompensationIdResponse withCompensation(Compensation compensation) {
        Utils.checkNotNull(compensation, "compensation");
        this.compensation = Optional.ofNullable(compensation);
        return this;
    }

    /**
     * Example response
     */
    public PostV1CompensationsCompensationIdResponse withCompensation(Optional<? extends Compensation> compensation) {
        Utils.checkNotNull(compensation, "compensation");
        this.compensation = compensation;
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
        PostV1CompensationsCompensationIdResponse other = (PostV1CompensationsCompensationIdResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.compensation, other.compensation);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            compensation);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1CompensationsCompensationIdResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "compensation", compensation);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends Compensation> compensation = Optional.empty();  
        
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
        public Builder compensation(Compensation compensation) {
            Utils.checkNotNull(compensation, "compensation");
            this.compensation = Optional.ofNullable(compensation);
            return this;
        }

        /**
         * Example response
         */
        public Builder compensation(Optional<? extends Compensation> compensation) {
            Utils.checkNotNull(compensation, "compensation");
            this.compensation = compensation;
            return this;
        }
        
        public PostV1CompensationsCompensationIdResponse build() {
            return new PostV1CompensationsCompensationIdResponse(
                contentType,
                statusCode,
                rawResponse,
                compensation);
        }
    }
}

