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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
/**
 * PutV1EmployeeBenefitsEmployeeBenefitIdContribution
 * 
 * <p>An object representing the type and value of the company contribution.
 */

public class PutV1EmployeeBenefitsEmployeeBenefitIdContribution {

    /**
     * The company contribution scheme.
     * 
     * <p>`amount`: The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>`percentage`: The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>`tiered`: The size of the company contribution corresponds to the size of the employee deduction relative to a tiered matching scheme.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends PutV1EmployeeBenefitsEmployeeBenefitIdType> type;

    /**
     * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
     * 
     * <p>For the `tiered` contribution type, an array of tiers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<? extends PutV1EmployeeBenefitsEmployeeBenefitIdValue> value;

    @JsonCreator
    public PutV1EmployeeBenefitsEmployeeBenefitIdContribution(
            @JsonProperty("type") Optional<? extends PutV1EmployeeBenefitsEmployeeBenefitIdType> type,
            @JsonProperty("value") Optional<? extends PutV1EmployeeBenefitsEmployeeBenefitIdValue> value) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(value, "value");
        this.type = type;
        this.value = value;
    }
    
    public PutV1EmployeeBenefitsEmployeeBenefitIdContribution() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The company contribution scheme.
     * 
     * <p>`amount`: The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>`percentage`: The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>`tiered`: The size of the company contribution corresponds to the size of the employee deduction relative to a tiered matching scheme.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PutV1EmployeeBenefitsEmployeeBenefitIdType> type() {
        return (Optional<PutV1EmployeeBenefitsEmployeeBenefitIdType>) type;
    }

    /**
     * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
     * 
     * <p>For the `tiered` contribution type, an array of tiers.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PutV1EmployeeBenefitsEmployeeBenefitIdValue> value() {
        return (Optional<PutV1EmployeeBenefitsEmployeeBenefitIdValue>) value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The company contribution scheme.
     * 
     * <p>`amount`: The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>`percentage`: The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>`tiered`: The size of the company contribution corresponds to the size of the employee deduction relative to a tiered matching scheme.
     */
    public PutV1EmployeeBenefitsEmployeeBenefitIdContribution withType(PutV1EmployeeBenefitsEmployeeBenefitIdType type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The company contribution scheme.
     * 
     * <p>`amount`: The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>`percentage`: The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
     * 
     * <p>`tiered`: The size of the company contribution corresponds to the size of the employee deduction relative to a tiered matching scheme.
     */
    public PutV1EmployeeBenefitsEmployeeBenefitIdContribution withType(Optional<? extends PutV1EmployeeBenefitsEmployeeBenefitIdType> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
     * 
     * <p>For the `tiered` contribution type, an array of tiers.
     */
    public PutV1EmployeeBenefitsEmployeeBenefitIdContribution withValue(PutV1EmployeeBenefitsEmployeeBenefitIdValue value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    /**
     * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
     * 
     * <p>For the `tiered` contribution type, an array of tiers.
     */
    public PutV1EmployeeBenefitsEmployeeBenefitIdContribution withValue(Optional<? extends PutV1EmployeeBenefitsEmployeeBenefitIdValue> value) {
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
        PutV1EmployeeBenefitsEmployeeBenefitIdContribution other = (PutV1EmployeeBenefitsEmployeeBenefitIdContribution) o;
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
        return Utils.toString(PutV1EmployeeBenefitsEmployeeBenefitIdContribution.class,
                "type", type,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<? extends PutV1EmployeeBenefitsEmployeeBenefitIdType> type = Optional.empty();
 
        private Optional<? extends PutV1EmployeeBenefitsEmployeeBenefitIdValue> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The company contribution scheme.
         * 
         * <p>`amount`: The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
         * 
         * <p>`percentage`: The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
         * 
         * <p>`tiered`: The size of the company contribution corresponds to the size of the employee deduction relative to a tiered matching scheme.
         */
        public Builder type(PutV1EmployeeBenefitsEmployeeBenefitIdType type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        /**
         * The company contribution scheme.
         * 
         * <p>`amount`: The company contributes a fixed amount per payroll. If elective is true, the contribution is matching, dollar-for-dollar.
         * 
         * <p>`percentage`: The company contributes a percentage of the payroll amount per payroll period. If elective is true, the contribution is matching, dollar-for-dollar.
         * 
         * <p>`tiered`: The size of the company contribution corresponds to the size of the employee deduction relative to a tiered matching scheme.
         */
        public Builder type(Optional<? extends PutV1EmployeeBenefitsEmployeeBenefitIdType> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
         * 
         * <p>For the `tiered` contribution type, an array of tiers.
         */
        public Builder value(PutV1EmployeeBenefitsEmployeeBenefitIdValue value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        /**
         * For the `amount` and `percentage` contribution types, the value of the corresponding amount or percentage.
         * 
         * <p>For the `tiered` contribution type, an array of tiers.
         */
        public Builder value(Optional<? extends PutV1EmployeeBenefitsEmployeeBenefitIdValue> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public PutV1EmployeeBenefitsEmployeeBenefitIdContribution build() {
            return new PutV1EmployeeBenefitsEmployeeBenefitIdContribution(
                type,
                value);
        }
    }
}

