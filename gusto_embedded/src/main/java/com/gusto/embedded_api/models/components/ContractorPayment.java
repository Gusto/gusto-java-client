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
import java.util.Objects;
import java.util.Optional;
/**
 * ContractorPayment - The representation of a single contractor payment.
 */

public class ContractorPayment {

    /**
     * The unique identifier of the contractor payment in Gusto.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * The UUID of the contractor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contractor_uuid")
    private Optional<String> contractorUuid;

    /**
     * The bonus amount in the payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bonus")
    private Optional<String> bonus;

    /**
     * The payment date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date")
    private Optional<String> date;

    /**
     * The number of hours worked for the payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hours")
    private Optional<String> hours;

    /**
     * The payment method.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payment_method")
    private Optional<? extends ContractorPaymentPaymentMethod> paymentMethod;

    /**
     * The reimbursement amount in the payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reimbursement")
    private Optional<String> reimbursement;

    /**
     * Contractor payment status
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends ContractorPaymentStatus> status;

    /**
     * The rate per hour worked for the payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hourly_rate")
    private Optional<String> hourlyRate;

    /**
     * Determine if the contractor payment can be cancelled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("may_cancel")
    private Optional<Boolean> mayCancel;

    /**
     * The fixed wage of the payment, regardless of hours worked.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wage")
    private Optional<String> wage;

    /**
     * The wage type for the payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wage_type")
    private Optional<? extends ContractorPaymentWageType> wageType;

    /**
     * (hours * hourly_rate) + wage + bonus
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wage_total")
    private Optional<String> wageTotal;

    @JsonCreator
    public ContractorPayment(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("contractor_uuid") Optional<String> contractorUuid,
            @JsonProperty("bonus") Optional<String> bonus,
            @JsonProperty("date") Optional<String> date,
            @JsonProperty("hours") Optional<String> hours,
            @JsonProperty("payment_method") Optional<? extends ContractorPaymentPaymentMethod> paymentMethod,
            @JsonProperty("reimbursement") Optional<String> reimbursement,
            @JsonProperty("status") Optional<? extends ContractorPaymentStatus> status,
            @JsonProperty("hourly_rate") Optional<String> hourlyRate,
            @JsonProperty("may_cancel") Optional<Boolean> mayCancel,
            @JsonProperty("wage") Optional<String> wage,
            @JsonProperty("wage_type") Optional<? extends ContractorPaymentWageType> wageType,
            @JsonProperty("wage_total") Optional<String> wageTotal) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        Utils.checkNotNull(bonus, "bonus");
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(hours, "hours");
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        Utils.checkNotNull(reimbursement, "reimbursement");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(hourlyRate, "hourlyRate");
        Utils.checkNotNull(mayCancel, "mayCancel");
        Utils.checkNotNull(wage, "wage");
        Utils.checkNotNull(wageType, "wageType");
        Utils.checkNotNull(wageTotal, "wageTotal");
        this.uuid = uuid;
        this.contractorUuid = contractorUuid;
        this.bonus = bonus;
        this.date = date;
        this.hours = hours;
        this.paymentMethod = paymentMethod;
        this.reimbursement = reimbursement;
        this.status = status;
        this.hourlyRate = hourlyRate;
        this.mayCancel = mayCancel;
        this.wage = wage;
        this.wageType = wageType;
        this.wageTotal = wageTotal;
    }
    
    public ContractorPayment(
            String uuid) {
        this(uuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The unique identifier of the contractor payment in Gusto.
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * The UUID of the contractor.
     */
    @JsonIgnore
    public Optional<String> contractorUuid() {
        return contractorUuid;
    }

    /**
     * The bonus amount in the payment.
     */
    @JsonIgnore
    public Optional<String> bonus() {
        return bonus;
    }

    /**
     * The payment date.
     */
    @JsonIgnore
    public Optional<String> date() {
        return date;
    }

    /**
     * The number of hours worked for the payment.
     */
    @JsonIgnore
    public Optional<String> hours() {
        return hours;
    }

    /**
     * The payment method.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ContractorPaymentPaymentMethod> paymentMethod() {
        return (Optional<ContractorPaymentPaymentMethod>) paymentMethod;
    }

    /**
     * The reimbursement amount in the payment.
     */
    @JsonIgnore
    public Optional<String> reimbursement() {
        return reimbursement;
    }

    /**
     * Contractor payment status
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ContractorPaymentStatus> status() {
        return (Optional<ContractorPaymentStatus>) status;
    }

    /**
     * The rate per hour worked for the payment.
     */
    @JsonIgnore
    public Optional<String> hourlyRate() {
        return hourlyRate;
    }

    /**
     * Determine if the contractor payment can be cancelled.
     */
    @JsonIgnore
    public Optional<Boolean> mayCancel() {
        return mayCancel;
    }

    /**
     * The fixed wage of the payment, regardless of hours worked.
     */
    @JsonIgnore
    public Optional<String> wage() {
        return wage;
    }

    /**
     * The wage type for the payment.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ContractorPaymentWageType> wageType() {
        return (Optional<ContractorPaymentWageType>) wageType;
    }

    /**
     * (hours * hourly_rate) + wage + bonus
     */
    @JsonIgnore
    public Optional<String> wageTotal() {
        return wageTotal;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier of the contractor payment in Gusto.
     */
    public ContractorPayment withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The UUID of the contractor.
     */
    public ContractorPayment withContractorUuid(String contractorUuid) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        this.contractorUuid = Optional.ofNullable(contractorUuid);
        return this;
    }

    /**
     * The UUID of the contractor.
     */
    public ContractorPayment withContractorUuid(Optional<String> contractorUuid) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        this.contractorUuid = contractorUuid;
        return this;
    }

    /**
     * The bonus amount in the payment.
     */
    public ContractorPayment withBonus(String bonus) {
        Utils.checkNotNull(bonus, "bonus");
        this.bonus = Optional.ofNullable(bonus);
        return this;
    }

    /**
     * The bonus amount in the payment.
     */
    public ContractorPayment withBonus(Optional<String> bonus) {
        Utils.checkNotNull(bonus, "bonus");
        this.bonus = bonus;
        return this;
    }

    /**
     * The payment date.
     */
    public ContractorPayment withDate(String date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.ofNullable(date);
        return this;
    }

    /**
     * The payment date.
     */
    public ContractorPayment withDate(Optional<String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    /**
     * The number of hours worked for the payment.
     */
    public ContractorPayment withHours(String hours) {
        Utils.checkNotNull(hours, "hours");
        this.hours = Optional.ofNullable(hours);
        return this;
    }

    /**
     * The number of hours worked for the payment.
     */
    public ContractorPayment withHours(Optional<String> hours) {
        Utils.checkNotNull(hours, "hours");
        this.hours = hours;
        return this;
    }

    /**
     * The payment method.
     */
    public ContractorPayment withPaymentMethod(ContractorPaymentPaymentMethod paymentMethod) {
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        this.paymentMethod = Optional.ofNullable(paymentMethod);
        return this;
    }

    /**
     * The payment method.
     */
    public ContractorPayment withPaymentMethod(Optional<? extends ContractorPaymentPaymentMethod> paymentMethod) {
        Utils.checkNotNull(paymentMethod, "paymentMethod");
        this.paymentMethod = paymentMethod;
        return this;
    }

    /**
     * The reimbursement amount in the payment.
     */
    public ContractorPayment withReimbursement(String reimbursement) {
        Utils.checkNotNull(reimbursement, "reimbursement");
        this.reimbursement = Optional.ofNullable(reimbursement);
        return this;
    }

    /**
     * The reimbursement amount in the payment.
     */
    public ContractorPayment withReimbursement(Optional<String> reimbursement) {
        Utils.checkNotNull(reimbursement, "reimbursement");
        this.reimbursement = reimbursement;
        return this;
    }

    /**
     * Contractor payment status
     */
    public ContractorPayment withStatus(ContractorPaymentStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Contractor payment status
     */
    public ContractorPayment withStatus(Optional<? extends ContractorPaymentStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * The rate per hour worked for the payment.
     */
    public ContractorPayment withHourlyRate(String hourlyRate) {
        Utils.checkNotNull(hourlyRate, "hourlyRate");
        this.hourlyRate = Optional.ofNullable(hourlyRate);
        return this;
    }

    /**
     * The rate per hour worked for the payment.
     */
    public ContractorPayment withHourlyRate(Optional<String> hourlyRate) {
        Utils.checkNotNull(hourlyRate, "hourlyRate");
        this.hourlyRate = hourlyRate;
        return this;
    }

    /**
     * Determine if the contractor payment can be cancelled.
     */
    public ContractorPayment withMayCancel(boolean mayCancel) {
        Utils.checkNotNull(mayCancel, "mayCancel");
        this.mayCancel = Optional.ofNullable(mayCancel);
        return this;
    }

    /**
     * Determine if the contractor payment can be cancelled.
     */
    public ContractorPayment withMayCancel(Optional<Boolean> mayCancel) {
        Utils.checkNotNull(mayCancel, "mayCancel");
        this.mayCancel = mayCancel;
        return this;
    }

    /**
     * The fixed wage of the payment, regardless of hours worked.
     */
    public ContractorPayment withWage(String wage) {
        Utils.checkNotNull(wage, "wage");
        this.wage = Optional.ofNullable(wage);
        return this;
    }

    /**
     * The fixed wage of the payment, regardless of hours worked.
     */
    public ContractorPayment withWage(Optional<String> wage) {
        Utils.checkNotNull(wage, "wage");
        this.wage = wage;
        return this;
    }

    /**
     * The wage type for the payment.
     */
    public ContractorPayment withWageType(ContractorPaymentWageType wageType) {
        Utils.checkNotNull(wageType, "wageType");
        this.wageType = Optional.ofNullable(wageType);
        return this;
    }

    /**
     * The wage type for the payment.
     */
    public ContractorPayment withWageType(Optional<? extends ContractorPaymentWageType> wageType) {
        Utils.checkNotNull(wageType, "wageType");
        this.wageType = wageType;
        return this;
    }

    /**
     * (hours * hourly_rate) + wage + bonus
     */
    public ContractorPayment withWageTotal(String wageTotal) {
        Utils.checkNotNull(wageTotal, "wageTotal");
        this.wageTotal = Optional.ofNullable(wageTotal);
        return this;
    }

    /**
     * (hours * hourly_rate) + wage + bonus
     */
    public ContractorPayment withWageTotal(Optional<String> wageTotal) {
        Utils.checkNotNull(wageTotal, "wageTotal");
        this.wageTotal = wageTotal;
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
        ContractorPayment other = (ContractorPayment) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.contractorUuid, other.contractorUuid) &&
            Objects.deepEquals(this.bonus, other.bonus) &&
            Objects.deepEquals(this.date, other.date) &&
            Objects.deepEquals(this.hours, other.hours) &&
            Objects.deepEquals(this.paymentMethod, other.paymentMethod) &&
            Objects.deepEquals(this.reimbursement, other.reimbursement) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.hourlyRate, other.hourlyRate) &&
            Objects.deepEquals(this.mayCancel, other.mayCancel) &&
            Objects.deepEquals(this.wage, other.wage) &&
            Objects.deepEquals(this.wageType, other.wageType) &&
            Objects.deepEquals(this.wageTotal, other.wageTotal);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            contractorUuid,
            bonus,
            date,
            hours,
            paymentMethod,
            reimbursement,
            status,
            hourlyRate,
            mayCancel,
            wage,
            wageType,
            wageTotal);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ContractorPayment.class,
                "uuid", uuid,
                "contractorUuid", contractorUuid,
                "bonus", bonus,
                "date", date,
                "hours", hours,
                "paymentMethod", paymentMethod,
                "reimbursement", reimbursement,
                "status", status,
                "hourlyRate", hourlyRate,
                "mayCancel", mayCancel,
                "wage", wage,
                "wageType", wageType,
                "wageTotal", wageTotal);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<String> contractorUuid = Optional.empty();
 
        private Optional<String> bonus = Optional.empty();
 
        private Optional<String> date = Optional.empty();
 
        private Optional<String> hours = Optional.empty();
 
        private Optional<? extends ContractorPaymentPaymentMethod> paymentMethod = Optional.empty();
 
        private Optional<String> reimbursement = Optional.empty();
 
        private Optional<? extends ContractorPaymentStatus> status = Optional.empty();
 
        private Optional<String> hourlyRate = Optional.empty();
 
        private Optional<Boolean> mayCancel = Optional.empty();
 
        private Optional<String> wage = Optional.empty();
 
        private Optional<? extends ContractorPaymentWageType> wageType = Optional.empty();
 
        private Optional<String> wageTotal = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier of the contractor payment in Gusto.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The UUID of the contractor.
         */
        public Builder contractorUuid(String contractorUuid) {
            Utils.checkNotNull(contractorUuid, "contractorUuid");
            this.contractorUuid = Optional.ofNullable(contractorUuid);
            return this;
        }

        /**
         * The UUID of the contractor.
         */
        public Builder contractorUuid(Optional<String> contractorUuid) {
            Utils.checkNotNull(contractorUuid, "contractorUuid");
            this.contractorUuid = contractorUuid;
            return this;
        }

        /**
         * The bonus amount in the payment.
         */
        public Builder bonus(String bonus) {
            Utils.checkNotNull(bonus, "bonus");
            this.bonus = Optional.ofNullable(bonus);
            return this;
        }

        /**
         * The bonus amount in the payment.
         */
        public Builder bonus(Optional<String> bonus) {
            Utils.checkNotNull(bonus, "bonus");
            this.bonus = bonus;
            return this;
        }

        /**
         * The payment date.
         */
        public Builder date(String date) {
            Utils.checkNotNull(date, "date");
            this.date = Optional.ofNullable(date);
            return this;
        }

        /**
         * The payment date.
         */
        public Builder date(Optional<String> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        /**
         * The number of hours worked for the payment.
         */
        public Builder hours(String hours) {
            Utils.checkNotNull(hours, "hours");
            this.hours = Optional.ofNullable(hours);
            return this;
        }

        /**
         * The number of hours worked for the payment.
         */
        public Builder hours(Optional<String> hours) {
            Utils.checkNotNull(hours, "hours");
            this.hours = hours;
            return this;
        }

        /**
         * The payment method.
         */
        public Builder paymentMethod(ContractorPaymentPaymentMethod paymentMethod) {
            Utils.checkNotNull(paymentMethod, "paymentMethod");
            this.paymentMethod = Optional.ofNullable(paymentMethod);
            return this;
        }

        /**
         * The payment method.
         */
        public Builder paymentMethod(Optional<? extends ContractorPaymentPaymentMethod> paymentMethod) {
            Utils.checkNotNull(paymentMethod, "paymentMethod");
            this.paymentMethod = paymentMethod;
            return this;
        }

        /**
         * The reimbursement amount in the payment.
         */
        public Builder reimbursement(String reimbursement) {
            Utils.checkNotNull(reimbursement, "reimbursement");
            this.reimbursement = Optional.ofNullable(reimbursement);
            return this;
        }

        /**
         * The reimbursement amount in the payment.
         */
        public Builder reimbursement(Optional<String> reimbursement) {
            Utils.checkNotNull(reimbursement, "reimbursement");
            this.reimbursement = reimbursement;
            return this;
        }

        /**
         * Contractor payment status
         */
        public Builder status(ContractorPaymentStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Contractor payment status
         */
        public Builder status(Optional<? extends ContractorPaymentStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * The rate per hour worked for the payment.
         */
        public Builder hourlyRate(String hourlyRate) {
            Utils.checkNotNull(hourlyRate, "hourlyRate");
            this.hourlyRate = Optional.ofNullable(hourlyRate);
            return this;
        }

        /**
         * The rate per hour worked for the payment.
         */
        public Builder hourlyRate(Optional<String> hourlyRate) {
            Utils.checkNotNull(hourlyRate, "hourlyRate");
            this.hourlyRate = hourlyRate;
            return this;
        }

        /**
         * Determine if the contractor payment can be cancelled.
         */
        public Builder mayCancel(boolean mayCancel) {
            Utils.checkNotNull(mayCancel, "mayCancel");
            this.mayCancel = Optional.ofNullable(mayCancel);
            return this;
        }

        /**
         * Determine if the contractor payment can be cancelled.
         */
        public Builder mayCancel(Optional<Boolean> mayCancel) {
            Utils.checkNotNull(mayCancel, "mayCancel");
            this.mayCancel = mayCancel;
            return this;
        }

        /**
         * The fixed wage of the payment, regardless of hours worked.
         */
        public Builder wage(String wage) {
            Utils.checkNotNull(wage, "wage");
            this.wage = Optional.ofNullable(wage);
            return this;
        }

        /**
         * The fixed wage of the payment, regardless of hours worked.
         */
        public Builder wage(Optional<String> wage) {
            Utils.checkNotNull(wage, "wage");
            this.wage = wage;
            return this;
        }

        /**
         * The wage type for the payment.
         */
        public Builder wageType(ContractorPaymentWageType wageType) {
            Utils.checkNotNull(wageType, "wageType");
            this.wageType = Optional.ofNullable(wageType);
            return this;
        }

        /**
         * The wage type for the payment.
         */
        public Builder wageType(Optional<? extends ContractorPaymentWageType> wageType) {
            Utils.checkNotNull(wageType, "wageType");
            this.wageType = wageType;
            return this;
        }

        /**
         * (hours * hourly_rate) + wage + bonus
         */
        public Builder wageTotal(String wageTotal) {
            Utils.checkNotNull(wageTotal, "wageTotal");
            this.wageTotal = Optional.ofNullable(wageTotal);
            return this;
        }

        /**
         * (hours * hourly_rate) + wage + bonus
         */
        public Builder wageTotal(Optional<String> wageTotal) {
            Utils.checkNotNull(wageTotal, "wageTotal");
            this.wageTotal = wageTotal;
            return this;
        }
        
        public ContractorPayment build() {
            return new ContractorPayment(
                uuid,
                contractorUuid,
                bonus,
                date,
                hours,
                paymentMethod,
                reimbursement,
                status,
                hourlyRate,
                mayCancel,
                wage,
                wageType,
                wageTotal);
        }
    }
}

