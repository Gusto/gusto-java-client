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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
/**
 * Compensations
 * 
 * <p>The available company-wide compensation rates for the company.
 */

public class Compensations {

    /**
     * The available hourly compensation rates for the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hourly")
    private Optional<? extends List<Hourly>> hourly;

    /**
     * The available fixed compensation rates for the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fixed")
    private Optional<? extends List<Fixed>> fixed;

    /**
     * The available types of paid time off for the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("paid_time_off")
    private Optional<? extends List<CompanyPaidTimeOff>> paidTimeOff;

    @JsonCreator
    public Compensations(
            @JsonProperty("hourly") Optional<? extends List<Hourly>> hourly,
            @JsonProperty("fixed") Optional<? extends List<Fixed>> fixed,
            @JsonProperty("paid_time_off") Optional<? extends List<CompanyPaidTimeOff>> paidTimeOff) {
        Utils.checkNotNull(hourly, "hourly");
        Utils.checkNotNull(fixed, "fixed");
        Utils.checkNotNull(paidTimeOff, "paidTimeOff");
        this.hourly = hourly;
        this.fixed = fixed;
        this.paidTimeOff = paidTimeOff;
    }
    
    public Compensations() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The available hourly compensation rates for the company.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Hourly>> hourly() {
        return (Optional<List<Hourly>>) hourly;
    }

    /**
     * The available fixed compensation rates for the company.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Fixed>> fixed() {
        return (Optional<List<Fixed>>) fixed;
    }

    /**
     * The available types of paid time off for the company.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<CompanyPaidTimeOff>> paidTimeOff() {
        return (Optional<List<CompanyPaidTimeOff>>) paidTimeOff;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The available hourly compensation rates for the company.
     */
    public Compensations withHourly(List<Hourly> hourly) {
        Utils.checkNotNull(hourly, "hourly");
        this.hourly = Optional.ofNullable(hourly);
        return this;
    }

    /**
     * The available hourly compensation rates for the company.
     */
    public Compensations withHourly(Optional<? extends List<Hourly>> hourly) {
        Utils.checkNotNull(hourly, "hourly");
        this.hourly = hourly;
        return this;
    }

    /**
     * The available fixed compensation rates for the company.
     */
    public Compensations withFixed(List<Fixed> fixed) {
        Utils.checkNotNull(fixed, "fixed");
        this.fixed = Optional.ofNullable(fixed);
        return this;
    }

    /**
     * The available fixed compensation rates for the company.
     */
    public Compensations withFixed(Optional<? extends List<Fixed>> fixed) {
        Utils.checkNotNull(fixed, "fixed");
        this.fixed = fixed;
        return this;
    }

    /**
     * The available types of paid time off for the company.
     */
    public Compensations withPaidTimeOff(List<CompanyPaidTimeOff> paidTimeOff) {
        Utils.checkNotNull(paidTimeOff, "paidTimeOff");
        this.paidTimeOff = Optional.ofNullable(paidTimeOff);
        return this;
    }

    /**
     * The available types of paid time off for the company.
     */
    public Compensations withPaidTimeOff(Optional<? extends List<CompanyPaidTimeOff>> paidTimeOff) {
        Utils.checkNotNull(paidTimeOff, "paidTimeOff");
        this.paidTimeOff = paidTimeOff;
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
        Compensations other = (Compensations) o;
        return 
            Objects.deepEquals(this.hourly, other.hourly) &&
            Objects.deepEquals(this.fixed, other.fixed) &&
            Objects.deepEquals(this.paidTimeOff, other.paidTimeOff);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            hourly,
            fixed,
            paidTimeOff);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Compensations.class,
                "hourly", hourly,
                "fixed", fixed,
                "paidTimeOff", paidTimeOff);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Hourly>> hourly = Optional.empty();
 
        private Optional<? extends List<Fixed>> fixed = Optional.empty();
 
        private Optional<? extends List<CompanyPaidTimeOff>> paidTimeOff = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The available hourly compensation rates for the company.
         */
        public Builder hourly(List<Hourly> hourly) {
            Utils.checkNotNull(hourly, "hourly");
            this.hourly = Optional.ofNullable(hourly);
            return this;
        }

        /**
         * The available hourly compensation rates for the company.
         */
        public Builder hourly(Optional<? extends List<Hourly>> hourly) {
            Utils.checkNotNull(hourly, "hourly");
            this.hourly = hourly;
            return this;
        }

        /**
         * The available fixed compensation rates for the company.
         */
        public Builder fixed(List<Fixed> fixed) {
            Utils.checkNotNull(fixed, "fixed");
            this.fixed = Optional.ofNullable(fixed);
            return this;
        }

        /**
         * The available fixed compensation rates for the company.
         */
        public Builder fixed(Optional<? extends List<Fixed>> fixed) {
            Utils.checkNotNull(fixed, "fixed");
            this.fixed = fixed;
            return this;
        }

        /**
         * The available types of paid time off for the company.
         */
        public Builder paidTimeOff(List<CompanyPaidTimeOff> paidTimeOff) {
            Utils.checkNotNull(paidTimeOff, "paidTimeOff");
            this.paidTimeOff = Optional.ofNullable(paidTimeOff);
            return this;
        }

        /**
         * The available types of paid time off for the company.
         */
        public Builder paidTimeOff(Optional<? extends List<CompanyPaidTimeOff>> paidTimeOff) {
            Utils.checkNotNull(paidTimeOff, "paidTimeOff");
            this.paidTimeOff = paidTimeOff;
            return this;
        }
        
        public Compensations build() {
            return new Compensations(
                hourly,
                fixed,
                paidTimeOff);
        }
    }
}

