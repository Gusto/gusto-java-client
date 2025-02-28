/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.FederalTaxDetails;
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

public class PutV1CompaniesCompanyIdFederalTaxDetailsResponse implements Response {

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
    private Optional<? extends FederalTaxDetails> federalTaxDetails;

    @JsonCreator
    public PutV1CompaniesCompanyIdFederalTaxDetailsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends FederalTaxDetails> federalTaxDetails) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(federalTaxDetails, "federalTaxDetails");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.federalTaxDetails = federalTaxDetails;
    }
    
    public PutV1CompaniesCompanyIdFederalTaxDetailsResponse(
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
    public Optional<FederalTaxDetails> federalTaxDetails() {
        return (Optional<FederalTaxDetails>) federalTaxDetails;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public PutV1CompaniesCompanyIdFederalTaxDetailsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PutV1CompaniesCompanyIdFederalTaxDetailsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PutV1CompaniesCompanyIdFederalTaxDetailsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public PutV1CompaniesCompanyIdFederalTaxDetailsResponse withFederalTaxDetails(FederalTaxDetails federalTaxDetails) {
        Utils.checkNotNull(federalTaxDetails, "federalTaxDetails");
        this.federalTaxDetails = Optional.ofNullable(federalTaxDetails);
        return this;
    }

    /**
     * Example response
     */
    public PutV1CompaniesCompanyIdFederalTaxDetailsResponse withFederalTaxDetails(Optional<? extends FederalTaxDetails> federalTaxDetails) {
        Utils.checkNotNull(federalTaxDetails, "federalTaxDetails");
        this.federalTaxDetails = federalTaxDetails;
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
        PutV1CompaniesCompanyIdFederalTaxDetailsResponse other = (PutV1CompaniesCompanyIdFederalTaxDetailsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.federalTaxDetails, other.federalTaxDetails);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            federalTaxDetails);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1CompaniesCompanyIdFederalTaxDetailsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "federalTaxDetails", federalTaxDetails);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends FederalTaxDetails> federalTaxDetails = Optional.empty();  
        
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
        public Builder federalTaxDetails(FederalTaxDetails federalTaxDetails) {
            Utils.checkNotNull(federalTaxDetails, "federalTaxDetails");
            this.federalTaxDetails = Optional.ofNullable(federalTaxDetails);
            return this;
        }

        /**
         * Example response
         */
        public Builder federalTaxDetails(Optional<? extends FederalTaxDetails> federalTaxDetails) {
            Utils.checkNotNull(federalTaxDetails, "federalTaxDetails");
            this.federalTaxDetails = federalTaxDetails;
            return this;
        }
        
        public PutV1CompaniesCompanyIdFederalTaxDetailsResponse build() {
            return new PutV1CompaniesCompanyIdFederalTaxDetailsResponse(
                contentType,
                statusCode,
                rawResponse,
                federalTaxDetails);
        }
    }
}

