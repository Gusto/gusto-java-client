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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * PayScheduleObject
 * 
 * <p>The representation of a pay schedule.
 */

public class PayScheduleObject {

    /**
     * The unique identifier of the pay schedule in Gusto.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * The frequency that employees on this pay schedule are paid with Gusto.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("frequency")
    private Optional<? extends PayScheduleFrequency> frequency;

    /**
     * The first date that employees on this pay schedule are paid with Gusto.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("anchor_pay_date")
    private Optional<String> anchorPayDate;

    /**
     * The last date of the first pay period. This can be the same date as the anchor pay date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("anchor_end_of_pay_period")
    private Optional<String> anchorEndOfPayPeriod;

    /**
     * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("day_1")
    private JsonNullable<Long> day1;

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, this field should be set to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("day_2")
    private JsonNullable<Long> day2;

    /**
     * This field will be hourly when the pay schedule is for hourly employees, salaried when the pay schedule is for salaried employees, the department name if pay schedule is by department, and null when the pay schedule is for all employees.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private JsonNullable<String> name;

    /**
     * A custom name for a pay schedule, defaults to the pay frequency description.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_name")
    private Optional<String> customName;

    /**
     * With Autopilot® enabled, payroll will run automatically one day before your payroll deadlines.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("auto_pilot")
    private Optional<Boolean> autoPilot;

    /**
     * Whether this pay schedule is associated with any employees. A pay schedule is inactive when it's unassigned.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<Boolean> active;

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

    @JsonCreator
    public PayScheduleObject(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("frequency") Optional<? extends PayScheduleFrequency> frequency,
            @JsonProperty("anchor_pay_date") Optional<String> anchorPayDate,
            @JsonProperty("anchor_end_of_pay_period") Optional<String> anchorEndOfPayPeriod,
            @JsonProperty("day_1") JsonNullable<Long> day1,
            @JsonProperty("day_2") JsonNullable<Long> day2,
            @JsonProperty("name") JsonNullable<String> name,
            @JsonProperty("custom_name") Optional<String> customName,
            @JsonProperty("auto_pilot") Optional<Boolean> autoPilot,
            @JsonProperty("active") Optional<Boolean> active,
            @JsonProperty("version") String version) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(frequency, "frequency");
        Utils.checkNotNull(anchorPayDate, "anchorPayDate");
        Utils.checkNotNull(anchorEndOfPayPeriod, "anchorEndOfPayPeriod");
        Utils.checkNotNull(day1, "day1");
        Utils.checkNotNull(day2, "day2");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(customName, "customName");
        Utils.checkNotNull(autoPilot, "autoPilot");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(version, "version");
        this.uuid = uuid;
        this.frequency = frequency;
        this.anchorPayDate = anchorPayDate;
        this.anchorEndOfPayPeriod = anchorEndOfPayPeriod;
        this.day1 = day1;
        this.day2 = day2;
        this.name = name;
        this.customName = customName;
        this.autoPilot = autoPilot;
        this.active = active;
        this.version = version;
    }
    
    public PayScheduleObject(
            String uuid,
            String version) {
        this(uuid, Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), version);
    }

    /**
     * The unique identifier of the pay schedule in Gusto.
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * The frequency that employees on this pay schedule are paid with Gusto.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PayScheduleFrequency> frequency() {
        return (Optional<PayScheduleFrequency>) frequency;
    }

    /**
     * The first date that employees on this pay schedule are paid with Gusto.
     */
    @JsonIgnore
    public Optional<String> anchorPayDate() {
        return anchorPayDate;
    }

    /**
     * The last date of the first pay period. This can be the same date as the anchor pay date.
     */
    @JsonIgnore
    public Optional<String> anchorEndOfPayPeriod() {
        return anchorEndOfPayPeriod;
    }

    /**
     * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
     */
    @JsonIgnore
    public JsonNullable<Long> day1() {
        return day1;
    }

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, this field should be set to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    @JsonIgnore
    public JsonNullable<Long> day2() {
        return day2;
    }

    /**
     * This field will be hourly when the pay schedule is for hourly employees, salaried when the pay schedule is for salaried employees, the department name if pay schedule is by department, and null when the pay schedule is for all employees.
     */
    @JsonIgnore
    public JsonNullable<String> name() {
        return name;
    }

    /**
     * A custom name for a pay schedule, defaults to the pay frequency description.
     */
    @JsonIgnore
    public Optional<String> customName() {
        return customName;
    }

    /**
     * With Autopilot® enabled, payroll will run automatically one day before your payroll deadlines.
     */
    @JsonIgnore
    public Optional<Boolean> autoPilot() {
        return autoPilot;
    }

    /**
     * Whether this pay schedule is associated with any employees. A pay schedule is inactive when it's unassigned.
     */
    @JsonIgnore
    public Optional<Boolean> active() {
        return active;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier of the pay schedule in Gusto.
     */
    public PayScheduleObject withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The frequency that employees on this pay schedule are paid with Gusto.
     */
    public PayScheduleObject withFrequency(PayScheduleFrequency frequency) {
        Utils.checkNotNull(frequency, "frequency");
        this.frequency = Optional.ofNullable(frequency);
        return this;
    }

    /**
     * The frequency that employees on this pay schedule are paid with Gusto.
     */
    public PayScheduleObject withFrequency(Optional<? extends PayScheduleFrequency> frequency) {
        Utils.checkNotNull(frequency, "frequency");
        this.frequency = frequency;
        return this;
    }

    /**
     * The first date that employees on this pay schedule are paid with Gusto.
     */
    public PayScheduleObject withAnchorPayDate(String anchorPayDate) {
        Utils.checkNotNull(anchorPayDate, "anchorPayDate");
        this.anchorPayDate = Optional.ofNullable(anchorPayDate);
        return this;
    }

    /**
     * The first date that employees on this pay schedule are paid with Gusto.
     */
    public PayScheduleObject withAnchorPayDate(Optional<String> anchorPayDate) {
        Utils.checkNotNull(anchorPayDate, "anchorPayDate");
        this.anchorPayDate = anchorPayDate;
        return this;
    }

    /**
     * The last date of the first pay period. This can be the same date as the anchor pay date.
     */
    public PayScheduleObject withAnchorEndOfPayPeriod(String anchorEndOfPayPeriod) {
        Utils.checkNotNull(anchorEndOfPayPeriod, "anchorEndOfPayPeriod");
        this.anchorEndOfPayPeriod = Optional.ofNullable(anchorEndOfPayPeriod);
        return this;
    }

    /**
     * The last date of the first pay period. This can be the same date as the anchor pay date.
     */
    public PayScheduleObject withAnchorEndOfPayPeriod(Optional<String> anchorEndOfPayPeriod) {
        Utils.checkNotNull(anchorEndOfPayPeriod, "anchorEndOfPayPeriod");
        this.anchorEndOfPayPeriod = anchorEndOfPayPeriod;
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
     */
    public PayScheduleObject withDay1(long day1) {
        Utils.checkNotNull(day1, "day1");
        this.day1 = JsonNullable.of(day1);
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
     */
    public PayScheduleObject withDay1(JsonNullable<Long> day1) {
        Utils.checkNotNull(day1, "day1");
        this.day1 = day1;
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, this field should be set to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    public PayScheduleObject withDay2(long day2) {
        Utils.checkNotNull(day2, "day2");
        this.day2 = JsonNullable.of(day2);
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, this field should be set to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    public PayScheduleObject withDay2(JsonNullable<Long> day2) {
        Utils.checkNotNull(day2, "day2");
        this.day2 = day2;
        return this;
    }

    /**
     * This field will be hourly when the pay schedule is for hourly employees, salaried when the pay schedule is for salaried employees, the department name if pay schedule is by department, and null when the pay schedule is for all employees.
     */
    public PayScheduleObject withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * This field will be hourly when the pay schedule is for hourly employees, salaried when the pay schedule is for salaried employees, the department name if pay schedule is by department, and null when the pay schedule is for all employees.
     */
    public PayScheduleObject withName(JsonNullable<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * A custom name for a pay schedule, defaults to the pay frequency description.
     */
    public PayScheduleObject withCustomName(String customName) {
        Utils.checkNotNull(customName, "customName");
        this.customName = Optional.ofNullable(customName);
        return this;
    }

    /**
     * A custom name for a pay schedule, defaults to the pay frequency description.
     */
    public PayScheduleObject withCustomName(Optional<String> customName) {
        Utils.checkNotNull(customName, "customName");
        this.customName = customName;
        return this;
    }

    /**
     * With Autopilot® enabled, payroll will run automatically one day before your payroll deadlines.
     */
    public PayScheduleObject withAutoPilot(boolean autoPilot) {
        Utils.checkNotNull(autoPilot, "autoPilot");
        this.autoPilot = Optional.ofNullable(autoPilot);
        return this;
    }

    /**
     * With Autopilot® enabled, payroll will run automatically one day before your payroll deadlines.
     */
    public PayScheduleObject withAutoPilot(Optional<Boolean> autoPilot) {
        Utils.checkNotNull(autoPilot, "autoPilot");
        this.autoPilot = autoPilot;
        return this;
    }

    /**
     * Whether this pay schedule is associated with any employees. A pay schedule is inactive when it's unassigned.
     */
    public PayScheduleObject withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    /**
     * Whether this pay schedule is associated with any employees. A pay schedule is inactive when it's unassigned.
     */
    public PayScheduleObject withActive(Optional<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public PayScheduleObject withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
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
        PayScheduleObject other = (PayScheduleObject) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.frequency, other.frequency) &&
            Objects.deepEquals(this.anchorPayDate, other.anchorPayDate) &&
            Objects.deepEquals(this.anchorEndOfPayPeriod, other.anchorEndOfPayPeriod) &&
            Objects.deepEquals(this.day1, other.day1) &&
            Objects.deepEquals(this.day2, other.day2) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.customName, other.customName) &&
            Objects.deepEquals(this.autoPilot, other.autoPilot) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.version, other.version);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            frequency,
            anchorPayDate,
            anchorEndOfPayPeriod,
            day1,
            day2,
            name,
            customName,
            autoPilot,
            active,
            version);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PayScheduleObject.class,
                "uuid", uuid,
                "frequency", frequency,
                "anchorPayDate", anchorPayDate,
                "anchorEndOfPayPeriod", anchorEndOfPayPeriod,
                "day1", day1,
                "day2", day2,
                "name", name,
                "customName", customName,
                "autoPilot", autoPilot,
                "active", active,
                "version", version);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<? extends PayScheduleFrequency> frequency = Optional.empty();
 
        private Optional<String> anchorPayDate = Optional.empty();
 
        private Optional<String> anchorEndOfPayPeriod = Optional.empty();
 
        private JsonNullable<Long> day1 = JsonNullable.undefined();
 
        private JsonNullable<Long> day2 = JsonNullable.undefined();
 
        private JsonNullable<String> name = JsonNullable.undefined();
 
        private Optional<String> customName = Optional.empty();
 
        private Optional<Boolean> autoPilot = Optional.empty();
 
        private Optional<Boolean> active = Optional.empty();
 
        private String version;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier of the pay schedule in Gusto.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The frequency that employees on this pay schedule are paid with Gusto.
         */
        public Builder frequency(PayScheduleFrequency frequency) {
            Utils.checkNotNull(frequency, "frequency");
            this.frequency = Optional.ofNullable(frequency);
            return this;
        }

        /**
         * The frequency that employees on this pay schedule are paid with Gusto.
         */
        public Builder frequency(Optional<? extends PayScheduleFrequency> frequency) {
            Utils.checkNotNull(frequency, "frequency");
            this.frequency = frequency;
            return this;
        }

        /**
         * The first date that employees on this pay schedule are paid with Gusto.
         */
        public Builder anchorPayDate(String anchorPayDate) {
            Utils.checkNotNull(anchorPayDate, "anchorPayDate");
            this.anchorPayDate = Optional.ofNullable(anchorPayDate);
            return this;
        }

        /**
         * The first date that employees on this pay schedule are paid with Gusto.
         */
        public Builder anchorPayDate(Optional<String> anchorPayDate) {
            Utils.checkNotNull(anchorPayDate, "anchorPayDate");
            this.anchorPayDate = anchorPayDate;
            return this;
        }

        /**
         * The last date of the first pay period. This can be the same date as the anchor pay date.
         */
        public Builder anchorEndOfPayPeriod(String anchorEndOfPayPeriod) {
            Utils.checkNotNull(anchorEndOfPayPeriod, "anchorEndOfPayPeriod");
            this.anchorEndOfPayPeriod = Optional.ofNullable(anchorEndOfPayPeriod);
            return this;
        }

        /**
         * The last date of the first pay period. This can be the same date as the anchor pay date.
         */
        public Builder anchorEndOfPayPeriod(Optional<String> anchorEndOfPayPeriod) {
            Utils.checkNotNull(anchorEndOfPayPeriod, "anchorEndOfPayPeriod");
            this.anchorEndOfPayPeriod = anchorEndOfPayPeriod;
            return this;
        }

        /**
         * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
         */
        public Builder day1(long day1) {
            Utils.checkNotNull(day1, "day1");
            this.day1 = JsonNullable.of(day1);
            return this;
        }

        /**
         * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
         */
        public Builder day1(JsonNullable<Long> day1) {
            Utils.checkNotNull(day1, "day1");
            this.day1 = day1;
            return this;
        }

        /**
         * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, this field should be set to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
         */
        public Builder day2(long day2) {
            Utils.checkNotNull(day2, "day2");
            this.day2 = JsonNullable.of(day2);
            return this;
        }

        /**
         * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, this field should be set to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
         */
        public Builder day2(JsonNullable<Long> day2) {
            Utils.checkNotNull(day2, "day2");
            this.day2 = day2;
            return this;
        }

        /**
         * This field will be hourly when the pay schedule is for hourly employees, salaried when the pay schedule is for salaried employees, the department name if pay schedule is by department, and null when the pay schedule is for all employees.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = JsonNullable.of(name);
            return this;
        }

        /**
         * This field will be hourly when the pay schedule is for hourly employees, salaried when the pay schedule is for salaried employees, the department name if pay schedule is by department, and null when the pay schedule is for all employees.
         */
        public Builder name(JsonNullable<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * A custom name for a pay schedule, defaults to the pay frequency description.
         */
        public Builder customName(String customName) {
            Utils.checkNotNull(customName, "customName");
            this.customName = Optional.ofNullable(customName);
            return this;
        }

        /**
         * A custom name for a pay schedule, defaults to the pay frequency description.
         */
        public Builder customName(Optional<String> customName) {
            Utils.checkNotNull(customName, "customName");
            this.customName = customName;
            return this;
        }

        /**
         * With Autopilot® enabled, payroll will run automatically one day before your payroll deadlines.
         */
        public Builder autoPilot(boolean autoPilot) {
            Utils.checkNotNull(autoPilot, "autoPilot");
            this.autoPilot = Optional.ofNullable(autoPilot);
            return this;
        }

        /**
         * With Autopilot® enabled, payroll will run automatically one day before your payroll deadlines.
         */
        public Builder autoPilot(Optional<Boolean> autoPilot) {
            Utils.checkNotNull(autoPilot, "autoPilot");
            this.autoPilot = autoPilot;
            return this;
        }

        /**
         * Whether this pay schedule is associated with any employees. A pay schedule is inactive when it's unassigned.
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        /**
         * Whether this pay schedule is associated with any employees. A pay schedule is inactive when it's unassigned.
         */
        public Builder active(Optional<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }
        
        public PayScheduleObject build() {
            return new PayScheduleObject(
                uuid,
                frequency,
                anchorPayDate,
                anchorEndOfPayPeriod,
                day1,
                day2,
                name,
                customName,
                autoPilot,
                active,
                version);
        }
    }
}

