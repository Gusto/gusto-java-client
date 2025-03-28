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

public class PutV1CompensationsCompensationIdRequestBody {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

    /**
     * The dollar amount paid per payment unit.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rate")
    private Optional<String> rate;

    /**
     * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_unit")
    private Optional<? extends PutV1CompensationsCompensationIdPaymentUnit> paymentUnit;

    /**
     * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flsa_status")
    private Optional<? extends FlsaStatusType> flsaStatus;

    /**
     * Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("adjust_for_minimum_wage")
    private Optional<Boolean> adjustForMinimumWage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_wages")
    private Optional<? extends List<PutV1CompensationsCompensationIdMinimumWages>> minimumWages;

    @JsonCreator
    public PutV1CompensationsCompensationIdRequestBody(
            @JsonProperty("version") String version,
            @JsonProperty("rate") Optional<String> rate,
            @JsonProperty("payment_unit") Optional<? extends PutV1CompensationsCompensationIdPaymentUnit> paymentUnit,
            @JsonProperty("flsa_status") Optional<? extends FlsaStatusType> flsaStatus,
            @JsonProperty("adjust_for_minimum_wage") Optional<Boolean> adjustForMinimumWage,
            @JsonProperty("minimum_wages") Optional<? extends List<PutV1CompensationsCompensationIdMinimumWages>> minimumWages) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(rate, "rate");
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        Utils.checkNotNull(flsaStatus, "flsaStatus");
        Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
        Utils.checkNotNull(minimumWages, "minimumWages");
        this.version = version;
        this.rate = rate;
        this.paymentUnit = paymentUnit;
        this.flsaStatus = flsaStatus;
        this.adjustForMinimumWage = adjustForMinimumWage;
        this.minimumWages = minimumWages;
    }
    
    public PutV1CompensationsCompensationIdRequestBody(
            String version) {
        this(version, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
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
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PutV1CompensationsCompensationIdPaymentUnit> paymentUnit() {
        return (Optional<PutV1CompensationsCompensationIdPaymentUnit>) paymentUnit;
    }

    /**
     * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<FlsaStatusType> flsaStatus() {
        return (Optional<FlsaStatusType>) flsaStatus;
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
    public Optional<List<PutV1CompensationsCompensationIdMinimumWages>> minimumWages() {
        return (Optional<List<PutV1CompensationsCompensationIdMinimumWages>>) minimumWages;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    public PutV1CompensationsCompensationIdRequestBody withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * The dollar amount paid per payment unit.
     */
    public PutV1CompensationsCompensationIdRequestBody withRate(String rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = Optional.ofNullable(rate);
        return this;
    }

    /**
     * The dollar amount paid per payment unit.
     */
    public PutV1CompensationsCompensationIdRequestBody withRate(Optional<String> rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = rate;
        return this;
    }

    /**
     * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
     */
    public PutV1CompensationsCompensationIdRequestBody withPaymentUnit(PutV1CompensationsCompensationIdPaymentUnit paymentUnit) {
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        this.paymentUnit = Optional.ofNullable(paymentUnit);
        return this;
    }

    /**
     * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
     */
    public PutV1CompensationsCompensationIdRequestBody withPaymentUnit(Optional<? extends PutV1CompensationsCompensationIdPaymentUnit> paymentUnit) {
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        this.paymentUnit = paymentUnit;
        return this;
    }

    /**
     * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company.
     */
    public PutV1CompensationsCompensationIdRequestBody withFlsaStatus(FlsaStatusType flsaStatus) {
        Utils.checkNotNull(flsaStatus, "flsaStatus");
        this.flsaStatus = Optional.ofNullable(flsaStatus);
        return this;
    }

    /**
     * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company.
     */
    public PutV1CompensationsCompensationIdRequestBody withFlsaStatus(Optional<? extends FlsaStatusType> flsaStatus) {
        Utils.checkNotNull(flsaStatus, "flsaStatus");
        this.flsaStatus = flsaStatus;
        return this;
    }

    /**
     * Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
     */
    public PutV1CompensationsCompensationIdRequestBody withAdjustForMinimumWage(boolean adjustForMinimumWage) {
        Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
        this.adjustForMinimumWage = Optional.ofNullable(adjustForMinimumWage);
        return this;
    }

    /**
     * Determines whether the compensation should be adjusted for minimum wage. Only applies to Nonexempt employees.
     */
    public PutV1CompensationsCompensationIdRequestBody withAdjustForMinimumWage(Optional<Boolean> adjustForMinimumWage) {
        Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
        this.adjustForMinimumWage = adjustForMinimumWage;
        return this;
    }

    public PutV1CompensationsCompensationIdRequestBody withMinimumWages(List<PutV1CompensationsCompensationIdMinimumWages> minimumWages) {
        Utils.checkNotNull(minimumWages, "minimumWages");
        this.minimumWages = Optional.ofNullable(minimumWages);
        return this;
    }

    public PutV1CompensationsCompensationIdRequestBody withMinimumWages(Optional<? extends List<PutV1CompensationsCompensationIdMinimumWages>> minimumWages) {
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
        PutV1CompensationsCompensationIdRequestBody other = (PutV1CompensationsCompensationIdRequestBody) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.rate, other.rate) &&
            Objects.deepEquals(this.paymentUnit, other.paymentUnit) &&
            Objects.deepEquals(this.flsaStatus, other.flsaStatus) &&
            Objects.deepEquals(this.adjustForMinimumWage, other.adjustForMinimumWage) &&
            Objects.deepEquals(this.minimumWages, other.minimumWages);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            version,
            rate,
            paymentUnit,
            flsaStatus,
            adjustForMinimumWage,
            minimumWages);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1CompensationsCompensationIdRequestBody.class,
                "version", version,
                "rate", rate,
                "paymentUnit", paymentUnit,
                "flsaStatus", flsaStatus,
                "adjustForMinimumWage", adjustForMinimumWage,
                "minimumWages", minimumWages);
    }
    
    public final static class Builder {
 
        private String version;
 
        private Optional<String> rate = Optional.empty();
 
        private Optional<? extends PutV1CompensationsCompensationIdPaymentUnit> paymentUnit = Optional.empty();
 
        private Optional<? extends FlsaStatusType> flsaStatus = Optional.empty();
 
        private Optional<Boolean> adjustForMinimumWage = Optional.empty();
 
        private Optional<? extends List<PutV1CompensationsCompensationIdMinimumWages>> minimumWages = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
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
        public Builder paymentUnit(PutV1CompensationsCompensationIdPaymentUnit paymentUnit) {
            Utils.checkNotNull(paymentUnit, "paymentUnit");
            this.paymentUnit = Optional.ofNullable(paymentUnit);
            return this;
        }

        /**
         * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
         */
        public Builder paymentUnit(Optional<? extends PutV1CompensationsCompensationIdPaymentUnit> paymentUnit) {
            Utils.checkNotNull(paymentUnit, "paymentUnit");
            this.paymentUnit = paymentUnit;
            return this;
        }

        /**
         * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company.
         */
        public Builder flsaStatus(FlsaStatusType flsaStatus) {
            Utils.checkNotNull(flsaStatus, "flsaStatus");
            this.flsaStatus = Optional.ofNullable(flsaStatus);
            return this;
        }

        /**
         * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company.
         */
        public Builder flsaStatus(Optional<? extends FlsaStatusType> flsaStatus) {
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

        public Builder minimumWages(List<PutV1CompensationsCompensationIdMinimumWages> minimumWages) {
            Utils.checkNotNull(minimumWages, "minimumWages");
            this.minimumWages = Optional.ofNullable(minimumWages);
            return this;
        }

        public Builder minimumWages(Optional<? extends List<PutV1CompensationsCompensationIdMinimumWages>> minimumWages) {
            Utils.checkNotNull(minimumWages, "minimumWages");
            this.minimumWages = minimumWages;
            return this;
        }
        
        public PutV1CompensationsCompensationIdRequestBody build() {
            return new PutV1CompensationsCompensationIdRequestBody(
                version,
                rate,
                paymentUnit,
                flsaStatus,
                adjustForMinimumWage,
                minimumWages);
        }
    }
}

