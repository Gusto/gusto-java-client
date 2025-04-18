/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class GetV1ContractorsContractorUuidRequest {

    /**
     * The UUID of the contractor
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=contractor_uuid")
    private String contractorUuid;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetV1ContractorsContractorUuidRequest(
            String contractorUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.contractorUuid = contractorUuid;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1ContractorsContractorUuidRequest(
            String contractorUuid) {
        this(contractorUuid, Optional.empty());
    }

    /**
     * The UUID of the contractor
     */
    @JsonIgnore
    public String contractorUuid() {
        return contractorUuid;
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
    public GetV1ContractorsContractorUuidRequest withContractorUuid(String contractorUuid) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        this.contractorUuid = contractorUuid;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1ContractorsContractorUuidRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1ContractorsContractorUuidRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetV1ContractorsContractorUuidRequest other = (GetV1ContractorsContractorUuidRequest) o;
        return 
            Objects.deepEquals(this.contractorUuid, other.contractorUuid) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contractorUuid,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1ContractorsContractorUuidRequest.class,
                "contractorUuid", contractorUuid,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String contractorUuid;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;  
        
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
        
        public GetV1ContractorsContractorUuidRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new GetV1ContractorsContractorUuidRequest(
                contractorUuid,
                xGustoAPIVersion);
        }

        private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
                new LazySingletonValue<>(
                        "X-Gusto-API-Version",
                        "\"2024-04-01\"",
                        new TypeReference<Optional<? extends VersionHeader>>() {});
    }
}

