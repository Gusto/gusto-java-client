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
import java.util.Objects;
import java.util.Optional;

public class PayScheduleAssignmentEmployee {

    /**
     * The UUID of the employee.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_uuid")
    private Optional<String> employeeUuid;

    /**
     * The employee's pay schedule UUID.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pay_schedule_uuid")
    private Optional<String> payScheduleUuid;

    @JsonCreator
    public PayScheduleAssignmentEmployee(
            @JsonProperty("employee_uuid") Optional<String> employeeUuid,
            @JsonProperty("pay_schedule_uuid") Optional<String> payScheduleUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        Utils.checkNotNull(payScheduleUuid, "payScheduleUuid");
        this.employeeUuid = employeeUuid;
        this.payScheduleUuid = payScheduleUuid;
    }
    
    public PayScheduleAssignmentEmployee() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the employee.
     */
    @JsonIgnore
    public Optional<String> employeeUuid() {
        return employeeUuid;
    }

    /**
     * The employee's pay schedule UUID.
     */
    @JsonIgnore
    public Optional<String> payScheduleUuid() {
        return payScheduleUuid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the employee.
     */
    public PayScheduleAssignmentEmployee withEmployeeUuid(String employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = Optional.ofNullable(employeeUuid);
        return this;
    }

    /**
     * The UUID of the employee.
     */
    public PayScheduleAssignmentEmployee withEmployeeUuid(Optional<String> employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = employeeUuid;
        return this;
    }

    /**
     * The employee's pay schedule UUID.
     */
    public PayScheduleAssignmentEmployee withPayScheduleUuid(String payScheduleUuid) {
        Utils.checkNotNull(payScheduleUuid, "payScheduleUuid");
        this.payScheduleUuid = Optional.ofNullable(payScheduleUuid);
        return this;
    }

    /**
     * The employee's pay schedule UUID.
     */
    public PayScheduleAssignmentEmployee withPayScheduleUuid(Optional<String> payScheduleUuid) {
        Utils.checkNotNull(payScheduleUuid, "payScheduleUuid");
        this.payScheduleUuid = payScheduleUuid;
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
        PayScheduleAssignmentEmployee other = (PayScheduleAssignmentEmployee) o;
        return 
            Objects.deepEquals(this.employeeUuid, other.employeeUuid) &&
            Objects.deepEquals(this.payScheduleUuid, other.payScheduleUuid);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employeeUuid,
            payScheduleUuid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PayScheduleAssignmentEmployee.class,
                "employeeUuid", employeeUuid,
                "payScheduleUuid", payScheduleUuid);
    }
    
    public final static class Builder {
 
        private Optional<String> employeeUuid = Optional.empty();
 
        private Optional<String> payScheduleUuid = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the employee.
         */
        public Builder employeeUuid(String employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = Optional.ofNullable(employeeUuid);
            return this;
        }

        /**
         * The UUID of the employee.
         */
        public Builder employeeUuid(Optional<String> employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = employeeUuid;
            return this;
        }

        /**
         * The employee's pay schedule UUID.
         */
        public Builder payScheduleUuid(String payScheduleUuid) {
            Utils.checkNotNull(payScheduleUuid, "payScheduleUuid");
            this.payScheduleUuid = Optional.ofNullable(payScheduleUuid);
            return this;
        }

        /**
         * The employee's pay schedule UUID.
         */
        public Builder payScheduleUuid(Optional<String> payScheduleUuid) {
            Utils.checkNotNull(payScheduleUuid, "payScheduleUuid");
            this.payScheduleUuid = payScheduleUuid;
            return this;
        }
        
        public PayScheduleAssignmentEmployee build() {
            return new PayScheduleAssignmentEmployee(
                employeeUuid,
                payScheduleUuid);
        }
    }
}

