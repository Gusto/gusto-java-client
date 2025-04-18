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
 * ContractorPaymentReceiptTotals
 * 
 * <p>The subtotals for the contractor payment.
 */

public class ContractorPaymentReceiptTotals {

    /**
     * The total company debit for the contractor payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_debit")
    private Optional<String> companyDebit;

    @JsonCreator
    public ContractorPaymentReceiptTotals(
            @JsonProperty("company_debit") Optional<String> companyDebit) {
        Utils.checkNotNull(companyDebit, "companyDebit");
        this.companyDebit = companyDebit;
    }
    
    public ContractorPaymentReceiptTotals() {
        this(Optional.empty());
    }

    /**
     * The total company debit for the contractor payment.
     */
    @JsonIgnore
    public Optional<String> companyDebit() {
        return companyDebit;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The total company debit for the contractor payment.
     */
    public ContractorPaymentReceiptTotals withCompanyDebit(String companyDebit) {
        Utils.checkNotNull(companyDebit, "companyDebit");
        this.companyDebit = Optional.ofNullable(companyDebit);
        return this;
    }

    /**
     * The total company debit for the contractor payment.
     */
    public ContractorPaymentReceiptTotals withCompanyDebit(Optional<String> companyDebit) {
        Utils.checkNotNull(companyDebit, "companyDebit");
        this.companyDebit = companyDebit;
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
        ContractorPaymentReceiptTotals other = (ContractorPaymentReceiptTotals) o;
        return 
            Objects.deepEquals(this.companyDebit, other.companyDebit);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyDebit);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ContractorPaymentReceiptTotals.class,
                "companyDebit", companyDebit);
    }
    
    public final static class Builder {
 
        private Optional<String> companyDebit = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The total company debit for the contractor payment.
         */
        public Builder companyDebit(String companyDebit) {
            Utils.checkNotNull(companyDebit, "companyDebit");
            this.companyDebit = Optional.ofNullable(companyDebit);
            return this;
        }

        /**
         * The total company debit for the contractor payment.
         */
        public Builder companyDebit(Optional<String> companyDebit) {
            Utils.checkNotNull(companyDebit, "companyDebit");
            this.companyDebit = companyDebit;
            return this;
        }
        
        public ContractorPaymentReceiptTotals build() {
            return new ContractorPaymentReceiptTotals(
                companyDebit);
        }
    }
}

