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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
/**
 * PutTimeOffPoliciesTimeOffPolicyUuidRequestBody - Can update any attributes of the time off policy except policy_type, is_active, complete &amp; employees
 */

public class PutTimeOffPoliciesTimeOffPolicyUuidRequestBody {

    /**
     * Name of the time off policy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * Accrual method of the time off policy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accrual_method")
    private Optional<? extends AccrualMethod> accrualMethod;

    /**
     * The rate at which the time off hours will accrue for an employee on the policy. Represented as a float, e.g. "40.0".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accrual_rate")
    private Optional<String> accrualRate;

    /**
     * The number of hours an employee has to work or be paid for to accrue the number of hours set in the accrual rate. Only used for hourly policies (per_hour_paid, per_hour_paid_no_overtime, per_hour_work, per_hour_worked_no_overtime). Represented as a float, e.g. "40.0".
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accrual_rate_unit")
    private Optional<String> accrualRateUnit;

    /**
     * Boolean representing if an employee's accrued time off hours will be paid out on termination
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("paid_out_on_termination")
    private Optional<Boolean> paidOutOnTermination;

    /**
     * Number of days before an employee on the policy will begin accruing time off hours. If accrual_method is per_anniversary_year, per_calendar_year, or unlimited, then accrual_waiting_period_days should be 0.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accrual_waiting_period_days")
    private Optional<Long> accrualWaitingPeriodDays;

    /**
     * The max number of hours an employee can carryover from one year to the next. If accrual_method is unlimited, then carryover_limit_hours must be blank.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("carryover_limit_hours")
    private Optional<String> carryoverLimitHours;

    /**
     * The max number of hours an employee can accrue in a year. If accrual_method is unlimited, then max_accrual_hours_per_year must be blank.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_accrual_hours_per_year")
    private Optional<String> maxAccrualHoursPerYear;

    /**
     * The max number of hours an employee can accrue. If accrual_method is unlimited, then max_hours must be blank.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max_hours")
    private Optional<String> maxHours;

    @JsonCreator
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody(
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("accrual_method") Optional<? extends AccrualMethod> accrualMethod,
            @JsonProperty("accrual_rate") Optional<String> accrualRate,
            @JsonProperty("accrual_rate_unit") Optional<String> accrualRateUnit,
            @JsonProperty("paid_out_on_termination") Optional<Boolean> paidOutOnTermination,
            @JsonProperty("accrual_waiting_period_days") Optional<Long> accrualWaitingPeriodDays,
            @JsonProperty("carryover_limit_hours") Optional<String> carryoverLimitHours,
            @JsonProperty("max_accrual_hours_per_year") Optional<String> maxAccrualHoursPerYear,
            @JsonProperty("max_hours") Optional<String> maxHours) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(accrualMethod, "accrualMethod");
        Utils.checkNotNull(accrualRate, "accrualRate");
        Utils.checkNotNull(accrualRateUnit, "accrualRateUnit");
        Utils.checkNotNull(paidOutOnTermination, "paidOutOnTermination");
        Utils.checkNotNull(accrualWaitingPeriodDays, "accrualWaitingPeriodDays");
        Utils.checkNotNull(carryoverLimitHours, "carryoverLimitHours");
        Utils.checkNotNull(maxAccrualHoursPerYear, "maxAccrualHoursPerYear");
        Utils.checkNotNull(maxHours, "maxHours");
        this.name = name;
        this.accrualMethod = accrualMethod;
        this.accrualRate = accrualRate;
        this.accrualRateUnit = accrualRateUnit;
        this.paidOutOnTermination = paidOutOnTermination;
        this.accrualWaitingPeriodDays = accrualWaitingPeriodDays;
        this.carryoverLimitHours = carryoverLimitHours;
        this.maxAccrualHoursPerYear = maxAccrualHoursPerYear;
        this.maxHours = maxHours;
    }
    
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Name of the time off policy
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * Accrual method of the time off policy
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccrualMethod> accrualMethod() {
        return (Optional<AccrualMethod>) accrualMethod;
    }

    /**
     * The rate at which the time off hours will accrue for an employee on the policy. Represented as a float, e.g. "40.0".
     */
    @JsonIgnore
    public Optional<String> accrualRate() {
        return accrualRate;
    }

    /**
     * The number of hours an employee has to work or be paid for to accrue the number of hours set in the accrual rate. Only used for hourly policies (per_hour_paid, per_hour_paid_no_overtime, per_hour_work, per_hour_worked_no_overtime). Represented as a float, e.g. "40.0".
     */
    @JsonIgnore
    public Optional<String> accrualRateUnit() {
        return accrualRateUnit;
    }

    /**
     * Boolean representing if an employee's accrued time off hours will be paid out on termination
     */
    @JsonIgnore
    public Optional<Boolean> paidOutOnTermination() {
        return paidOutOnTermination;
    }

    /**
     * Number of days before an employee on the policy will begin accruing time off hours. If accrual_method is per_anniversary_year, per_calendar_year, or unlimited, then accrual_waiting_period_days should be 0.
     */
    @JsonIgnore
    public Optional<Long> accrualWaitingPeriodDays() {
        return accrualWaitingPeriodDays;
    }

    /**
     * The max number of hours an employee can carryover from one year to the next. If accrual_method is unlimited, then carryover_limit_hours must be blank.
     */
    @JsonIgnore
    public Optional<String> carryoverLimitHours() {
        return carryoverLimitHours;
    }

    /**
     * The max number of hours an employee can accrue in a year. If accrual_method is unlimited, then max_accrual_hours_per_year must be blank.
     */
    @JsonIgnore
    public Optional<String> maxAccrualHoursPerYear() {
        return maxAccrualHoursPerYear;
    }

    /**
     * The max number of hours an employee can accrue. If accrual_method is unlimited, then max_hours must be blank.
     */
    @JsonIgnore
    public Optional<String> maxHours() {
        return maxHours;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the time off policy
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of the time off policy
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Accrual method of the time off policy
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withAccrualMethod(AccrualMethod accrualMethod) {
        Utils.checkNotNull(accrualMethod, "accrualMethod");
        this.accrualMethod = Optional.ofNullable(accrualMethod);
        return this;
    }

    /**
     * Accrual method of the time off policy
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withAccrualMethod(Optional<? extends AccrualMethod> accrualMethod) {
        Utils.checkNotNull(accrualMethod, "accrualMethod");
        this.accrualMethod = accrualMethod;
        return this;
    }

    /**
     * The rate at which the time off hours will accrue for an employee on the policy. Represented as a float, e.g. "40.0".
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withAccrualRate(String accrualRate) {
        Utils.checkNotNull(accrualRate, "accrualRate");
        this.accrualRate = Optional.ofNullable(accrualRate);
        return this;
    }

    /**
     * The rate at which the time off hours will accrue for an employee on the policy. Represented as a float, e.g. "40.0".
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withAccrualRate(Optional<String> accrualRate) {
        Utils.checkNotNull(accrualRate, "accrualRate");
        this.accrualRate = accrualRate;
        return this;
    }

    /**
     * The number of hours an employee has to work or be paid for to accrue the number of hours set in the accrual rate. Only used for hourly policies (per_hour_paid, per_hour_paid_no_overtime, per_hour_work, per_hour_worked_no_overtime). Represented as a float, e.g. "40.0".
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withAccrualRateUnit(String accrualRateUnit) {
        Utils.checkNotNull(accrualRateUnit, "accrualRateUnit");
        this.accrualRateUnit = Optional.ofNullable(accrualRateUnit);
        return this;
    }

    /**
     * The number of hours an employee has to work or be paid for to accrue the number of hours set in the accrual rate. Only used for hourly policies (per_hour_paid, per_hour_paid_no_overtime, per_hour_work, per_hour_worked_no_overtime). Represented as a float, e.g. "40.0".
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withAccrualRateUnit(Optional<String> accrualRateUnit) {
        Utils.checkNotNull(accrualRateUnit, "accrualRateUnit");
        this.accrualRateUnit = accrualRateUnit;
        return this;
    }

    /**
     * Boolean representing if an employee's accrued time off hours will be paid out on termination
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withPaidOutOnTermination(boolean paidOutOnTermination) {
        Utils.checkNotNull(paidOutOnTermination, "paidOutOnTermination");
        this.paidOutOnTermination = Optional.ofNullable(paidOutOnTermination);
        return this;
    }

    /**
     * Boolean representing if an employee's accrued time off hours will be paid out on termination
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withPaidOutOnTermination(Optional<Boolean> paidOutOnTermination) {
        Utils.checkNotNull(paidOutOnTermination, "paidOutOnTermination");
        this.paidOutOnTermination = paidOutOnTermination;
        return this;
    }

    /**
     * Number of days before an employee on the policy will begin accruing time off hours. If accrual_method is per_anniversary_year, per_calendar_year, or unlimited, then accrual_waiting_period_days should be 0.
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withAccrualWaitingPeriodDays(long accrualWaitingPeriodDays) {
        Utils.checkNotNull(accrualWaitingPeriodDays, "accrualWaitingPeriodDays");
        this.accrualWaitingPeriodDays = Optional.ofNullable(accrualWaitingPeriodDays);
        return this;
    }

    /**
     * Number of days before an employee on the policy will begin accruing time off hours. If accrual_method is per_anniversary_year, per_calendar_year, or unlimited, then accrual_waiting_period_days should be 0.
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withAccrualWaitingPeriodDays(Optional<Long> accrualWaitingPeriodDays) {
        Utils.checkNotNull(accrualWaitingPeriodDays, "accrualWaitingPeriodDays");
        this.accrualWaitingPeriodDays = accrualWaitingPeriodDays;
        return this;
    }

    /**
     * The max number of hours an employee can carryover from one year to the next. If accrual_method is unlimited, then carryover_limit_hours must be blank.
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withCarryoverLimitHours(String carryoverLimitHours) {
        Utils.checkNotNull(carryoverLimitHours, "carryoverLimitHours");
        this.carryoverLimitHours = Optional.ofNullable(carryoverLimitHours);
        return this;
    }

    /**
     * The max number of hours an employee can carryover from one year to the next. If accrual_method is unlimited, then carryover_limit_hours must be blank.
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withCarryoverLimitHours(Optional<String> carryoverLimitHours) {
        Utils.checkNotNull(carryoverLimitHours, "carryoverLimitHours");
        this.carryoverLimitHours = carryoverLimitHours;
        return this;
    }

    /**
     * The max number of hours an employee can accrue in a year. If accrual_method is unlimited, then max_accrual_hours_per_year must be blank.
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withMaxAccrualHoursPerYear(String maxAccrualHoursPerYear) {
        Utils.checkNotNull(maxAccrualHoursPerYear, "maxAccrualHoursPerYear");
        this.maxAccrualHoursPerYear = Optional.ofNullable(maxAccrualHoursPerYear);
        return this;
    }

    /**
     * The max number of hours an employee can accrue in a year. If accrual_method is unlimited, then max_accrual_hours_per_year must be blank.
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withMaxAccrualHoursPerYear(Optional<String> maxAccrualHoursPerYear) {
        Utils.checkNotNull(maxAccrualHoursPerYear, "maxAccrualHoursPerYear");
        this.maxAccrualHoursPerYear = maxAccrualHoursPerYear;
        return this;
    }

    /**
     * The max number of hours an employee can accrue. If accrual_method is unlimited, then max_hours must be blank.
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withMaxHours(String maxHours) {
        Utils.checkNotNull(maxHours, "maxHours");
        this.maxHours = Optional.ofNullable(maxHours);
        return this;
    }

    /**
     * The max number of hours an employee can accrue. If accrual_method is unlimited, then max_hours must be blank.
     */
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody withMaxHours(Optional<String> maxHours) {
        Utils.checkNotNull(maxHours, "maxHours");
        this.maxHours = maxHours;
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
        PutTimeOffPoliciesTimeOffPolicyUuidRequestBody other = (PutTimeOffPoliciesTimeOffPolicyUuidRequestBody) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.accrualMethod, other.accrualMethod) &&
            Objects.deepEquals(this.accrualRate, other.accrualRate) &&
            Objects.deepEquals(this.accrualRateUnit, other.accrualRateUnit) &&
            Objects.deepEquals(this.paidOutOnTermination, other.paidOutOnTermination) &&
            Objects.deepEquals(this.accrualWaitingPeriodDays, other.accrualWaitingPeriodDays) &&
            Objects.deepEquals(this.carryoverLimitHours, other.carryoverLimitHours) &&
            Objects.deepEquals(this.maxAccrualHoursPerYear, other.maxAccrualHoursPerYear) &&
            Objects.deepEquals(this.maxHours, other.maxHours);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            accrualMethod,
            accrualRate,
            accrualRateUnit,
            paidOutOnTermination,
            accrualWaitingPeriodDays,
            carryoverLimitHours,
            maxAccrualHoursPerYear,
            maxHours);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutTimeOffPoliciesTimeOffPolicyUuidRequestBody.class,
                "name", name,
                "accrualMethod", accrualMethod,
                "accrualRate", accrualRate,
                "accrualRateUnit", accrualRateUnit,
                "paidOutOnTermination", paidOutOnTermination,
                "accrualWaitingPeriodDays", accrualWaitingPeriodDays,
                "carryoverLimitHours", carryoverLimitHours,
                "maxAccrualHoursPerYear", maxAccrualHoursPerYear,
                "maxHours", maxHours);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();
 
        private Optional<? extends AccrualMethod> accrualMethod = Optional.empty();
 
        private Optional<String> accrualRate = Optional.empty();
 
        private Optional<String> accrualRateUnit = Optional.empty();
 
        private Optional<Boolean> paidOutOnTermination = Optional.empty();
 
        private Optional<Long> accrualWaitingPeriodDays = Optional.empty();
 
        private Optional<String> carryoverLimitHours = Optional.empty();
 
        private Optional<String> maxAccrualHoursPerYear = Optional.empty();
 
        private Optional<String> maxHours = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the time off policy
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of the time off policy
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Accrual method of the time off policy
         */
        public Builder accrualMethod(AccrualMethod accrualMethod) {
            Utils.checkNotNull(accrualMethod, "accrualMethod");
            this.accrualMethod = Optional.ofNullable(accrualMethod);
            return this;
        }

        /**
         * Accrual method of the time off policy
         */
        public Builder accrualMethod(Optional<? extends AccrualMethod> accrualMethod) {
            Utils.checkNotNull(accrualMethod, "accrualMethod");
            this.accrualMethod = accrualMethod;
            return this;
        }

        /**
         * The rate at which the time off hours will accrue for an employee on the policy. Represented as a float, e.g. "40.0".
         */
        public Builder accrualRate(String accrualRate) {
            Utils.checkNotNull(accrualRate, "accrualRate");
            this.accrualRate = Optional.ofNullable(accrualRate);
            return this;
        }

        /**
         * The rate at which the time off hours will accrue for an employee on the policy. Represented as a float, e.g. "40.0".
         */
        public Builder accrualRate(Optional<String> accrualRate) {
            Utils.checkNotNull(accrualRate, "accrualRate");
            this.accrualRate = accrualRate;
            return this;
        }

        /**
         * The number of hours an employee has to work or be paid for to accrue the number of hours set in the accrual rate. Only used for hourly policies (per_hour_paid, per_hour_paid_no_overtime, per_hour_work, per_hour_worked_no_overtime). Represented as a float, e.g. "40.0".
         */
        public Builder accrualRateUnit(String accrualRateUnit) {
            Utils.checkNotNull(accrualRateUnit, "accrualRateUnit");
            this.accrualRateUnit = Optional.ofNullable(accrualRateUnit);
            return this;
        }

        /**
         * The number of hours an employee has to work or be paid for to accrue the number of hours set in the accrual rate. Only used for hourly policies (per_hour_paid, per_hour_paid_no_overtime, per_hour_work, per_hour_worked_no_overtime). Represented as a float, e.g. "40.0".
         */
        public Builder accrualRateUnit(Optional<String> accrualRateUnit) {
            Utils.checkNotNull(accrualRateUnit, "accrualRateUnit");
            this.accrualRateUnit = accrualRateUnit;
            return this;
        }

        /**
         * Boolean representing if an employee's accrued time off hours will be paid out on termination
         */
        public Builder paidOutOnTermination(boolean paidOutOnTermination) {
            Utils.checkNotNull(paidOutOnTermination, "paidOutOnTermination");
            this.paidOutOnTermination = Optional.ofNullable(paidOutOnTermination);
            return this;
        }

        /**
         * Boolean representing if an employee's accrued time off hours will be paid out on termination
         */
        public Builder paidOutOnTermination(Optional<Boolean> paidOutOnTermination) {
            Utils.checkNotNull(paidOutOnTermination, "paidOutOnTermination");
            this.paidOutOnTermination = paidOutOnTermination;
            return this;
        }

        /**
         * Number of days before an employee on the policy will begin accruing time off hours. If accrual_method is per_anniversary_year, per_calendar_year, or unlimited, then accrual_waiting_period_days should be 0.
         */
        public Builder accrualWaitingPeriodDays(long accrualWaitingPeriodDays) {
            Utils.checkNotNull(accrualWaitingPeriodDays, "accrualWaitingPeriodDays");
            this.accrualWaitingPeriodDays = Optional.ofNullable(accrualWaitingPeriodDays);
            return this;
        }

        /**
         * Number of days before an employee on the policy will begin accruing time off hours. If accrual_method is per_anniversary_year, per_calendar_year, or unlimited, then accrual_waiting_period_days should be 0.
         */
        public Builder accrualWaitingPeriodDays(Optional<Long> accrualWaitingPeriodDays) {
            Utils.checkNotNull(accrualWaitingPeriodDays, "accrualWaitingPeriodDays");
            this.accrualWaitingPeriodDays = accrualWaitingPeriodDays;
            return this;
        }

        /**
         * The max number of hours an employee can carryover from one year to the next. If accrual_method is unlimited, then carryover_limit_hours must be blank.
         */
        public Builder carryoverLimitHours(String carryoverLimitHours) {
            Utils.checkNotNull(carryoverLimitHours, "carryoverLimitHours");
            this.carryoverLimitHours = Optional.ofNullable(carryoverLimitHours);
            return this;
        }

        /**
         * The max number of hours an employee can carryover from one year to the next. If accrual_method is unlimited, then carryover_limit_hours must be blank.
         */
        public Builder carryoverLimitHours(Optional<String> carryoverLimitHours) {
            Utils.checkNotNull(carryoverLimitHours, "carryoverLimitHours");
            this.carryoverLimitHours = carryoverLimitHours;
            return this;
        }

        /**
         * The max number of hours an employee can accrue in a year. If accrual_method is unlimited, then max_accrual_hours_per_year must be blank.
         */
        public Builder maxAccrualHoursPerYear(String maxAccrualHoursPerYear) {
            Utils.checkNotNull(maxAccrualHoursPerYear, "maxAccrualHoursPerYear");
            this.maxAccrualHoursPerYear = Optional.ofNullable(maxAccrualHoursPerYear);
            return this;
        }

        /**
         * The max number of hours an employee can accrue in a year. If accrual_method is unlimited, then max_accrual_hours_per_year must be blank.
         */
        public Builder maxAccrualHoursPerYear(Optional<String> maxAccrualHoursPerYear) {
            Utils.checkNotNull(maxAccrualHoursPerYear, "maxAccrualHoursPerYear");
            this.maxAccrualHoursPerYear = maxAccrualHoursPerYear;
            return this;
        }

        /**
         * The max number of hours an employee can accrue. If accrual_method is unlimited, then max_hours must be blank.
         */
        public Builder maxHours(String maxHours) {
            Utils.checkNotNull(maxHours, "maxHours");
            this.maxHours = Optional.ofNullable(maxHours);
            return this;
        }

        /**
         * The max number of hours an employee can accrue. If accrual_method is unlimited, then max_hours must be blank.
         */
        public Builder maxHours(Optional<String> maxHours) {
            Utils.checkNotNull(maxHours, "maxHours");
            this.maxHours = maxHours;
            return this;
        }
        
        public PutTimeOffPoliciesTimeOffPolicyUuidRequestBody build() {
            return new PutTimeOffPoliciesTimeOffPolicyUuidRequestBody(
                name,
                accrualMethod,
                accrualRate,
                accrualRateUnit,
                paidOutOnTermination,
                accrualWaitingPeriodDays,
                carryoverLimitHours,
                maxAccrualHoursPerYear,
                maxHours);
        }
    }
}

