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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class PostV1CompaniesCompanyIdPaySchedulesRequestBody {

    /**
     * The frequency that employees on this pay schedule are paid with Gusto.
     */
    @JsonProperty("frequency")
    private Frequency frequency;

    /**
     * The first date that employees on this pay schedule are paid with Gusto.
     */
    @JsonProperty("anchor_pay_date")
    private String anchorPayDate;

    /**
     * The last date of the first pay period. This can be the same date as the anchor pay date.
     */
    @JsonProperty("anchor_end_of_pay_period")
    private String anchorEndOfPayPeriod;

    /**
     * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("day_1")
    private JsonNullable<Long> day1;

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("day_2")
    private JsonNullable<Long> day2;

    /**
     * A custom pay schedule name, defaults to the pay frequency description.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("custom_name")
    private Optional<String> customName;

    @JsonCreator
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody(
            @JsonProperty("frequency") Frequency frequency,
            @JsonProperty("anchor_pay_date") String anchorPayDate,
            @JsonProperty("anchor_end_of_pay_period") String anchorEndOfPayPeriod,
            @JsonProperty("day_1") JsonNullable<Long> day1,
            @JsonProperty("day_2") JsonNullable<Long> day2,
            @JsonProperty("custom_name") Optional<String> customName) {
        Utils.checkNotNull(frequency, "frequency");
        Utils.checkNotNull(anchorPayDate, "anchorPayDate");
        Utils.checkNotNull(anchorEndOfPayPeriod, "anchorEndOfPayPeriod");
        Utils.checkNotNull(day1, "day1");
        Utils.checkNotNull(day2, "day2");
        Utils.checkNotNull(customName, "customName");
        this.frequency = frequency;
        this.anchorPayDate = anchorPayDate;
        this.anchorEndOfPayPeriod = anchorEndOfPayPeriod;
        this.day1 = day1;
        this.day2 = day2;
        this.customName = customName;
    }
    
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody(
            Frequency frequency,
            String anchorPayDate,
            String anchorEndOfPayPeriod) {
        this(frequency, anchorPayDate, anchorEndOfPayPeriod, JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The frequency that employees on this pay schedule are paid with Gusto.
     */
    @JsonIgnore
    public Frequency frequency() {
        return frequency;
    }

    /**
     * The first date that employees on this pay schedule are paid with Gusto.
     */
    @JsonIgnore
    public String anchorPayDate() {
        return anchorPayDate;
    }

    /**
     * The last date of the first pay period. This can be the same date as the anchor pay date.
     */
    @JsonIgnore
    public String anchorEndOfPayPeriod() {
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
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    @JsonIgnore
    public JsonNullable<Long> day2() {
        return day2;
    }

    /**
     * A custom pay schedule name, defaults to the pay frequency description.
     */
    @JsonIgnore
    public Optional<String> customName() {
        return customName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The frequency that employees on this pay schedule are paid with Gusto.
     */
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody withFrequency(Frequency frequency) {
        Utils.checkNotNull(frequency, "frequency");
        this.frequency = frequency;
        return this;
    }

    /**
     * The first date that employees on this pay schedule are paid with Gusto.
     */
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody withAnchorPayDate(String anchorPayDate) {
        Utils.checkNotNull(anchorPayDate, "anchorPayDate");
        this.anchorPayDate = anchorPayDate;
        return this;
    }

    /**
     * The last date of the first pay period. This can be the same date as the anchor pay date.
     */
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody withAnchorEndOfPayPeriod(String anchorEndOfPayPeriod) {
        Utils.checkNotNull(anchorEndOfPayPeriod, "anchorEndOfPayPeriod");
        this.anchorEndOfPayPeriod = anchorEndOfPayPeriod;
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
     */
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody withDay1(long day1) {
        Utils.checkNotNull(day1, "day1");
        this.day1 = JsonNullable.of(day1);
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
     */
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody withDay1(JsonNullable<Long> day1) {
        Utils.checkNotNull(day1, "day1");
        this.day1 = day1;
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody withDay2(long day2) {
        Utils.checkNotNull(day2, "day2");
        this.day2 = JsonNullable.of(day2);
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody withDay2(JsonNullable<Long> day2) {
        Utils.checkNotNull(day2, "day2");
        this.day2 = day2;
        return this;
    }

    /**
     * A custom pay schedule name, defaults to the pay frequency description.
     */
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody withCustomName(String customName) {
        Utils.checkNotNull(customName, "customName");
        this.customName = Optional.ofNullable(customName);
        return this;
    }

    /**
     * A custom pay schedule name, defaults to the pay frequency description.
     */
    public PostV1CompaniesCompanyIdPaySchedulesRequestBody withCustomName(Optional<String> customName) {
        Utils.checkNotNull(customName, "customName");
        this.customName = customName;
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
        PostV1CompaniesCompanyIdPaySchedulesRequestBody other = (PostV1CompaniesCompanyIdPaySchedulesRequestBody) o;
        return 
            Objects.deepEquals(this.frequency, other.frequency) &&
            Objects.deepEquals(this.anchorPayDate, other.anchorPayDate) &&
            Objects.deepEquals(this.anchorEndOfPayPeriod, other.anchorEndOfPayPeriod) &&
            Objects.deepEquals(this.day1, other.day1) &&
            Objects.deepEquals(this.day2, other.day2) &&
            Objects.deepEquals(this.customName, other.customName);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            frequency,
            anchorPayDate,
            anchorEndOfPayPeriod,
            day1,
            day2,
            customName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1CompaniesCompanyIdPaySchedulesRequestBody.class,
                "frequency", frequency,
                "anchorPayDate", anchorPayDate,
                "anchorEndOfPayPeriod", anchorEndOfPayPeriod,
                "day1", day1,
                "day2", day2,
                "customName", customName);
    }
    
    public final static class Builder {
 
        private Frequency frequency;
 
        private String anchorPayDate;
 
        private String anchorEndOfPayPeriod;
 
        private JsonNullable<Long> day1 = JsonNullable.undefined();
 
        private JsonNullable<Long> day2 = JsonNullable.undefined();
 
        private Optional<String> customName = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The frequency that employees on this pay schedule are paid with Gusto.
         */
        public Builder frequency(Frequency frequency) {
            Utils.checkNotNull(frequency, "frequency");
            this.frequency = frequency;
            return this;
        }

        /**
         * The first date that employees on this pay schedule are paid with Gusto.
         */
        public Builder anchorPayDate(String anchorPayDate) {
            Utils.checkNotNull(anchorPayDate, "anchorPayDate");
            this.anchorPayDate = anchorPayDate;
            return this;
        }

        /**
         * The last date of the first pay period. This can be the same date as the anchor pay date.
         */
        public Builder anchorEndOfPayPeriod(String anchorEndOfPayPeriod) {
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
         * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
         */
        public Builder day2(long day2) {
            Utils.checkNotNull(day2, "day2");
            this.day2 = JsonNullable.of(day2);
            return this;
        }

        /**
         * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
         */
        public Builder day2(JsonNullable<Long> day2) {
            Utils.checkNotNull(day2, "day2");
            this.day2 = day2;
            return this;
        }

        /**
         * A custom pay schedule name, defaults to the pay frequency description.
         */
        public Builder customName(String customName) {
            Utils.checkNotNull(customName, "customName");
            this.customName = Optional.ofNullable(customName);
            return this;
        }

        /**
         * A custom pay schedule name, defaults to the pay frequency description.
         */
        public Builder customName(Optional<String> customName) {
            Utils.checkNotNull(customName, "customName");
            this.customName = customName;
            return this;
        }
        
        public PostV1CompaniesCompanyIdPaySchedulesRequestBody build() {
            return new PostV1CompaniesCompanyIdPaySchedulesRequestBody(
                frequency,
                anchorPayDate,
                anchorEndOfPayPeriod,
                day1,
                day2,
                customName);
        }
    }
}

