/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class PutV1EmployeesEmployeeIdBankAccountsRequest {

    /**
     * The UUID of the employee
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=employee_id")
    private String employeeId;

    /**
     * The UUID of the bank account
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bank_account_uuid")
    private String bankAccountUuid;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PutV1EmployeesEmployeeIdBankAccountsRequestBody requestBody;

    @JsonCreator
    public PutV1EmployeesEmployeeIdBankAccountsRequest(
            String employeeId,
            String bankAccountUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutV1EmployeesEmployeeIdBankAccountsRequestBody requestBody) {
        Utils.checkNotNull(employeeId, "employeeId");
        Utils.checkNotNull(bankAccountUuid, "bankAccountUuid");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(requestBody, "requestBody");
        this.employeeId = employeeId;
        this.bankAccountUuid = bankAccountUuid;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.requestBody = requestBody;
    }
    
    public PutV1EmployeesEmployeeIdBankAccountsRequest(
            String employeeId,
            String bankAccountUuid,
            PutV1EmployeesEmployeeIdBankAccountsRequestBody requestBody) {
        this(employeeId, bankAccountUuid, Optional.empty(), requestBody);
    }

    /**
     * The UUID of the employee
     */
    @JsonIgnore
    public String employeeId() {
        return employeeId;
    }

    /**
     * The UUID of the bank account
     */
    @JsonIgnore
    public String bankAccountUuid() {
        return bankAccountUuid;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VersionHeader> xGustoAPIVersion() {
        return (Optional<VersionHeader>) xGustoAPIVersion;
    }

    @JsonIgnore
    public PutV1EmployeesEmployeeIdBankAccountsRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the employee
     */
    public PutV1EmployeesEmployeeIdBankAccountsRequest withEmployeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }

    /**
     * The UUID of the bank account
     */
    public PutV1EmployeesEmployeeIdBankAccountsRequest withBankAccountUuid(String bankAccountUuid) {
        Utils.checkNotNull(bankAccountUuid, "bankAccountUuid");
        this.bankAccountUuid = bankAccountUuid;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1EmployeesEmployeeIdBankAccountsRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1EmployeesEmployeeIdBankAccountsRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1EmployeesEmployeeIdBankAccountsRequest withRequestBody(PutV1EmployeesEmployeeIdBankAccountsRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        PutV1EmployeesEmployeeIdBankAccountsRequest other = (PutV1EmployeesEmployeeIdBankAccountsRequest) o;
        return 
            Objects.deepEquals(this.employeeId, other.employeeId) &&
            Objects.deepEquals(this.bankAccountUuid, other.bankAccountUuid) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employeeId,
            bankAccountUuid,
            xGustoAPIVersion,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1EmployeesEmployeeIdBankAccountsRequest.class,
                "employeeId", employeeId,
                "bankAccountUuid", bankAccountUuid,
                "xGustoAPIVersion", xGustoAPIVersion,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String employeeId;
 
        private String bankAccountUuid;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
 
        private PutV1EmployeesEmployeeIdBankAccountsRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the employee
         */
        public Builder employeeId(String employeeId) {
            Utils.checkNotNull(employeeId, "employeeId");
            this.employeeId = employeeId;
            return this;
        }

        /**
         * The UUID of the bank account
         */
        public Builder bankAccountUuid(String bankAccountUuid) {
            Utils.checkNotNull(bankAccountUuid, "bankAccountUuid");
            this.bankAccountUuid = bankAccountUuid;
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

        public Builder requestBody(PutV1EmployeesEmployeeIdBankAccountsRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public PutV1EmployeesEmployeeIdBankAccountsRequest build() {
            return new PutV1EmployeesEmployeeIdBankAccountsRequest(
                employeeId,
                bankAccountUuid,
                xGustoAPIVersion,
                requestBody);
        }
    }
}

