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
 * ContractorPaymentSummary
 * 
 * <p>The representation of the summary of contractor payments for a given company in a given time period.
 */

public class ContractorPaymentSummary {

    /**
     * The wage and reimbursement totals for all contractor payments within a given time period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("total")
    private Optional<? extends Total> total;

    /**
     * The individual contractor payments, within a given time period, grouped by contractor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contractor_payments")
    private Optional<? extends List<ContractorPaymentSummaryContractorPayments>> contractorPayments;

    @JsonCreator
    public ContractorPaymentSummary(
            @JsonProperty("total") Optional<? extends Total> total,
            @JsonProperty("contractor_payments") Optional<? extends List<ContractorPaymentSummaryContractorPayments>> contractorPayments) {
        Utils.checkNotNull(total, "total");
        Utils.checkNotNull(contractorPayments, "contractorPayments");
        this.total = total;
        this.contractorPayments = contractorPayments;
    }
    
    public ContractorPaymentSummary() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The wage and reimbursement totals for all contractor payments within a given time period.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Total> total() {
        return (Optional<Total>) total;
    }

    /**
     * The individual contractor payments, within a given time period, grouped by contractor.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ContractorPaymentSummaryContractorPayments>> contractorPayments() {
        return (Optional<List<ContractorPaymentSummaryContractorPayments>>) contractorPayments;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The wage and reimbursement totals for all contractor payments within a given time period.
     */
    public ContractorPaymentSummary withTotal(Total total) {
        Utils.checkNotNull(total, "total");
        this.total = Optional.ofNullable(total);
        return this;
    }

    /**
     * The wage and reimbursement totals for all contractor payments within a given time period.
     */
    public ContractorPaymentSummary withTotal(Optional<? extends Total> total) {
        Utils.checkNotNull(total, "total");
        this.total = total;
        return this;
    }

    /**
     * The individual contractor payments, within a given time period, grouped by contractor.
     */
    public ContractorPaymentSummary withContractorPayments(List<ContractorPaymentSummaryContractorPayments> contractorPayments) {
        Utils.checkNotNull(contractorPayments, "contractorPayments");
        this.contractorPayments = Optional.ofNullable(contractorPayments);
        return this;
    }

    /**
     * The individual contractor payments, within a given time period, grouped by contractor.
     */
    public ContractorPaymentSummary withContractorPayments(Optional<? extends List<ContractorPaymentSummaryContractorPayments>> contractorPayments) {
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
        ContractorPaymentSummary other = (ContractorPaymentSummary) o;
        return 
            Objects.deepEquals(this.total, other.total) &&
            Objects.deepEquals(this.contractorPayments, other.contractorPayments);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            total,
            contractorPayments);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ContractorPaymentSummary.class,
                "total", total,
                "contractorPayments", contractorPayments);
    }
    
    public final static class Builder {
 
        private Optional<? extends Total> total = Optional.empty();
 
        private Optional<? extends List<ContractorPaymentSummaryContractorPayments>> contractorPayments = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The wage and reimbursement totals for all contractor payments within a given time period.
         */
        public Builder total(Total total) {
            Utils.checkNotNull(total, "total");
            this.total = Optional.ofNullable(total);
            return this;
        }

        /**
         * The wage and reimbursement totals for all contractor payments within a given time period.
         */
        public Builder total(Optional<? extends Total> total) {
            Utils.checkNotNull(total, "total");
            this.total = total;
            return this;
        }

        /**
         * The individual contractor payments, within a given time period, grouped by contractor.
         */
        public Builder contractorPayments(List<ContractorPaymentSummaryContractorPayments> contractorPayments) {
            Utils.checkNotNull(contractorPayments, "contractorPayments");
            this.contractorPayments = Optional.ofNullable(contractorPayments);
            return this;
        }

        /**
         * The individual contractor payments, within a given time period, grouped by contractor.
         */
        public Builder contractorPayments(Optional<? extends List<ContractorPaymentSummaryContractorPayments>> contractorPayments) {
            Utils.checkNotNull(contractorPayments, "contractorPayments");
            this.contractorPayments = contractorPayments;
            return this;
        }
        
        public ContractorPaymentSummary build() {
            return new ContractorPaymentSummary(
                total,
                contractorPayments);
        }
    }
}

