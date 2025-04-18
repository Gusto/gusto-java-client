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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class PutV1CompaniesCompanyIdBankAccountsVerifyRequest {

    /**
     * The UUID of the bank account
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=bank_account_uuid")
    private String bankAccountUuid;

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_id")
    private String companyId;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody requestBody;

    @JsonCreator
    public PutV1CompaniesCompanyIdBankAccountsVerifyRequest(
            String bankAccountUuid,
            String companyId,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody requestBody) {
        Utils.checkNotNull(bankAccountUuid, "bankAccountUuid");
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(requestBody, "requestBody");
        this.bankAccountUuid = bankAccountUuid;
        this.companyId = companyId;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.requestBody = requestBody;
    }
    
    public PutV1CompaniesCompanyIdBankAccountsVerifyRequest(
            String bankAccountUuid,
            String companyId,
            PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody requestBody) {
        this(bankAccountUuid, companyId, Optional.empty(), requestBody);
    }

    /**
     * The UUID of the bank account
     */
    @JsonIgnore
    public String bankAccountUuid() {
        return bankAccountUuid;
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
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
    public PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the bank account
     */
    public PutV1CompaniesCompanyIdBankAccountsVerifyRequest withBankAccountUuid(String bankAccountUuid) {
        Utils.checkNotNull(bankAccountUuid, "bankAccountUuid");
        this.bankAccountUuid = bankAccountUuid;
        return this;
    }

    /**
     * The UUID of the company
     */
    public PutV1CompaniesCompanyIdBankAccountsVerifyRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1CompaniesCompanyIdBankAccountsVerifyRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1CompaniesCompanyIdBankAccountsVerifyRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1CompaniesCompanyIdBankAccountsVerifyRequest withRequestBody(PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody requestBody) {
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
        PutV1CompaniesCompanyIdBankAccountsVerifyRequest other = (PutV1CompaniesCompanyIdBankAccountsVerifyRequest) o;
        return 
            Objects.deepEquals(this.bankAccountUuid, other.bankAccountUuid) &&
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bankAccountUuid,
            companyId,
            xGustoAPIVersion,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1CompaniesCompanyIdBankAccountsVerifyRequest.class,
                "bankAccountUuid", bankAccountUuid,
                "companyId", companyId,
                "xGustoAPIVersion", xGustoAPIVersion,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String bankAccountUuid;
 
        private String companyId;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;
 
        private PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
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
         * The UUID of the company
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
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

        public Builder requestBody(PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public PutV1CompaniesCompanyIdBankAccountsVerifyRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new PutV1CompaniesCompanyIdBankAccountsVerifyRequest(
                bankAccountUuid,
                companyId,
                xGustoAPIVersion,
                requestBody);
        }

        private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
                new LazySingletonValue<>(
                        "X-Gusto-API-Version",
                        "\"2024-04-01\"",
                        new TypeReference<Optional<? extends VersionHeader>>() {});
    }
}

