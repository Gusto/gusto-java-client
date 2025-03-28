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
import java.util.Objects;
import java.util.Optional;
/**
 * GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody
 * 
 * <p>OK
 */

public class GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody {

    /**
     * The calculated debit date. If the payment method is Direct Deposit, the debit date will account for the company's ACH speed. If the payment method is Check, the debit date will be the same as the check date.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expected_debit_date")
    private Optional<String> expectedDebitDate;

    @JsonCreator
    public GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody(
            @JsonProperty("expected_debit_date") Optional<String> expectedDebitDate) {
        Utils.checkNotNull(expectedDebitDate, "expectedDebitDate");
        this.expectedDebitDate = expectedDebitDate;
    }
    
    public GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody() {
        this(Optional.empty());
    }

    /**
     * The calculated debit date. If the payment method is Direct Deposit, the debit date will account for the company's ACH speed. If the payment method is Check, the debit date will be the same as the check date.
     */
    @JsonIgnore
    public Optional<String> expectedDebitDate() {
        return expectedDebitDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The calculated debit date. If the payment method is Direct Deposit, the debit date will account for the company's ACH speed. If the payment method is Check, the debit date will be the same as the check date.
     */
    public GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody withExpectedDebitDate(String expectedDebitDate) {
        Utils.checkNotNull(expectedDebitDate, "expectedDebitDate");
        this.expectedDebitDate = Optional.ofNullable(expectedDebitDate);
        return this;
    }

    /**
     * The calculated debit date. If the payment method is Direct Deposit, the debit date will account for the company's ACH speed. If the payment method is Check, the debit date will be the same as the check date.
     */
    public GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody withExpectedDebitDate(Optional<String> expectedDebitDate) {
        Utils.checkNotNull(expectedDebitDate, "expectedDebitDate");
        this.expectedDebitDate = expectedDebitDate;
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
        GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody other = (GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody) o;
        return 
            Objects.deepEquals(this.expectedDebitDate, other.expectedDebitDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            expectedDebitDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody.class,
                "expectedDebitDate", expectedDebitDate);
    }
    
    public final static class Builder {
 
        private Optional<String> expectedDebitDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The calculated debit date. If the payment method is Direct Deposit, the debit date will account for the company's ACH speed. If the payment method is Check, the debit date will be the same as the check date.
         */
        public Builder expectedDebitDate(String expectedDebitDate) {
            Utils.checkNotNull(expectedDebitDate, "expectedDebitDate");
            this.expectedDebitDate = Optional.ofNullable(expectedDebitDate);
            return this;
        }

        /**
         * The calculated debit date. If the payment method is Direct Deposit, the debit date will account for the company's ACH speed. If the payment method is Check, the debit date will be the same as the check date.
         */
        public Builder expectedDebitDate(Optional<String> expectedDebitDate) {
            Utils.checkNotNull(expectedDebitDate, "expectedDebitDate");
            this.expectedDebitDate = expectedDebitDate;
            return this;
        }
        
        public GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody build() {
            return new GetCompaniesCompanyUuidContractorPaymentsPreviewResponseBody(
                expectedDebitDate);
        }
    }
}

