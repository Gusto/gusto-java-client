/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.BenefitTypeRequirements;
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

public class GetV1BenefitsBenefitsIdRequirementsResponse implements Response {

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
     * Benefit type requirements response
     */
    private Optional<? extends BenefitTypeRequirements> benefitTypeRequirements;

    @JsonCreator
    public GetV1BenefitsBenefitsIdRequirementsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends BenefitTypeRequirements> benefitTypeRequirements) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(benefitTypeRequirements, "benefitTypeRequirements");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.benefitTypeRequirements = benefitTypeRequirements;
    }
    
    public GetV1BenefitsBenefitsIdRequirementsResponse(
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
     * Benefit type requirements response
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BenefitTypeRequirements> benefitTypeRequirements() {
        return (Optional<BenefitTypeRequirements>) benefitTypeRequirements;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetV1BenefitsBenefitsIdRequirementsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetV1BenefitsBenefitsIdRequirementsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetV1BenefitsBenefitsIdRequirementsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Benefit type requirements response
     */
    public GetV1BenefitsBenefitsIdRequirementsResponse withBenefitTypeRequirements(BenefitTypeRequirements benefitTypeRequirements) {
        Utils.checkNotNull(benefitTypeRequirements, "benefitTypeRequirements");
        this.benefitTypeRequirements = Optional.ofNullable(benefitTypeRequirements);
        return this;
    }

    /**
     * Benefit type requirements response
     */
    public GetV1BenefitsBenefitsIdRequirementsResponse withBenefitTypeRequirements(Optional<? extends BenefitTypeRequirements> benefitTypeRequirements) {
        Utils.checkNotNull(benefitTypeRequirements, "benefitTypeRequirements");
        this.benefitTypeRequirements = benefitTypeRequirements;
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
        GetV1BenefitsBenefitsIdRequirementsResponse other = (GetV1BenefitsBenefitsIdRequirementsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.benefitTypeRequirements, other.benefitTypeRequirements);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            benefitTypeRequirements);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1BenefitsBenefitsIdRequirementsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "benefitTypeRequirements", benefitTypeRequirements);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends BenefitTypeRequirements> benefitTypeRequirements = Optional.empty();  
        
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
         * Benefit type requirements response
         */
        public Builder benefitTypeRequirements(BenefitTypeRequirements benefitTypeRequirements) {
            Utils.checkNotNull(benefitTypeRequirements, "benefitTypeRequirements");
            this.benefitTypeRequirements = Optional.ofNullable(benefitTypeRequirements);
            return this;
        }

        /**
         * Benefit type requirements response
         */
        public Builder benefitTypeRequirements(Optional<? extends BenefitTypeRequirements> benefitTypeRequirements) {
            Utils.checkNotNull(benefitTypeRequirements, "benefitTypeRequirements");
            this.benefitTypeRequirements = benefitTypeRequirements;
            return this;
        }
        
        public GetV1BenefitsBenefitsIdRequirementsResponse build() {
            return new GetV1BenefitsBenefitsIdRequirementsResponse(
                contentType,
                statusCode,
                rawResponse,
                benefitTypeRequirements);
        }
    }
}

