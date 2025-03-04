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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest {

    /**
     * The UUID of the employee
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=employee_id")
    private String employeeId;

    /**
     * The tax year for which to retrieve YTD benefit amounts. Defaults to current year if not specified.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tax_year")
    private Optional<Long> taxYear;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest(
            String employeeId,
            Optional<Long> taxYear,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(employeeId, "employeeId");
        Utils.checkNotNull(taxYear, "taxYear");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.employeeId = employeeId;
        this.taxYear = taxYear;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest(
            String employeeId) {
        this(employeeId, Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the employee
     */
    @JsonIgnore
    public String employeeId() {
        return employeeId;
    }

    /**
     * The tax year for which to retrieve YTD benefit amounts. Defaults to current year if not specified.
     */
    @JsonIgnore
    public Optional<Long> taxYear() {
        return taxYear;
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
     * The UUID of the employee
     */
    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest withEmployeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }

    /**
     * The tax year for which to retrieve YTD benefit amounts. Defaults to current year if not specified.
     */
    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest withTaxYear(long taxYear) {
        Utils.checkNotNull(taxYear, "taxYear");
        this.taxYear = Optional.ofNullable(taxYear);
        return this;
    }

    /**
     * The tax year for which to retrieve YTD benefit amounts. Defaults to current year if not specified.
     */
    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest withTaxYear(Optional<Long> taxYear) {
        Utils.checkNotNull(taxYear, "taxYear");
        this.taxYear = taxYear;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest other = (GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest) o;
        return 
            Objects.deepEquals(this.employeeId, other.employeeId) &&
            Objects.deepEquals(this.taxYear, other.taxYear) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employeeId,
            taxYear,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest.class,
                "employeeId", employeeId,
                "taxYear", taxYear,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String employeeId;
 
        private Optional<Long> taxYear = Optional.empty();
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the employee
         */
        public Builder employeeId(String employeeId) {
            Utils.checkNotNull(employeeId, "employeeId");
            this.employeeId = employeeId;
            return this;
        }

        /**
         * The tax year for which to retrieve YTD benefit amounts. Defaults to current year if not specified.
         */
        public Builder taxYear(long taxYear) {
            Utils.checkNotNull(taxYear, "taxYear");
            this.taxYear = Optional.ofNullable(taxYear);
            return this;
        }

        /**
         * The tax year for which to retrieve YTD benefit amounts. Defaults to current year if not specified.
         */
        public Builder taxYear(Optional<Long> taxYear) {
            Utils.checkNotNull(taxYear, "taxYear");
            this.taxYear = taxYear;
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
        
        public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequest(
                employeeId,
                taxYear,
                xGustoAPIVersion);
        }

        private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
                new LazySingletonValue<>(
                        "X-Gusto-API-Version",
                        "\"2024-04-01\"",
                        new TypeReference<Optional<? extends VersionHeader>>() {});
    }
}

