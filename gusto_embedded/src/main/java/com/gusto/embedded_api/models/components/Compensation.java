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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
/**
 * Compensation - The representation of compensation in Gusto.
 */

public class Compensation {

    /**
     * The UUID of the compensation in Gusto.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    private Optional<String> version;

    /**
     * The UUID of the job to which the compensation belongs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("job_uuid")
    private Optional<String> jobUuid;

    /**
     * The UUID of the employee to which the compensation belongs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_uuid")
    private Optional<String> employeeUuid;

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
    private Optional<? extends PaymentUnit> paymentUnit;

    /**
     * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company. 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("flsa_status")
    private Optional<? extends FlsaStatusType> flsaStatus;

    /**
     * The effective date for this compensation. For the first compensation, this defaults to the job's hire date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_date")
    private Optional<String> effectiveDate;

    /**
     * Indicates if the compensation could be adjusted to minimum wage during payroll calculation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("adjust_for_minimum_wage")
    private Optional<Boolean> adjustForMinimumWage;

    /**
     * The minimum wages associated with the compensation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minimum_wages")
    private Optional<? extends List<MinimumWages>> minimumWages;

    @JsonCreator
    public Compensation(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("version") Optional<String> version,
            @JsonProperty("job_uuid") Optional<String> jobUuid,
            @JsonProperty("employee_uuid") Optional<String> employeeUuid,
            @JsonProperty("rate") Optional<String> rate,
            @JsonProperty("payment_unit") Optional<? extends PaymentUnit> paymentUnit,
            @JsonProperty("flsa_status") Optional<? extends FlsaStatusType> flsaStatus,
            @JsonProperty("effective_date") Optional<String> effectiveDate,
            @JsonProperty("adjust_for_minimum_wage") Optional<Boolean> adjustForMinimumWage,
            @JsonProperty("minimum_wages") Optional<? extends List<MinimumWages>> minimumWages) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(jobUuid, "jobUuid");
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        Utils.checkNotNull(rate, "rate");
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        Utils.checkNotNull(flsaStatus, "flsaStatus");
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
        Utils.checkNotNull(minimumWages, "minimumWages");
        this.uuid = uuid;
        this.version = version;
        this.jobUuid = jobUuid;
        this.employeeUuid = employeeUuid;
        this.rate = rate;
        this.paymentUnit = paymentUnit;
        this.flsaStatus = flsaStatus;
        this.effectiveDate = effectiveDate;
        this.adjustForMinimumWage = adjustForMinimumWage;
        this.minimumWages = minimumWages;
    }
    
    public Compensation(
            String uuid) {
        this(uuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the compensation in Gusto.
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonIgnore
    public Optional<String> version() {
        return version;
    }

    /**
     * The UUID of the job to which the compensation belongs.
     */
    @JsonIgnore
    public Optional<String> jobUuid() {
        return jobUuid;
    }

    /**
     * The UUID of the employee to which the compensation belongs.
     */
    @JsonIgnore
    public Optional<String> employeeUuid() {
        return employeeUuid;
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
    public Optional<PaymentUnit> paymentUnit() {
        return (Optional<PaymentUnit>) paymentUnit;
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
     * The effective date for this compensation. For the first compensation, this defaults to the job's hire date.
     */
    @JsonIgnore
    public Optional<String> effectiveDate() {
        return effectiveDate;
    }

    /**
     * Indicates if the compensation could be adjusted to minimum wage during payroll calculation.
     */
    @JsonIgnore
    public Optional<Boolean> adjustForMinimumWage() {
        return adjustForMinimumWage;
    }

    /**
     * The minimum wages associated with the compensation.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<MinimumWages>> minimumWages() {
        return (Optional<List<MinimumWages>>) minimumWages;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the compensation in Gusto.
     */
    public Compensation withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public Compensation withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public Compensation withVersion(Optional<String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * The UUID of the job to which the compensation belongs.
     */
    public Compensation withJobUuid(String jobUuid) {
        Utils.checkNotNull(jobUuid, "jobUuid");
        this.jobUuid = Optional.ofNullable(jobUuid);
        return this;
    }

    /**
     * The UUID of the job to which the compensation belongs.
     */
    public Compensation withJobUuid(Optional<String> jobUuid) {
        Utils.checkNotNull(jobUuid, "jobUuid");
        this.jobUuid = jobUuid;
        return this;
    }

    /**
     * The UUID of the employee to which the compensation belongs.
     */
    public Compensation withEmployeeUuid(String employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = Optional.ofNullable(employeeUuid);
        return this;
    }

    /**
     * The UUID of the employee to which the compensation belongs.
     */
    public Compensation withEmployeeUuid(Optional<String> employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = employeeUuid;
        return this;
    }

    /**
     * The dollar amount paid per payment unit.
     */
    public Compensation withRate(String rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = Optional.ofNullable(rate);
        return this;
    }

    /**
     * The dollar amount paid per payment unit.
     */
    public Compensation withRate(Optional<String> rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = rate;
        return this;
    }

    /**
     * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
     */
    public Compensation withPaymentUnit(PaymentUnit paymentUnit) {
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        this.paymentUnit = Optional.ofNullable(paymentUnit);
        return this;
    }

    /**
     * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
     */
    public Compensation withPaymentUnit(Optional<? extends PaymentUnit> paymentUnit) {
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        this.paymentUnit = paymentUnit;
        return this;
    }

    /**
     * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company. 
     */
    public Compensation withFlsaStatus(FlsaStatusType flsaStatus) {
        Utils.checkNotNull(flsaStatus, "flsaStatus");
        this.flsaStatus = Optional.ofNullable(flsaStatus);
        return this;
    }

    /**
     * The FLSA status for this compensation. Salaried ('Exempt') employees are paid a fixed salary every pay period. Salaried with overtime ('Salaried Nonexempt') employees are paid a fixed salary every pay period, and receive overtime pay when applicable. Hourly ('Nonexempt') employees are paid for the hours they work, and receive overtime pay when applicable. Commissioned employees ('Commission Only Exempt') earn wages based only on commission. Commissioned with overtime ('Commission Only Nonexempt') earn wages based on commission, and receive overtime pay when applicable. Owners ('Owner') are employees that own at least twenty percent of the company. 
     */
    public Compensation withFlsaStatus(Optional<? extends FlsaStatusType> flsaStatus) {
        Utils.checkNotNull(flsaStatus, "flsaStatus");
        this.flsaStatus = flsaStatus;
        return this;
    }

    /**
     * The effective date for this compensation. For the first compensation, this defaults to the job's hire date.
     */
    public Compensation withEffectiveDate(String effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = Optional.ofNullable(effectiveDate);
        return this;
    }

    /**
     * The effective date for this compensation. For the first compensation, this defaults to the job's hire date.
     */
    public Compensation withEffectiveDate(Optional<String> effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Indicates if the compensation could be adjusted to minimum wage during payroll calculation.
     */
    public Compensation withAdjustForMinimumWage(boolean adjustForMinimumWage) {
        Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
        this.adjustForMinimumWage = Optional.ofNullable(adjustForMinimumWage);
        return this;
    }

    /**
     * Indicates if the compensation could be adjusted to minimum wage during payroll calculation.
     */
    public Compensation withAdjustForMinimumWage(Optional<Boolean> adjustForMinimumWage) {
        Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
        this.adjustForMinimumWage = adjustForMinimumWage;
        return this;
    }

    /**
     * The minimum wages associated with the compensation.
     */
    public Compensation withMinimumWages(List<MinimumWages> minimumWages) {
        Utils.checkNotNull(minimumWages, "minimumWages");
        this.minimumWages = Optional.ofNullable(minimumWages);
        return this;
    }

    /**
     * The minimum wages associated with the compensation.
     */
    public Compensation withMinimumWages(Optional<? extends List<MinimumWages>> minimumWages) {
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
        Compensation other = (Compensation) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.jobUuid, other.jobUuid) &&
            Objects.deepEquals(this.employeeUuid, other.employeeUuid) &&
            Objects.deepEquals(this.rate, other.rate) &&
            Objects.deepEquals(this.paymentUnit, other.paymentUnit) &&
            Objects.deepEquals(this.flsaStatus, other.flsaStatus) &&
            Objects.deepEquals(this.effectiveDate, other.effectiveDate) &&
            Objects.deepEquals(this.adjustForMinimumWage, other.adjustForMinimumWage) &&
            Objects.deepEquals(this.minimumWages, other.minimumWages);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            version,
            jobUuid,
            employeeUuid,
            rate,
            paymentUnit,
            flsaStatus,
            effectiveDate,
            adjustForMinimumWage,
            minimumWages);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Compensation.class,
                "uuid", uuid,
                "version", version,
                "jobUuid", jobUuid,
                "employeeUuid", employeeUuid,
                "rate", rate,
                "paymentUnit", paymentUnit,
                "flsaStatus", flsaStatus,
                "effectiveDate", effectiveDate,
                "adjustForMinimumWage", adjustForMinimumWage,
                "minimumWages", minimumWages);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<String> version = Optional.empty();
 
        private Optional<String> jobUuid = Optional.empty();
 
        private Optional<String> employeeUuid = Optional.empty();
 
        private Optional<String> rate = Optional.empty();
 
        private Optional<? extends PaymentUnit> paymentUnit = Optional.empty();
 
        private Optional<? extends FlsaStatusType> flsaStatus = Optional.empty();
 
        private Optional<String> effectiveDate = Optional.empty();
 
        private Optional<Boolean> adjustForMinimumWage = Optional.empty();
 
        private Optional<? extends List<MinimumWages>> minimumWages = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the compensation in Gusto.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = Optional.ofNullable(version);
            return this;
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(Optional<String> version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        /**
         * The UUID of the job to which the compensation belongs.
         */
        public Builder jobUuid(String jobUuid) {
            Utils.checkNotNull(jobUuid, "jobUuid");
            this.jobUuid = Optional.ofNullable(jobUuid);
            return this;
        }

        /**
         * The UUID of the job to which the compensation belongs.
         */
        public Builder jobUuid(Optional<String> jobUuid) {
            Utils.checkNotNull(jobUuid, "jobUuid");
            this.jobUuid = jobUuid;
            return this;
        }

        /**
         * The UUID of the employee to which the compensation belongs.
         */
        public Builder employeeUuid(String employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = Optional.ofNullable(employeeUuid);
            return this;
        }

        /**
         * The UUID of the employee to which the compensation belongs.
         */
        public Builder employeeUuid(Optional<String> employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = employeeUuid;
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
        public Builder paymentUnit(PaymentUnit paymentUnit) {
            Utils.checkNotNull(paymentUnit, "paymentUnit");
            this.paymentUnit = Optional.ofNullable(paymentUnit);
            return this;
        }

        /**
         * The unit accompanying the compensation rate. If the employee is an owner, rate should be 'Paycheck'.
         */
        public Builder paymentUnit(Optional<? extends PaymentUnit> paymentUnit) {
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
         * The effective date for this compensation. For the first compensation, this defaults to the job's hire date.
         */
        public Builder effectiveDate(String effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = Optional.ofNullable(effectiveDate);
            return this;
        }

        /**
         * The effective date for this compensation. For the first compensation, this defaults to the job's hire date.
         */
        public Builder effectiveDate(Optional<String> effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * Indicates if the compensation could be adjusted to minimum wage during payroll calculation.
         */
        public Builder adjustForMinimumWage(boolean adjustForMinimumWage) {
            Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
            this.adjustForMinimumWage = Optional.ofNullable(adjustForMinimumWage);
            return this;
        }

        /**
         * Indicates if the compensation could be adjusted to minimum wage during payroll calculation.
         */
        public Builder adjustForMinimumWage(Optional<Boolean> adjustForMinimumWage) {
            Utils.checkNotNull(adjustForMinimumWage, "adjustForMinimumWage");
            this.adjustForMinimumWage = adjustForMinimumWage;
            return this;
        }

        /**
         * The minimum wages associated with the compensation.
         */
        public Builder minimumWages(List<MinimumWages> minimumWages) {
            Utils.checkNotNull(minimumWages, "minimumWages");
            this.minimumWages = Optional.ofNullable(minimumWages);
            return this;
        }

        /**
         * The minimum wages associated with the compensation.
         */
        public Builder minimumWages(Optional<? extends List<MinimumWages>> minimumWages) {
            Utils.checkNotNull(minimumWages, "minimumWages");
            this.minimumWages = minimumWages;
            return this;
        }
        
        public Compensation build() {
            return new Compensation(
                uuid,
                version,
                jobUuid,
                employeeUuid,
                rate,
                paymentUnit,
                flsaStatus,
                effectiveDate,
                adjustForMinimumWage,
                minimumWages);
        }
    }
}

