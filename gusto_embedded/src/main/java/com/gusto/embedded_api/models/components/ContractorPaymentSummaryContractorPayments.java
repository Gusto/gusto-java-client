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
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ContractorPaymentSummaryContractorPayments {

    /**
     * The UUID of the contractor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contractor_uuid")
    private Optional<Double> contractorUuid;

    /**
     * The total reimbursements for the contractor within a given time period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reimbursement_total")
    private Optional<String> reimbursementTotal;

    /**
     * The total wages for the contractor within a given time period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("wage_total")
    private Optional<String> wageTotal;

    /**
     * The contractor’s payments within a given time period.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("payments")
    private Optional<? extends List<ContractorPayment>> payments;

    @JsonCreator
    public ContractorPaymentSummaryContractorPayments(
            @JsonProperty("contractor_uuid") Optional<Double> contractorUuid,
            @JsonProperty("reimbursement_total") Optional<String> reimbursementTotal,
            @JsonProperty("wage_total") Optional<String> wageTotal,
            @JsonProperty("payments") Optional<? extends List<ContractorPayment>> payments) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        Utils.checkNotNull(reimbursementTotal, "reimbursementTotal");
        Utils.checkNotNull(wageTotal, "wageTotal");
        Utils.checkNotNull(payments, "payments");
        this.contractorUuid = contractorUuid;
        this.reimbursementTotal = reimbursementTotal;
        this.wageTotal = wageTotal;
        this.payments = payments;
    }
    
    public ContractorPaymentSummaryContractorPayments() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the contractor.
     */
    @JsonIgnore
    public Optional<Double> contractorUuid() {
        return contractorUuid;
    }

    /**
     * The total reimbursements for the contractor within a given time period.
     */
    @JsonIgnore
    public Optional<String> reimbursementTotal() {
        return reimbursementTotal;
    }

    /**
     * The total wages for the contractor within a given time period.
     */
    @JsonIgnore
    public Optional<String> wageTotal() {
        return wageTotal;
    }

    /**
     * The contractor’s payments within a given time period.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ContractorPayment>> payments() {
        return (Optional<List<ContractorPayment>>) payments;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the contractor.
     */
    public ContractorPaymentSummaryContractorPayments withContractorUuid(double contractorUuid) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        this.contractorUuid = Optional.ofNullable(contractorUuid);
        return this;
    }

    /**
     * The UUID of the contractor.
     */
    public ContractorPaymentSummaryContractorPayments withContractorUuid(Optional<Double> contractorUuid) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        this.contractorUuid = contractorUuid;
        return this;
    }

    /**
     * The total reimbursements for the contractor within a given time period.
     */
    public ContractorPaymentSummaryContractorPayments withReimbursementTotal(String reimbursementTotal) {
        Utils.checkNotNull(reimbursementTotal, "reimbursementTotal");
        this.reimbursementTotal = Optional.ofNullable(reimbursementTotal);
        return this;
    }

    /**
     * The total reimbursements for the contractor within a given time period.
     */
    public ContractorPaymentSummaryContractorPayments withReimbursementTotal(Optional<String> reimbursementTotal) {
        Utils.checkNotNull(reimbursementTotal, "reimbursementTotal");
        this.reimbursementTotal = reimbursementTotal;
        return this;
    }

    /**
     * The total wages for the contractor within a given time period.
     */
    public ContractorPaymentSummaryContractorPayments withWageTotal(String wageTotal) {
        Utils.checkNotNull(wageTotal, "wageTotal");
        this.wageTotal = Optional.ofNullable(wageTotal);
        return this;
    }

    /**
     * The total wages for the contractor within a given time period.
     */
    public ContractorPaymentSummaryContractorPayments withWageTotal(Optional<String> wageTotal) {
        Utils.checkNotNull(wageTotal, "wageTotal");
        this.wageTotal = wageTotal;
        return this;
    }

    /**
     * The contractor’s payments within a given time period.
     */
    public ContractorPaymentSummaryContractorPayments withPayments(List<ContractorPayment> payments) {
        Utils.checkNotNull(payments, "payments");
        this.payments = Optional.ofNullable(payments);
        return this;
    }

    /**
     * The contractor’s payments within a given time period.
     */
    public ContractorPaymentSummaryContractorPayments withPayments(Optional<? extends List<ContractorPayment>> payments) {
        Utils.checkNotNull(payments, "payments");
        this.payments = payments;
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
        ContractorPaymentSummaryContractorPayments other = (ContractorPaymentSummaryContractorPayments) o;
        return 
            Objects.deepEquals(this.contractorUuid, other.contractorUuid) &&
            Objects.deepEquals(this.reimbursementTotal, other.reimbursementTotal) &&
            Objects.deepEquals(this.wageTotal, other.wageTotal) &&
            Objects.deepEquals(this.payments, other.payments);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contractorUuid,
            reimbursementTotal,
            wageTotal,
            payments);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ContractorPaymentSummaryContractorPayments.class,
                "contractorUuid", contractorUuid,
                "reimbursementTotal", reimbursementTotal,
                "wageTotal", wageTotal,
                "payments", payments);
    }
    
    public final static class Builder {
 
        private Optional<Double> contractorUuid = Optional.empty();
 
        private Optional<String> reimbursementTotal = Optional.empty();
 
        private Optional<String> wageTotal = Optional.empty();
 
        private Optional<? extends List<ContractorPayment>> payments = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the contractor.
         */
        public Builder contractorUuid(double contractorUuid) {
            Utils.checkNotNull(contractorUuid, "contractorUuid");
            this.contractorUuid = Optional.ofNullable(contractorUuid);
            return this;
        }

        /**
         * The UUID of the contractor.
         */
        public Builder contractorUuid(Optional<Double> contractorUuid) {
            Utils.checkNotNull(contractorUuid, "contractorUuid");
            this.contractorUuid = contractorUuid;
            return this;
        }

        /**
         * The total reimbursements for the contractor within a given time period.
         */
        public Builder reimbursementTotal(String reimbursementTotal) {
            Utils.checkNotNull(reimbursementTotal, "reimbursementTotal");
            this.reimbursementTotal = Optional.ofNullable(reimbursementTotal);
            return this;
        }

        /**
         * The total reimbursements for the contractor within a given time period.
         */
        public Builder reimbursementTotal(Optional<String> reimbursementTotal) {
            Utils.checkNotNull(reimbursementTotal, "reimbursementTotal");
            this.reimbursementTotal = reimbursementTotal;
            return this;
        }

        /**
         * The total wages for the contractor within a given time period.
         */
        public Builder wageTotal(String wageTotal) {
            Utils.checkNotNull(wageTotal, "wageTotal");
            this.wageTotal = Optional.ofNullable(wageTotal);
            return this;
        }

        /**
         * The total wages for the contractor within a given time period.
         */
        public Builder wageTotal(Optional<String> wageTotal) {
            Utils.checkNotNull(wageTotal, "wageTotal");
            this.wageTotal = wageTotal;
            return this;
        }

        /**
         * The contractor’s payments within a given time period.
         */
        public Builder payments(List<ContractorPayment> payments) {
            Utils.checkNotNull(payments, "payments");
            this.payments = Optional.ofNullable(payments);
            return this;
        }

        /**
         * The contractor’s payments within a given time period.
         */
        public Builder payments(Optional<? extends List<ContractorPayment>> payments) {
            Utils.checkNotNull(payments, "payments");
            this.payments = payments;
            return this;
        }
        
        public ContractorPaymentSummaryContractorPayments build() {
            return new ContractorPaymentSummaryContractorPayments(
                contractorUuid,
                reimbursementTotal,
                wageTotal,
                payments);
        }
    }
}

