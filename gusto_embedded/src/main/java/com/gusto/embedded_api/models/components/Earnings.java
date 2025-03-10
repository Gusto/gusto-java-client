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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class Earnings {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("amount")
    private Optional<String> amount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours")
    private Optional<String> hours;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("earning_type")
    private Optional<String> earningType;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("earning_id")
    private Optional<Long> earningId;

    @JsonCreator
    public Earnings(
            @JsonProperty("amount") Optional<String> amount,
            @JsonProperty("hours") Optional<String> hours,
            @JsonProperty("earning_type") Optional<String> earningType,
            @JsonProperty("earning_id") Optional<Long> earningId) {
        Utils.checkNotNull(amount, "amount");
        Utils.checkNotNull(hours, "hours");
        Utils.checkNotNull(earningType, "earningType");
        Utils.checkNotNull(earningId, "earningId");
        this.amount = amount;
        this.hours = hours;
        this.earningType = earningType;
        this.earningId = earningId;
    }
    
    public Earnings() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> amount() {
        return amount;
    }

    @JsonIgnore
    public Optional<String> hours() {
        return hours;
    }

    @JsonIgnore
    public Optional<String> earningType() {
        return earningType;
    }

    @JsonIgnore
    public Optional<Long> earningId() {
        return earningId;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Earnings withAmount(String amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = Optional.ofNullable(amount);
        return this;
    }

    public Earnings withAmount(Optional<String> amount) {
        Utils.checkNotNull(amount, "amount");
        this.amount = amount;
        return this;
    }

    public Earnings withHours(String hours) {
        Utils.checkNotNull(hours, "hours");
        this.hours = Optional.ofNullable(hours);
        return this;
    }

    public Earnings withHours(Optional<String> hours) {
        Utils.checkNotNull(hours, "hours");
        this.hours = hours;
        return this;
    }

    public Earnings withEarningType(String earningType) {
        Utils.checkNotNull(earningType, "earningType");
        this.earningType = Optional.ofNullable(earningType);
        return this;
    }

    public Earnings withEarningType(Optional<String> earningType) {
        Utils.checkNotNull(earningType, "earningType");
        this.earningType = earningType;
        return this;
    }

    public Earnings withEarningId(long earningId) {
        Utils.checkNotNull(earningId, "earningId");
        this.earningId = Optional.ofNullable(earningId);
        return this;
    }

    public Earnings withEarningId(Optional<Long> earningId) {
        Utils.checkNotNull(earningId, "earningId");
        this.earningId = earningId;
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
            Objects.deepEquals(this.amount, other.amount) &&
            Objects.deepEquals(this.hours, other.hours) &&
            Objects.deepEquals(this.earningType, other.earningType) &&
            Objects.deepEquals(this.earningId, other.earningId);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            amount,
            hours,
            earningType,
            earningId);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Earnings.class,
                "amount", amount,
                "hours", hours,
                "earningType", earningType,
                "earningId", earningId);
    }
    
    public final static class Builder {
 
        private Optional<String> amount = Optional.empty();
 
        private Optional<String> hours = Optional.empty();
 
        private Optional<String> earningType = Optional.empty();
 
        private Optional<Long> earningId = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder amount(String amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = Optional.ofNullable(amount);
            return this;
        }

        public Builder amount(Optional<String> amount) {
            Utils.checkNotNull(amount, "amount");
            this.amount = amount;
            return this;
        }

        public Builder hours(String hours) {
            Utils.checkNotNull(hours, "hours");
            this.hours = Optional.ofNullable(hours);
            return this;
        }

        public Builder hours(Optional<String> hours) {
            Utils.checkNotNull(hours, "hours");
            this.hours = hours;
            return this;
        }

        public Builder earningType(String earningType) {
            Utils.checkNotNull(earningType, "earningType");
            this.earningType = Optional.ofNullable(earningType);
            return this;
        }

        public Builder earningType(Optional<String> earningType) {
            Utils.checkNotNull(earningType, "earningType");
            this.earningType = earningType;
            return this;
        }

        public Builder earningId(long earningId) {
            Utils.checkNotNull(earningId, "earningId");
            this.earningId = Optional.ofNullable(earningId);
            return this;
        }

        public Builder earningId(Optional<Long> earningId) {
            Utils.checkNotNull(earningId, "earningId");
            this.earningId = earningId;
            return this;
        }
        
        public Earnings build() {
            return new Earnings(
                amount,
                hours,
                earningType,
                earningId);
        }
    }
}

