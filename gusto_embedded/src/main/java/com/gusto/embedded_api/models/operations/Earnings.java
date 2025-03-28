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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
/**
 * Earnings
 * 
 * <p>An array of earnings for the employee. Depends on your company selections, earnings includes wages, hours, bonuses, tips, commission and more.
 */

public class Earnings {

    /**
     * The hour of the compensation for the pay period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours")
    private Optional<String> hours;

    /**
     * The amount of the earning.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<String> amount;

    /**
     * The ID of the earning.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("earning_id")
    private Optional<Long> earningId;

    /**
     * The earning type for the compensation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("earning_type")
    private Optional<? extends EarningType> earningType;

    @JsonCreator
    public Earnings(
            @JsonProperty("hours") Optional<String> hours,
            @JsonProperty("amount") Optional<String> amount,
            @JsonProperty("earning_id") Optional<Long> earningId,
            @JsonProperty("earning_type") Optional<? extends EarningType> earningType) {
        Utils.checkNotNull(hours, "hours");
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(earningId, "earningId");
        Utils.checkNotNull(earningType, "earningType");
        this.hours = hours;
        this.amount = amount;
        this.earningId = earningId;
        this.earningType = earningType;
    }
    
    public Earnings() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The hour of the compensation for the pay period.
     */
    @JsonIgnore
    public Optional<String> hours() {
        return hours;
    }

    /**
     * The amount of the earning.
     */
    @JsonIgnore
    public Optional<String> amount() {
        return amount;
    }

    /**
     * The ID of the earning.
     */
    @JsonIgnore
    public Optional<Long> earningId() {
        return earningId;
    }

    /**
     * The earning type for the compensation.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EarningType> earningType() {
        return (Optional<EarningType>) earningType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The hour of the compensation for the pay period.
     */
    public Earnings withHours(String hours) {
        Utils.checkNotNull(hours, "hours");
        this.hours = Optional.ofNullable(hours);
        return this;
    }

    /**
     * The hour of the compensation for the pay period.
     */
    public Earnings withHours(Optional<String> hours) {
        Utils.checkNotNull(hours, "hours");
        this.hours = hours;
        return this;
    }

    /**
     * The amount of the earning.
     */
    public Earnings withAmount(String amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    /**
     * The amount of the earning.
     */
    public Earnings withAmount(Optional<String> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    /**
     * The ID of the earning.
     */
    public Earnings withEarningId(long earningId) {
        Utils.checkNotNull(earningId, "earningId");
        this.earningId = Optional.ofNullable(earningId);
        return this;
    }

    /**
     * The ID of the earning.
     */
    public Earnings withEarningId(Optional<Long> earningId) {
        Utils.checkNotNull(earningId, "earningId");
        this.earningId = earningId;
        return this;
    }

    /**
     * The earning type for the compensation.
     */
    public Earnings withEarningType(EarningType earningType) {
        Utils.checkNotNull(earningType, "earningType");
        this.earningType = Optional.ofNullable(earningType);
        return this;
    }

    /**
     * The earning type for the compensation.
     */
    public Earnings withEarningType(Optional<? extends EarningType> earningType) {
        Utils.checkNotNull(earningType, "earningType");
        this.earningType = earningType;
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
        Earnings other = (Earnings) o;
        return 
            Objects.deepEquals(this.hours, other.hours) &&
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.earningId, other.earningId) &&
            Objects.deepEquals(this.earningType, other.earningType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hours,
            amount,
            earningId,
            earningType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Earnings.class,
                "hours", hours,
                "amount", amount,
                "earningId", earningId,
                "earningType", earningType);
    }
    
    public final static class Builder {
 
        private Optional<String> hours = Optional.empty();
 
        private Optional<String> amount = Optional.empty();
 
        private Optional<Long> earningId = Optional.empty();
 
        private Optional<? extends EarningType> earningType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The hour of the compensation for the pay period.
         */
        public Builder hours(String hours) {
            Utils.checkNotNull(hours, "hours");
            this.hours = Optional.ofNullable(hours);
            return this;
        }

        /**
         * The hour of the compensation for the pay period.
         */
        public Builder hours(Optional<String> hours) {
            Utils.checkNotNull(hours, "hours");
            this.hours = hours;
            return this;
        }

        /**
         * The amount of the earning.
         */
        public Builder amount(String amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        /**
         * The amount of the earning.
         */
        public Builder amount(Optional<String> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        /**
         * The ID of the earning.
         */
        public Builder earningId(long earningId) {
            Utils.checkNotNull(earningId, "earningId");
            this.earningId = Optional.ofNullable(earningId);
            return this;
        }

        /**
         * The ID of the earning.
         */
        public Builder earningId(Optional<Long> earningId) {
            Utils.checkNotNull(earningId, "earningId");
            this.earningId = earningId;
            return this;
        }

        /**
         * The earning type for the compensation.
         */
        public Builder earningType(EarningType earningType) {
            Utils.checkNotNull(earningType, "earningType");
            this.earningType = Optional.ofNullable(earningType);
            return this;
        }

        /**
         * The earning type for the compensation.
         */
        public Builder earningType(Optional<? extends EarningType> earningType) {
            Utils.checkNotNull(earningType, "earningType");
            this.earningType = earningType;
            return this;
        }
        
        public Earnings build() {
            return new Earnings(
                hours,
                amount,
                earningId,
                earningType);
        }
    }
}

