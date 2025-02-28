/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class GetV1ContractorFormPdfRequest {

    /**
     * The UUID of the contractor
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=contractor_uuid")
    private String contractorUuid;

    /**
     * The UUID of the form
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=form_id")
    private String formId;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetV1ContractorFormPdfRequest(
            String contractorUuid,
            String formId,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        Utils.checkNotNull(formId, "formId");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.contractorUuid = contractorUuid;
        this.formId = formId;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1ContractorFormPdfRequest(
            String contractorUuid,
            String formId) {
        this(contractorUuid, formId, Optional.empty());
    }

    /**
     * The UUID of the contractor
     */
    @JsonIgnore
    public String contractorUuid() {
        return contractorUuid;
    }

    /**
     * The UUID of the form
     */
    @JsonIgnore
    public String formId() {
        return formId;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VersionHeader> xGustoAPIVersion() {
        return (Optional<VersionHeader>) xGustoAPIVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the contractor
     */
    public GetV1ContractorFormPdfRequest withContractorUuid(String contractorUuid) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        this.contractorUuid = contractorUuid;
        return this;
    }

    /**
     * The UUID of the form
     */
    public GetV1ContractorFormPdfRequest withFormId(String formId) {
        Utils.checkNotNull(formId, "formId");
        this.formId = formId;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1ContractorFormPdfRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1ContractorFormPdfRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
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
        GetV1ContractorFormPdfRequest other = (GetV1ContractorFormPdfRequest) o;
        return 
            Objects.deepEquals(this.contractorUuid, other.contractorUuid) &&
            Objects.deepEquals(this.formId, other.formId) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contractorUuid,
            formId,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1ContractorFormPdfRequest.class,
                "contractorUuid", contractorUuid,
                "formId", formId,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String contractorUuid;
 
        private String formId;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the contractor
         */
        public Builder contractorUuid(String contractorUuid) {
            Utils.checkNotNull(contractorUuid, "contractorUuid");
            this.contractorUuid = contractorUuid;
            return this;
        }

        /**
         * The UUID of the form
         */
        public Builder formId(String formId) {
            Utils.checkNotNull(formId, "formId");
            this.formId = formId;
            return this;
        }

        /**
         * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
         */
        public Builder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
            Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
            this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
            return this;
        }

        /**
         * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
         */
        public Builder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
            Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
            this.xGustoAPIVersion = xGustoAPIVersion;
            return this;
        }
        
        public GetV1ContractorFormPdfRequest build() {
            return new GetV1ContractorFormPdfRequest(
                contractorUuid,
                formId,
                xGustoAPIVersion);
        }
    }
}

