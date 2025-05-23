/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.ContractorPaymentGroup;
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

public class GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse implements Response {

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
     * Full contractor payment group object
     */
    private Optional<? extends ContractorPaymentGroup> contractorPaymentGroup;

    @JsonCreator
    public GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ContractorPaymentGroup> contractorPaymentGroup) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(contractorPaymentGroup, "contractorPaymentGroup");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.contractorPaymentGroup = contractorPaymentGroup;
    }
    
    public GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse(
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
     * Full contractor payment group object
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ContractorPaymentGroup> contractorPaymentGroup() {
        return (Optional<ContractorPaymentGroup>) contractorPaymentGroup;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Full contractor payment group object
     */
    public GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse withContractorPaymentGroup(ContractorPaymentGroup contractorPaymentGroup) {
        Utils.checkNotNull(contractorPaymentGroup, "contractorPaymentGroup");
        this.contractorPaymentGroup = Optional.ofNullable(contractorPaymentGroup);
        return this;
    }

    /**
     * Full contractor payment group object
     */
    public GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse withContractorPaymentGroup(Optional<? extends ContractorPaymentGroup> contractorPaymentGroup) {
        Utils.checkNotNull(contractorPaymentGroup, "contractorPaymentGroup");
        this.contractorPaymentGroup = contractorPaymentGroup;
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
        GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse other = (GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.contractorPaymentGroup, other.contractorPaymentGroup);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            contractorPaymentGroup);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "contractorPaymentGroup", contractorPaymentGroup);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ContractorPaymentGroup> contractorPaymentGroup = Optional.empty();  
        
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
         * Full contractor payment group object
         */
        public Builder contractorPaymentGroup(ContractorPaymentGroup contractorPaymentGroup) {
            Utils.checkNotNull(contractorPaymentGroup, "contractorPaymentGroup");
            this.contractorPaymentGroup = Optional.ofNullable(contractorPaymentGroup);
            return this;
        }

        /**
         * Full contractor payment group object
         */
        public Builder contractorPaymentGroup(Optional<? extends ContractorPaymentGroup> contractorPaymentGroup) {
            Utils.checkNotNull(contractorPaymentGroup, "contractorPaymentGroup");
            this.contractorPaymentGroup = contractorPaymentGroup;
            return this;
        }
        
        public GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse build() {
            return new GetV1ContractorPaymentGroupsContractorPaymentGroupIdResponse(
                contentType,
                statusCode,
                rawResponse,
                contractorPaymentGroup);
        }
    }
}

