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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * FederalTaxDetails
 * 
 * <p>Example response
 */

public class FederalTaxDetails {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    private Optional<String> version;

    /**
     * What type of tax entity the company is. One of:
     * - C-Corporation
     * - S-Corporation
     * - Sole proprietor
     * - LLC
     * - LLP
     * - Limited partnership
     * - Co-ownership
     * - Association
     * - Trusteeship
     * - General partnership
     * - Joint venture
     * - Non-Profit
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_payer_type")
    private JsonNullable<String> taxPayerType;

    /**
     * Whether the company is taxed as an S-Corporation. Tax payer types that may be taxed as an S-Corporation include:
     * - S-Corporation
     * - C-Corporation
     * - LLC
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("taxable_as_scorp")
    private Optional<Boolean> taxableAsScorp;

    /**
     * The form used by the company for federal tax filing. One of:
     * - 941 (Quarterly federal tax return form)
     * - 944 (Annual federal tax return form)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filing_form")
    private Optional<String> filingForm;

    /**
     * Whether company's Employer Identification Number (EIN) is present
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_ein")
    private Optional<Boolean> hasEin;

    /**
     * Whether the EIN was able to be verified as a valid EIN with the IRS.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ein_verified")
    private Optional<Boolean> einVerified;

    /**
     * The legal name of the company
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("legal_name")
    private Optional<String> legalName;

    /**
     * The date that these details took effect.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_date")
    private Optional<String> effectiveDate;

    /**
     * How often the company sends money to the IRS. One of:
     *   - Semiweekly
     *   - Monthly
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deposit_schedule")
    private Optional<String> depositSchedule;

    @JsonCreator
    public FederalTaxDetails(
            @JsonProperty("version") Optional<String> version,
            @JsonProperty("tax_payer_type") JsonNullable<String> taxPayerType,
            @JsonProperty("taxable_as_scorp") Optional<Boolean> taxableAsScorp,
            @JsonProperty("filing_form") Optional<String> filingForm,
            @JsonProperty("has_ein") Optional<Boolean> hasEin,
            @JsonProperty("ein_verified") Optional<Boolean> einVerified,
            @JsonProperty("legal_name") Optional<String> legalName,
            @JsonProperty("effective_date") Optional<String> effectiveDate,
            @JsonProperty("deposit_schedule") Optional<String> depositSchedule) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(taxPayerType, "taxPayerType");
        Utils.checkNotNull(taxableAsScorp, "taxableAsScorp");
        Utils.checkNotNull(filingForm, "filingForm");
        Utils.checkNotNull(hasEin, "hasEin");
        Utils.checkNotNull(einVerified, "einVerified");
        Utils.checkNotNull(legalName, "legalName");
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        Utils.checkNotNull(depositSchedule, "depositSchedule");
        this.version = version;
        this.taxPayerType = taxPayerType;
        this.taxableAsScorp = taxableAsScorp;
        this.filingForm = filingForm;
        this.hasEin = hasEin;
        this.einVerified = einVerified;
        this.legalName = legalName;
        this.effectiveDate = effectiveDate;
        this.depositSchedule = depositSchedule;
    }
    
    public FederalTaxDetails() {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonIgnore
    public Optional<String> version() {
        return version;
    }

    /**
     * What type of tax entity the company is. One of:
     * - C-Corporation
     * - S-Corporation
     * - Sole proprietor
     * - LLC
     * - LLP
     * - Limited partnership
     * - Co-ownership
     * - Association
     * - Trusteeship
     * - General partnership
     * - Joint venture
     * - Non-Profit
     */
    @JsonIgnore
    public JsonNullable<String> taxPayerType() {
        return taxPayerType;
    }

    /**
     * Whether the company is taxed as an S-Corporation. Tax payer types that may be taxed as an S-Corporation include:
     * - S-Corporation
     * - C-Corporation
     * - LLC
     */
    @JsonIgnore
    public Optional<Boolean> taxableAsScorp() {
        return taxableAsScorp;
    }

    /**
     * The form used by the company for federal tax filing. One of:
     * - 941 (Quarterly federal tax return form)
     * - 944 (Annual federal tax return form)
     */
    @JsonIgnore
    public Optional<String> filingForm() {
        return filingForm;
    }

    /**
     * Whether company's Employer Identification Number (EIN) is present
     */
    @JsonIgnore
    public Optional<Boolean> hasEin() {
        return hasEin;
    }

    /**
     * Whether the EIN was able to be verified as a valid EIN with the IRS.
     */
    @JsonIgnore
    public Optional<Boolean> einVerified() {
        return einVerified;
    }

    /**
     * The legal name of the company
     */
    @JsonIgnore
    public Optional<String> legalName() {
        return legalName;
    }

    /**
     * The date that these details took effect.
     */
    @JsonIgnore
    public Optional<String> effectiveDate() {
        return effectiveDate;
    }

    /**
     * How often the company sends money to the IRS. One of:
     *   - Semiweekly
     *   - Monthly
     */
    @JsonIgnore
    public Optional<String> depositSchedule() {
        return depositSchedule;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public FederalTaxDetails withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public FederalTaxDetails withVersion(Optional<String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * What type of tax entity the company is. One of:
     * - C-Corporation
     * - S-Corporation
     * - Sole proprietor
     * - LLC
     * - LLP
     * - Limited partnership
     * - Co-ownership
     * - Association
     * - Trusteeship
     * - General partnership
     * - Joint venture
     * - Non-Profit
     */
    public FederalTaxDetails withTaxPayerType(String taxPayerType) {
        Utils.checkNotNull(taxPayerType, "taxPayerType");
        this.taxPayerType = JsonNullable.of(taxPayerType);
        return this;
    }

    /**
     * What type of tax entity the company is. One of:
     * - C-Corporation
     * - S-Corporation
     * - Sole proprietor
     * - LLC
     * - LLP
     * - Limited partnership
     * - Co-ownership
     * - Association
     * - Trusteeship
     * - General partnership
     * - Joint venture
     * - Non-Profit
     */
    public FederalTaxDetails withTaxPayerType(JsonNullable<String> taxPayerType) {
        Utils.checkNotNull(taxPayerType, "taxPayerType");
        this.taxPayerType = taxPayerType;
        return this;
    }

    /**
     * Whether the company is taxed as an S-Corporation. Tax payer types that may be taxed as an S-Corporation include:
     * - S-Corporation
     * - C-Corporation
     * - LLC
     */
    public FederalTaxDetails withTaxableAsScorp(boolean taxableAsScorp) {
        Utils.checkNotNull(taxableAsScorp, "taxableAsScorp");
        this.taxableAsScorp = Optional.ofNullable(taxableAsScorp);
        return this;
    }

    /**
     * Whether the company is taxed as an S-Corporation. Tax payer types that may be taxed as an S-Corporation include:
     * - S-Corporation
     * - C-Corporation
     * - LLC
     */
    public FederalTaxDetails withTaxableAsScorp(Optional<Boolean> taxableAsScorp) {
        Utils.checkNotNull(taxableAsScorp, "taxableAsScorp");
        this.taxableAsScorp = taxableAsScorp;
        return this;
    }

    /**
     * The form used by the company for federal tax filing. One of:
     * - 941 (Quarterly federal tax return form)
     * - 944 (Annual federal tax return form)
     */
    public FederalTaxDetails withFilingForm(String filingForm) {
        Utils.checkNotNull(filingForm, "filingForm");
        this.filingForm = Optional.ofNullable(filingForm);
        return this;
    }

    /**
     * The form used by the company for federal tax filing. One of:
     * - 941 (Quarterly federal tax return form)
     * - 944 (Annual federal tax return form)
     */
    public FederalTaxDetails withFilingForm(Optional<String> filingForm) {
        Utils.checkNotNull(filingForm, "filingForm");
        this.filingForm = filingForm;
        return this;
    }

    /**
     * Whether company's Employer Identification Number (EIN) is present
     */
    public FederalTaxDetails withHasEin(boolean hasEin) {
        Utils.checkNotNull(hasEin, "hasEin");
        this.hasEin = Optional.ofNullable(hasEin);
        return this;
    }

    /**
     * Whether company's Employer Identification Number (EIN) is present
     */
    public FederalTaxDetails withHasEin(Optional<Boolean> hasEin) {
        Utils.checkNotNull(hasEin, "hasEin");
        this.hasEin = hasEin;
        return this;
    }

    /**
     * Whether the EIN was able to be verified as a valid EIN with the IRS.
     */
    public FederalTaxDetails withEinVerified(boolean einVerified) {
        Utils.checkNotNull(einVerified, "einVerified");
        this.einVerified = Optional.ofNullable(einVerified);
        return this;
    }

    /**
     * Whether the EIN was able to be verified as a valid EIN with the IRS.
     */
    public FederalTaxDetails withEinVerified(Optional<Boolean> einVerified) {
        Utils.checkNotNull(einVerified, "einVerified");
        this.einVerified = einVerified;
        return this;
    }

    /**
     * The legal name of the company
     */
    public FederalTaxDetails withLegalName(String legalName) {
        Utils.checkNotNull(legalName, "legalName");
        this.legalName = Optional.ofNullable(legalName);
        return this;
    }

    /**
     * The legal name of the company
     */
    public FederalTaxDetails withLegalName(Optional<String> legalName) {
        Utils.checkNotNull(legalName, "legalName");
        this.legalName = legalName;
        return this;
    }

    /**
     * The date that these details took effect.
     */
    public FederalTaxDetails withEffectiveDate(String effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = Optional.ofNullable(effectiveDate);
        return this;
    }

    /**
     * The date that these details took effect.
     */
    public FederalTaxDetails withEffectiveDate(Optional<String> effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * How often the company sends money to the IRS. One of:
     *   - Semiweekly
     *   - Monthly
     */
    public FederalTaxDetails withDepositSchedule(String depositSchedule) {
        Utils.checkNotNull(depositSchedule, "depositSchedule");
        this.depositSchedule = Optional.ofNullable(depositSchedule);
        return this;
    }

    /**
     * How often the company sends money to the IRS. One of:
     *   - Semiweekly
     *   - Monthly
     */
    public FederalTaxDetails withDepositSchedule(Optional<String> depositSchedule) {
        Utils.checkNotNull(depositSchedule, "depositSchedule");
        this.depositSchedule = depositSchedule;
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
        FederalTaxDetails other = (FederalTaxDetails) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.taxPayerType, other.taxPayerType) &&
            Objects.deepEquals(this.taxableAsScorp, other.taxableAsScorp) &&
            Objects.deepEquals(this.filingForm, other.filingForm) &&
            Objects.deepEquals(this.hasEin, other.hasEin) &&
            Objects.deepEquals(this.einVerified, other.einVerified) &&
            Objects.deepEquals(this.legalName, other.legalName) &&
            Objects.deepEquals(this.effectiveDate, other.effectiveDate) &&
            Objects.deepEquals(this.depositSchedule, other.depositSchedule);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            version,
            taxPayerType,
            taxableAsScorp,
            filingForm,
            hasEin,
            einVerified,
            legalName,
            effectiveDate,
            depositSchedule);
    }
    
    @Override
    public String toString() {
        return Utils.toString(FederalTaxDetails.class,
                "version", version,
                "taxPayerType", taxPayerType,
                "taxableAsScorp", taxableAsScorp,
                "filingForm", filingForm,
                "hasEin", hasEin,
                "einVerified", einVerified,
                "legalName", legalName,
                "effectiveDate", effectiveDate,
                "depositSchedule", depositSchedule);
    }
    
    public final static class Builder {
 
        private Optional<String> version = Optional.empty();
 
        private JsonNullable<String> taxPayerType = JsonNullable.undefined();
 
        private Optional<Boolean> taxableAsScorp = Optional.empty();
 
        private Optional<String> filingForm = Optional.empty();
 
        private Optional<Boolean> hasEin = Optional.empty();
 
        private Optional<Boolean> einVerified = Optional.empty();
 
        private Optional<String> legalName = Optional.empty();
 
        private Optional<String> effectiveDate = Optional.empty();
 
        private Optional<String> depositSchedule = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = Optional.ofNullable(version);
            return this;
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(Optional<String> version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        /**
         * What type of tax entity the company is. One of:
         * - C-Corporation
         * - S-Corporation
         * - Sole proprietor
         * - LLC
         * - LLP
         * - Limited partnership
         * - Co-ownership
         * - Association
         * - Trusteeship
         * - General partnership
         * - Joint venture
         * - Non-Profit
         */
        public Builder taxPayerType(String taxPayerType) {
            Utils.checkNotNull(taxPayerType, "taxPayerType");
            this.taxPayerType = JsonNullable.of(taxPayerType);
            return this;
        }

        /**
         * What type of tax entity the company is. One of:
         * - C-Corporation
         * - S-Corporation
         * - Sole proprietor
         * - LLC
         * - LLP
         * - Limited partnership
         * - Co-ownership
         * - Association
         * - Trusteeship
         * - General partnership
         * - Joint venture
         * - Non-Profit
         */
        public Builder taxPayerType(JsonNullable<String> taxPayerType) {
            Utils.checkNotNull(taxPayerType, "taxPayerType");
            this.taxPayerType = taxPayerType;
            return this;
        }

        /**
         * Whether the company is taxed as an S-Corporation. Tax payer types that may be taxed as an S-Corporation include:
         * - S-Corporation
         * - C-Corporation
         * - LLC
         */
        public Builder taxableAsScorp(boolean taxableAsScorp) {
            Utils.checkNotNull(taxableAsScorp, "taxableAsScorp");
            this.taxableAsScorp = Optional.ofNullable(taxableAsScorp);
            return this;
        }

        /**
         * Whether the company is taxed as an S-Corporation. Tax payer types that may be taxed as an S-Corporation include:
         * - S-Corporation
         * - C-Corporation
         * - LLC
         */
        public Builder taxableAsScorp(Optional<Boolean> taxableAsScorp) {
            Utils.checkNotNull(taxableAsScorp, "taxableAsScorp");
            this.taxableAsScorp = taxableAsScorp;
            return this;
        }

        /**
         * The form used by the company for federal tax filing. One of:
         * - 941 (Quarterly federal tax return form)
         * - 944 (Annual federal tax return form)
         */
        public Builder filingForm(String filingForm) {
            Utils.checkNotNull(filingForm, "filingForm");
            this.filingForm = Optional.ofNullable(filingForm);
            return this;
        }

        /**
         * The form used by the company for federal tax filing. One of:
         * - 941 (Quarterly federal tax return form)
         * - 944 (Annual federal tax return form)
         */
        public Builder filingForm(Optional<String> filingForm) {
            Utils.checkNotNull(filingForm, "filingForm");
            this.filingForm = filingForm;
            return this;
        }

        /**
         * Whether company's Employer Identification Number (EIN) is present
         */
        public Builder hasEin(boolean hasEin) {
            Utils.checkNotNull(hasEin, "hasEin");
            this.hasEin = Optional.ofNullable(hasEin);
            return this;
        }

        /**
         * Whether company's Employer Identification Number (EIN) is present
         */
        public Builder hasEin(Optional<Boolean> hasEin) {
            Utils.checkNotNull(hasEin, "hasEin");
            this.hasEin = hasEin;
            return this;
        }

        /**
         * Whether the EIN was able to be verified as a valid EIN with the IRS.
         */
        public Builder einVerified(boolean einVerified) {
            Utils.checkNotNull(einVerified, "einVerified");
            this.einVerified = Optional.ofNullable(einVerified);
            return this;
        }

        /**
         * Whether the EIN was able to be verified as a valid EIN with the IRS.
         */
        public Builder einVerified(Optional<Boolean> einVerified) {
            Utils.checkNotNull(einVerified, "einVerified");
            this.einVerified = einVerified;
            return this;
        }

        /**
         * The legal name of the company
         */
        public Builder legalName(String legalName) {
            Utils.checkNotNull(legalName, "legalName");
            this.legalName = Optional.ofNullable(legalName);
            return this;
        }

        /**
         * The legal name of the company
         */
        public Builder legalName(Optional<String> legalName) {
            Utils.checkNotNull(legalName, "legalName");
            this.legalName = legalName;
            return this;
        }

        /**
         * The date that these details took effect.
         */
        public Builder effectiveDate(String effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = Optional.ofNullable(effectiveDate);
            return this;
        }

        /**
         * The date that these details took effect.
         */
        public Builder effectiveDate(Optional<String> effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * How often the company sends money to the IRS. One of:
         *   - Semiweekly
         *   - Monthly
         */
        public Builder depositSchedule(String depositSchedule) {
            Utils.checkNotNull(depositSchedule, "depositSchedule");
            this.depositSchedule = Optional.ofNullable(depositSchedule);
            return this;
        }

        /**
         * How often the company sends money to the IRS. One of:
         *   - Semiweekly
         *   - Monthly
         */
        public Builder depositSchedule(Optional<String> depositSchedule) {
            Utils.checkNotNull(depositSchedule, "depositSchedule");
            this.depositSchedule = depositSchedule;
            return this;
        }
        
        public FederalTaxDetails build() {
            return new FederalTaxDetails(
                version,
                taxPayerType,
                taxableAsScorp,
                filingForm,
                hasEin,
                einVerified,
                legalName,
                effectiveDate,
                depositSchedule);
        }
    }
}

