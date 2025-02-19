/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

/**
 * ValueTiers - A single tier of a tiered matching scheme.
 */

public class ValueTiers {

    /**
     * The percentage of employee deduction within this tier the company contribution will match.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rate")
    private Optional<String> rate;

    /**
     * The percentage threshold at which this tier ends (inclusive).
     * 
     * For example, a value of "5" means the company contribution will match employee deductions from the previous tier's threshold up to and including 5% of payroll.
     * 
     * If this is the first tier, a value of "5" means the company contribution will match employee deductions from 0% up to and including 5% of payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("threshold")
    private Optional<String> threshold;

    /**
     * The step up difference between this tier's threshold and the previous tier's threshold. In the first tier, this is equivalent to threshold.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("threshold_delta")
    private Optional<String> thresholdDelta;

    @JsonCreator
    public ValueTiers(
            @JsonProperty("rate") Optional<String> rate,
            @JsonProperty("threshold") Optional<String> threshold,
            @JsonProperty("threshold_delta") Optional<String> thresholdDelta) {
        Utils.checkNotNull(rate, "rate");
        Utils.checkNotNull(threshold, "threshold");
        Utils.checkNotNull(thresholdDelta, "thresholdDelta");
        this.rate = rate;
        this.threshold = threshold;
        this.thresholdDelta = thresholdDelta;
    }
    
    public ValueTiers() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The percentage of employee deduction within this tier the company contribution will match.
     */
    @JsonIgnore
    public Optional<String> rate() {
        return rate;
    }

    /**
     * The percentage threshold at which this tier ends (inclusive).
     * 
     * For example, a value of "5" means the company contribution will match employee deductions from the previous tier's threshold up to and including 5% of payroll.
     * 
     * If this is the first tier, a value of "5" means the company contribution will match employee deductions from 0% up to and including 5% of payroll.
     */
    @JsonIgnore
    public Optional<String> threshold() {
        return threshold;
    }

    /**
     * The step up difference between this tier's threshold and the previous tier's threshold. In the first tier, this is equivalent to threshold.
     */
    @JsonIgnore
    public Optional<String> thresholdDelta() {
        return thresholdDelta;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The percentage of employee deduction within this tier the company contribution will match.
     */
    public ValueTiers withRate(String rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = Optional.ofNullable(rate);
        return this;
    }

    /**
     * The percentage of employee deduction within this tier the company contribution will match.
     */
    public ValueTiers withRate(Optional<String> rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = rate;
        return this;
    }

    /**
     * The percentage threshold at which this tier ends (inclusive).
     * 
     * For example, a value of "5" means the company contribution will match employee deductions from the previous tier's threshold up to and including 5% of payroll.
     * 
     * If this is the first tier, a value of "5" means the company contribution will match employee deductions from 0% up to and including 5% of payroll.
     */
    public ValueTiers withThreshold(String threshold) {
        Utils.checkNotNull(threshold, "threshold");
        this.threshold = Optional.ofNullable(threshold);
        return this;
    }

    /**
     * The percentage threshold at which this tier ends (inclusive).
     * 
     * For example, a value of "5" means the company contribution will match employee deductions from the previous tier's threshold up to and including 5% of payroll.
     * 
     * If this is the first tier, a value of "5" means the company contribution will match employee deductions from 0% up to and including 5% of payroll.
     */
    public ValueTiers withThreshold(Optional<String> threshold) {
        Utils.checkNotNull(threshold, "threshold");
        this.threshold = threshold;
        return this;
    }

    /**
     * The step up difference between this tier's threshold and the previous tier's threshold. In the first tier, this is equivalent to threshold.
     */
    public ValueTiers withThresholdDelta(String thresholdDelta) {
        Utils.checkNotNull(thresholdDelta, "thresholdDelta");
        this.thresholdDelta = Optional.ofNullable(thresholdDelta);
        return this;
    }

    /**
     * The step up difference between this tier's threshold and the previous tier's threshold. In the first tier, this is equivalent to threshold.
     */
    public ValueTiers withThresholdDelta(Optional<String> thresholdDelta) {
        Utils.checkNotNull(thresholdDelta, "thresholdDelta");
        this.thresholdDelta = thresholdDelta;
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
        ValueTiers other = (ValueTiers) o;
        return 
            Objects.deepEquals(this.rate, other.rate) &&
            Objects.deepEquals(this.threshold, other.threshold) &&
            Objects.deepEquals(this.thresholdDelta, other.thresholdDelta);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            rate,
            threshold,
            thresholdDelta);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ValueTiers.class,
                "rate", rate,
                "threshold", threshold,
                "thresholdDelta", thresholdDelta);
    }
    
    public final static class Builder {
 
        private Optional<String> rate = Optional.empty();
 
        private Optional<String> threshold = Optional.empty();
 
        private Optional<String> thresholdDelta = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The percentage of employee deduction within this tier the company contribution will match.
         */
        public Builder rate(String rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = Optional.ofNullable(rate);
            return this;
        }

        /**
         * The percentage of employee deduction within this tier the company contribution will match.
         */
        public Builder rate(Optional<String> rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = rate;
            return this;
        }

        /**
         * The percentage threshold at which this tier ends (inclusive).
         * 
         * For example, a value of "5" means the company contribution will match employee deductions from the previous tier's threshold up to and including 5% of payroll.
         * 
         * If this is the first tier, a value of "5" means the company contribution will match employee deductions from 0% up to and including 5% of payroll.
         */
        public Builder threshold(String threshold) {
            Utils.checkNotNull(threshold, "threshold");
            this.threshold = Optional.ofNullable(threshold);
            return this;
        }

        /**
         * The percentage threshold at which this tier ends (inclusive).
         * 
         * For example, a value of "5" means the company contribution will match employee deductions from the previous tier's threshold up to and including 5% of payroll.
         * 
         * If this is the first tier, a value of "5" means the company contribution will match employee deductions from 0% up to and including 5% of payroll.
         */
        public Builder threshold(Optional<String> threshold) {
            Utils.checkNotNull(threshold, "threshold");
            this.threshold = threshold;
            return this;
        }

        /**
         * The step up difference between this tier's threshold and the previous tier's threshold. In the first tier, this is equivalent to threshold.
         */
        public Builder thresholdDelta(String thresholdDelta) {
            Utils.checkNotNull(thresholdDelta, "thresholdDelta");
            this.thresholdDelta = Optional.ofNullable(thresholdDelta);
            return this;
        }

        /**
         * The step up difference between this tier's threshold and the previous tier's threshold. In the first tier, this is equivalent to threshold.
         */
        public Builder thresholdDelta(Optional<String> thresholdDelta) {
            Utils.checkNotNull(thresholdDelta, "thresholdDelta");
            this.thresholdDelta = thresholdDelta;
            return this;
        }
        
        public ValueTiers build() {
            return new ValueTiers(
                rate,
                threshold,
                thresholdDelta);
        }
    }
}

