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
import java.lang.Double;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class LiabilitySelections {

    /**
     * The ID of the tax.
     */
    @JsonProperty("tax_id")
    private long taxId;

    /**
     * The UUID of the last unpaid external payroll uuid. It should be null when the full amount of tax liability has been paid.
     */
    @JsonInclude(Include.ALWAYS)
    @JsonProperty("last_unpaid_external_payroll_uuid")
    private Optional<String> lastUnpaidExternalPayrollUuid;

    /**
     * A selection of unpaid liability amount.
     */
    @JsonProperty("unpaid_liability_amount")
    private double unpaidLiabilityAmount;

    @JsonCreator
    public LiabilitySelections(
            @JsonProperty("tax_id") long taxId,
            @JsonProperty("last_unpaid_external_payroll_uuid") Optional<String> lastUnpaidExternalPayrollUuid,
            @JsonProperty("unpaid_liability_amount") double unpaidLiabilityAmount) {
        Utils.checkNotNull(taxId, "taxId");
        Utils.checkNotNull(lastUnpaidExternalPayrollUuid, "lastUnpaidExternalPayrollUuid");
        Utils.checkNotNull(unpaidLiabilityAmount, "unpaidLiabilityAmount");
        this.taxId = taxId;
        this.lastUnpaidExternalPayrollUuid = lastUnpaidExternalPayrollUuid;
        this.unpaidLiabilityAmount = unpaidLiabilityAmount;
    }
    
    public LiabilitySelections(
            long taxId,
            double unpaidLiabilityAmount) {
        this(taxId, Optional.empty(), unpaidLiabilityAmount);
    }

    /**
     * The ID of the tax.
     */
    @JsonIgnore
    public long taxId() {
        return taxId;
    }

    /**
     * The UUID of the last unpaid external payroll uuid. It should be null when the full amount of tax liability has been paid.
     */
    @JsonIgnore
    public Optional<String> lastUnpaidExternalPayrollUuid() {
        return lastUnpaidExternalPayrollUuid;
    }

    /**
     * A selection of unpaid liability amount.
     */
    @JsonIgnore
    public double unpaidLiabilityAmount() {
        return unpaidLiabilityAmount;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ID of the tax.
     */
    public LiabilitySelections withTaxId(long taxId) {
        Utils.checkNotNull(taxId, "taxId");
        this.taxId = taxId;
        return this;
    }

    /**
     * The UUID of the last unpaid external payroll uuid. It should be null when the full amount of tax liability has been paid.
     */
    public LiabilitySelections withLastUnpaidExternalPayrollUuid(String lastUnpaidExternalPayrollUuid) {
        Utils.checkNotNull(lastUnpaidExternalPayrollUuid, "lastUnpaidExternalPayrollUuid");
        this.lastUnpaidExternalPayrollUuid = Optional.ofNullable(lastUnpaidExternalPayrollUuid);
        return this;
    }

    /**
     * The UUID of the last unpaid external payroll uuid. It should be null when the full amount of tax liability has been paid.
     */
    public LiabilitySelections withLastUnpaidExternalPayrollUuid(Optional<String> lastUnpaidExternalPayrollUuid) {
        Utils.checkNotNull(lastUnpaidExternalPayrollUuid, "lastUnpaidExternalPayrollUuid");
        this.lastUnpaidExternalPayrollUuid = lastUnpaidExternalPayrollUuid;
        return this;
    }

    /**
     * A selection of unpaid liability amount.
     */
    public LiabilitySelections withUnpaidLiabilityAmount(double unpaidLiabilityAmount) {
        Utils.checkNotNull(unpaidLiabilityAmount, "unpaidLiabilityAmount");
        this.unpaidLiabilityAmount = unpaidLiabilityAmount;
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
        LiabilitySelections other = (LiabilitySelections) o;
        return 
            Objects.deepEquals(this.taxId, other.taxId) &&
            Objects.deepEquals(this.lastUnpaidExternalPayrollUuid, other.lastUnpaidExternalPayrollUuid) &&
            Objects.deepEquals(this.unpaidLiabilityAmount, other.unpaidLiabilityAmount);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            taxId,
            lastUnpaidExternalPayrollUuid,
            unpaidLiabilityAmount);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LiabilitySelections.class,
                "taxId", taxId,
                "lastUnpaidExternalPayrollUuid", lastUnpaidExternalPayrollUuid,
                "unpaidLiabilityAmount", unpaidLiabilityAmount);
    }
    
    public final static class Builder {
 
        private Long taxId;
 
        private Optional<String> lastUnpaidExternalPayrollUuid = Optional.empty();
 
        private Double unpaidLiabilityAmount;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ID of the tax.
         */
        public Builder taxId(long taxId) {
            Utils.checkNotNull(taxId, "taxId");
            this.taxId = taxId;
            return this;
        }

        /**
         * The UUID of the last unpaid external payroll uuid. It should be null when the full amount of tax liability has been paid.
         */
        public Builder lastUnpaidExternalPayrollUuid(String lastUnpaidExternalPayrollUuid) {
            Utils.checkNotNull(lastUnpaidExternalPayrollUuid, "lastUnpaidExternalPayrollUuid");
            this.lastUnpaidExternalPayrollUuid = Optional.ofNullable(lastUnpaidExternalPayrollUuid);
            return this;
        }

        /**
         * The UUID of the last unpaid external payroll uuid. It should be null when the full amount of tax liability has been paid.
         */
        public Builder lastUnpaidExternalPayrollUuid(Optional<String> lastUnpaidExternalPayrollUuid) {
            Utils.checkNotNull(lastUnpaidExternalPayrollUuid, "lastUnpaidExternalPayrollUuid");
            this.lastUnpaidExternalPayrollUuid = lastUnpaidExternalPayrollUuid;
            return this;
        }

        /**
         * A selection of unpaid liability amount.
         */
        public Builder unpaidLiabilityAmount(double unpaidLiabilityAmount) {
            Utils.checkNotNull(unpaidLiabilityAmount, "unpaidLiabilityAmount");
            this.unpaidLiabilityAmount = unpaidLiabilityAmount;
            return this;
        }
        
        public LiabilitySelections build() {
            return new LiabilitySelections(
                taxId,
                lastUnpaidExternalPayrollUuid,
                unpaidLiabilityAmount);
        }
    }
}

