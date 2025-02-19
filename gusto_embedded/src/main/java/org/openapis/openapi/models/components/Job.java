/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.LazySingletonValue;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Job - The representation of a job in Gusto.
 */

public class Job {

    /**
     * The UUID of the job.
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
     * The UUID of the employee to which the job belongs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_uuid")
    private Optional<String> employeeUuid;

    /**
     * The date when the employee was hired or rehired for the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hire_date")
    private Optional<String> hireDate;

    /**
     * The title for the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private JsonNullable<String> title;

    /**
     * Whether this is the employee's primary job. The value will be set to true unless an existing job exists for the employee.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primary")
    private Optional<Boolean> primary;

    /**
     * The current compensation rate of the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rate")
    private Optional<String> rate;

    /**
     * The payment unit of the current compensation for the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_unit")
    private Optional<String> paymentUnit;

    /**
     * The UUID of the current compensation of the job.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("current_compensation_uuid")
    private Optional<String> currentCompensationUuid;

    /**
     * Whether the employee owns at least 2% of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("two_percent_shareholder")
    private Optional<Boolean> twoPercentShareholder;

    /**
     * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state_wc_covered")
    private JsonNullable<Boolean> stateWcCovered;

    /**
     * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state_wc_class_code")
    private JsonNullable<String> stateWcClassCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("compensations")
    private Optional<? extends List<Compensation>> compensations;

    @JsonCreator
    public Job(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("version") Optional<String> version,
            @JsonProperty("employee_uuid") Optional<String> employeeUuid,
            @JsonProperty("hire_date") Optional<String> hireDate,
            @JsonProperty("title") JsonNullable<String> title,
            @JsonProperty("primary") Optional<Boolean> primary,
            @JsonProperty("rate") Optional<String> rate,
            @JsonProperty("payment_unit") Optional<String> paymentUnit,
            @JsonProperty("current_compensation_uuid") Optional<String> currentCompensationUuid,
            @JsonProperty("two_percent_shareholder") Optional<Boolean> twoPercentShareholder,
            @JsonProperty("state_wc_covered") JsonNullable<Boolean> stateWcCovered,
            @JsonProperty("state_wc_class_code") JsonNullable<String> stateWcClassCode,
            @JsonProperty("compensations") Optional<? extends List<Compensation>> compensations) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        Utils.checkNotNull(hireDate, "hireDate");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(primary, "primary");
        Utils.checkNotNull(rate, "rate");
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        Utils.checkNotNull(currentCompensationUuid, "currentCompensationUuid");
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        Utils.checkNotNull(stateWcCovered, "stateWcCovered");
        Utils.checkNotNull(stateWcClassCode, "stateWcClassCode");
        Utils.checkNotNull(compensations, "compensations");
        this.uuid = uuid;
        this.version = version;
        this.employeeUuid = employeeUuid;
        this.hireDate = hireDate;
        this.title = title;
        this.primary = primary;
        this.rate = rate;
        this.paymentUnit = paymentUnit;
        this.currentCompensationUuid = currentCompensationUuid;
        this.twoPercentShareholder = twoPercentShareholder;
        this.stateWcCovered = stateWcCovered;
        this.stateWcClassCode = stateWcClassCode;
        this.compensations = compensations;
    }
    
    public Job(
            String uuid) {
        this(uuid, Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The UUID of the job.
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
     * The UUID of the employee to which the job belongs.
     */
    @JsonIgnore
    public Optional<String> employeeUuid() {
        return employeeUuid;
    }

    /**
     * The date when the employee was hired or rehired for the job.
     */
    @JsonIgnore
    public Optional<String> hireDate() {
        return hireDate;
    }

    /**
     * The title for the job.
     */
    @JsonIgnore
    public JsonNullable<String> title() {
        return title;
    }

    /**
     * Whether this is the employee's primary job. The value will be set to true unless an existing job exists for the employee.
     */
    @JsonIgnore
    public Optional<Boolean> primary() {
        return primary;
    }

    /**
     * The current compensation rate of the job.
     */
    @JsonIgnore
    public Optional<String> rate() {
        return rate;
    }

    /**
     * The payment unit of the current compensation for the job.
     */
    @JsonIgnore
    public Optional<String> paymentUnit() {
        return paymentUnit;
    }

    /**
     * The UUID of the current compensation of the job.
     */
    @JsonIgnore
    public Optional<String> currentCompensationUuid() {
        return currentCompensationUuid;
    }

    /**
     * Whether the employee owns at least 2% of the company.
     */
    @JsonIgnore
    public Optional<Boolean> twoPercentShareholder() {
        return twoPercentShareholder;
    }

    /**
     * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
     */
    @JsonIgnore
    public JsonNullable<Boolean> stateWcCovered() {
        return stateWcCovered;
    }

    /**
     * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
     */
    @JsonIgnore
    public JsonNullable<String> stateWcClassCode() {
        return stateWcClassCode;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Compensation>> compensations() {
        return (Optional<List<Compensation>>) compensations;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the job.
     */
    public Job withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public Job withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public Job withVersion(Optional<String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * The UUID of the employee to which the job belongs.
     */
    public Job withEmployeeUuid(String employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = Optional.ofNullable(employeeUuid);
        return this;
    }

    /**
     * The UUID of the employee to which the job belongs.
     */
    public Job withEmployeeUuid(Optional<String> employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = employeeUuid;
        return this;
    }

    /**
     * The date when the employee was hired or rehired for the job.
     */
    public Job withHireDate(String hireDate) {
        Utils.checkNotNull(hireDate, "hireDate");
        this.hireDate = Optional.ofNullable(hireDate);
        return this;
    }

    /**
     * The date when the employee was hired or rehired for the job.
     */
    public Job withHireDate(Optional<String> hireDate) {
        Utils.checkNotNull(hireDate, "hireDate");
        this.hireDate = hireDate;
        return this;
    }

    /**
     * The title for the job.
     */
    public Job withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * The title for the job.
     */
    public Job withTitle(JsonNullable<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * Whether this is the employee's primary job. The value will be set to true unless an existing job exists for the employee.
     */
    public Job withPrimary(boolean primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = Optional.ofNullable(primary);
        return this;
    }

    /**
     * Whether this is the employee's primary job. The value will be set to true unless an existing job exists for the employee.
     */
    public Job withPrimary(Optional<Boolean> primary) {
        Utils.checkNotNull(primary, "primary");
        this.primary = primary;
        return this;
    }

    /**
     * The current compensation rate of the job.
     */
    public Job withRate(String rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = Optional.ofNullable(rate);
        return this;
    }

    /**
     * The current compensation rate of the job.
     */
    public Job withRate(Optional<String> rate) {
        Utils.checkNotNull(rate, "rate");
        this.rate = rate;
        return this;
    }

    /**
     * The payment unit of the current compensation for the job.
     */
    public Job withPaymentUnit(String paymentUnit) {
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        this.paymentUnit = Optional.ofNullable(paymentUnit);
        return this;
    }

    /**
     * The payment unit of the current compensation for the job.
     */
    public Job withPaymentUnit(Optional<String> paymentUnit) {
        Utils.checkNotNull(paymentUnit, "paymentUnit");
        this.paymentUnit = paymentUnit;
        return this;
    }

    /**
     * The UUID of the current compensation of the job.
     */
    public Job withCurrentCompensationUuid(String currentCompensationUuid) {
        Utils.checkNotNull(currentCompensationUuid, "currentCompensationUuid");
        this.currentCompensationUuid = Optional.ofNullable(currentCompensationUuid);
        return this;
    }

    /**
     * The UUID of the current compensation of the job.
     */
    public Job withCurrentCompensationUuid(Optional<String> currentCompensationUuid) {
        Utils.checkNotNull(currentCompensationUuid, "currentCompensationUuid");
        this.currentCompensationUuid = currentCompensationUuid;
        return this;
    }

    /**
     * Whether the employee owns at least 2% of the company.
     */
    public Job withTwoPercentShareholder(boolean twoPercentShareholder) {
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        this.twoPercentShareholder = Optional.ofNullable(twoPercentShareholder);
        return this;
    }

    /**
     * Whether the employee owns at least 2% of the company.
     */
    public Job withTwoPercentShareholder(Optional<Boolean> twoPercentShareholder) {
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        this.twoPercentShareholder = twoPercentShareholder;
        return this;
    }

    /**
     * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
     */
    public Job withStateWcCovered(boolean stateWcCovered) {
        Utils.checkNotNull(stateWcCovered, "stateWcCovered");
        this.stateWcCovered = JsonNullable.of(stateWcCovered);
        return this;
    }

    /**
     * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
     */
    public Job withStateWcCovered(JsonNullable<Boolean> stateWcCovered) {
        Utils.checkNotNull(stateWcCovered, "stateWcCovered");
        this.stateWcCovered = stateWcCovered;
        return this;
    }

    /**
     * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
     */
    public Job withStateWcClassCode(String stateWcClassCode) {
        Utils.checkNotNull(stateWcClassCode, "stateWcClassCode");
        this.stateWcClassCode = JsonNullable.of(stateWcClassCode);
        return this;
    }

    /**
     * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
     */
    public Job withStateWcClassCode(JsonNullable<String> stateWcClassCode) {
        Utils.checkNotNull(stateWcClassCode, "stateWcClassCode");
        this.stateWcClassCode = stateWcClassCode;
        return this;
    }

    public Job withCompensations(List<Compensation> compensations) {
        Utils.checkNotNull(compensations, "compensations");
        this.compensations = Optional.ofNullable(compensations);
        return this;
    }

    public Job withCompensations(Optional<? extends List<Compensation>> compensations) {
        Utils.checkNotNull(compensations, "compensations");
        this.compensations = compensations;
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
        Job other = (Job) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.employeeUuid, other.employeeUuid) &&
            Objects.deepEquals(this.hireDate, other.hireDate) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.primary, other.primary) &&
            Objects.deepEquals(this.rate, other.rate) &&
            Objects.deepEquals(this.paymentUnit, other.paymentUnit) &&
            Objects.deepEquals(this.currentCompensationUuid, other.currentCompensationUuid) &&
            Objects.deepEquals(this.twoPercentShareholder, other.twoPercentShareholder) &&
            Objects.deepEquals(this.stateWcCovered, other.stateWcCovered) &&
            Objects.deepEquals(this.stateWcClassCode, other.stateWcClassCode) &&
            Objects.deepEquals(this.compensations, other.compensations);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            version,
            employeeUuid,
            hireDate,
            title,
            primary,
            rate,
            paymentUnit,
            currentCompensationUuid,
            twoPercentShareholder,
            stateWcCovered,
            stateWcClassCode,
            compensations);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Job.class,
                "uuid", uuid,
                "version", version,
                "employeeUuid", employeeUuid,
                "hireDate", hireDate,
                "title", title,
                "primary", primary,
                "rate", rate,
                "paymentUnit", paymentUnit,
                "currentCompensationUuid", currentCompensationUuid,
                "twoPercentShareholder", twoPercentShareholder,
                "stateWcCovered", stateWcCovered,
                "stateWcClassCode", stateWcClassCode,
                "compensations", compensations);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<String> version = Optional.empty();
 
        private Optional<String> employeeUuid = Optional.empty();
 
        private Optional<String> hireDate = Optional.empty();
 
        private JsonNullable<String> title;
 
        private Optional<Boolean> primary = Optional.empty();
 
        private Optional<String> rate = Optional.empty();
 
        private Optional<String> paymentUnit = Optional.empty();
 
        private Optional<String> currentCompensationUuid = Optional.empty();
 
        private Optional<Boolean> twoPercentShareholder = Optional.empty();
 
        private JsonNullable<Boolean> stateWcCovered = JsonNullable.undefined();
 
        private JsonNullable<String> stateWcClassCode = JsonNullable.undefined();
 
        private Optional<? extends List<Compensation>> compensations = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the job.
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
         * The UUID of the employee to which the job belongs.
         */
        public Builder employeeUuid(String employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = Optional.ofNullable(employeeUuid);
            return this;
        }

        /**
         * The UUID of the employee to which the job belongs.
         */
        public Builder employeeUuid(Optional<String> employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = employeeUuid;
            return this;
        }

        /**
         * The date when the employee was hired or rehired for the job.
         */
        public Builder hireDate(String hireDate) {
            Utils.checkNotNull(hireDate, "hireDate");
            this.hireDate = Optional.ofNullable(hireDate);
            return this;
        }

        /**
         * The date when the employee was hired or rehired for the job.
         */
        public Builder hireDate(Optional<String> hireDate) {
            Utils.checkNotNull(hireDate, "hireDate");
            this.hireDate = hireDate;
            return this;
        }

        /**
         * The title for the job.
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = JsonNullable.of(title);
            return this;
        }

        /**
         * The title for the job.
         */
        public Builder title(JsonNullable<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * Whether this is the employee's primary job. The value will be set to true unless an existing job exists for the employee.
         */
        public Builder primary(boolean primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = Optional.ofNullable(primary);
            return this;
        }

        /**
         * Whether this is the employee's primary job. The value will be set to true unless an existing job exists for the employee.
         */
        public Builder primary(Optional<Boolean> primary) {
            Utils.checkNotNull(primary, "primary");
            this.primary = primary;
            return this;
        }

        /**
         * The current compensation rate of the job.
         */
        public Builder rate(String rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = Optional.ofNullable(rate);
            return this;
        }

        /**
         * The current compensation rate of the job.
         */
        public Builder rate(Optional<String> rate) {
            Utils.checkNotNull(rate, "rate");
            this.rate = rate;
            return this;
        }

        /**
         * The payment unit of the current compensation for the job.
         */
        public Builder paymentUnit(String paymentUnit) {
            Utils.checkNotNull(paymentUnit, "paymentUnit");
            this.paymentUnit = Optional.ofNullable(paymentUnit);
            return this;
        }

        /**
         * The payment unit of the current compensation for the job.
         */
        public Builder paymentUnit(Optional<String> paymentUnit) {
            Utils.checkNotNull(paymentUnit, "paymentUnit");
            this.paymentUnit = paymentUnit;
            return this;
        }

        /**
         * The UUID of the current compensation of the job.
         */
        public Builder currentCompensationUuid(String currentCompensationUuid) {
            Utils.checkNotNull(currentCompensationUuid, "currentCompensationUuid");
            this.currentCompensationUuid = Optional.ofNullable(currentCompensationUuid);
            return this;
        }

        /**
         * The UUID of the current compensation of the job.
         */
        public Builder currentCompensationUuid(Optional<String> currentCompensationUuid) {
            Utils.checkNotNull(currentCompensationUuid, "currentCompensationUuid");
            this.currentCompensationUuid = currentCompensationUuid;
            return this;
        }

        /**
         * Whether the employee owns at least 2% of the company.
         */
        public Builder twoPercentShareholder(boolean twoPercentShareholder) {
            Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
            this.twoPercentShareholder = Optional.ofNullable(twoPercentShareholder);
            return this;
        }

        /**
         * Whether the employee owns at least 2% of the company.
         */
        public Builder twoPercentShareholder(Optional<Boolean> twoPercentShareholder) {
            Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
            this.twoPercentShareholder = twoPercentShareholder;
            return this;
        }

        /**
         * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
         */
        public Builder stateWcCovered(boolean stateWcCovered) {
            Utils.checkNotNull(stateWcCovered, "stateWcCovered");
            this.stateWcCovered = JsonNullable.of(stateWcCovered);
            return this;
        }

        /**
         * Whether this job is eligible for workers' compensation coverage in the state of Washington (WA).
         */
        public Builder stateWcCovered(JsonNullable<Boolean> stateWcCovered) {
            Utils.checkNotNull(stateWcCovered, "stateWcCovered");
            this.stateWcCovered = stateWcCovered;
            return this;
        }

        /**
         * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
         */
        public Builder stateWcClassCode(String stateWcClassCode) {
            Utils.checkNotNull(stateWcClassCode, "stateWcClassCode");
            this.stateWcClassCode = JsonNullable.of(stateWcClassCode);
            return this;
        }

        /**
         * The risk class code for workers' compensation in Washington state. Please visit [Washington state's Risk Class page](https://www.lni.wa.gov/insurance/rates-risk-classes/risk-classes-for-workers-compensation/risk-class-lookup#/) to learn more.
         */
        public Builder stateWcClassCode(JsonNullable<String> stateWcClassCode) {
            Utils.checkNotNull(stateWcClassCode, "stateWcClassCode");
            this.stateWcClassCode = stateWcClassCode;
            return this;
        }

        public Builder compensations(List<Compensation> compensations) {
            Utils.checkNotNull(compensations, "compensations");
            this.compensations = Optional.ofNullable(compensations);
            return this;
        }

        public Builder compensations(Optional<? extends List<Compensation>> compensations) {
            Utils.checkNotNull(compensations, "compensations");
            this.compensations = compensations;
            return this;
        }
        
        public Job build() {
            if (title == null) {
                title = _SINGLETON_VALUE_Title.value();
            }            return new Job(
                uuid,
                version,
                employeeUuid,
                hireDate,
                title,
                primary,
                rate,
                paymentUnit,
                currentCompensationUuid,
                twoPercentShareholder,
                stateWcCovered,
                stateWcClassCode,
                compensations);
        }

        private static final LazySingletonValue<JsonNullable<String>> _SINGLETON_VALUE_Title =
                new LazySingletonValue<>(
                        "title",
                        "null",
                        new TypeReference<JsonNullable<String>>() {});
    }
}

