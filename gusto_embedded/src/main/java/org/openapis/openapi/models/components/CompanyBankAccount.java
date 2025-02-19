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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CompanyBankAccount - The company bank account
 */

public class CompanyBankAccount {

    /**
     * UUID of the bank account
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * UUID of the company
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_uuid")
    private Optional<String> companyUuid;

    /**
     * Bank account type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_type")
    private Optional<? extends AccountType> accountType;

    /**
     * The bank account's routing number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("routing_number")
    private Optional<String> routingNumber;

    /**
     * Masked bank account number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden_account_number")
    private Optional<String> hiddenAccountNumber;

    /**
     * The verification status of the bank account.
     * 
     * 'awaiting_deposits' means the bank account is just created and money is being transferred.
     * 'ready_for_verification' means the micro-deposits are completed and the verification process can begin by using the verify endpoint.
     * 'verified' means the bank account is verified.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verification_status")
    private Optional<? extends VerificationStatus> verificationStatus;

    /**
     * The verification type of the bank account.
     * 
     * 'bank_deposits' means the bank account is connected by entering routing and accounting numbers and verifying through micro-deposits.
     * 'plaid' means the bank account is connected through Plaid.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("verification_type")
    private Optional<? extends VerificationType> verificationType;

    /**
     * The Plaid connection status of the bank account. Only applies when verification type is Plaid.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("plaid_status")
    private JsonNullable<? extends PlaidStatus> plaidStatus;

    /**
     * The last fetch balance for the bank account. Please be aware that this amount does not reflect the most up-to-date balance and only applies when the verification type is Plaid.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_cached_balance")
    private JsonNullable<String> lastCachedBalance;

    /**
     * The balance fetch date associated with the last_cached_balance. Only applies when verification type is Plaid.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("balance_fetched_date")
    private JsonNullable<String> balanceFetchedDate;

    /**
     * Name of bank account
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonCreator
    public CompanyBankAccount(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("company_uuid") Optional<String> companyUuid,
            @JsonProperty("account_type") Optional<? extends AccountType> accountType,
            @JsonProperty("routing_number") Optional<String> routingNumber,
            @JsonProperty("hidden_account_number") Optional<String> hiddenAccountNumber,
            @JsonProperty("verification_status") Optional<? extends VerificationStatus> verificationStatus,
            @JsonProperty("verification_type") Optional<? extends VerificationType> verificationType,
            @JsonProperty("plaid_status") JsonNullable<? extends PlaidStatus> plaidStatus,
            @JsonProperty("last_cached_balance") JsonNullable<String> lastCachedBalance,
            @JsonProperty("balance_fetched_date") JsonNullable<String> balanceFetchedDate,
            @JsonProperty("name") Optional<String> name) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(accountType, "accountType");
        Utils.checkNotNull(routingNumber, "routingNumber");
        Utils.checkNotNull(hiddenAccountNumber, "hiddenAccountNumber");
        Utils.checkNotNull(verificationStatus, "verificationStatus");
        Utils.checkNotNull(verificationType, "verificationType");
        Utils.checkNotNull(plaidStatus, "plaidStatus");
        Utils.checkNotNull(lastCachedBalance, "lastCachedBalance");
        Utils.checkNotNull(balanceFetchedDate, "balanceFetchedDate");
        Utils.checkNotNull(name, "name");
        this.uuid = uuid;
        this.companyUuid = companyUuid;
        this.accountType = accountType;
        this.routingNumber = routingNumber;
        this.hiddenAccountNumber = hiddenAccountNumber;
        this.verificationStatus = verificationStatus;
        this.verificationType = verificationType;
        this.plaidStatus = plaidStatus;
        this.lastCachedBalance = lastCachedBalance;
        this.balanceFetchedDate = balanceFetchedDate;
        this.name = name;
    }
    
    public CompanyBankAccount(
            String uuid) {
        this(uuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * UUID of the bank account
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * UUID of the company
     */
    @JsonIgnore
    public Optional<String> companyUuid() {
        return companyUuid;
    }

    /**
     * Bank account type
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountType> accountType() {
        return (Optional<AccountType>) accountType;
    }

    /**
     * The bank account's routing number
     */
    @JsonIgnore
    public Optional<String> routingNumber() {
        return routingNumber;
    }

    /**
     * Masked bank account number
     */
    @JsonIgnore
    public Optional<String> hiddenAccountNumber() {
        return hiddenAccountNumber;
    }

    /**
     * The verification status of the bank account.
     * 
     * 'awaiting_deposits' means the bank account is just created and money is being transferred.
     * 'ready_for_verification' means the micro-deposits are completed and the verification process can begin by using the verify endpoint.
     * 'verified' means the bank account is verified.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VerificationStatus> verificationStatus() {
        return (Optional<VerificationStatus>) verificationStatus;
    }

    /**
     * The verification type of the bank account.
     * 
     * 'bank_deposits' means the bank account is connected by entering routing and accounting numbers and verifying through micro-deposits.
     * 'plaid' means the bank account is connected through Plaid.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VerificationType> verificationType() {
        return (Optional<VerificationType>) verificationType;
    }

    /**
     * The Plaid connection status of the bank account. Only applies when verification type is Plaid.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public JsonNullable<PlaidStatus> plaidStatus() {
        return (JsonNullable<PlaidStatus>) plaidStatus;
    }

    /**
     * The last fetch balance for the bank account. Please be aware that this amount does not reflect the most up-to-date balance and only applies when the verification type is Plaid.
     */
    @JsonIgnore
    public JsonNullable<String> lastCachedBalance() {
        return lastCachedBalance;
    }

    /**
     * The balance fetch date associated with the last_cached_balance. Only applies when verification type is Plaid.
     */
    @JsonIgnore
    public JsonNullable<String> balanceFetchedDate() {
        return balanceFetchedDate;
    }

    /**
     * Name of bank account
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * UUID of the bank account
     */
    public CompanyBankAccount withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * UUID of the company
     */
    public CompanyBankAccount withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = Optional.ofNullable(companyUuid);
        return this;
    }

    /**
     * UUID of the company
     */
    public CompanyBankAccount withCompanyUuid(Optional<String> companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * Bank account type
     */
    public CompanyBankAccount withAccountType(AccountType accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = Optional.ofNullable(accountType);
        return this;
    }

    /**
     * Bank account type
     */
    public CompanyBankAccount withAccountType(Optional<? extends AccountType> accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = accountType;
        return this;
    }

    /**
     * The bank account's routing number
     */
    public CompanyBankAccount withRoutingNumber(String routingNumber) {
        Utils.checkNotNull(routingNumber, "routingNumber");
        this.routingNumber = Optional.ofNullable(routingNumber);
        return this;
    }

    /**
     * The bank account's routing number
     */
    public CompanyBankAccount withRoutingNumber(Optional<String> routingNumber) {
        Utils.checkNotNull(routingNumber, "routingNumber");
        this.routingNumber = routingNumber;
        return this;
    }

    /**
     * Masked bank account number
     */
    public CompanyBankAccount withHiddenAccountNumber(String hiddenAccountNumber) {
        Utils.checkNotNull(hiddenAccountNumber, "hiddenAccountNumber");
        this.hiddenAccountNumber = Optional.ofNullable(hiddenAccountNumber);
        return this;
    }

    /**
     * Masked bank account number
     */
    public CompanyBankAccount withHiddenAccountNumber(Optional<String> hiddenAccountNumber) {
        Utils.checkNotNull(hiddenAccountNumber, "hiddenAccountNumber");
        this.hiddenAccountNumber = hiddenAccountNumber;
        return this;
    }

    /**
     * The verification status of the bank account.
     * 
     * 'awaiting_deposits' means the bank account is just created and money is being transferred.
     * 'ready_for_verification' means the micro-deposits are completed and the verification process can begin by using the verify endpoint.
     * 'verified' means the bank account is verified.
     */
    public CompanyBankAccount withVerificationStatus(VerificationStatus verificationStatus) {
        Utils.checkNotNull(verificationStatus, "verificationStatus");
        this.verificationStatus = Optional.ofNullable(verificationStatus);
        return this;
    }

    /**
     * The verification status of the bank account.
     * 
     * 'awaiting_deposits' means the bank account is just created and money is being transferred.
     * 'ready_for_verification' means the micro-deposits are completed and the verification process can begin by using the verify endpoint.
     * 'verified' means the bank account is verified.
     */
    public CompanyBankAccount withVerificationStatus(Optional<? extends VerificationStatus> verificationStatus) {
        Utils.checkNotNull(verificationStatus, "verificationStatus");
        this.verificationStatus = verificationStatus;
        return this;
    }

    /**
     * The verification type of the bank account.
     * 
     * 'bank_deposits' means the bank account is connected by entering routing and accounting numbers and verifying through micro-deposits.
     * 'plaid' means the bank account is connected through Plaid.
     */
    public CompanyBankAccount withVerificationType(VerificationType verificationType) {
        Utils.checkNotNull(verificationType, "verificationType");
        this.verificationType = Optional.ofNullable(verificationType);
        return this;
    }

    /**
     * The verification type of the bank account.
     * 
     * 'bank_deposits' means the bank account is connected by entering routing and accounting numbers and verifying through micro-deposits.
     * 'plaid' means the bank account is connected through Plaid.
     */
    public CompanyBankAccount withVerificationType(Optional<? extends VerificationType> verificationType) {
        Utils.checkNotNull(verificationType, "verificationType");
        this.verificationType = verificationType;
        return this;
    }

    /**
     * The Plaid connection status of the bank account. Only applies when verification type is Plaid.
     */
    public CompanyBankAccount withPlaidStatus(PlaidStatus plaidStatus) {
        Utils.checkNotNull(plaidStatus, "plaidStatus");
        this.plaidStatus = JsonNullable.of(plaidStatus);
        return this;
    }

    /**
     * The Plaid connection status of the bank account. Only applies when verification type is Plaid.
     */
    public CompanyBankAccount withPlaidStatus(JsonNullable<? extends PlaidStatus> plaidStatus) {
        Utils.checkNotNull(plaidStatus, "plaidStatus");
        this.plaidStatus = plaidStatus;
        return this;
    }

    /**
     * The last fetch balance for the bank account. Please be aware that this amount does not reflect the most up-to-date balance and only applies when the verification type is Plaid.
     */
    public CompanyBankAccount withLastCachedBalance(String lastCachedBalance) {
        Utils.checkNotNull(lastCachedBalance, "lastCachedBalance");
        this.lastCachedBalance = JsonNullable.of(lastCachedBalance);
        return this;
    }

    /**
     * The last fetch balance for the bank account. Please be aware that this amount does not reflect the most up-to-date balance and only applies when the verification type is Plaid.
     */
    public CompanyBankAccount withLastCachedBalance(JsonNullable<String> lastCachedBalance) {
        Utils.checkNotNull(lastCachedBalance, "lastCachedBalance");
        this.lastCachedBalance = lastCachedBalance;
        return this;
    }

    /**
     * The balance fetch date associated with the last_cached_balance. Only applies when verification type is Plaid.
     */
    public CompanyBankAccount withBalanceFetchedDate(String balanceFetchedDate) {
        Utils.checkNotNull(balanceFetchedDate, "balanceFetchedDate");
        this.balanceFetchedDate = JsonNullable.of(balanceFetchedDate);
        return this;
    }

    /**
     * The balance fetch date associated with the last_cached_balance. Only applies when verification type is Plaid.
     */
    public CompanyBankAccount withBalanceFetchedDate(JsonNullable<String> balanceFetchedDate) {
        Utils.checkNotNull(balanceFetchedDate, "balanceFetchedDate");
        this.balanceFetchedDate = balanceFetchedDate;
        return this;
    }

    /**
     * Name of bank account
     */
    public CompanyBankAccount withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of bank account
     */
    public CompanyBankAccount withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        CompanyBankAccount other = (CompanyBankAccount) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.accountType, other.accountType) &&
            Objects.deepEquals(this.routingNumber, other.routingNumber) &&
            Objects.deepEquals(this.hiddenAccountNumber, other.hiddenAccountNumber) &&
            Objects.deepEquals(this.verificationStatus, other.verificationStatus) &&
            Objects.deepEquals(this.verificationType, other.verificationType) &&
            Objects.deepEquals(this.plaidStatus, other.plaidStatus) &&
            Objects.deepEquals(this.lastCachedBalance, other.lastCachedBalance) &&
            Objects.deepEquals(this.balanceFetchedDate, other.balanceFetchedDate) &&
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            companyUuid,
            accountType,
            routingNumber,
            hiddenAccountNumber,
            verificationStatus,
            verificationType,
            plaidStatus,
            lastCachedBalance,
            balanceFetchedDate,
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyBankAccount.class,
                "uuid", uuid,
                "companyUuid", companyUuid,
                "accountType", accountType,
                "routingNumber", routingNumber,
                "hiddenAccountNumber", hiddenAccountNumber,
                "verificationStatus", verificationStatus,
                "verificationType", verificationType,
                "plaidStatus", plaidStatus,
                "lastCachedBalance", lastCachedBalance,
                "balanceFetchedDate", balanceFetchedDate,
                "name", name);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<String> companyUuid = Optional.empty();
 
        private Optional<? extends AccountType> accountType = Optional.empty();
 
        private Optional<String> routingNumber = Optional.empty();
 
        private Optional<String> hiddenAccountNumber = Optional.empty();
 
        private Optional<? extends VerificationStatus> verificationStatus = Optional.empty();
 
        private Optional<? extends VerificationType> verificationType = Optional.empty();
 
        private JsonNullable<? extends PlaidStatus> plaidStatus = JsonNullable.undefined();
 
        private JsonNullable<String> lastCachedBalance = JsonNullable.undefined();
 
        private JsonNullable<String> balanceFetchedDate = JsonNullable.undefined();
 
        private Optional<String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * UUID of the bank account
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * UUID of the company
         */
        public Builder companyUuid(String companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = Optional.ofNullable(companyUuid);
            return this;
        }

        /**
         * UUID of the company
         */
        public Builder companyUuid(Optional<String> companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = companyUuid;
            return this;
        }

        /**
         * Bank account type
         */
        public Builder accountType(AccountType accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = Optional.ofNullable(accountType);
            return this;
        }

        /**
         * Bank account type
         */
        public Builder accountType(Optional<? extends AccountType> accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = accountType;
            return this;
        }

        /**
         * The bank account's routing number
         */
        public Builder routingNumber(String routingNumber) {
            Utils.checkNotNull(routingNumber, "routingNumber");
            this.routingNumber = Optional.ofNullable(routingNumber);
            return this;
        }

        /**
         * The bank account's routing number
         */
        public Builder routingNumber(Optional<String> routingNumber) {
            Utils.checkNotNull(routingNumber, "routingNumber");
            this.routingNumber = routingNumber;
            return this;
        }

        /**
         * Masked bank account number
         */
        public Builder hiddenAccountNumber(String hiddenAccountNumber) {
            Utils.checkNotNull(hiddenAccountNumber, "hiddenAccountNumber");
            this.hiddenAccountNumber = Optional.ofNullable(hiddenAccountNumber);
            return this;
        }

        /**
         * Masked bank account number
         */
        public Builder hiddenAccountNumber(Optional<String> hiddenAccountNumber) {
            Utils.checkNotNull(hiddenAccountNumber, "hiddenAccountNumber");
            this.hiddenAccountNumber = hiddenAccountNumber;
            return this;
        }

        /**
         * The verification status of the bank account.
         * 
         * 'awaiting_deposits' means the bank account is just created and money is being transferred.
         * 'ready_for_verification' means the micro-deposits are completed and the verification process can begin by using the verify endpoint.
         * 'verified' means the bank account is verified.
         */
        public Builder verificationStatus(VerificationStatus verificationStatus) {
            Utils.checkNotNull(verificationStatus, "verificationStatus");
            this.verificationStatus = Optional.ofNullable(verificationStatus);
            return this;
        }

        /**
         * The verification status of the bank account.
         * 
         * 'awaiting_deposits' means the bank account is just created and money is being transferred.
         * 'ready_for_verification' means the micro-deposits are completed and the verification process can begin by using the verify endpoint.
         * 'verified' means the bank account is verified.
         */
        public Builder verificationStatus(Optional<? extends VerificationStatus> verificationStatus) {
            Utils.checkNotNull(verificationStatus, "verificationStatus");
            this.verificationStatus = verificationStatus;
            return this;
        }

        /**
         * The verification type of the bank account.
         * 
         * 'bank_deposits' means the bank account is connected by entering routing and accounting numbers and verifying through micro-deposits.
         * 'plaid' means the bank account is connected through Plaid.
         */
        public Builder verificationType(VerificationType verificationType) {
            Utils.checkNotNull(verificationType, "verificationType");
            this.verificationType = Optional.ofNullable(verificationType);
            return this;
        }

        /**
         * The verification type of the bank account.
         * 
         * 'bank_deposits' means the bank account is connected by entering routing and accounting numbers and verifying through micro-deposits.
         * 'plaid' means the bank account is connected through Plaid.
         */
        public Builder verificationType(Optional<? extends VerificationType> verificationType) {
            Utils.checkNotNull(verificationType, "verificationType");
            this.verificationType = verificationType;
            return this;
        }

        /**
         * The Plaid connection status of the bank account. Only applies when verification type is Plaid.
         */
        public Builder plaidStatus(PlaidStatus plaidStatus) {
            Utils.checkNotNull(plaidStatus, "plaidStatus");
            this.plaidStatus = JsonNullable.of(plaidStatus);
            return this;
        }

        /**
         * The Plaid connection status of the bank account. Only applies when verification type is Plaid.
         */
        public Builder plaidStatus(JsonNullable<? extends PlaidStatus> plaidStatus) {
            Utils.checkNotNull(plaidStatus, "plaidStatus");
            this.plaidStatus = plaidStatus;
            return this;
        }

        /**
         * The last fetch balance for the bank account. Please be aware that this amount does not reflect the most up-to-date balance and only applies when the verification type is Plaid.
         */
        public Builder lastCachedBalance(String lastCachedBalance) {
            Utils.checkNotNull(lastCachedBalance, "lastCachedBalance");
            this.lastCachedBalance = JsonNullable.of(lastCachedBalance);
            return this;
        }

        /**
         * The last fetch balance for the bank account. Please be aware that this amount does not reflect the most up-to-date balance and only applies when the verification type is Plaid.
         */
        public Builder lastCachedBalance(JsonNullable<String> lastCachedBalance) {
            Utils.checkNotNull(lastCachedBalance, "lastCachedBalance");
            this.lastCachedBalance = lastCachedBalance;
            return this;
        }

        /**
         * The balance fetch date associated with the last_cached_balance. Only applies when verification type is Plaid.
         */
        public Builder balanceFetchedDate(String balanceFetchedDate) {
            Utils.checkNotNull(balanceFetchedDate, "balanceFetchedDate");
            this.balanceFetchedDate = JsonNullable.of(balanceFetchedDate);
            return this;
        }

        /**
         * The balance fetch date associated with the last_cached_balance. Only applies when verification type is Plaid.
         */
        public Builder balanceFetchedDate(JsonNullable<String> balanceFetchedDate) {
            Utils.checkNotNull(balanceFetchedDate, "balanceFetchedDate");
            this.balanceFetchedDate = balanceFetchedDate;
            return this;
        }

        /**
         * Name of bank account
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of bank account
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public CompanyBankAccount build() {
            return new CompanyBankAccount(
                uuid,
                companyUuid,
                accountType,
                routingNumber,
                hiddenAccountNumber,
                verificationStatus,
                verificationType,
                plaidStatus,
                lastCachedBalance,
                balanceFetchedDate,
                name);
        }
    }
}

