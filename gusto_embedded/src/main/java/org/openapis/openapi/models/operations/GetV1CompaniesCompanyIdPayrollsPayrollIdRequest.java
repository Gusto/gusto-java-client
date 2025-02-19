/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class GetV1CompaniesCompanyIdPayrollsPayrollIdRequest {

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
     * Include the requested attribute in the response, for multiple attributes comma separate the values, i.e. `?include=benefits,deductions,taxes`
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<GetV1CompaniesCompanyIdPayrollsPayrollIdQueryParamInclude>> include;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetV1CompaniesCompanyIdPayrollsPayrollIdRequest(
            String companyId,
            String payrollId,
            Optional<? extends List<GetV1CompaniesCompanyIdPayrollsPayrollIdQueryParamInclude>> include,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(payrollId, "payrollId");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.companyId = companyId;
        this.payrollId = payrollId;
        this.include = include;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1CompaniesCompanyIdPayrollsPayrollIdRequest(
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
     * Include the requested attribute in the response, for multiple attributes comma separate the values, i.e. `?include=benefits,deductions,taxes`
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<GetV1CompaniesCompanyIdPayrollsPayrollIdQueryParamInclude>> include() {
        return (Optional<List<GetV1CompaniesCompanyIdPayrollsPayrollIdQueryParamInclude>>) include;
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
    public GetV1CompaniesCompanyIdPayrollsPayrollIdRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The UUID of the payroll
     */
    public GetV1CompaniesCompanyIdPayrollsPayrollIdRequest withPayrollId(String payrollId) {
        Utils.checkNotNull(payrollId, "payrollId");
        this.payrollId = payrollId;
        return this;
    }

    /**
     * Include the requested attribute in the response, for multiple attributes comma separate the values, i.e. `?include=benefits,deductions,taxes`
     */
    public GetV1CompaniesCompanyIdPayrollsPayrollIdRequest withInclude(List<GetV1CompaniesCompanyIdPayrollsPayrollIdQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * Include the requested attribute in the response, for multiple attributes comma separate the values, i.e. `?include=benefits,deductions,taxes`
     */
    public GetV1CompaniesCompanyIdPayrollsPayrollIdRequest withInclude(Optional<? extends List<GetV1CompaniesCompanyIdPayrollsPayrollIdQueryParamInclude>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdPayrollsPayrollIdRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdPayrollsPayrollIdRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetV1CompaniesCompanyIdPayrollsPayrollIdRequest other = (GetV1CompaniesCompanyIdPayrollsPayrollIdRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.payrollId, other.payrollId) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            payrollId,
            include,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1CompaniesCompanyIdPayrollsPayrollIdRequest.class,
                "companyId", companyId,
                "payrollId", payrollId,
                "include", include,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String payrollId;
 
        private Optional<? extends List<GetV1CompaniesCompanyIdPayrollsPayrollIdQueryParamInclude>> include = Optional.empty();
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();  
        
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
         * Include the requested attribute in the response, for multiple attributes comma separate the values, i.e. `?include=benefits,deductions,taxes`
         */
        public Builder include(List<GetV1CompaniesCompanyIdPayrollsPayrollIdQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * Include the requested attribute in the response, for multiple attributes comma separate the values, i.e. `?include=benefits,deductions,taxes`
         */
        public Builder include(Optional<? extends List<GetV1CompaniesCompanyIdPayrollsPayrollIdQueryParamInclude>> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
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
        
        public GetV1CompaniesCompanyIdPayrollsPayrollIdRequest build() {
            return new GetV1CompaniesCompanyIdPayrollsPayrollIdRequest(
                companyId,
                payrollId,
                include,
                xGustoAPIVersion);
        }
    }
}

