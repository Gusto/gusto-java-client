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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class DeleteV1CompaniesCompanyIdPayrollsRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_id")
    private String companyId;

    /**
     * The UUID of the payroll
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=payroll_id")
    private String payrollId;

    /**
     * When true, request an asynchronous delete of the payroll.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=async")
    private Optional<Boolean> async;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public DeleteV1CompaniesCompanyIdPayrollsRequest(
            String companyId,
            String payrollId,
            Optional<Boolean> async,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(payrollId, "payrollId");
        Utils.checkNotNull(async, "async");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.companyId = companyId;
        this.payrollId = payrollId;
        this.async = async;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public DeleteV1CompaniesCompanyIdPayrollsRequest(
            String companyId,
            String payrollId) {
        this(companyId, payrollId, Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * The UUID of the payroll
     */
    @JsonIgnore
    public String payrollId() {
        return payrollId;
    }

    /**
     * When true, request an asynchronous delete of the payroll.
     */
    @JsonIgnore
    public Optional<Boolean> async() {
        return async;
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
     * The UUID of the company
     */
    public DeleteV1CompaniesCompanyIdPayrollsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The UUID of the payroll
     */
    public DeleteV1CompaniesCompanyIdPayrollsRequest withPayrollId(String payrollId) {
        Utils.checkNotNull(payrollId, "payrollId");
        this.payrollId = payrollId;
        return this;
    }

    /**
     * When true, request an asynchronous delete of the payroll.
     */
    public DeleteV1CompaniesCompanyIdPayrollsRequest withAsync(boolean async) {
        Utils.checkNotNull(async, "async");
        this.async = Optional.ofNullable(async);
        return this;
    }

    /**
     * When true, request an asynchronous delete of the payroll.
     */
    public DeleteV1CompaniesCompanyIdPayrollsRequest withAsync(Optional<Boolean> async) {
        Utils.checkNotNull(async, "async");
        this.async = async;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public DeleteV1CompaniesCompanyIdPayrollsRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public DeleteV1CompaniesCompanyIdPayrollsRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        DeleteV1CompaniesCompanyIdPayrollsRequest other = (DeleteV1CompaniesCompanyIdPayrollsRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.payrollId, other.payrollId) &&
            Objects.deepEquals(this.async, other.async) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            payrollId,
            async,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeleteV1CompaniesCompanyIdPayrollsRequest.class,
                "companyId", companyId,
                "payrollId", payrollId,
                "async", async,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String payrollId;
 
        private Optional<Boolean> async = Optional.empty();
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the company
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * The UUID of the payroll
         */
        public Builder payrollId(String payrollId) {
            Utils.checkNotNull(payrollId, "payrollId");
            this.payrollId = payrollId;
            return this;
        }

        /**
         * When true, request an asynchronous delete of the payroll.
         */
        public Builder async(boolean async) {
            Utils.checkNotNull(async, "async");
            this.async = Optional.ofNullable(async);
            return this;
        }

        /**
         * When true, request an asynchronous delete of the payroll.
         */
        public Builder async(Optional<Boolean> async) {
            Utils.checkNotNull(async, "async");
            this.async = async;
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
        
        public DeleteV1CompaniesCompanyIdPayrollsRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new DeleteV1CompaniesCompanyIdPayrollsRequest(
                companyId,
                payrollId,
                async,
                xGustoAPIVersion);
        }

        private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
                new LazySingletonValue<>(
                        "X-Gusto-API-Version",
                        "\"2024-04-01\"",
                        new TypeReference<Optional<? extends VersionHeader>>() {});
    }
}

