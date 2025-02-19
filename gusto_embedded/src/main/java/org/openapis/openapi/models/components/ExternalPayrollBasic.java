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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

/**
 * ExternalPayrollBasic - The representation of an external payroll with minimal information.
 */

public class ExternalPayrollBasic {

    /**
     * The UUID of the external payroll.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * The UUID of the company.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_uuid")
    private Optional<String> companyUuid;

    /**
     * External payroll's check date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("check_date")
    private Optional<String> checkDate;

    /**
     * External payroll's pay period start date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_period_start_date")
    private Optional<String> paymentPeriodStartDate;

    /**
     * External payroll's pay period end date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_period_end_date")
    private Optional<String> paymentPeriodEndDate;

    /**
     * The status of the external payroll. The status will be `unprocessed` when the external payroll is created and transition to `processed` once tax liabilities are entered and finalized.  Once in the `processed` status all actions that can edit an external payroll will be disabled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends ExternalPayrollBasicStatus> status;

    @JsonCreator
    public ExternalPayrollBasic(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("company_uuid") Optional<String> companyUuid,
            @JsonProperty("check_date") Optional<String> checkDate,
            @JsonProperty("payment_period_start_date") Optional<String> paymentPeriodStartDate,
            @JsonProperty("payment_period_end_date") Optional<String> paymentPeriodEndDate,
            @JsonProperty("status") Optional<? extends ExternalPayrollBasicStatus> status) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(checkDate, "checkDate");
        Utils.checkNotNull(paymentPeriodStartDate, "paymentPeriodStartDate");
        Utils.checkNotNull(paymentPeriodEndDate, "paymentPeriodEndDate");
        Utils.checkNotNull(status, "status");
        this.uuid = uuid;
        this.companyUuid = companyUuid;
        this.checkDate = checkDate;
        this.paymentPeriodStartDate = paymentPeriodStartDate;
        this.paymentPeriodEndDate = paymentPeriodEndDate;
        this.status = status;
    }
    
    public ExternalPayrollBasic(
            String uuid) {
        this(uuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the external payroll.
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * The UUID of the company.
     */
    @JsonIgnore
    public Optional<String> companyUuid() {
        return companyUuid;
    }

    /**
     * External payroll's check date.
     */
    @JsonIgnore
    public Optional<String> checkDate() {
        return checkDate;
    }

    /**
     * External payroll's pay period start date.
     */
    @JsonIgnore
    public Optional<String> paymentPeriodStartDate() {
        return paymentPeriodStartDate;
    }

    /**
     * External payroll's pay period end date.
     */
    @JsonIgnore
    public Optional<String> paymentPeriodEndDate() {
        return paymentPeriodEndDate;
    }

    /**
     * The status of the external payroll. The status will be `unprocessed` when the external payroll is created and transition to `processed` once tax liabilities are entered and finalized.  Once in the `processed` status all actions that can edit an external payroll will be disabled.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ExternalPayrollBasicStatus> status() {
        return (Optional<ExternalPayrollBasicStatus>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the external payroll.
     */
    public ExternalPayrollBasic withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The UUID of the company.
     */
    public ExternalPayrollBasic withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = Optional.ofNullable(companyUuid);
        return this;
    }

    /**
     * The UUID of the company.
     */
    public ExternalPayrollBasic withCompanyUuid(Optional<String> companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * External payroll's check date.
     */
    public ExternalPayrollBasic withCheckDate(String checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = Optional.ofNullable(checkDate);
        return this;
    }

    /**
     * External payroll's check date.
     */
    public ExternalPayrollBasic withCheckDate(Optional<String> checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = checkDate;
        return this;
    }

    /**
     * External payroll's pay period start date.
     */
    public ExternalPayrollBasic withPaymentPeriodStartDate(String paymentPeriodStartDate) {
        Utils.checkNotNull(paymentPeriodStartDate, "paymentPeriodStartDate");
        this.paymentPeriodStartDate = Optional.ofNullable(paymentPeriodStartDate);
        return this;
    }

    /**
     * External payroll's pay period start date.
     */
    public ExternalPayrollBasic withPaymentPeriodStartDate(Optional<String> paymentPeriodStartDate) {
        Utils.checkNotNull(paymentPeriodStartDate, "paymentPeriodStartDate");
        this.paymentPeriodStartDate = paymentPeriodStartDate;
        return this;
    }

    /**
     * External payroll's pay period end date.
     */
    public ExternalPayrollBasic withPaymentPeriodEndDate(String paymentPeriodEndDate) {
        Utils.checkNotNull(paymentPeriodEndDate, "paymentPeriodEndDate");
        this.paymentPeriodEndDate = Optional.ofNullable(paymentPeriodEndDate);
        return this;
    }

    /**
     * External payroll's pay period end date.
     */
    public ExternalPayrollBasic withPaymentPeriodEndDate(Optional<String> paymentPeriodEndDate) {
        Utils.checkNotNull(paymentPeriodEndDate, "paymentPeriodEndDate");
        this.paymentPeriodEndDate = paymentPeriodEndDate;
        return this;
    }

    /**
     * The status of the external payroll. The status will be `unprocessed` when the external payroll is created and transition to `processed` once tax liabilities are entered and finalized.  Once in the `processed` status all actions that can edit an external payroll will be disabled.
     */
    public ExternalPayrollBasic withStatus(ExternalPayrollBasicStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * The status of the external payroll. The status will be `unprocessed` when the external payroll is created and transition to `processed` once tax liabilities are entered and finalized.  Once in the `processed` status all actions that can edit an external payroll will be disabled.
     */
    public ExternalPayrollBasic withStatus(Optional<? extends ExternalPayrollBasicStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        ExternalPayrollBasic other = (ExternalPayrollBasic) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.checkDate, other.checkDate) &&
            Objects.deepEquals(this.paymentPeriodStartDate, other.paymentPeriodStartDate) &&
            Objects.deepEquals(this.paymentPeriodEndDate, other.paymentPeriodEndDate) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            companyUuid,
            checkDate,
            paymentPeriodStartDate,
            paymentPeriodEndDate,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExternalPayrollBasic.class,
                "uuid", uuid,
                "companyUuid", companyUuid,
                "checkDate", checkDate,
                "paymentPeriodStartDate", paymentPeriodStartDate,
                "paymentPeriodEndDate", paymentPeriodEndDate,
                "status", status);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<String> companyUuid = Optional.empty();
 
        private Optional<String> checkDate = Optional.empty();
 
        private Optional<String> paymentPeriodStartDate = Optional.empty();
 
        private Optional<String> paymentPeriodEndDate = Optional.empty();
 
        private Optional<? extends ExternalPayrollBasicStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the external payroll.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The UUID of the company.
         */
        public Builder companyUuid(String companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = Optional.ofNullable(companyUuid);
            return this;
        }

        /**
         * The UUID of the company.
         */
        public Builder companyUuid(Optional<String> companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = companyUuid;
            return this;
        }

        /**
         * External payroll's check date.
         */
        public Builder checkDate(String checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = Optional.ofNullable(checkDate);
            return this;
        }

        /**
         * External payroll's check date.
         */
        public Builder checkDate(Optional<String> checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = checkDate;
            return this;
        }

        /**
         * External payroll's pay period start date.
         */
        public Builder paymentPeriodStartDate(String paymentPeriodStartDate) {
            Utils.checkNotNull(paymentPeriodStartDate, "paymentPeriodStartDate");
            this.paymentPeriodStartDate = Optional.ofNullable(paymentPeriodStartDate);
            return this;
        }

        /**
         * External payroll's pay period start date.
         */
        public Builder paymentPeriodStartDate(Optional<String> paymentPeriodStartDate) {
            Utils.checkNotNull(paymentPeriodStartDate, "paymentPeriodStartDate");
            this.paymentPeriodStartDate = paymentPeriodStartDate;
            return this;
        }

        /**
         * External payroll's pay period end date.
         */
        public Builder paymentPeriodEndDate(String paymentPeriodEndDate) {
            Utils.checkNotNull(paymentPeriodEndDate, "paymentPeriodEndDate");
            this.paymentPeriodEndDate = Optional.ofNullable(paymentPeriodEndDate);
            return this;
        }

        /**
         * External payroll's pay period end date.
         */
        public Builder paymentPeriodEndDate(Optional<String> paymentPeriodEndDate) {
            Utils.checkNotNull(paymentPeriodEndDate, "paymentPeriodEndDate");
            this.paymentPeriodEndDate = paymentPeriodEndDate;
            return this;
        }

        /**
         * The status of the external payroll. The status will be `unprocessed` when the external payroll is created and transition to `processed` once tax liabilities are entered and finalized.  Once in the `processed` status all actions that can edit an external payroll will be disabled.
         */
        public Builder status(ExternalPayrollBasicStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * The status of the external payroll. The status will be `unprocessed` when the external payroll is created and transition to `processed` once tax liabilities are entered and finalized.  Once in the `processed` status all actions that can edit an external payroll will be disabled.
         */
        public Builder status(Optional<? extends ExternalPayrollBasicStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public ExternalPayrollBasic build() {
            return new ExternalPayrollBasic(
                uuid,
                companyUuid,
                checkDate,
                paymentPeriodStartDate,
                paymentPeriodEndDate,
                status);
        }
    }
}

