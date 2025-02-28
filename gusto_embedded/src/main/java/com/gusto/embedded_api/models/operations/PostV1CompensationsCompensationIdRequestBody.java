/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.models.components.FlsaStatusType;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PostV1CompensationsCompensationIdRequestBody {

    /**
     * The dollar amount paid per payment unit.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rate")
    private Optional<String> rate;

    /**
     * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
     */
    @JsonProperty("payment_unit")
    private PaymentUnit paymentUnit;

    /**
     * The date when the compensation takes effect.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_date")
    private Optional<String> effectiveDate;

    /**
     * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company. 
     */
    @JsonProperty("flsa_status")
    private FlsaStatusType flsaStatus;

    /**
     * Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("adjust_for_minimum_wage")
    private Optional<Boolean> adjustForMinimumWage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_wages")
    private Optional<? extends List<MinimumWages>> minimumWages;

    @JsonCreator
    public PostV1CompensationsCompensationIdRequestBody(
            @JsonProperty("rate") Optional<String> rate,
            @JsonProperty("payment_unit") PaymentUnit paymentUnit,
            @JsonProperty("effective_date") Optional<String> effectiveDate,
            @JsonProperty("flsa_status") FlsaStatusType flsaStatus,
            @JsonProperty("adjust_for_minimum_wage") Optional<Boolean> adjustForMinimumWage,
            @JsonProperty("minimum_wages") Optional<? extends List<MinimumWages>> minimumWages) {
        Utils.checkNotNull(rate, "rate");
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        Utils.checkNotNull(flsaStatus, "flsaStatus");
        Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
        Utils.checkNotNull(minimumWages, "minimumWages");
        this.rate = rate;
        this.paymentUnit = paymentUnit;
        this.effectiveDate = effectiveDate;
        this.flsaStatus = flsaStatus;
        this.adjustForMinimumWage = adjustForMinimumWage;
        this.minimumWages = minimumWages;
    }
    
    public PostV1CompensationsCompensationIdRequestBody(
            PaymentUnit paymentUnit,
            FlsaStatusType flsaStatus) {
        this(Optional.empty(), paymentUnit, Optional.empty(), flsaStatus, Optional.empty(), Optional.empty());
    }

    /**
     * The dollar amount paid per payment unit.
     */
    @JsonIgnore
    public Optional<String> rate() {
        return rate;
    }

    /**
     * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
     */
    @JsonIgnore
    public PaymentUnit paymentUnit() {
        return paymentUnit;
    }

    /**
     * The date when the compensation takes effect.
     */
    @JsonIgnore
    public Optional<String> effectiveDate() {
        return effectiveDate;
    }

    /**
     * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company. 
     */
    @JsonIgnore
    public FlsaStatusType flsaStatus() {
        return flsaStatus;
    }

    /**
     * Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
     */
    @JsonIgnore
    public Optional<Boolean> adjustForMinimumWage() {
        return adjustForMinimumWage;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MinimumWages>> minimumWages() {
        return (Optional<List<MinimumWages>>) minimumWages;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The dollar amount paid per payment unit.
     */
    public PostV1CompensationsCompensationIdRequestBody withRate(String rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = Optional.ofNullable(rate);
        return this;
    }

    /**
     * The dollar amount paid per payment unit.
     */
    public PostV1CompensationsCompensationIdRequestBody withRate(Optional<String> rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = rate;
        return this;
    }

    /**
     * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
     */
    public PostV1CompensationsCompensationIdRequestBody withPaymentUnit(PaymentUnit paymentUnit) {
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        this.paymentUnit = paymentUnit;
        return this;
    }

    /**
     * The date when the compensation takes effect.
     */
    public PostV1CompensationsCompensationIdRequestBody withEffectiveDate(String effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = Optional.ofNullable(effectiveDate);
        return this;
    }

    /**
     * The date when the compensation takes effect.
     */
    public PostV1CompensationsCompensationIdRequestBody withEffectiveDate(Optional<String> effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company. 
     */
    public PostV1CompensationsCompensationIdRequestBody withFlsaStatus(FlsaStatusType flsaStatus) {
        Utils.checkNotNull(flsaStatus, "flsaStatus");
        this.flsaStatus = flsaStatus;
        return this;
    }

    /**
     * Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
     */
    public PostV1CompensationsCompensationIdRequestBody withAdjustForMinimumWage(boolean adjustForMinimumWage) {
        Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
        this.adjustForMinimumWage = Optional.ofNullable(adjustForMinimumWage);
        return this;
    }

    /**
     * Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
     */
    public PostV1CompensationsCompensationIdRequestBody withAdjustForMinimumWage(Optional<Boolean> adjustForMinimumWage) {
        Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
        this.adjustForMinimumWage = adjustForMinimumWage;
        return this;
    }

    public PostV1CompensationsCompensationIdRequestBody withMinimumWages(List<MinimumWages> minimumWages) {
        Utils.checkNotNull(minimumWages, "minimumWages");
        this.minimumWages = Optional.ofNullable(minimumWages);
        return this;
    }

    public PostV1CompensationsCompensationIdRequestBody withMinimumWages(Optional<? extends List<MinimumWages>> minimumWages) {
        Utils.checkNotNull(minimumWages, "minimumWages");
        this.minimumWages = minimumWages;
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
        PostV1CompensationsCompensationIdRequestBody other = (PostV1CompensationsCompensationIdRequestBody) o;
        return 
            Objects.deepEquals(this.rate, other.rate) &&
            Objects.deepEquals(this.paymentUnit, other.paymentUnit) &&
            Objects.deepEquals(this.effectiveDate, other.effectiveDate) &&
            Objects.deepEquals(this.flsaStatus, other.flsaStatus) &&
            Objects.deepEquals(this.adjustForMinimumWage, other.adjustForMinimumWage) &&
            Objects.deepEquals(this.minimumWages, other.minimumWages);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            rate,
            paymentUnit,
            effectiveDate,
            flsaStatus,
            adjustForMinimumWage,
            minimumWages);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1CompensationsCompensationIdRequestBody.class,
                "rate", rate,
                "paymentUnit", paymentUnit,
                "effectiveDate", effectiveDate,
                "flsaStatus", flsaStatus,
                "adjustForMinimumWage", adjustForMinimumWage,
                "minimumWages", minimumWages);
    }
    
    public final static class Builder {
 
        private Optional<String> rate = Optional.empty();
 
        private PaymentUnit paymentUnit;
 
        private Optional<String> effectiveDate = Optional.empty();
 
        private FlsaStatusType flsaStatus;
 
        private Optional<Boolean> adjustForMinimumWage = Optional.empty();
 
        private Optional<? extends List<MinimumWages>> minimumWages = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The dollar amount paid per payment unit.
         */
        public Builder rate(String rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = Optional.ofNullable(rate);
            return this;
        }

        /**
         * The dollar amount paid per payment unit.
         */
        public Builder rate(Optional<String> rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = rate;
            return this;
        }

        /**
         * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
         */
        public Builder paymentUnit(PaymentUnit paymentUnit) {
            Utils.checkNotNull(paymentUnit, "paymentUnit");
            this.paymentUnit = paymentUnit;
            return this;
        }

        /**
         * The date when the compensation takes effect.
         */
        public Builder effectiveDate(String effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = Optional.ofNullable(effectiveDate);
            return this;
        }

        /**
         * The date when the compensation takes effect.
         */
        public Builder effectiveDate(Optional<String> effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company. 
         */
        public Builder flsaStatus(FlsaStatusType flsaStatus) {
            Utils.checkNotNull(flsaStatus, "flsaStatus");
            this.flsaStatus = flsaStatus;
            return this;
        }

        /**
         * Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
         */
        public Builder adjustForMinimumWage(boolean adjustForMinimumWage) {
            Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
            this.adjustForMinimumWage = Optional.ofNullable(adjustForMinimumWage);
            return this;
        }

        /**
         * Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
         */
        public Builder adjustForMinimumWage(Optional<Boolean> adjustForMinimumWage) {
            Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
            this.adjustForMinimumWage = adjustForMinimumWage;
            return this;
        }

        public Builder minimumWages(List<MinimumWages> minimumWages) {
            Utils.checkNotNull(minimumWages, "minimumWages");
            this.minimumWages = Optional.ofNullable(minimumWages);
            return this;
        }

        public Builder minimumWages(Optional<? extends List<MinimumWages>> minimumWages) {
            Utils.checkNotNull(minimumWages, "minimumWages");
            this.minimumWages = minimumWages;
            return this;
        }
        
        public PostV1CompensationsCompensationIdRequestBody build() {
            return new PostV1CompensationsCompensationIdRequestBody(
                rate,
                paymentUnit,
                effectiveDate,
                flsaStatus,
                adjustForMinimumWage,
                minimumWages);
        }
    }
}

