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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
/**
 * PayrollCheck - Example response
 */

public class PayrollCheck {

    /**
     * A unique identifier of the payroll.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payroll_uuid")
    private Optional<String> payrollUuid;

    /**
     * The format the checks will be printed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("printing_format")
    private Optional<String> printingFormat;

    /**
     * The starting check number for the checks being printed.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("starting_check_number")
    private Optional<String> startingCheckNumber;

    /**
     * A unique identifier of the Generated Document request
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("request_uuid")
    private Optional<String> requestUuid;

    /**
     * Current status of the Generated Document
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<String> status;

    /**
     * An array of mapping employee uuids to their check numbers
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_check_number_mapping")
    private Optional<? extends List<EmployeeCheckNumberMapping>> employeeCheckNumberMapping;

    @JsonCreator
    public PayrollCheck(
            @JsonProperty("payroll_uuid") Optional<String> payrollUuid,
            @JsonProperty("printing_format") Optional<String> printingFormat,
            @JsonProperty("starting_check_number") Optional<String> startingCheckNumber,
            @JsonProperty("request_uuid") Optional<String> requestUuid,
            @JsonProperty("status") Optional<String> status,
            @JsonProperty("employee_check_number_mapping") Optional<? extends List<EmployeeCheckNumberMapping>> employeeCheckNumberMapping) {
        Utils.checkNotNull(payrollUuid, "payrollUuid");
        Utils.checkNotNull(printingFormat, "printingFormat");
        Utils.checkNotNull(startingCheckNumber, "startingCheckNumber");
        Utils.checkNotNull(requestUuid, "requestUuid");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(employeeCheckNumberMapping, "employeeCheckNumberMapping");
        this.payrollUuid = payrollUuid;
        this.printingFormat = printingFormat;
        this.startingCheckNumber = startingCheckNumber;
        this.requestUuid = requestUuid;
        this.status = status;
        this.employeeCheckNumberMapping = employeeCheckNumberMapping;
    }
    
    public PayrollCheck() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * A unique identifier of the payroll.
     */
    @JsonIgnore
    public Optional<String> payrollUuid() {
        return payrollUuid;
    }

    /**
     * The format the checks will be printed.
     */
    @JsonIgnore
    public Optional<String> printingFormat() {
        return printingFormat;
    }

    /**
     * The starting check number for the checks being printed.
     */
    @JsonIgnore
    public Optional<String> startingCheckNumber() {
        return startingCheckNumber;
    }

    /**
     * A unique identifier of the Generated Document request
     */
    @JsonIgnore
    public Optional<String> requestUuid() {
        return requestUuid;
    }

    /**
     * Current status of the Generated Document
     */
    @JsonIgnore
    public Optional<String> status() {
        return status;
    }

    /**
     * An array of mapping employee uuids to their check numbers
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<EmployeeCheckNumberMapping>> employeeCheckNumberMapping() {
        return (Optional<List<EmployeeCheckNumberMapping>>) employeeCheckNumberMapping;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * A unique identifier of the payroll.
     */
    public PayrollCheck withPayrollUuid(String payrollUuid) {
        Utils.checkNotNull(payrollUuid, "payrollUuid");
        this.payrollUuid = Optional.ofNullable(payrollUuid);
        return this;
    }

    /**
     * A unique identifier of the payroll.
     */
    public PayrollCheck withPayrollUuid(Optional<String> payrollUuid) {
        Utils.checkNotNull(payrollUuid, "payrollUuid");
        this.payrollUuid = payrollUuid;
        return this;
    }

    /**
     * The format the checks will be printed.
     */
    public PayrollCheck withPrintingFormat(String printingFormat) {
        Utils.checkNotNull(printingFormat, "printingFormat");
        this.printingFormat = Optional.ofNullable(printingFormat);
        return this;
    }

    /**
     * The format the checks will be printed.
     */
    public PayrollCheck withPrintingFormat(Optional<String> printingFormat) {
        Utils.checkNotNull(printingFormat, "printingFormat");
        this.printingFormat = printingFormat;
        return this;
    }

    /**
     * The starting check number for the checks being printed.
     */
    public PayrollCheck withStartingCheckNumber(String startingCheckNumber) {
        Utils.checkNotNull(startingCheckNumber, "startingCheckNumber");
        this.startingCheckNumber = Optional.ofNullable(startingCheckNumber);
        return this;
    }

    /**
     * The starting check number for the checks being printed.
     */
    public PayrollCheck withStartingCheckNumber(Optional<String> startingCheckNumber) {
        Utils.checkNotNull(startingCheckNumber, "startingCheckNumber");
        this.startingCheckNumber = startingCheckNumber;
        return this;
    }

    /**
     * A unique identifier of the Generated Document request
     */
    public PayrollCheck withRequestUuid(String requestUuid) {
        Utils.checkNotNull(requestUuid, "requestUuid");
        this.requestUuid = Optional.ofNullable(requestUuid);
        return this;
    }

    /**
     * A unique identifier of the Generated Document request
     */
    public PayrollCheck withRequestUuid(Optional<String> requestUuid) {
        Utils.checkNotNull(requestUuid, "requestUuid");
        this.requestUuid = requestUuid;
        return this;
    }

    /**
     * Current status of the Generated Document
     */
    public PayrollCheck withStatus(String status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Current status of the Generated Document
     */
    public PayrollCheck withStatus(Optional<String> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * An array of mapping employee uuids to their check numbers
     */
    public PayrollCheck withEmployeeCheckNumberMapping(List<EmployeeCheckNumberMapping> employeeCheckNumberMapping) {
        Utils.checkNotNull(employeeCheckNumberMapping, "employeeCheckNumberMapping");
        this.employeeCheckNumberMapping = Optional.ofNullable(employeeCheckNumberMapping);
        return this;
    }

    /**
     * An array of mapping employee uuids to their check numbers
     */
    public PayrollCheck withEmployeeCheckNumberMapping(Optional<? extends List<EmployeeCheckNumberMapping>> employeeCheckNumberMapping) {
        Utils.checkNotNull(employeeCheckNumberMapping, "employeeCheckNumberMapping");
        this.employeeCheckNumberMapping = employeeCheckNumberMapping;
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
        PayrollCheck other = (PayrollCheck) o;
        return 
            Objects.deepEquals(this.payrollUuid, other.payrollUuid) &&
            Objects.deepEquals(this.printingFormat, other.printingFormat) &&
            Objects.deepEquals(this.startingCheckNumber, other.startingCheckNumber) &&
            Objects.deepEquals(this.requestUuid, other.requestUuid) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.employeeCheckNumberMapping, other.employeeCheckNumberMapping);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            payrollUuid,
            printingFormat,
            startingCheckNumber,
            requestUuid,
            status,
            employeeCheckNumberMapping);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PayrollCheck.class,
                "payrollUuid", payrollUuid,
                "printingFormat", printingFormat,
                "startingCheckNumber", startingCheckNumber,
                "requestUuid", requestUuid,
                "status", status,
                "employeeCheckNumberMapping", employeeCheckNumberMapping);
    }
    
    public final static class Builder {
 
        private Optional<String> payrollUuid = Optional.empty();
 
        private Optional<String> printingFormat = Optional.empty();
 
        private Optional<String> startingCheckNumber = Optional.empty();
 
        private Optional<String> requestUuid = Optional.empty();
 
        private Optional<String> status = Optional.empty();
 
        private Optional<? extends List<EmployeeCheckNumberMapping>> employeeCheckNumberMapping = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * A unique identifier of the payroll.
         */
        public Builder payrollUuid(String payrollUuid) {
            Utils.checkNotNull(payrollUuid, "payrollUuid");
            this.payrollUuid = Optional.ofNullable(payrollUuid);
            return this;
        }

        /**
         * A unique identifier of the payroll.
         */
        public Builder payrollUuid(Optional<String> payrollUuid) {
            Utils.checkNotNull(payrollUuid, "payrollUuid");
            this.payrollUuid = payrollUuid;
            return this;
        }

        /**
         * The format the checks will be printed.
         */
        public Builder printingFormat(String printingFormat) {
            Utils.checkNotNull(printingFormat, "printingFormat");
            this.printingFormat = Optional.ofNullable(printingFormat);
            return this;
        }

        /**
         * The format the checks will be printed.
         */
        public Builder printingFormat(Optional<String> printingFormat) {
            Utils.checkNotNull(printingFormat, "printingFormat");
            this.printingFormat = printingFormat;
            return this;
        }

        /**
         * The starting check number for the checks being printed.
         */
        public Builder startingCheckNumber(String startingCheckNumber) {
            Utils.checkNotNull(startingCheckNumber, "startingCheckNumber");
            this.startingCheckNumber = Optional.ofNullable(startingCheckNumber);
            return this;
        }

        /**
         * The starting check number for the checks being printed.
         */
        public Builder startingCheckNumber(Optional<String> startingCheckNumber) {
            Utils.checkNotNull(startingCheckNumber, "startingCheckNumber");
            this.startingCheckNumber = startingCheckNumber;
            return this;
        }

        /**
         * A unique identifier of the Generated Document request
         */
        public Builder requestUuid(String requestUuid) {
            Utils.checkNotNull(requestUuid, "requestUuid");
            this.requestUuid = Optional.ofNullable(requestUuid);
            return this;
        }

        /**
         * A unique identifier of the Generated Document request
         */
        public Builder requestUuid(Optional<String> requestUuid) {
            Utils.checkNotNull(requestUuid, "requestUuid");
            this.requestUuid = requestUuid;
            return this;
        }

        /**
         * Current status of the Generated Document
         */
        public Builder status(String status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * Current status of the Generated Document
         */
        public Builder status(Optional<String> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * An array of mapping employee uuids to their check numbers
         */
        public Builder employeeCheckNumberMapping(List<EmployeeCheckNumberMapping> employeeCheckNumberMapping) {
            Utils.checkNotNull(employeeCheckNumberMapping, "employeeCheckNumberMapping");
            this.employeeCheckNumberMapping = Optional.ofNullable(employeeCheckNumberMapping);
            return this;
        }

        /**
         * An array of mapping employee uuids to their check numbers
         */
        public Builder employeeCheckNumberMapping(Optional<? extends List<EmployeeCheckNumberMapping>> employeeCheckNumberMapping) {
            Utils.checkNotNull(employeeCheckNumberMapping, "employeeCheckNumberMapping");
            this.employeeCheckNumberMapping = employeeCheckNumberMapping;
            return this;
        }
        
        public PayrollCheck build() {
            return new PayrollCheck(
                payrollUuid,
                printingFormat,
                startingCheckNumber,
                requestUuid,
                status,
                employeeCheckNumberMapping);
        }
    }
}

