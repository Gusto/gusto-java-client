/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.SupportedBenefit;
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

public class GetV1BenefitsBenefitIdResponse implements Response {

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
     * Supported benefit response
     */
    private Optional<? extends SupportedBenefit> supportedBenefit;

    @JsonCreator
    public GetV1BenefitsBenefitIdResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends SupportedBenefit> supportedBenefit) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(supportedBenefit, "supportedBenefit");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.supportedBenefit = supportedBenefit;
    }
    
    public GetV1BenefitsBenefitIdResponse(
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
     * Supported benefit response
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<SupportedBenefit> supportedBenefit() {
        return (Optional<SupportedBenefit>) supportedBenefit;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetV1BenefitsBenefitIdResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetV1BenefitsBenefitIdResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetV1BenefitsBenefitIdResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Supported benefit response
     */
    public GetV1BenefitsBenefitIdResponse withSupportedBenefit(SupportedBenefit supportedBenefit) {
        Utils.checkNotNull(supportedBenefit, "supportedBenefit");
        this.supportedBenefit = Optional.ofNullable(supportedBenefit);
        return this;
    }

    /**
     * Supported benefit response
     */
    public GetV1BenefitsBenefitIdResponse withSupportedBenefit(Optional<? extends SupportedBenefit> supportedBenefit) {
        Utils.checkNotNull(supportedBenefit, "supportedBenefit");
        this.supportedBenefit = supportedBenefit;
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
        GetV1BenefitsBenefitIdResponse other = (GetV1BenefitsBenefitIdResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.supportedBenefit, other.supportedBenefit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            supportedBenefit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1BenefitsBenefitIdResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "supportedBenefit", supportedBenefit);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends SupportedBenefit> supportedBenefit = Optional.empty();  
        
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
         * Supported benefit response
         */
        public Builder supportedBenefit(SupportedBenefit supportedBenefit) {
            Utils.checkNotNull(supportedBenefit, "supportedBenefit");
            this.supportedBenefit = Optional.ofNullable(supportedBenefit);
            return this;
        }

        /**
         * Supported benefit response
         */
        public Builder supportedBenefit(Optional<? extends SupportedBenefit> supportedBenefit) {
            Utils.checkNotNull(supportedBenefit, "supportedBenefit");
            this.supportedBenefit = supportedBenefit;
            return this;
        }
        
        public GetV1BenefitsBenefitIdResponse build() {
            return new GetV1BenefitsBenefitIdResponse(
                contentType,
                statusCode,
                rawResponse,
                supportedBenefit);
        }
    }
}

