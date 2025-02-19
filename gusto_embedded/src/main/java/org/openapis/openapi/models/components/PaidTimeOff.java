/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PaidTimeOff - The representation of paid time off in Gusto.
 */

public class PaidTimeOff {

    /**
     * The name of the paid time off type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends Name> name;

    /**
     * The name of the time off policy.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy_name")
    private Optional<String> policyName;

    /**
     * The UUID of the time off policy.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("policy_uuid")
    private Optional<String> policyUuid;

    /**
     * The unit the PTO type is accrued in.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accrual_unit")
    private Optional<String> accrualUnit;

    /**
     * The number of accrual units accrued per accrual period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accrual_rate")
    private Optional<String> accrualRate;

    /**
     * The accrual method of the time off policy
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accrual_method")
    private Optional<String> accrualMethod;

    /**
     * The frequency at which the PTO type is accrued.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accrual_period")
    private Optional<String> accrualPeriod;

    /**
     * The number of accrual units accrued.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("accrual_balance")
    private Optional<String> accrualBalance;

    /**
     * The maximum number of accrual units allowed. A null value signifies no maximum.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maximum_accrual_balance")
    private JsonNullable<String> maximumAccrualBalance;

    /**
     * Whether the accrual balance is paid to the employee upon termination.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("paid_at_termination")
    private Optional<Boolean> paidAtTermination;

    @JsonCreator
    public PaidTimeOff(
            @JsonProperty("name") Optional<? extends Name> name,
            @JsonProperty("policy_name") Optional<String> policyName,
            @JsonProperty("policy_uuid") Optional<String> policyUuid,
            @JsonProperty("accrual_unit") Optional<String> accrualUnit,
            @JsonProperty("accrual_rate") Optional<String> accrualRate,
            @JsonProperty("accrual_method") Optional<String> accrualMethod,
            @JsonProperty("accrual_period") Optional<String> accrualPeriod,
            @JsonProperty("accrual_balance") Optional<String> accrualBalance,
            @JsonProperty("maximum_accrual_balance") JsonNullable<String> maximumAccrualBalance,
            @JsonProperty("paid_at_termination") Optional<Boolean> paidAtTermination) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(policyName, "policyName");
        Utils.checkNotNull(policyUuid, "policyUuid");
        Utils.checkNotNull(accrualUnit, "accrualUnit");
        Utils.checkNotNull(accrualRate, "accrualRate");
        Utils.checkNotNull(accrualMethod, "accrualMethod");
        Utils.checkNotNull(accrualPeriod, "accrualPeriod");
        Utils.checkNotNull(accrualBalance, "accrualBalance");
        Utils.checkNotNull(maximumAccrualBalance, "maximumAccrualBalance");
        Utils.checkNotNull(paidAtTermination, "paidAtTermination");
        this.name = name;
        this.policyName = policyName;
        this.policyUuid = policyUuid;
        this.accrualUnit = accrualUnit;
        this.accrualRate = accrualRate;
        this.accrualMethod = accrualMethod;
        this.accrualPeriod = accrualPeriod;
        this.accrualBalance = accrualBalance;
        this.maximumAccrualBalance = maximumAccrualBalance;
        this.paidAtTermination = paidAtTermination;
    }
    
    public PaidTimeOff() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The name of the paid time off type.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Name> name() {
        return (Optional<Name>) name;
    }

    /**
     * The name of the time off policy.
     */
    @JsonIgnore
    public Optional<String> policyName() {
        return policyName;
    }

    /**
     * The UUID of the time off policy.
     */
    @JsonIgnore
    public Optional<String> policyUuid() {
        return policyUuid;
    }

    /**
     * The unit the PTO type is accrued in.
     */
    @JsonIgnore
    public Optional<String> accrualUnit() {
        return accrualUnit;
    }

    /**
     * The number of accrual units accrued per accrual period.
     */
    @JsonIgnore
    public Optional<String> accrualRate() {
        return accrualRate;
    }

    /**
     * The accrual method of the time off policy
     */
    @JsonIgnore
    public Optional<String> accrualMethod() {
        return accrualMethod;
    }

    /**
     * The frequency at which the PTO type is accrued.
     */
    @JsonIgnore
    public Optional<String> accrualPeriod() {
        return accrualPeriod;
    }

    /**
     * The number of accrual units accrued.
     */
    @JsonIgnore
    public Optional<String> accrualBalance() {
        return accrualBalance;
    }

    /**
     * The maximum number of accrual units allowed. A null value signifies no maximum.
     */
    @JsonIgnore
    public JsonNullable<String> maximumAccrualBalance() {
        return maximumAccrualBalance;
    }

    /**
     * Whether the accrual balance is paid to the employee upon termination.
     */
    @JsonIgnore
    public Optional<Boolean> paidAtTermination() {
        return paidAtTermination;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the paid time off type.
     */
    public PaidTimeOff withName(Name name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the paid time off type.
     */
    public PaidTimeOff withName(Optional<? extends Name> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * The name of the time off policy.
     */
    public PaidTimeOff withPolicyName(String policyName) {
        Utils.checkNotNull(policyName, "policyName");
        this.policyName = Optional.ofNullable(policyName);
        return this;
    }

    /**
     * The name of the time off policy.
     */
    public PaidTimeOff withPolicyName(Optional<String> policyName) {
        Utils.checkNotNull(policyName, "policyName");
        this.policyName = policyName;
        return this;
    }

    /**
     * The UUID of the time off policy.
     */
    public PaidTimeOff withPolicyUuid(String policyUuid) {
        Utils.checkNotNull(policyUuid, "policyUuid");
        this.policyUuid = Optional.ofNullable(policyUuid);
        return this;
    }

    /**
     * The UUID of the time off policy.
     */
    public PaidTimeOff withPolicyUuid(Optional<String> policyUuid) {
        Utils.checkNotNull(policyUuid, "policyUuid");
        this.policyUuid = policyUuid;
        return this;
    }

    /**
     * The unit the PTO type is accrued in.
     */
    public PaidTimeOff withAccrualUnit(String accrualUnit) {
        Utils.checkNotNull(accrualUnit, "accrualUnit");
        this.accrualUnit = Optional.ofNullable(accrualUnit);
        return this;
    }

    /**
     * The unit the PTO type is accrued in.
     */
    public PaidTimeOff withAccrualUnit(Optional<String> accrualUnit) {
        Utils.checkNotNull(accrualUnit, "accrualUnit");
        this.accrualUnit = accrualUnit;
        return this;
    }

    /**
     * The number of accrual units accrued per accrual period.
     */
    public PaidTimeOff withAccrualRate(String accrualRate) {
        Utils.checkNotNull(accrualRate, "accrualRate");
        this.accrualRate = Optional.ofNullable(accrualRate);
        return this;
    }

    /**
     * The number of accrual units accrued per accrual period.
     */
    public PaidTimeOff withAccrualRate(Optional<String> accrualRate) {
        Utils.checkNotNull(accrualRate, "accrualRate");
        this.accrualRate = accrualRate;
        return this;
    }

    /**
     * The accrual method of the time off policy
     */
    public PaidTimeOff withAccrualMethod(String accrualMethod) {
        Utils.checkNotNull(accrualMethod, "accrualMethod");
        this.accrualMethod = Optional.ofNullable(accrualMethod);
        return this;
    }

    /**
     * The accrual method of the time off policy
     */
    public PaidTimeOff withAccrualMethod(Optional<String> accrualMethod) {
        Utils.checkNotNull(accrualMethod, "accrualMethod");
        this.accrualMethod = accrualMethod;
        return this;
    }

    /**
     * The frequency at which the PTO type is accrued.
     */
    public PaidTimeOff withAccrualPeriod(String accrualPeriod) {
        Utils.checkNotNull(accrualPeriod, "accrualPeriod");
        this.accrualPeriod = Optional.ofNullable(accrualPeriod);
        return this;
    }

    /**
     * The frequency at which the PTO type is accrued.
     */
    public PaidTimeOff withAccrualPeriod(Optional<String> accrualPeriod) {
        Utils.checkNotNull(accrualPeriod, "accrualPeriod");
        this.accrualPeriod = accrualPeriod;
        return this;
    }

    /**
     * The number of accrual units accrued.
     */
    public PaidTimeOff withAccrualBalance(String accrualBalance) {
        Utils.checkNotNull(accrualBalance, "accrualBalance");
        this.accrualBalance = Optional.ofNullable(accrualBalance);
        return this;
    }

    /**
     * The number of accrual units accrued.
     */
    public PaidTimeOff withAccrualBalance(Optional<String> accrualBalance) {
        Utils.checkNotNull(accrualBalance, "accrualBalance");
        this.accrualBalance = accrualBalance;
        return this;
    }

    /**
     * The maximum number of accrual units allowed. A null value signifies no maximum.
     */
    public PaidTimeOff withMaximumAccrualBalance(String maximumAccrualBalance) {
        Utils.checkNotNull(maximumAccrualBalance, "maximumAccrualBalance");
        this.maximumAccrualBalance = JsonNullable.of(maximumAccrualBalance);
        return this;
    }

    /**
     * The maximum number of accrual units allowed. A null value signifies no maximum.
     */
    public PaidTimeOff withMaximumAccrualBalance(JsonNullable<String> maximumAccrualBalance) {
        Utils.checkNotNull(maximumAccrualBalance, "maximumAccrualBalance");
        this.maximumAccrualBalance = maximumAccrualBalance;
        return this;
    }

    /**
     * Whether the accrual balance is paid to the employee upon termination.
     */
    public PaidTimeOff withPaidAtTermination(boolean paidAtTermination) {
        Utils.checkNotNull(paidAtTermination, "paidAtTermination");
        this.paidAtTermination = Optional.ofNullable(paidAtTermination);
        return this;
    }

    /**
     * Whether the accrual balance is paid to the employee upon termination.
     */
    public PaidTimeOff withPaidAtTermination(Optional<Boolean> paidAtTermination) {
        Utils.checkNotNull(paidAtTermination, "paidAtTermination");
        this.paidAtTermination = paidAtTermination;
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
        PaidTimeOff other = (PaidTimeOff) o;
        return 
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.policyName, other.policyName) &&
            Objects.deepEquals(this.policyUuid, other.policyUuid) &&
            Objects.deepEquals(this.accrualUnit, other.accrualUnit) &&
            Objects.deepEquals(this.accrualRate, other.accrualRate) &&
            Objects.deepEquals(this.accrualMethod, other.accrualMethod) &&
            Objects.deepEquals(this.accrualPeriod, other.accrualPeriod) &&
            Objects.deepEquals(this.accrualBalance, other.accrualBalance) &&
            Objects.deepEquals(this.maximumAccrualBalance, other.maximumAccrualBalance) &&
            Objects.deepEquals(this.paidAtTermination, other.paidAtTermination);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            policyName,
            policyUuid,
            accrualUnit,
            accrualRate,
            accrualMethod,
            accrualPeriod,
            accrualBalance,
            maximumAccrualBalance,
            paidAtTermination);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaidTimeOff.class,
                "name", name,
                "policyName", policyName,
                "policyUuid", policyUuid,
                "accrualUnit", accrualUnit,
                "accrualRate", accrualRate,
                "accrualMethod", accrualMethod,
                "accrualPeriod", accrualPeriod,
                "accrualBalance", accrualBalance,
                "maximumAccrualBalance", maximumAccrualBalance,
                "paidAtTermination", paidAtTermination);
    }
    
    public final static class Builder {
 
        private Optional<? extends Name> name = Optional.empty();
 
        private Optional<String> policyName = Optional.empty();
 
        private Optional<String> policyUuid = Optional.empty();
 
        private Optional<String> accrualUnit = Optional.empty();
 
        private Optional<String> accrualRate = Optional.empty();
 
        private Optional<String> accrualMethod = Optional.empty();
 
        private Optional<String> accrualPeriod = Optional.empty();
 
        private Optional<String> accrualBalance = Optional.empty();
 
        private JsonNullable<String> maximumAccrualBalance = JsonNullable.undefined();
 
        private Optional<Boolean> paidAtTermination = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the paid time off type.
         */
        public Builder name(Name name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of the paid time off type.
         */
        public Builder name(Optional<? extends Name> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * The name of the time off policy.
         */
        public Builder policyName(String policyName) {
            Utils.checkNotNull(policyName, "policyName");
            this.policyName = Optional.ofNullable(policyName);
            return this;
        }

        /**
         * The name of the time off policy.
         */
        public Builder policyName(Optional<String> policyName) {
            Utils.checkNotNull(policyName, "policyName");
            this.policyName = policyName;
            return this;
        }

        /**
         * The UUID of the time off policy.
         */
        public Builder policyUuid(String policyUuid) {
            Utils.checkNotNull(policyUuid, "policyUuid");
            this.policyUuid = Optional.ofNullable(policyUuid);
            return this;
        }

        /**
         * The UUID of the time off policy.
         */
        public Builder policyUuid(Optional<String> policyUuid) {
            Utils.checkNotNull(policyUuid, "policyUuid");
            this.policyUuid = policyUuid;
            return this;
        }

        /**
         * The unit the PTO type is accrued in.
         */
        public Builder accrualUnit(String accrualUnit) {
            Utils.checkNotNull(accrualUnit, "accrualUnit");
            this.accrualUnit = Optional.ofNullable(accrualUnit);
            return this;
        }

        /**
         * The unit the PTO type is accrued in.
         */
        public Builder accrualUnit(Optional<String> accrualUnit) {
            Utils.checkNotNull(accrualUnit, "accrualUnit");
            this.accrualUnit = accrualUnit;
            return this;
        }

        /**
         * The number of accrual units accrued per accrual period.
         */
        public Builder accrualRate(String accrualRate) {
            Utils.checkNotNull(accrualRate, "accrualRate");
            this.accrualRate = Optional.ofNullable(accrualRate);
            return this;
        }

        /**
         * The number of accrual units accrued per accrual period.
         */
        public Builder accrualRate(Optional<String> accrualRate) {
            Utils.checkNotNull(accrualRate, "accrualRate");
            this.accrualRate = accrualRate;
            return this;
        }

        /**
         * The accrual method of the time off policy
         */
        public Builder accrualMethod(String accrualMethod) {
            Utils.checkNotNull(accrualMethod, "accrualMethod");
            this.accrualMethod = Optional.ofNullable(accrualMethod);
            return this;
        }

        /**
         * The accrual method of the time off policy
         */
        public Builder accrualMethod(Optional<String> accrualMethod) {
            Utils.checkNotNull(accrualMethod, "accrualMethod");
            this.accrualMethod = accrualMethod;
            return this;
        }

        /**
         * The frequency at which the PTO type is accrued.
         */
        public Builder accrualPeriod(String accrualPeriod) {
            Utils.checkNotNull(accrualPeriod, "accrualPeriod");
            this.accrualPeriod = Optional.ofNullable(accrualPeriod);
            return this;
        }

        /**
         * The frequency at which the PTO type is accrued.
         */
        public Builder accrualPeriod(Optional<String> accrualPeriod) {
            Utils.checkNotNull(accrualPeriod, "accrualPeriod");
            this.accrualPeriod = accrualPeriod;
            return this;
        }

        /**
         * The number of accrual units accrued.
         */
        public Builder accrualBalance(String accrualBalance) {
            Utils.checkNotNull(accrualBalance, "accrualBalance");
            this.accrualBalance = Optional.ofNullable(accrualBalance);
            return this;
        }

        /**
         * The number of accrual units accrued.
         */
        public Builder accrualBalance(Optional<String> accrualBalance) {
            Utils.checkNotNull(accrualBalance, "accrualBalance");
            this.accrualBalance = accrualBalance;
            return this;
        }

        /**
         * The maximum number of accrual units allowed. A null value signifies no maximum.
         */
        public Builder maximumAccrualBalance(String maximumAccrualBalance) {
            Utils.checkNotNull(maximumAccrualBalance, "maximumAccrualBalance");
            this.maximumAccrualBalance = JsonNullable.of(maximumAccrualBalance);
            return this;
        }

        /**
         * The maximum number of accrual units allowed. A null value signifies no maximum.
         */
        public Builder maximumAccrualBalance(JsonNullable<String> maximumAccrualBalance) {
            Utils.checkNotNull(maximumAccrualBalance, "maximumAccrualBalance");
            this.maximumAccrualBalance = maximumAccrualBalance;
            return this;
        }

        /**
         * Whether the accrual balance is paid to the employee upon termination.
         */
        public Builder paidAtTermination(boolean paidAtTermination) {
            Utils.checkNotNull(paidAtTermination, "paidAtTermination");
            this.paidAtTermination = Optional.ofNullable(paidAtTermination);
            return this;
        }

        /**
         * Whether the accrual balance is paid to the employee upon termination.
         */
        public Builder paidAtTermination(Optional<Boolean> paidAtTermination) {
            Utils.checkNotNull(paidAtTermination, "paidAtTermination");
            this.paidAtTermination = paidAtTermination;
            return this;
        }
        
        public PaidTimeOff build() {
            return new PaidTimeOff(
                name,
                policyName,
                policyUuid,
                accrualUnit,
                accrualRate,
                accrualMethod,
                accrualPeriod,
                accrualBalance,
                maximumAccrualBalance,
                paidAtTermination);
        }
    }
}

