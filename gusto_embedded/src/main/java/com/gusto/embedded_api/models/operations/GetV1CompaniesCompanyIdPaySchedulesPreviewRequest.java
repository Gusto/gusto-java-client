/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class GetV1CompaniesCompanyIdPaySchedulesPreviewRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_id")
    private String companyId;

    /**
     * The frequency that employees on this pay schedule are paid with Gusto.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=frequency")
    private QueryParamFrequency frequency;

    /**
     * The first date that employees on this pay schedule are paid with Gusto.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=anchor_pay_date")
    private String anchorPayDate;

    /**
     * The last date of the first pay period. This can be the same date as the anchor pay date.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=anchor_end_of_pay_period")
    private String anchorEndOfPayPeriod;

    /**
     * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=day_1")
    private Optional<Long> day1;

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=day_2")
    private Optional<Long> day2;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest(
            String companyId,
            QueryParamFrequency frequency,
            String anchorPayDate,
            String anchorEndOfPayPeriod,
            Optional<Long> day1,
            Optional<Long> day2,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(frequency, "frequency");
        Utils.checkNotNull(anchorPayDate, "anchorPayDate");
        Utils.checkNotNull(anchorEndOfPayPeriod, "anchorEndOfPayPeriod");
        Utils.checkNotNull(day1, "day1");
        Utils.checkNotNull(day2, "day2");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.companyId = companyId;
        this.frequency = frequency;
        this.anchorPayDate = anchorPayDate;
        this.anchorEndOfPayPeriod = anchorEndOfPayPeriod;
        this.day1 = day1;
        this.day2 = day2;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest(
            String companyId,
            QueryParamFrequency frequency,
            String anchorPayDate,
            String anchorEndOfPayPeriod) {
        this(companyId, frequency, anchorPayDate, anchorEndOfPayPeriod, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * The frequency that employees on this pay schedule are paid with Gusto.
     */
    @JsonIgnore
    public QueryParamFrequency frequency() {
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
    public Optional<Long> day1() {
        return day1;
    }

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    @JsonIgnore
    public Optional<Long> day2() {
        return day2;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VersionHeader> xGustoAPIVersion() {
        return (Optional<VersionHeader>) xGustoAPIVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the company
     */
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The frequency that employees on this pay schedule are paid with Gusto.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest withFrequency(QueryParamFrequency frequency) {
        Utils.checkNotNull(frequency, "frequency");
        this.frequency = frequency;
        return this;
    }

    /**
     * The first date that employees on this pay schedule are paid with Gusto.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest withAnchorPayDate(String anchorPayDate) {
        Utils.checkNotNull(anchorPayDate, "anchorPayDate");
        this.anchorPayDate = anchorPayDate;
        return this;
    }

    /**
     * The last date of the first pay period. This can be the same date as the anchor pay date.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest withAnchorEndOfPayPeriod(String anchorEndOfPayPeriod) {
        Utils.checkNotNull(anchorEndOfPayPeriod, "anchorEndOfPayPeriod");
        this.anchorEndOfPayPeriod = anchorEndOfPayPeriod;
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest withDay1(long day1) {
        Utils.checkNotNull(day1, "day1");
        this.day1 = Optional.ofNullable(day1);
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest withDay1(Optional<Long> day1) {
        Utils.checkNotNull(day1, "day1");
        this.day1 = day1;
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest withDay2(long day2) {
        Utils.checkNotNull(day2, "day2");
        this.day2 = Optional.ofNullable(day2);
        return this;
    }

    /**
     * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest withDay2(Optional<Long> day2) {
        Utils.checkNotNull(day2, "day2");
        this.day2 = day2;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
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
        GetV1CompaniesCompanyIdPaySchedulesPreviewRequest other = (GetV1CompaniesCompanyIdPaySchedulesPreviewRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.frequency, other.frequency) &&
            Objects.deepEquals(this.anchorPayDate, other.anchorPayDate) &&
            Objects.deepEquals(this.anchorEndOfPayPeriod, other.anchorEndOfPayPeriod) &&
            Objects.deepEquals(this.day1, other.day1) &&
            Objects.deepEquals(this.day2, other.day2) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            frequency,
            anchorPayDate,
            anchorEndOfPayPeriod,
            day1,
            day2,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1CompaniesCompanyIdPaySchedulesPreviewRequest.class,
                "companyId", companyId,
                "frequency", frequency,
                "anchorPayDate", anchorPayDate,
                "anchorEndOfPayPeriod", anchorEndOfPayPeriod,
                "day1", day1,
                "day2", day2,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private QueryParamFrequency frequency;
 
        private String anchorPayDate;
 
        private String anchorEndOfPayPeriod;
 
        private Optional<Long> day1 = Optional.empty();
 
        private Optional<Long> day2 = Optional.empty();
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the company
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
            return this;
        }

        /**
         * The frequency that employees on this pay schedule are paid with Gusto.
         */
        public Builder frequency(QueryParamFrequency frequency) {
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
            this.day1 = Optional.ofNullable(day1);
            return this;
        }

        /**
         * An integer between 1 and 31 indicating the first day of the month that employees are paid. This field is only relevant for pay schedules with the “Twice per month” and “Monthly” frequencies. It will be null for pay schedules with other frequencies.
         */
        public Builder day1(Optional<Long> day1) {
            Utils.checkNotNull(day1, "day1");
            this.day1 = day1;
            return this;
        }

        /**
         * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
         */
        public Builder day2(long day2) {
            Utils.checkNotNull(day2, "day2");
            this.day2 = Optional.ofNullable(day2);
            return this;
        }

        /**
         * An integer between 1 and 31 indicating the second day of the month that employees are paid. This field is the second pay date for pay schedules with the "Twice per month" frequency. For semi-monthly pay schedules, set this field to 31. For months shorter than 31 days, we will set the second pay date to the last day of the month. It will be null for pay schedules with other frequencies.
         */
        public Builder day2(Optional<Long> day2) {
            Utils.checkNotNull(day2, "day2");
            this.day2 = day2;
            return this;
        }

        /**
         * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
         */
        public Builder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
            Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
            this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
            return this;
        }

        /**
         * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
         */
        public Builder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
            Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
            this.xGustoAPIVersion = xGustoAPIVersion;
            return this;
        }
        
        public GetV1CompaniesCompanyIdPaySchedulesPreviewRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new GetV1CompaniesCompanyIdPaySchedulesPreviewRequest(
                companyId,
                frequency,
                anchorPayDate,
                anchorEndOfPayPeriod,
                day1,
                day2,
                xGustoAPIVersion);
        }

        private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
                new LazySingletonValue<>(
                        "X-Gusto-API-Version",
                        "\"2024-04-01\"",
                        new TypeReference<Optional<? extends VersionHeader>>() {});
    }
}

