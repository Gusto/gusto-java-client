/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PutV1CompaniesCompanyIdPayrollsRequestBody {

    @JsonProperty("employee_compensations")
    private List<EmployeeCompensations> employeeCompensations;

    /**
     * The payment schedule tax rate the payroll is based on. Only relevant for off-cycle payrolls.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("withholding_pay_period")
    private Optional<? extends PutV1CompaniesCompanyIdPayrollsWithholdingPayPeriod> withholdingPayPeriod;

    /**
     * Block regular deductions and contributions for this payroll. Only relevant for off-cycle payrolls.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skip_regular_deductions")
    private Optional<Boolean> skipRegularDeductions;

    /**
     * Enable taxes to be withheld at the IRS's required rate of 22% for federal income taxes. State income taxes will be taxed at the state's supplemental tax rate. Otherwise, we'll sum the entirety of the employee's wages and withhold taxes on the entire amount at the rate for regular wages. Only relevant for off-cycle payrolls.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fixed_withholding_rate")
    private Optional<Boolean> fixedWithholdingRate;

    @JsonCreator
    public PutV1CompaniesCompanyIdPayrollsRequestBody(
            @JsonProperty("employee_compensations") List<EmployeeCompensations> employeeCompensations,
            @JsonProperty("withholding_pay_period") Optional<? extends PutV1CompaniesCompanyIdPayrollsWithholdingPayPeriod> withholdingPayPeriod,
            @JsonProperty("skip_regular_deductions") Optional<Boolean> skipRegularDeductions,
            @JsonProperty("fixed_withholding_rate") Optional<Boolean> fixedWithholdingRate) {
        Utils.checkNotNull(employeeCompensations, "employeeCompensations");
        Utils.checkNotNull(withholdingPayPeriod, "withholdingPayPeriod");
        Utils.checkNotNull(skipRegularDeductions, "skipRegularDeductions");
        Utils.checkNotNull(fixedWithholdingRate, "fixedWithholdingRate");
        this.employeeCompensations = employeeCompensations;
        this.withholdingPayPeriod = withholdingPayPeriod;
        this.skipRegularDeductions = skipRegularDeductions;
        this.fixedWithholdingRate = fixedWithholdingRate;
    }
    
    public PutV1CompaniesCompanyIdPayrollsRequestBody(
            List<EmployeeCompensations> employeeCompensations) {
        this(employeeCompensations, Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public List<EmployeeCompensations> employeeCompensations() {
        return employeeCompensations;
    }

    /**
     * The payment schedule tax rate the payroll is based on. Only relevant for off-cycle payrolls.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PutV1CompaniesCompanyIdPayrollsWithholdingPayPeriod> withholdingPayPeriod() {
        return (Optional<PutV1CompaniesCompanyIdPayrollsWithholdingPayPeriod>) withholdingPayPeriod;
    }

    /**
     * Block regular deductions and contributions for this payroll. Only relevant for off-cycle payrolls.
     */
    @JsonIgnore
    public Optional<Boolean> skipRegularDeductions() {
        return skipRegularDeductions;
    }

    /**
     * Enable taxes to be withheld at the IRS's required rate of 22% for federal income taxes. State income taxes will be taxed at the state's supplemental tax rate. Otherwise, we'll sum the entirety of the employee's wages and withhold taxes on the entire amount at the rate for regular wages. Only relevant for off-cycle payrolls.
     */
    @JsonIgnore
    public Optional<Boolean> fixedWithholdingRate() {
        return fixedWithholdingRate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PutV1CompaniesCompanyIdPayrollsRequestBody withEmployeeCompensations(List<EmployeeCompensations> employeeCompensations) {
        Utils.checkNotNull(employeeCompensations, "employeeCompensations");
        this.employeeCompensations = employeeCompensations;
        return this;
    }

    /**
     * The payment schedule tax rate the payroll is based on. Only relevant for off-cycle payrolls.
     */
    public PutV1CompaniesCompanyIdPayrollsRequestBody withWithholdingPayPeriod(PutV1CompaniesCompanyIdPayrollsWithholdingPayPeriod withholdingPayPeriod) {
        Utils.checkNotNull(withholdingPayPeriod, "withholdingPayPeriod");
        this.withholdingPayPeriod = Optional.ofNullable(withholdingPayPeriod);
        return this;
    }

    /**
     * The payment schedule tax rate the payroll is based on. Only relevant for off-cycle payrolls.
     */
    public PutV1CompaniesCompanyIdPayrollsRequestBody withWithholdingPayPeriod(Optional<? extends PutV1CompaniesCompanyIdPayrollsWithholdingPayPeriod> withholdingPayPeriod) {
        Utils.checkNotNull(withholdingPayPeriod, "withholdingPayPeriod");
        this.withholdingPayPeriod = withholdingPayPeriod;
        return this;
    }

    /**
     * Block regular deductions and contributions for this payroll. Only relevant for off-cycle payrolls.
     */
    public PutV1CompaniesCompanyIdPayrollsRequestBody withSkipRegularDeductions(boolean skipRegularDeductions) {
        Utils.checkNotNull(skipRegularDeductions, "skipRegularDeductions");
        this.skipRegularDeductions = Optional.ofNullable(skipRegularDeductions);
        return this;
    }

    /**
     * Block regular deductions and contributions for this payroll. Only relevant for off-cycle payrolls.
     */
    public PutV1CompaniesCompanyIdPayrollsRequestBody withSkipRegularDeductions(Optional<Boolean> skipRegularDeductions) {
        Utils.checkNotNull(skipRegularDeductions, "skipRegularDeductions");
        this.skipRegularDeductions = skipRegularDeductions;
        return this;
    }

    /**
     * Enable taxes to be withheld at the IRS's required rate of 22% for federal income taxes. State income taxes will be taxed at the state's supplemental tax rate. Otherwise, we'll sum the entirety of the employee's wages and withhold taxes on the entire amount at the rate for regular wages. Only relevant for off-cycle payrolls.
     */
    public PutV1CompaniesCompanyIdPayrollsRequestBody withFixedWithholdingRate(boolean fixedWithholdingRate) {
        Utils.checkNotNull(fixedWithholdingRate, "fixedWithholdingRate");
        this.fixedWithholdingRate = Optional.ofNullable(fixedWithholdingRate);
        return this;
    }

    /**
     * Enable taxes to be withheld at the IRS's required rate of 22% for federal income taxes. State income taxes will be taxed at the state's supplemental tax rate. Otherwise, we'll sum the entirety of the employee's wages and withhold taxes on the entire amount at the rate for regular wages. Only relevant for off-cycle payrolls.
     */
    public PutV1CompaniesCompanyIdPayrollsRequestBody withFixedWithholdingRate(Optional<Boolean> fixedWithholdingRate) {
        Utils.checkNotNull(fixedWithholdingRate, "fixedWithholdingRate");
        this.fixedWithholdingRate = fixedWithholdingRate;
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
        PutV1CompaniesCompanyIdPayrollsRequestBody other = (PutV1CompaniesCompanyIdPayrollsRequestBody) o;
        return 
            Objects.deepEquals(this.employeeCompensations, other.employeeCompensations) &&
            Objects.deepEquals(this.withholdingPayPeriod, other.withholdingPayPeriod) &&
            Objects.deepEquals(this.skipRegularDeductions, other.skipRegularDeductions) &&
            Objects.deepEquals(this.fixedWithholdingRate, other.fixedWithholdingRate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employeeCompensations,
            withholdingPayPeriod,
            skipRegularDeductions,
            fixedWithholdingRate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1CompaniesCompanyIdPayrollsRequestBody.class,
                "employeeCompensations", employeeCompensations,
                "withholdingPayPeriod", withholdingPayPeriod,
                "skipRegularDeductions", skipRegularDeductions,
                "fixedWithholdingRate", fixedWithholdingRate);
    }
    
    public final static class Builder {
 
        private List<EmployeeCompensations> employeeCompensations;
 
        private Optional<? extends PutV1CompaniesCompanyIdPayrollsWithholdingPayPeriod> withholdingPayPeriod = Optional.empty();
 
        private Optional<Boolean> skipRegularDeductions = Optional.empty();
 
        private Optional<Boolean> fixedWithholdingRate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder employeeCompensations(List<EmployeeCompensations> employeeCompensations) {
            Utils.checkNotNull(employeeCompensations, "employeeCompensations");
            this.employeeCompensations = employeeCompensations;
            return this;
        }

        /**
         * The payment schedule tax rate the payroll is based on. Only relevant for off-cycle payrolls.
         */
        public Builder withholdingPayPeriod(PutV1CompaniesCompanyIdPayrollsWithholdingPayPeriod withholdingPayPeriod) {
            Utils.checkNotNull(withholdingPayPeriod, "withholdingPayPeriod");
            this.withholdingPayPeriod = Optional.ofNullable(withholdingPayPeriod);
            return this;
        }

        /**
         * The payment schedule tax rate the payroll is based on. Only relevant for off-cycle payrolls.
         */
        public Builder withholdingPayPeriod(Optional<? extends PutV1CompaniesCompanyIdPayrollsWithholdingPayPeriod> withholdingPayPeriod) {
            Utils.checkNotNull(withholdingPayPeriod, "withholdingPayPeriod");
            this.withholdingPayPeriod = withholdingPayPeriod;
            return this;
        }

        /**
         * Block regular deductions and contributions for this payroll. Only relevant for off-cycle payrolls.
         */
        public Builder skipRegularDeductions(boolean skipRegularDeductions) {
            Utils.checkNotNull(skipRegularDeductions, "skipRegularDeductions");
            this.skipRegularDeductions = Optional.ofNullable(skipRegularDeductions);
            return this;
        }

        /**
         * Block regular deductions and contributions for this payroll. Only relevant for off-cycle payrolls.
         */
        public Builder skipRegularDeductions(Optional<Boolean> skipRegularDeductions) {
            Utils.checkNotNull(skipRegularDeductions, "skipRegularDeductions");
            this.skipRegularDeductions = skipRegularDeductions;
            return this;
        }

        /**
         * Enable taxes to be withheld at the IRS's required rate of 22% for federal income taxes. State income taxes will be taxed at the state's supplemental tax rate. Otherwise, we'll sum the entirety of the employee's wages and withhold taxes on the entire amount at the rate for regular wages. Only relevant for off-cycle payrolls.
         */
        public Builder fixedWithholdingRate(boolean fixedWithholdingRate) {
            Utils.checkNotNull(fixedWithholdingRate, "fixedWithholdingRate");
            this.fixedWithholdingRate = Optional.ofNullable(fixedWithholdingRate);
            return this;
        }

        /**
         * Enable taxes to be withheld at the IRS's required rate of 22% for federal income taxes. State income taxes will be taxed at the state's supplemental tax rate. Otherwise, we'll sum the entirety of the employee's wages and withhold taxes on the entire amount at the rate for regular wages. Only relevant for off-cycle payrolls.
         */
        public Builder fixedWithholdingRate(Optional<Boolean> fixedWithholdingRate) {
            Utils.checkNotNull(fixedWithholdingRate, "fixedWithholdingRate");
            this.fixedWithholdingRate = fixedWithholdingRate;
            return this;
        }
        
        public PutV1CompaniesCompanyIdPayrollsRequestBody build() {
            return new PutV1CompaniesCompanyIdPayrollsRequestBody(
                employeeCompensations,
                withholdingPayPeriod,
                skipRegularDeductions,
                fixedWithholdingRate);
        }
    }
}

