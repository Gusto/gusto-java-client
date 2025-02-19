/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class PayrollPayPeriodType {

    /**
     * The start date, inclusive, of the pay period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("start_date")
    private Optional<String> startDate;

    /**
     * The start date, inclusive, of the pay period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("end_date")
    private Optional<String> endDate;

    /**
     * The UUID of the pay schedule for the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("pay_schedule_uuid")
    private JsonNullable<String> payScheduleUuid;

    @JsonCreator
    public PayrollPayPeriodType(
            @JsonProperty("start_date") Optional<String> startDate,
            @JsonProperty("end_date") Optional<String> endDate,
            @JsonProperty("pay_schedule_uuid") JsonNullable<String> payScheduleUuid) {
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(payScheduleUuid, "payScheduleUuid");
        this.startDate = startDate;
        this.endDate = endDate;
        this.payScheduleUuid = payScheduleUuid;
    }
    
    public PayrollPayPeriodType() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined());
    }

    /**
     * The start date, inclusive, of the pay period.
     */
    @JsonIgnore
    public Optional<String> startDate() {
        return startDate;
    }

    /**
     * The start date, inclusive, of the pay period.
     */
    @JsonIgnore
    public Optional<String> endDate() {
        return endDate;
    }

    /**
     * The UUID of the pay schedule for the payroll.
     */
    @JsonIgnore
    public JsonNullable<String> payScheduleUuid() {
        return payScheduleUuid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The start date, inclusive, of the pay period.
     */
    public PayrollPayPeriodType withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = Optional.ofNullable(startDate);
        return this;
    }

    /**
     * The start date, inclusive, of the pay period.
     */
    public PayrollPayPeriodType withStartDate(Optional<String> startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The start date, inclusive, of the pay period.
     */
    public PayrollPayPeriodType withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = Optional.ofNullable(endDate);
        return this;
    }

    /**
     * The start date, inclusive, of the pay period.
     */
    public PayrollPayPeriodType withEndDate(Optional<String> endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * The UUID of the pay schedule for the payroll.
     */
    public PayrollPayPeriodType withPayScheduleUuid(String payScheduleUuid) {
        Utils.checkNotNull(payScheduleUuid, "payScheduleUuid");
        this.payScheduleUuid = JsonNullable.of(payScheduleUuid);
        return this;
    }

    /**
     * The UUID of the pay schedule for the payroll.
     */
    public PayrollPayPeriodType withPayScheduleUuid(JsonNullable<String> payScheduleUuid) {
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
        PayrollPayPeriodType other = (PayrollPayPeriodType) o;
        return 
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.payScheduleUuid, other.payScheduleUuid);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            startDate,
            endDate,
            payScheduleUuid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PayrollPayPeriodType.class,
                "startDate", startDate,
                "endDate", endDate,
                "payScheduleUuid", payScheduleUuid);
    }
    
    public final static class Builder {
 
        private Optional<String> startDate = Optional.empty();
 
        private Optional<String> endDate = Optional.empty();
 
        private JsonNullable<String> payScheduleUuid = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The start date, inclusive, of the pay period.
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = Optional.ofNullable(startDate);
            return this;
        }

        /**
         * The start date, inclusive, of the pay period.
         */
        public Builder startDate(Optional<String> startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The start date, inclusive, of the pay period.
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = Optional.ofNullable(endDate);
            return this;
        }

        /**
         * The start date, inclusive, of the pay period.
         */
        public Builder endDate(Optional<String> endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * The UUID of the pay schedule for the payroll.
         */
        public Builder payScheduleUuid(String payScheduleUuid) {
            Utils.checkNotNull(payScheduleUuid, "payScheduleUuid");
            this.payScheduleUuid = JsonNullable.of(payScheduleUuid);
            return this;
        }

        /**
         * The UUID of the pay schedule for the payroll.
         */
        public Builder payScheduleUuid(JsonNullable<String> payScheduleUuid) {
            Utils.checkNotNull(payScheduleUuid, "payScheduleUuid");
            this.payScheduleUuid = payScheduleUuid;
            return this;
        }
        
        public PayrollPayPeriodType build() {
            return new PayrollPayPeriodType(
                startDate,
                endDate,
                payScheduleUuid);
        }
    }
}

