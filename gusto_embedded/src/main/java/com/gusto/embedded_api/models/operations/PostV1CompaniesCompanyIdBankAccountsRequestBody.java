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
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class PostV1CompaniesCompanyIdBankAccountsRequestBody {

    /**
     * The bank routing number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("routing_number")
    private Optional<String> routingNumber;

    /**
     * The bank account number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_number")
    private Optional<String> accountNumber;

    /**
     * The bank account type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("account_type")
    private Optional<? extends AccountType> accountType;

    @JsonCreator
    public PostV1CompaniesCompanyIdBankAccountsRequestBody(
            @JsonProperty("routing_number") Optional<String> routingNumber,
            @JsonProperty("account_number") Optional<String> accountNumber,
            @JsonProperty("account_type") Optional<? extends AccountType> accountType) {
        Utils.checkNotNull(routingNumber, "routingNumber");
        Utils.checkNotNull(accountNumber, "accountNumber");
        Utils.checkNotNull(accountType, "accountType");
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }
    
    public PostV1CompaniesCompanyIdBankAccountsRequestBody() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The bank routing number
     */
    @JsonIgnore
    public Optional<String> routingNumber() {
        return routingNumber;
    }

    /**
     * The bank account number
     */
    @JsonIgnore
    public Optional<String> accountNumber() {
        return accountNumber;
    }

    /**
     * The bank account type
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AccountType> accountType() {
        return (Optional<AccountType>) accountType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The bank routing number
     */
    public PostV1CompaniesCompanyIdBankAccountsRequestBody withRoutingNumber(String routingNumber) {
        Utils.checkNotNull(routingNumber, "routingNumber");
        this.routingNumber = Optional.ofNullable(routingNumber);
        return this;
    }

    /**
     * The bank routing number
     */
    public PostV1CompaniesCompanyIdBankAccountsRequestBody withRoutingNumber(Optional<String> routingNumber) {
        Utils.checkNotNull(routingNumber, "routingNumber");
        this.routingNumber = routingNumber;
        return this;
    }

    /**
     * The bank account number
     */
    public PostV1CompaniesCompanyIdBankAccountsRequestBody withAccountNumber(String accountNumber) {
        Utils.checkNotNull(accountNumber, "accountNumber");
        this.accountNumber = Optional.ofNullable(accountNumber);
        return this;
    }

    /**
     * The bank account number
     */
    public PostV1CompaniesCompanyIdBankAccountsRequestBody withAccountNumber(Optional<String> accountNumber) {
        Utils.checkNotNull(accountNumber, "accountNumber");
        this.accountNumber = accountNumber;
        return this;
    }

    /**
     * The bank account type
     */
    public PostV1CompaniesCompanyIdBankAccountsRequestBody withAccountType(AccountType accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = Optional.ofNullable(accountType);
        return this;
    }

    /**
     * The bank account type
     */
    public PostV1CompaniesCompanyIdBankAccountsRequestBody withAccountType(Optional<? extends AccountType> accountType) {
        Utils.checkNotNull(accountType, "accountType");
        this.accountType = accountType;
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
        PostV1CompaniesCompanyIdBankAccountsRequestBody other = (PostV1CompaniesCompanyIdBankAccountsRequestBody) o;
        return 
            Objects.deepEquals(this.routingNumber, other.routingNumber) &&
            Objects.deepEquals(this.accountNumber, other.accountNumber) &&
            Objects.deepEquals(this.accountType, other.accountType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            routingNumber,
            accountNumber,
            accountType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1CompaniesCompanyIdBankAccountsRequestBody.class,
                "routingNumber", routingNumber,
                "accountNumber", accountNumber,
                "accountType", accountType);
    }
    
    public final static class Builder {
 
        private Optional<String> routingNumber = Optional.empty();
 
        private Optional<String> accountNumber = Optional.empty();
 
        private Optional<? extends AccountType> accountType = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The bank routing number
         */
        public Builder routingNumber(String routingNumber) {
            Utils.checkNotNull(routingNumber, "routingNumber");
            this.routingNumber = Optional.ofNullable(routingNumber);
            return this;
        }

        /**
         * The bank routing number
         */
        public Builder routingNumber(Optional<String> routingNumber) {
            Utils.checkNotNull(routingNumber, "routingNumber");
            this.routingNumber = routingNumber;
            return this;
        }

        /**
         * The bank account number
         */
        public Builder accountNumber(String accountNumber) {
            Utils.checkNotNull(accountNumber, "accountNumber");
            this.accountNumber = Optional.ofNullable(accountNumber);
            return this;
        }

        /**
         * The bank account number
         */
        public Builder accountNumber(Optional<String> accountNumber) {
            Utils.checkNotNull(accountNumber, "accountNumber");
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * The bank account type
         */
        public Builder accountType(AccountType accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = Optional.ofNullable(accountType);
            return this;
        }

        /**
         * The bank account type
         */
        public Builder accountType(Optional<? extends AccountType> accountType) {
            Utils.checkNotNull(accountType, "accountType");
            this.accountType = accountType;
            return this;
        }
        
        public PostV1CompaniesCompanyIdBankAccountsRequestBody build() {
            return new PostV1CompaniesCompanyIdBankAccountsRequestBody(
                routingNumber,
                accountNumber,
                accountType);
        }
    }
}

