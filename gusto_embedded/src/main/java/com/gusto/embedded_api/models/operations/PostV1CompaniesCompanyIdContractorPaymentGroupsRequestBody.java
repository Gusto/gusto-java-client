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
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody {

    /**
     * The payment check date
     */
    @JsonProperty("check_date")
    private LocalDate checkDate;

    /**
     * Optional token used to make contractor payment group creation idempotent.  If provided, string must be unique for each group you intend to create.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("creation_token")
    private Optional<String> creationToken;

    @JsonProperty("contractor_payments")
    private List<ContractorPayments> contractorPayments;

    @JsonCreator
    public PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody(
            @JsonProperty("check_date") LocalDate checkDate,
            @JsonProperty("creation_token") Optional<String> creationToken,
            @JsonProperty("contractor_payments") List<ContractorPayments> contractorPayments) {
        Utils.checkNotNull(checkDate, "checkDate");
        Utils.checkNotNull(creationToken, "creationToken");
        Utils.checkNotNull(contractorPayments, "contractorPayments");
        this.checkDate = checkDate;
        this.creationToken = creationToken;
        this.contractorPayments = contractorPayments;
    }
    
    public PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody(
            LocalDate checkDate,
            List<ContractorPayments> contractorPayments) {
        this(checkDate, Optional.empty(), contractorPayments);
    }

    /**
     * The payment check date
     */
    @JsonIgnore
    public LocalDate checkDate() {
        return checkDate;
    }

    /**
     * Optional token used to make contractor payment group creation idempotent.  If provided, string must be unique for each group you intend to create.
     */
    @JsonIgnore
    public Optional<String> creationToken() {
        return creationToken;
    }

    @JsonIgnore
    public List<ContractorPayments> contractorPayments() {
        return contractorPayments;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The payment check date
     */
    public PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody withCheckDate(LocalDate checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = checkDate;
        return this;
    }

    /**
     * Optional token used to make contractor payment group creation idempotent.  If provided, string must be unique for each group you intend to create.
     */
    public PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody withCreationToken(String creationToken) {
        Utils.checkNotNull(creationToken, "creationToken");
        this.creationToken = Optional.ofNullable(creationToken);
        return this;
    }

    /**
     * Optional token used to make contractor payment group creation idempotent.  If provided, string must be unique for each group you intend to create.
     */
    public PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody withCreationToken(Optional<String> creationToken) {
        Utils.checkNotNull(creationToken, "creationToken");
        this.creationToken = creationToken;
        return this;
    }

    public PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody withContractorPayments(List<ContractorPayments> contractorPayments) {
        Utils.checkNotNull(contractorPayments, "contractorPayments");
        this.contractorPayments = contractorPayments;
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
        PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody other = (PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody) o;
        return 
            Objects.deepEquals(this.checkDate, other.checkDate) &&
            Objects.deepEquals(this.creationToken, other.creationToken) &&
            Objects.deepEquals(this.contractorPayments, other.contractorPayments);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            checkDate,
            creationToken,
            contractorPayments);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody.class,
                "checkDate", checkDate,
                "creationToken", creationToken,
                "contractorPayments", contractorPayments);
    }
    
    public final static class Builder {
 
        private LocalDate checkDate;
 
        private Optional<String> creationToken = Optional.empty();
 
        private List<ContractorPayments> contractorPayments;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The payment check date
         */
        public Builder checkDate(LocalDate checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = checkDate;
            return this;
        }

        /**
         * Optional token used to make contractor payment group creation idempotent.  If provided, string must be unique for each group you intend to create.
         */
        public Builder creationToken(String creationToken) {
            Utils.checkNotNull(creationToken, "creationToken");
            this.creationToken = Optional.ofNullable(creationToken);
            return this;
        }

        /**
         * Optional token used to make contractor payment group creation idempotent.  If provided, string must be unique for each group you intend to create.
         */
        public Builder creationToken(Optional<String> creationToken) {
            Utils.checkNotNull(creationToken, "creationToken");
            this.creationToken = creationToken;
            return this;
        }

        public Builder contractorPayments(List<ContractorPayments> contractorPayments) {
            Utils.checkNotNull(contractorPayments, "contractorPayments");
            this.contractorPayments = contractorPayments;
            return this;
        }
        
        public PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody build() {
            return new PostV1CompaniesCompanyIdContractorPaymentGroupsRequestBody(
                checkDate,
                creationToken,
                contractorPayments);
        }
    }
}

