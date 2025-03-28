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
import java.util.Objects;
import java.util.Optional;
/**
 * Termination
 * 
 * <p>The representation of a termination in Gusto.
 */

public class Termination {

    /**
     * The UUID of the termination object.
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
     * The UUID of the employee to which this termination is attached.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_uuid")
    private Optional<String> employeeUuid;

    /**
     * Whether the employee's termination has gone into effect.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<Boolean> active;

    /**
     * Whether the employee's termination is cancelable. Cancelable is true if `run_termination_payroll` is false and `effective_date` is in the future.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cancelable")
    private Optional<Boolean> cancelable;

    /**
     * The employee's last day of work.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_date")
    private Optional<String> effectiveDate;

    /**
     * If true, the employee should receive their final wages via an off-cycle payroll. If false, they should receive their final wages on their current pay schedule.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("run_termination_payroll")
    private Optional<Boolean> runTerminationPayroll;

    @JsonCreator
    public Termination(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("version") Optional<String> version,
            @JsonProperty("employee_uuid") Optional<String> employeeUuid,
            @JsonProperty("active") Optional<Boolean> active,
            @JsonProperty("cancelable") Optional<Boolean> cancelable,
            @JsonProperty("effective_date") Optional<String> effectiveDate,
            @JsonProperty("run_termination_payroll") Optional<Boolean> runTerminationPayroll) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(cancelable, "cancelable");
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        Utils.checkNotNull(runTerminationPayroll, "runTerminationPayroll");
        this.uuid = uuid;
        this.version = version;
        this.employeeUuid = employeeUuid;
        this.active = active;
        this.cancelable = cancelable;
        this.effectiveDate = effectiveDate;
        this.runTerminationPayroll = runTerminationPayroll;
    }
    
    public Termination(
            String uuid) {
        this(uuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the termination object.
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
     * The UUID of the employee to which this termination is attached.
     */
    @JsonIgnore
    public Optional<String> employeeUuid() {
        return employeeUuid;
    }

    /**
     * Whether the employee's termination has gone into effect.
     */
    @JsonIgnore
    public Optional<Boolean> active() {
        return active;
    }

    /**
     * Whether the employee's termination is cancelable. Cancelable is true if `run_termination_payroll` is false and `effective_date` is in the future.
     */
    @JsonIgnore
    public Optional<Boolean> cancelable() {
        return cancelable;
    }

    /**
     * The employee's last day of work.
     */
    @JsonIgnore
    public Optional<String> effectiveDate() {
        return effectiveDate;
    }

    /**
     * If true, the employee should receive their final wages via an off-cycle payroll. If false, they should receive their final wages on their current pay schedule.
     */
    @JsonIgnore
    public Optional<Boolean> runTerminationPayroll() {
        return runTerminationPayroll;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the termination object.
     */
    public Termination withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public Termination withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public Termination withVersion(Optional<String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * The UUID of the employee to which this termination is attached.
     */
    public Termination withEmployeeUuid(String employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = Optional.ofNullable(employeeUuid);
        return this;
    }

    /**
     * The UUID of the employee to which this termination is attached.
     */
    public Termination withEmployeeUuid(Optional<String> employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = employeeUuid;
        return this;
    }

    /**
     * Whether the employee's termination has gone into effect.
     */
    public Termination withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    /**
     * Whether the employee's termination has gone into effect.
     */
    public Termination withActive(Optional<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * Whether the employee's termination is cancelable. Cancelable is true if `run_termination_payroll` is false and `effective_date` is in the future.
     */
    public Termination withCancelable(boolean cancelable) {
        Utils.checkNotNull(cancelable, "cancelable");
        this.cancelable = Optional.ofNullable(cancelable);
        return this;
    }

    /**
     * Whether the employee's termination is cancelable. Cancelable is true if `run_termination_payroll` is false and `effective_date` is in the future.
     */
    public Termination withCancelable(Optional<Boolean> cancelable) {
        Utils.checkNotNull(cancelable, "cancelable");
        this.cancelable = cancelable;
        return this;
    }

    /**
     * The employee's last day of work.
     */
    public Termination withEffectiveDate(String effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = Optional.ofNullable(effectiveDate);
        return this;
    }

    /**
     * The employee's last day of work.
     */
    public Termination withEffectiveDate(Optional<String> effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * If true, the employee should receive their final wages via an off-cycle payroll. If false, they should receive their final wages on their current pay schedule.
     */
    public Termination withRunTerminationPayroll(boolean runTerminationPayroll) {
        Utils.checkNotNull(runTerminationPayroll, "runTerminationPayroll");
        this.runTerminationPayroll = Optional.ofNullable(runTerminationPayroll);
        return this;
    }

    /**
     * If true, the employee should receive their final wages via an off-cycle payroll. If false, they should receive their final wages on their current pay schedule.
     */
    public Termination withRunTerminationPayroll(Optional<Boolean> runTerminationPayroll) {
        Utils.checkNotNull(runTerminationPayroll, "runTerminationPayroll");
        this.runTerminationPayroll = runTerminationPayroll;
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
        Termination other = (Termination) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.employeeUuid, other.employeeUuid) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.cancelable, other.cancelable) &&
            Objects.deepEquals(this.effectiveDate, other.effectiveDate) &&
            Objects.deepEquals(this.runTerminationPayroll, other.runTerminationPayroll);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            version,
            employeeUuid,
            active,
            cancelable,
            effectiveDate,
            runTerminationPayroll);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Termination.class,
                "uuid", uuid,
                "version", version,
                "employeeUuid", employeeUuid,
                "active", active,
                "cancelable", cancelable,
                "effectiveDate", effectiveDate,
                "runTerminationPayroll", runTerminationPayroll);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<String> version = Optional.empty();
 
        private Optional<String> employeeUuid = Optional.empty();
 
        private Optional<Boolean> active = Optional.empty();
 
        private Optional<Boolean> cancelable = Optional.empty();
 
        private Optional<String> effectiveDate = Optional.empty();
 
        private Optional<Boolean> runTerminationPayroll = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the termination object.
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
         * The UUID of the employee to which this termination is attached.
         */
        public Builder employeeUuid(String employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = Optional.ofNullable(employeeUuid);
            return this;
        }

        /**
         * The UUID of the employee to which this termination is attached.
         */
        public Builder employeeUuid(Optional<String> employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = employeeUuid;
            return this;
        }

        /**
         * Whether the employee's termination has gone into effect.
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        /**
         * Whether the employee's termination has gone into effect.
         */
        public Builder active(Optional<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * Whether the employee's termination is cancelable. Cancelable is true if `run_termination_payroll` is false and `effective_date` is in the future.
         */
        public Builder cancelable(boolean cancelable) {
            Utils.checkNotNull(cancelable, "cancelable");
            this.cancelable = Optional.ofNullable(cancelable);
            return this;
        }

        /**
         * Whether the employee's termination is cancelable. Cancelable is true if `run_termination_payroll` is false and `effective_date` is in the future.
         */
        public Builder cancelable(Optional<Boolean> cancelable) {
            Utils.checkNotNull(cancelable, "cancelable");
            this.cancelable = cancelable;
            return this;
        }

        /**
         * The employee's last day of work.
         */
        public Builder effectiveDate(String effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = Optional.ofNullable(effectiveDate);
            return this;
        }

        /**
         * The employee's last day of work.
         */
        public Builder effectiveDate(Optional<String> effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * If true, the employee should receive their final wages via an off-cycle payroll. If false, they should receive their final wages on their current pay schedule.
         */
        public Builder runTerminationPayroll(boolean runTerminationPayroll) {
            Utils.checkNotNull(runTerminationPayroll, "runTerminationPayroll");
            this.runTerminationPayroll = Optional.ofNullable(runTerminationPayroll);
            return this;
        }

        /**
         * If true, the employee should receive their final wages via an off-cycle payroll. If false, they should receive their final wages on their current pay schedule.
         */
        public Builder runTerminationPayroll(Optional<Boolean> runTerminationPayroll) {
            Utils.checkNotNull(runTerminationPayroll, "runTerminationPayroll");
            this.runTerminationPayroll = runTerminationPayroll;
            return this;
        }
        
        public Termination build() {
            return new Termination(
                uuid,
                version,
                employeeUuid,
                active,
                cancelable,
                effectiveDate,
                runTerminationPayroll);
        }
    }
}

