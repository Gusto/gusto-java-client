/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


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
 * Two - A single tier of a tiered matching scheme.
 */

public class Two {

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

    @JsonCreator
    public Two(
            @JsonProperty("rate") Optional<String> rate,
            @JsonProperty("threshold") Optional<String> threshold) {
        Utils.checkNotNull(rate, "rate");
        Utils.checkNotNull(threshold, "threshold");
        this.rate = rate;
        this.threshold = threshold;
    }
    
    public Two() {
        this(Optional.empty(), Optional.empty());
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The percentage of employee deduction within this tier the company contribution will match.
     */
    public Two withRate(String rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = Optional.ofNullable(rate);
        return this;
    }

    /**
     * The percentage of employee deduction within this tier the company contribution will match.
     */
    public Two withRate(Optional<String> rate) {
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
    public Two withThreshold(String threshold) {
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
    public Two withThreshold(Optional<String> threshold) {
        Utils.checkNotNull(threshold, "threshold");
        this.threshold = threshold;
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
        Two other = (Two) o;
        return 
            Objects.deepEquals(this.rate, other.rate) &&
            Objects.deepEquals(this.threshold, other.threshold);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            rate,
            threshold);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Two.class,
                "rate", rate,
                "threshold", threshold);
    }
    
    public final static class Builder {
 
        private Optional<String> rate = Optional.empty();
 
        private Optional<String> threshold = Optional.empty();  
        
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
        
        public Two build() {
            return new Two(
                rate,
                threshold);
        }
    }
}

