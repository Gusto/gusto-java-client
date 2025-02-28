/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * EmployeeFederalTax - Example response
 */

public class EmployeeFederalTax {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

    /**
     * It determines which tax return form an individual will use and is an important factor in computing taxable income. One of:
     * - Single
     * - Married
     * - Head of Household
     * - Exempt from withholding
     * - Married, but withhold as Single (does not apply to rev_2020_w4 form)
     */
    @JsonProperty("filing_status")
    private String filingStatus;

    /**
     * An employee can request an additional amount to be withheld from each paycheck.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("extra_withholding")
    private Optional<String> extraWithholding;

    /**
     * If there are only two jobs (i.e., you and your spouse each have a job, or you have two), you can set it to true.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("two_jobs")
    private Optional<Boolean> twoJobs;

    /**
     * A dependent is a person other than the taxpayer or spouse who entitles the taxpayer to claim a dependency exemption.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("dependents_amount")
    private Optional<String> dependentsAmount;

    /**
     * Other income amount.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("other_income")
    private Optional<String> otherIncome;

    /**
     * Deductions other than the standard deduction to reduce withholding.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("deductions")
    private Optional<String> deductions;

    /**
     * The version of w4 form.
     */
    @JsonProperty("w4_data_type")
    private W4DataType w4DataType;

    /**
     * *does not apply to rev_2020_w4 form*
     * 
     * An exemption from paying a certain amount of income tax.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("federal_withholding_allowance")
    private Optional<Double> federalWithholdingAllowance;

    /**
     * *does not apply to rev_2020_w4 form*
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additional_withholding")
    private Optional<Boolean> additionalWithholding;

    @JsonCreator
    public EmployeeFederalTax(
            @JsonProperty("version") String version,
            @JsonProperty("filing_status") String filingStatus,
            @JsonProperty("extra_withholding") Optional<String> extraWithholding,
            @JsonProperty("two_jobs") Optional<Boolean> twoJobs,
            @JsonProperty("dependents_amount") Optional<String> dependentsAmount,
            @JsonProperty("other_income") Optional<String> otherIncome,
            @JsonProperty("deductions") Optional<String> deductions,
            @JsonProperty("w4_data_type") W4DataType w4DataType,
            @JsonProperty("federal_withholding_allowance") Optional<Double> federalWithholdingAllowance,
            @JsonProperty("additional_withholding") Optional<Boolean> additionalWithholding) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(filingStatus, "filingStatus");
        Utils.checkNotNull(extraWithholding, "extraWithholding");
        Utils.checkNotNull(twoJobs, "twoJobs");
        Utils.checkNotNull(dependentsAmount, "dependentsAmount");
        Utils.checkNotNull(otherIncome, "otherIncome");
        Utils.checkNotNull(deductions, "deductions");
        Utils.checkNotNull(w4DataType, "w4DataType");
        Utils.checkNotNull(federalWithholdingAllowance, "federalWithholdingAllowance");
        Utils.checkNotNull(additionalWithholding, "additionalWithholding");
        this.version = version;
        this.filingStatus = filingStatus;
        this.extraWithholding = extraWithholding;
        this.twoJobs = twoJobs;
        this.dependentsAmount = dependentsAmount;
        this.otherIncome = otherIncome;
        this.deductions = deductions;
        this.w4DataType = w4DataType;
        this.federalWithholdingAllowance = federalWithholdingAllowance;
        this.additionalWithholding = additionalWithholding;
    }
    
    public EmployeeFederalTax(
            String version,
            String filingStatus,
            W4DataType w4DataType) {
        this(version, filingStatus, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), w4DataType, Optional.empty(), Optional.empty());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
    }

    /**
     * It determines which tax return form an individual will use and is an important factor in computing taxable income. One of:
     * - Single
     * - Married
     * - Head of Household
     * - Exempt from withholding
     * - Married, but withhold as Single (does not apply to rev_2020_w4 form)
     */
    @JsonIgnore
    public String filingStatus() {
        return filingStatus;
    }

    /**
     * An employee can request an additional amount to be withheld from each paycheck.
     */
    @JsonIgnore
    public Optional<String> extraWithholding() {
        return extraWithholding;
    }

    /**
     * If there are only two jobs (i.e., you and your spouse each have a job, or you have two), you can set it to true.
     */
    @JsonIgnore
    public Optional<Boolean> twoJobs() {
        return twoJobs;
    }

    /**
     * A dependent is a person other than the taxpayer or spouse who entitles the taxpayer to claim a dependency exemption.
     */
    @JsonIgnore
    public Optional<String> dependentsAmount() {
        return dependentsAmount;
    }

    /**
     * Other income amount.
     */
    @JsonIgnore
    public Optional<String> otherIncome() {
        return otherIncome;
    }

    /**
     * Deductions other than the standard deduction to reduce withholding.
     */
    @JsonIgnore
    public Optional<String> deductions() {
        return deductions;
    }

    /**
     * The version of w4 form.
     */
    @JsonIgnore
    public W4DataType w4DataType() {
        return w4DataType;
    }

    /**
     * *does not apply to rev_2020_w4 form*
     * 
     * An exemption from paying a certain amount of income tax.
     */
    @JsonIgnore
    public Optional<Double> federalWithholdingAllowance() {
        return federalWithholdingAllowance;
    }

    /**
     * *does not apply to rev_2020_w4 form*
     */
    @JsonIgnore
    public Optional<Boolean> additionalWithholding() {
        return additionalWithholding;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public EmployeeFederalTax withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * It determines which tax return form an individual will use and is an important factor in computing taxable income. One of:
     * - Single
     * - Married
     * - Head of Household
     * - Exempt from withholding
     * - Married, but withhold as Single (does not apply to rev_2020_w4 form)
     */
    public EmployeeFederalTax withFilingStatus(String filingStatus) {
        Utils.checkNotNull(filingStatus, "filingStatus");
        this.filingStatus = filingStatus;
        return this;
    }

    /**
     * An employee can request an additional amount to be withheld from each paycheck.
     */
    public EmployeeFederalTax withExtraWithholding(String extraWithholding) {
        Utils.checkNotNull(extraWithholding, "extraWithholding");
        this.extraWithholding = Optional.ofNullable(extraWithholding);
        return this;
    }

    /**
     * An employee can request an additional amount to be withheld from each paycheck.
     */
    public EmployeeFederalTax withExtraWithholding(Optional<String> extraWithholding) {
        Utils.checkNotNull(extraWithholding, "extraWithholding");
        this.extraWithholding = extraWithholding;
        return this;
    }

    /**
     * If there are only two jobs (i.e., you and your spouse each have a job, or you have two), you can set it to true.
     */
    public EmployeeFederalTax withTwoJobs(boolean twoJobs) {
        Utils.checkNotNull(twoJobs, "twoJobs");
        this.twoJobs = Optional.ofNullable(twoJobs);
        return this;
    }

    /**
     * If there are only two jobs (i.e., you and your spouse each have a job, or you have two), you can set it to true.
     */
    public EmployeeFederalTax withTwoJobs(Optional<Boolean> twoJobs) {
        Utils.checkNotNull(twoJobs, "twoJobs");
        this.twoJobs = twoJobs;
        return this;
    }

    /**
     * A dependent is a person other than the taxpayer or spouse who entitles the taxpayer to claim a dependency exemption.
     */
    public EmployeeFederalTax withDependentsAmount(String dependentsAmount) {
        Utils.checkNotNull(dependentsAmount, "dependentsAmount");
        this.dependentsAmount = Optional.ofNullable(dependentsAmount);
        return this;
    }

    /**
     * A dependent is a person other than the taxpayer or spouse who entitles the taxpayer to claim a dependency exemption.
     */
    public EmployeeFederalTax withDependentsAmount(Optional<String> dependentsAmount) {
        Utils.checkNotNull(dependentsAmount, "dependentsAmount");
        this.dependentsAmount = dependentsAmount;
        return this;
    }

    /**
     * Other income amount.
     */
    public EmployeeFederalTax withOtherIncome(String otherIncome) {
        Utils.checkNotNull(otherIncome, "otherIncome");
        this.otherIncome = Optional.ofNullable(otherIncome);
        return this;
    }

    /**
     * Other income amount.
     */
    public EmployeeFederalTax withOtherIncome(Optional<String> otherIncome) {
        Utils.checkNotNull(otherIncome, "otherIncome");
        this.otherIncome = otherIncome;
        return this;
    }

    /**
     * Deductions other than the standard deduction to reduce withholding.
     */
    public EmployeeFederalTax withDeductions(String deductions) {
        Utils.checkNotNull(deductions, "deductions");
        this.deductions = Optional.ofNullable(deductions);
        return this;
    }

    /**
     * Deductions other than the standard deduction to reduce withholding.
     */
    public EmployeeFederalTax withDeductions(Optional<String> deductions) {
        Utils.checkNotNull(deductions, "deductions");
        this.deductions = deductions;
        return this;
    }

    /**
     * The version of w4 form.
     */
    public EmployeeFederalTax withW4DataType(W4DataType w4DataType) {
        Utils.checkNotNull(w4DataType, "w4DataType");
        this.w4DataType = w4DataType;
        return this;
    }

    /**
     * *does not apply to rev_2020_w4 form*
     * 
     * An exemption from paying a certain amount of income tax.
     */
    public EmployeeFederalTax withFederalWithholdingAllowance(double federalWithholdingAllowance) {
        Utils.checkNotNull(federalWithholdingAllowance, "federalWithholdingAllowance");
        this.federalWithholdingAllowance = Optional.ofNullable(federalWithholdingAllowance);
        return this;
    }

    /**
     * *does not apply to rev_2020_w4 form*
     * 
     * An exemption from paying a certain amount of income tax.
     */
    public EmployeeFederalTax withFederalWithholdingAllowance(Optional<Double> federalWithholdingAllowance) {
        Utils.checkNotNull(federalWithholdingAllowance, "federalWithholdingAllowance");
        this.federalWithholdingAllowance = federalWithholdingAllowance;
        return this;
    }

    /**
     * *does not apply to rev_2020_w4 form*
     */
    public EmployeeFederalTax withAdditionalWithholding(boolean additionalWithholding) {
        Utils.checkNotNull(additionalWithholding, "additionalWithholding");
        this.additionalWithholding = Optional.ofNullable(additionalWithholding);
        return this;
    }

    /**
     * *does not apply to rev_2020_w4 form*
     */
    public EmployeeFederalTax withAdditionalWithholding(Optional<Boolean> additionalWithholding) {
        Utils.checkNotNull(additionalWithholding, "additionalWithholding");
        this.additionalWithholding = additionalWithholding;
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
        EmployeeFederalTax other = (EmployeeFederalTax) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.filingStatus, other.filingStatus) &&
            Objects.deepEquals(this.extraWithholding, other.extraWithholding) &&
            Objects.deepEquals(this.twoJobs, other.twoJobs) &&
            Objects.deepEquals(this.dependentsAmount, other.dependentsAmount) &&
            Objects.deepEquals(this.otherIncome, other.otherIncome) &&
            Objects.deepEquals(this.deductions, other.deductions) &&
            Objects.deepEquals(this.w4DataType, other.w4DataType) &&
            Objects.deepEquals(this.federalWithholdingAllowance, other.federalWithholdingAllowance) &&
            Objects.deepEquals(this.additionalWithholding, other.additionalWithholding);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            version,
            filingStatus,
            extraWithholding,
            twoJobs,
            dependentsAmount,
            otherIncome,
            deductions,
            w4DataType,
            federalWithholdingAllowance,
            additionalWithholding);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmployeeFederalTax.class,
                "version", version,
                "filingStatus", filingStatus,
                "extraWithholding", extraWithholding,
                "twoJobs", twoJobs,
                "dependentsAmount", dependentsAmount,
                "otherIncome", otherIncome,
                "deductions", deductions,
                "w4DataType", w4DataType,
                "federalWithholdingAllowance", federalWithholdingAllowance,
                "additionalWithholding", additionalWithholding);
    }
    
    public final static class Builder {
 
        private String version;
 
        private String filingStatus;
 
        private Optional<String> extraWithholding = Optional.empty();
 
        private Optional<Boolean> twoJobs = Optional.empty();
 
        private Optional<String> dependentsAmount = Optional.empty();
 
        private Optional<String> otherIncome = Optional.empty();
 
        private Optional<String> deductions = Optional.empty();
 
        private W4DataType w4DataType;
 
        private Optional<Double> federalWithholdingAllowance = Optional.empty();
 
        private Optional<Boolean> additionalWithholding = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        /**
         * It determines which tax return form an individual will use and is an important factor in computing taxable income. One of:
         * - Single
         * - Married
         * - Head of Household
         * - Exempt from withholding
         * - Married, but withhold as Single (does not apply to rev_2020_w4 form)
         */
        public Builder filingStatus(String filingStatus) {
            Utils.checkNotNull(filingStatus, "filingStatus");
            this.filingStatus = filingStatus;
            return this;
        }

        /**
         * An employee can request an additional amount to be withheld from each paycheck.
         */
        public Builder extraWithholding(String extraWithholding) {
            Utils.checkNotNull(extraWithholding, "extraWithholding");
            this.extraWithholding = Optional.ofNullable(extraWithholding);
            return this;
        }

        /**
         * An employee can request an additional amount to be withheld from each paycheck.
         */
        public Builder extraWithholding(Optional<String> extraWithholding) {
            Utils.checkNotNull(extraWithholding, "extraWithholding");
            this.extraWithholding = extraWithholding;
            return this;
        }

        /**
         * If there are only two jobs (i.e., you and your spouse each have a job, or you have two), you can set it to true.
         */
        public Builder twoJobs(boolean twoJobs) {
            Utils.checkNotNull(twoJobs, "twoJobs");
            this.twoJobs = Optional.ofNullable(twoJobs);
            return this;
        }

        /**
         * If there are only two jobs (i.e., you and your spouse each have a job, or you have two), you can set it to true.
         */
        public Builder twoJobs(Optional<Boolean> twoJobs) {
            Utils.checkNotNull(twoJobs, "twoJobs");
            this.twoJobs = twoJobs;
            return this;
        }

        /**
         * A dependent is a person other than the taxpayer or spouse who entitles the taxpayer to claim a dependency exemption.
         */
        public Builder dependentsAmount(String dependentsAmount) {
            Utils.checkNotNull(dependentsAmount, "dependentsAmount");
            this.dependentsAmount = Optional.ofNullable(dependentsAmount);
            return this;
        }

        /**
         * A dependent is a person other than the taxpayer or spouse who entitles the taxpayer to claim a dependency exemption.
         */
        public Builder dependentsAmount(Optional<String> dependentsAmount) {
            Utils.checkNotNull(dependentsAmount, "dependentsAmount");
            this.dependentsAmount = dependentsAmount;
            return this;
        }

        /**
         * Other income amount.
         */
        public Builder otherIncome(String otherIncome) {
            Utils.checkNotNull(otherIncome, "otherIncome");
            this.otherIncome = Optional.ofNullable(otherIncome);
            return this;
        }

        /**
         * Other income amount.
         */
        public Builder otherIncome(Optional<String> otherIncome) {
            Utils.checkNotNull(otherIncome, "otherIncome");
            this.otherIncome = otherIncome;
            return this;
        }

        /**
         * Deductions other than the standard deduction to reduce withholding.
         */
        public Builder deductions(String deductions) {
            Utils.checkNotNull(deductions, "deductions");
            this.deductions = Optional.ofNullable(deductions);
            return this;
        }

        /**
         * Deductions other than the standard deduction to reduce withholding.
         */
        public Builder deductions(Optional<String> deductions) {
            Utils.checkNotNull(deductions, "deductions");
            this.deductions = deductions;
            return this;
        }

        /**
         * The version of w4 form.
         */
        public Builder w4DataType(W4DataType w4DataType) {
            Utils.checkNotNull(w4DataType, "w4DataType");
            this.w4DataType = w4DataType;
            return this;
        }

        /**
         * *does not apply to rev_2020_w4 form*
         * 
         * An exemption from paying a certain amount of income tax.
         */
        public Builder federalWithholdingAllowance(double federalWithholdingAllowance) {
            Utils.checkNotNull(federalWithholdingAllowance, "federalWithholdingAllowance");
            this.federalWithholdingAllowance = Optional.ofNullable(federalWithholdingAllowance);
            return this;
        }

        /**
         * *does not apply to rev_2020_w4 form*
         * 
         * An exemption from paying a certain amount of income tax.
         */
        public Builder federalWithholdingAllowance(Optional<Double> federalWithholdingAllowance) {
            Utils.checkNotNull(federalWithholdingAllowance, "federalWithholdingAllowance");
            this.federalWithholdingAllowance = federalWithholdingAllowance;
            return this;
        }

        /**
         * *does not apply to rev_2020_w4 form*
         */
        public Builder additionalWithholding(boolean additionalWithholding) {
            Utils.checkNotNull(additionalWithholding, "additionalWithholding");
            this.additionalWithholding = Optional.ofNullable(additionalWithholding);
            return this;
        }

        /**
         * *does not apply to rev_2020_w4 form*
         */
        public Builder additionalWithholding(Optional<Boolean> additionalWithholding) {
            Utils.checkNotNull(additionalWithholding, "additionalWithholding");
            this.additionalWithholding = additionalWithholding;
            return this;
        }
        
        public EmployeeFederalTax build() {
            return new EmployeeFederalTax(
                version,
                filingStatus,
                extraWithholding,
                twoJobs,
                dependentsAmount,
                otherIncome,
                deductions,
                w4DataType,
                federalWithholdingAllowance,
                additionalWithholding);
        }
    }
}

