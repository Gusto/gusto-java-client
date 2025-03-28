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
/**
 * EmployeePayStub
 * 
 * <p>The representation of an employee pay stub information.
 */

public class EmployeePayStub {

    /**
     * The UUID of the employee pay stub.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * The check date of the pay stub.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("check_date")
    private Optional<String> checkDate;

    /**
     * The gross pay amount for the pay stub.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("gross_pay")
    private Optional<String> grossPay;

    /**
     * The net pay amount for the pay stub.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("net_pay")
    private Optional<String> netPay;

    /**
     * A unique identifier of the payroll to which the pay stub belongs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payroll_uuid")
    private Optional<String> payrollUuid;

    /**
     * The check amount for the pay stub.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("check_amount")
    private Optional<String> checkAmount;

    @JsonCreator
    public EmployeePayStub(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("check_date") Optional<String> checkDate,
            @JsonProperty("gross_pay") Optional<String> grossPay,
            @JsonProperty("net_pay") Optional<String> netPay,
            @JsonProperty("payroll_uuid") Optional<String> payrollUuid,
            @JsonProperty("check_amount") Optional<String> checkAmount) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(checkDate, "checkDate");
        Utils.checkNotNull(grossPay, "grossPay");
        Utils.checkNotNull(netPay, "netPay");
        Utils.checkNotNull(payrollUuid, "payrollUuid");
        Utils.checkNotNull(checkAmount, "checkAmount");
        this.uuid = uuid;
        this.checkDate = checkDate;
        this.grossPay = grossPay;
        this.netPay = netPay;
        this.payrollUuid = payrollUuid;
        this.checkAmount = checkAmount;
    }
    
    public EmployeePayStub(
            String uuid) {
        this(uuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the employee pay stub.
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * The check date of the pay stub.
     */
    @JsonIgnore
    public Optional<String> checkDate() {
        return checkDate;
    }

    /**
     * The gross pay amount for the pay stub.
     */
    @JsonIgnore
    public Optional<String> grossPay() {
        return grossPay;
    }

    /**
     * The net pay amount for the pay stub.
     */
    @JsonIgnore
    public Optional<String> netPay() {
        return netPay;
    }

    /**
     * A unique identifier of the payroll to which the pay stub belongs.
     */
    @JsonIgnore
    public Optional<String> payrollUuid() {
        return payrollUuid;
    }

    /**
     * The check amount for the pay stub.
     */
    @JsonIgnore
    public Optional<String> checkAmount() {
        return checkAmount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the employee pay stub.
     */
    public EmployeePayStub withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The check date of the pay stub.
     */
    public EmployeePayStub withCheckDate(String checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = Optional.ofNullable(checkDate);
        return this;
    }

    /**
     * The check date of the pay stub.
     */
    public EmployeePayStub withCheckDate(Optional<String> checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = checkDate;
        return this;
    }

    /**
     * The gross pay amount for the pay stub.
     */
    public EmployeePayStub withGrossPay(String grossPay) {
        Utils.checkNotNull(grossPay, "grossPay");
        this.grossPay = Optional.ofNullable(grossPay);
        return this;
    }

    /**
     * The gross pay amount for the pay stub.
     */
    public EmployeePayStub withGrossPay(Optional<String> grossPay) {
        Utils.checkNotNull(grossPay, "grossPay");
        this.grossPay = grossPay;
        return this;
    }

    /**
     * The net pay amount for the pay stub.
     */
    public EmployeePayStub withNetPay(String netPay) {
        Utils.checkNotNull(netPay, "netPay");
        this.netPay = Optional.ofNullable(netPay);
        return this;
    }

    /**
     * The net pay amount for the pay stub.
     */
    public EmployeePayStub withNetPay(Optional<String> netPay) {
        Utils.checkNotNull(netPay, "netPay");
        this.netPay = netPay;
        return this;
    }

    /**
     * A unique identifier of the payroll to which the pay stub belongs.
     */
    public EmployeePayStub withPayrollUuid(String payrollUuid) {
        Utils.checkNotNull(payrollUuid, "payrollUuid");
        this.payrollUuid = Optional.ofNullable(payrollUuid);
        return this;
    }

    /**
     * A unique identifier of the payroll to which the pay stub belongs.
     */
    public EmployeePayStub withPayrollUuid(Optional<String> payrollUuid) {
        Utils.checkNotNull(payrollUuid, "payrollUuid");
        this.payrollUuid = payrollUuid;
        return this;
    }

    /**
     * The check amount for the pay stub.
     */
    public EmployeePayStub withCheckAmount(String checkAmount) {
        Utils.checkNotNull(checkAmount, "checkAmount");
        this.checkAmount = Optional.ofNullable(checkAmount);
        return this;
    }

    /**
     * The check amount for the pay stub.
     */
    public EmployeePayStub withCheckAmount(Optional<String> checkAmount) {
        Utils.checkNotNull(checkAmount, "checkAmount");
        this.checkAmount = checkAmount;
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
        EmployeePayStub other = (EmployeePayStub) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.checkDate, other.checkDate) &&
            Objects.deepEquals(this.grossPay, other.grossPay) &&
            Objects.deepEquals(this.netPay, other.netPay) &&
            Objects.deepEquals(this.payrollUuid, other.payrollUuid) &&
            Objects.deepEquals(this.checkAmount, other.checkAmount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            checkDate,
            grossPay,
            netPay,
            payrollUuid,
            checkAmount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmployeePayStub.class,
                "uuid", uuid,
                "checkDate", checkDate,
                "grossPay", grossPay,
                "netPay", netPay,
                "payrollUuid", payrollUuid,
                "checkAmount", checkAmount);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<String> checkDate = Optional.empty();
 
        private Optional<String> grossPay = Optional.empty();
 
        private Optional<String> netPay = Optional.empty();
 
        private Optional<String> payrollUuid = Optional.empty();
 
        private Optional<String> checkAmount = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the employee pay stub.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The check date of the pay stub.
         */
        public Builder checkDate(String checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = Optional.ofNullable(checkDate);
            return this;
        }

        /**
         * The check date of the pay stub.
         */
        public Builder checkDate(Optional<String> checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = checkDate;
            return this;
        }

        /**
         * The gross pay amount for the pay stub.
         */
        public Builder grossPay(String grossPay) {
            Utils.checkNotNull(grossPay, "grossPay");
            this.grossPay = Optional.ofNullable(grossPay);
            return this;
        }

        /**
         * The gross pay amount for the pay stub.
         */
        public Builder grossPay(Optional<String> grossPay) {
            Utils.checkNotNull(grossPay, "grossPay");
            this.grossPay = grossPay;
            return this;
        }

        /**
         * The net pay amount for the pay stub.
         */
        public Builder netPay(String netPay) {
            Utils.checkNotNull(netPay, "netPay");
            this.netPay = Optional.ofNullable(netPay);
            return this;
        }

        /**
         * The net pay amount for the pay stub.
         */
        public Builder netPay(Optional<String> netPay) {
            Utils.checkNotNull(netPay, "netPay");
            this.netPay = netPay;
            return this;
        }

        /**
         * A unique identifier of the payroll to which the pay stub belongs.
         */
        public Builder payrollUuid(String payrollUuid) {
            Utils.checkNotNull(payrollUuid, "payrollUuid");
            this.payrollUuid = Optional.ofNullable(payrollUuid);
            return this;
        }

        /**
         * A unique identifier of the payroll to which the pay stub belongs.
         */
        public Builder payrollUuid(Optional<String> payrollUuid) {
            Utils.checkNotNull(payrollUuid, "payrollUuid");
            this.payrollUuid = payrollUuid;
            return this;
        }

        /**
         * The check amount for the pay stub.
         */
        public Builder checkAmount(String checkAmount) {
            Utils.checkNotNull(checkAmount, "checkAmount");
            this.checkAmount = Optional.ofNullable(checkAmount);
            return this;
        }

        /**
         * The check amount for the pay stub.
         */
        public Builder checkAmount(Optional<String> checkAmount) {
            Utils.checkNotNull(checkAmount, "checkAmount");
            this.checkAmount = checkAmount;
            return this;
        }
        
        public EmployeePayStub build() {
            return new EmployeePayStub(
                uuid,
                checkDate,
                grossPay,
                netPay,
                payrollUuid,
                checkAmount);
        }
    }
}

