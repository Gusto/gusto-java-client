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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
/**
 * CompanyBenefitWithEmployeeBenefitsContribution
 * 
 * <p>An object representing the type and value of the company contribution.
 */

public class CompanyBenefitWithEmployeeBenefitsContribution {

    /**
     * The company contribution scheme.
     * 
     * <p>"amount": The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>"percentage": The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>"tiered": The company contribution varies according to the size of the employee deduction.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    /**
     * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
     * 
     * <p>For the `tiered` contribution type, an array of tiers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<? extends CompanyBenefitWithEmployeeBenefitsValue> value;

    @JsonCreator
    public CompanyBenefitWithEmployeeBenefitsContribution(
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("value") Optional<? extends CompanyBenefitWithEmployeeBenefitsValue> value) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(value, "value");
        this.type = type;
        this.value = value;
    }
    
    public CompanyBenefitWithEmployeeBenefitsContribution() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The company contribution scheme.
     * 
     * <p>"amount": The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>"percentage": The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>"tiered": The company contribution varies according to the size of the employee deduction.
     */
    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    /**
     * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
     * 
     * <p>For the `tiered` contribution type, an array of tiers.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CompanyBenefitWithEmployeeBenefitsValue> value() {
        return (Optional<CompanyBenefitWithEmployeeBenefitsValue>) value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The company contribution scheme.
     * 
     * <p>"amount": The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>"percentage": The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>"tiered": The company contribution varies according to the size of the employee deduction.
     */
    public CompanyBenefitWithEmployeeBenefitsContribution withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The company contribution scheme.
     * 
     * <p>"amount": The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>"percentage": The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>"tiered": The company contribution varies according to the size of the employee deduction.
     */
    public CompanyBenefitWithEmployeeBenefitsContribution withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
     * 
     * <p>For the `tiered` contribution type, an array of tiers.
     */
    public CompanyBenefitWithEmployeeBenefitsContribution withValue(CompanyBenefitWithEmployeeBenefitsValue value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    /**
     * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
     * 
     * <p>For the `tiered` contribution type, an array of tiers.
     */
    public CompanyBenefitWithEmployeeBenefitsContribution withValue(Optional<? extends CompanyBenefitWithEmployeeBenefitsValue> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        CompanyBenefitWithEmployeeBenefitsContribution other = (CompanyBenefitWithEmployeeBenefitsContribution) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyBenefitWithEmployeeBenefitsContribution.class,
                "type", type,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<String> type = Optional.empty();
 
        private Optional<? extends CompanyBenefitWithEmployeeBenefitsValue> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The company contribution scheme.
         * 
         * <p>"amount": The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
         * 
         * <p>"percentage": The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
         * 
         * <p>"tiered": The company contribution varies according to the size of the employee deduction.
         */
        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * The company contribution scheme.
         * 
         * <p>"amount": The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
         * 
         * <p>"percentage": The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
         * 
         * <p>"tiered": The company contribution varies according to the size of the employee deduction.
         */
        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
         * 
         * <p>For the `tiered` contribution type, an array of tiers.
         */
        public Builder value(CompanyBenefitWithEmployeeBenefitsValue value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        /**
         * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
         * 
         * <p>For the `tiered` contribution type, an array of tiers.
         */
        public Builder value(Optional<? extends CompanyBenefitWithEmployeeBenefitsValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public CompanyBenefitWithEmployeeBenefitsContribution build() {
            return new CompanyBenefitWithEmployeeBenefitsContribution(
                type,
                value);
        }
    }
}

