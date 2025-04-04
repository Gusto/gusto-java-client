/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.Signatory;
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

public class PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse implements Response {

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
    private Optional<? extends Signatory> signatory;

    @JsonCreator
    public PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends Signatory> signatory) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(signatory, "signatory");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.signatory = signatory;
    }
    
    public PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse(
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
    public Optional<Signatory> signatory() {
        return (Optional<Signatory>) signatory;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse withSignatory(Signatory signatory) {
        Utils.checkNotNull(signatory, "signatory");
        this.signatory = Optional.ofNullable(signatory);
        return this;
    }

    /**
     * Example response
     */
    public PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse withSignatory(Optional<? extends Signatory> signatory) {
        Utils.checkNotNull(signatory, "signatory");
        this.signatory = signatory;
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
        PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse other = (PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.signatory, other.signatory);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            signatory);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "signatory", signatory);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends Signatory> signatory = Optional.empty();  
        
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
        public Builder signatory(Signatory signatory) {
            Utils.checkNotNull(signatory, "signatory");
            this.signatory = Optional.ofNullable(signatory);
            return this;
        }

        /**
         * Example response
         */
        public Builder signatory(Optional<? extends Signatory> signatory) {
            Utils.checkNotNull(signatory, "signatory");
            this.signatory = signatory;
            return this;
        }
        
        public PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse build() {
            return new PutV1CompaniesCompanyUuidSignatoriesSignatoryUuidResponse(
                contentType,
                statusCode,
                rawResponse,
                signatory);
        }
    }
}

