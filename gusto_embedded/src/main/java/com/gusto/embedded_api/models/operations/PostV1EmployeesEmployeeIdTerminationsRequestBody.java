/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
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

public class PostV1EmployeesEmployeeIdTerminationsRequestBody {

    /**
     * The employee's last day of work.
     */
    @JsonProperty("effective_date")
    private String effectiveDate;

    /**
     * If true, the employee should receive their final wages via an off-cycle payroll. If false, they should receive their final wages on their current pay schedule.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("run_termination_payroll")
    private Optional<Boolean> runTerminationPayroll;

    @JsonCreator
    public PostV1EmployeesEmployeeIdTerminationsRequestBody(
            @JsonProperty("effective_date") String effectiveDate,
            @JsonProperty("run_termination_payroll") Optional<Boolean> runTerminationPayroll) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        Utils.checkNotNull(runTerminationPayroll, "runTerminationPayroll");
        this.effectiveDate = effectiveDate;
        this.runTerminationPayroll = runTerminationPayroll;
    }
    
    public PostV1EmployeesEmployeeIdTerminationsRequestBody(
            String effectiveDate) {
        this(effectiveDate, Optional.empty());
    }

    /**
     * The employee's last day of work.
     */
    @JsonIgnore
    public String effectiveDate() {
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
     * The employee's last day of work.
     */
    public PostV1EmployeesEmployeeIdTerminationsRequestBody withEffectiveDate(String effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * If true, the employee should receive their final wages via an off-cycle payroll. If false, they should receive their final wages on their current pay schedule.
     */
    public PostV1EmployeesEmployeeIdTerminationsRequestBody withRunTerminationPayroll(boolean runTerminationPayroll) {
        Utils.checkNotNull(runTerminationPayroll, "runTerminationPayroll");
        this.runTerminationPayroll = Optional.ofNullable(runTerminationPayroll);
        return this;
    }

    /**
     * If true, the employee should receive their final wages via an off-cycle payroll. If false, they should receive their final wages on their current pay schedule.
     */
    public PostV1EmployeesEmployeeIdTerminationsRequestBody withRunTerminationPayroll(Optional<Boolean> runTerminationPayroll) {
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
        PostV1EmployeesEmployeeIdTerminationsRequestBody other = (PostV1EmployeesEmployeeIdTerminationsRequestBody) o;
        return 
            Objects.deepEquals(this.effectiveDate, other.effectiveDate) &&
            Objects.deepEquals(this.runTerminationPayroll, other.runTerminationPayroll);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            effectiveDate,
            runTerminationPayroll);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1EmployeesEmployeeIdTerminationsRequestBody.class,
                "effectiveDate", effectiveDate,
                "runTerminationPayroll", runTerminationPayroll);
    }
    
    public final static class Builder {
 
        private String effectiveDate;
 
        private Optional<Boolean> runTerminationPayroll = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The employee's last day of work.
         */
        public Builder effectiveDate(String effectiveDate) {
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
        
        public PostV1EmployeesEmployeeIdTerminationsRequestBody build() {
            return new PostV1EmployeesEmployeeIdTerminationsRequestBody(
                effectiveDate,
                runTerminationPayroll);
        }
    }
}

