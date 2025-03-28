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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
/**
 * CompanySuspension
 * 
 * <p>Record representing the suspension of a company's Gusto account.
 */

public class CompanySuspension {

    /**
     * Unique identifier for this suspension.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    private Optional<String> uuid;

    /**
     * Unique identifier for the company which is suspended.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_uuid")
    private Optional<String> companyUuid;

    /**
     * Date that the suspension took effect.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_date")
    private Optional<String> effectiveDate;

    /**
     * Which competitor the company is joining instead. Only required if `reason` is `'switching_provider'`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("leaving_for")
    private Optional<String> leavingFor;

    /**
     * Explanation for why the company's account was suspended.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reason")
    private Optional<String> reason;

    /**
     * How Gusto will handle taxes already collected.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reconcile_tax_method")
    private Optional<? extends ReconcileTaxMethod> reconcileTaxMethod;

    /**
     * Should Gusto file quarterly tax forms on behalf of the company? The correct answer can depend on why the company
     * is suspending their account, and how taxes are being reconciled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_quarterly_forms")
    private Optional<Boolean> fileQuarterlyForms;

    /**
     * Should Gusto file yearly tax forms on behalf of the company? The correct answer can depend on why the company
     * is suspending their account, and how taxes are being reconciled.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("file_yearly_forms")
    private Optional<Boolean> fileYearlyForms;

    /**
     * User-supplied comments describing why then are suspending their account.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("comments")
    private Optional<String> comments;

    /**
     * Describes the taxes which are refundable to the company for this suspension. These may be refunded, or paid
     * by Gusto, depending on the value in `reconcile_tax_method`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tax_refunds")
    private Optional<? extends TaxRefunds> taxRefunds;

    @JsonCreator
    public CompanySuspension(
            @JsonProperty("uuid") Optional<String> uuid,
            @JsonProperty("company_uuid") Optional<String> companyUuid,
            @JsonProperty("effective_date") Optional<String> effectiveDate,
            @JsonProperty("leaving_for") Optional<String> leavingFor,
            @JsonProperty("reason") Optional<String> reason,
            @JsonProperty("reconcile_tax_method") Optional<? extends ReconcileTaxMethod> reconcileTaxMethod,
            @JsonProperty("file_quarterly_forms") Optional<Boolean> fileQuarterlyForms,
            @JsonProperty("file_yearly_forms") Optional<Boolean> fileYearlyForms,
            @JsonProperty("comments") Optional<String> comments,
            @JsonProperty("tax_refunds") Optional<? extends TaxRefunds> taxRefunds) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        Utils.checkNotNull(leavingFor, "leavingFor");
        Utils.checkNotNull(reason, "reason");
        Utils.checkNotNull(reconcileTaxMethod, "reconcileTaxMethod");
        Utils.checkNotNull(fileQuarterlyForms, "fileQuarterlyForms");
        Utils.checkNotNull(fileYearlyForms, "fileYearlyForms");
        Utils.checkNotNull(comments, "comments");
        Utils.checkNotNull(taxRefunds, "taxRefunds");
        this.uuid = uuid;
        this.companyUuid = companyUuid;
        this.effectiveDate = effectiveDate;
        this.leavingFor = leavingFor;
        this.reason = reason;
        this.reconcileTaxMethod = reconcileTaxMethod;
        this.fileQuarterlyForms = fileQuarterlyForms;
        this.fileYearlyForms = fileYearlyForms;
        this.comments = comments;
        this.taxRefunds = taxRefunds;
    }
    
    public CompanySuspension() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for this suspension.
     */
    @JsonIgnore
    public Optional<String> uuid() {
        return uuid;
    }

    /**
     * Unique identifier for the company which is suspended.
     */
    @JsonIgnore
    public Optional<String> companyUuid() {
        return companyUuid;
    }

    /**
     * Date that the suspension took effect.
     */
    @JsonIgnore
    public Optional<String> effectiveDate() {
        return effectiveDate;
    }

    /**
     * Which competitor the company is joining instead. Only required if `reason` is `'switching_provider'`.
     */
    @JsonIgnore
    public Optional<String> leavingFor() {
        return leavingFor;
    }

    /**
     * Explanation for why the company's account was suspended.
     */
    @JsonIgnore
    public Optional<String> reason() {
        return reason;
    }

    /**
     * How Gusto will handle taxes already collected.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ReconcileTaxMethod> reconcileTaxMethod() {
        return (Optional<ReconcileTaxMethod>) reconcileTaxMethod;
    }

    /**
     * Should Gusto file quarterly tax forms on behalf of the company? The correct answer can depend on why the company
     * is suspending their account, and how taxes are being reconciled.
     */
    @JsonIgnore
    public Optional<Boolean> fileQuarterlyForms() {
        return fileQuarterlyForms;
    }

    /**
     * Should Gusto file yearly tax forms on behalf of the company? The correct answer can depend on why the company
     * is suspending their account, and how taxes are being reconciled.
     */
    @JsonIgnore
    public Optional<Boolean> fileYearlyForms() {
        return fileYearlyForms;
    }

    /**
     * User-supplied comments describing why then are suspending their account.
     */
    @JsonIgnore
    public Optional<String> comments() {
        return comments;
    }

    /**
     * Describes the taxes which are refundable to the company for this suspension. These may be refunded, or paid
     * by Gusto, depending on the value in `reconcile_tax_method`.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<TaxRefunds> taxRefunds() {
        return (Optional<TaxRefunds>) taxRefunds;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for this suspension.
     */
    public CompanySuspension withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = Optional.ofNullable(uuid);
        return this;
    }

    /**
     * Unique identifier for this suspension.
     */
    public CompanySuspension withUuid(Optional<String> uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * Unique identifier for the company which is suspended.
     */
    public CompanySuspension withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = Optional.ofNullable(companyUuid);
        return this;
    }

    /**
     * Unique identifier for the company which is suspended.
     */
    public CompanySuspension withCompanyUuid(Optional<String> companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * Date that the suspension took effect.
     */
    public CompanySuspension withEffectiveDate(String effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = Optional.ofNullable(effectiveDate);
        return this;
    }

    /**
     * Date that the suspension took effect.
     */
    public CompanySuspension withEffectiveDate(Optional<String> effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Which competitor the company is joining instead. Only required if `reason` is `'switching_provider'`.
     */
    public CompanySuspension withLeavingFor(String leavingFor) {
        Utils.checkNotNull(leavingFor, "leavingFor");
        this.leavingFor = Optional.ofNullable(leavingFor);
        return this;
    }

    /**
     * Which competitor the company is joining instead. Only required if `reason` is `'switching_provider'`.
     */
    public CompanySuspension withLeavingFor(Optional<String> leavingFor) {
        Utils.checkNotNull(leavingFor, "leavingFor");
        this.leavingFor = leavingFor;
        return this;
    }

    /**
     * Explanation for why the company's account was suspended.
     */
    public CompanySuspension withReason(String reason) {
        Utils.checkNotNull(reason, "reason");
        this.reason = Optional.ofNullable(reason);
        return this;
    }

    /**
     * Explanation for why the company's account was suspended.
     */
    public CompanySuspension withReason(Optional<String> reason) {
        Utils.checkNotNull(reason, "reason");
        this.reason = reason;
        return this;
    }

    /**
     * How Gusto will handle taxes already collected.
     */
    public CompanySuspension withReconcileTaxMethod(ReconcileTaxMethod reconcileTaxMethod) {
        Utils.checkNotNull(reconcileTaxMethod, "reconcileTaxMethod");
        this.reconcileTaxMethod = Optional.ofNullable(reconcileTaxMethod);
        return this;
    }

    /**
     * How Gusto will handle taxes already collected.
     */
    public CompanySuspension withReconcileTaxMethod(Optional<? extends ReconcileTaxMethod> reconcileTaxMethod) {
        Utils.checkNotNull(reconcileTaxMethod, "reconcileTaxMethod");
        this.reconcileTaxMethod = reconcileTaxMethod;
        return this;
    }

    /**
     * Should Gusto file quarterly tax forms on behalf of the company? The correct answer can depend on why the company
     * is suspending their account, and how taxes are being reconciled.
     */
    public CompanySuspension withFileQuarterlyForms(boolean fileQuarterlyForms) {
        Utils.checkNotNull(fileQuarterlyForms, "fileQuarterlyForms");
        this.fileQuarterlyForms = Optional.ofNullable(fileQuarterlyForms);
        return this;
    }

    /**
     * Should Gusto file quarterly tax forms on behalf of the company? The correct answer can depend on why the company
     * is suspending their account, and how taxes are being reconciled.
     */
    public CompanySuspension withFileQuarterlyForms(Optional<Boolean> fileQuarterlyForms) {
        Utils.checkNotNull(fileQuarterlyForms, "fileQuarterlyForms");
        this.fileQuarterlyForms = fileQuarterlyForms;
        return this;
    }

    /**
     * Should Gusto file yearly tax forms on behalf of the company? The correct answer can depend on why the company
     * is suspending their account, and how taxes are being reconciled.
     */
    public CompanySuspension withFileYearlyForms(boolean fileYearlyForms) {
        Utils.checkNotNull(fileYearlyForms, "fileYearlyForms");
        this.fileYearlyForms = Optional.ofNullable(fileYearlyForms);
        return this;
    }

    /**
     * Should Gusto file yearly tax forms on behalf of the company? The correct answer can depend on why the company
     * is suspending their account, and how taxes are being reconciled.
     */
    public CompanySuspension withFileYearlyForms(Optional<Boolean> fileYearlyForms) {
        Utils.checkNotNull(fileYearlyForms, "fileYearlyForms");
        this.fileYearlyForms = fileYearlyForms;
        return this;
    }

    /**
     * User-supplied comments describing why then are suspending their account.
     */
    public CompanySuspension withComments(String comments) {
        Utils.checkNotNull(comments, "comments");
        this.comments = Optional.ofNullable(comments);
        return this;
    }

    /**
     * User-supplied comments describing why then are suspending their account.
     */
    public CompanySuspension withComments(Optional<String> comments) {
        Utils.checkNotNull(comments, "comments");
        this.comments = comments;
        return this;
    }

    /**
     * Describes the taxes which are refundable to the company for this suspension. These may be refunded, or paid
     * by Gusto, depending on the value in `reconcile_tax_method`.
     */
    public CompanySuspension withTaxRefunds(TaxRefunds taxRefunds) {
        Utils.checkNotNull(taxRefunds, "taxRefunds");
        this.taxRefunds = Optional.ofNullable(taxRefunds);
        return this;
    }

    /**
     * Describes the taxes which are refundable to the company for this suspension. These may be refunded, or paid
     * by Gusto, depending on the value in `reconcile_tax_method`.
     */
    public CompanySuspension withTaxRefunds(Optional<? extends TaxRefunds> taxRefunds) {
        Utils.checkNotNull(taxRefunds, "taxRefunds");
        this.taxRefunds = taxRefunds;
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
        CompanySuspension other = (CompanySuspension) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.effectiveDate, other.effectiveDate) &&
            Objects.deepEquals(this.leavingFor, other.leavingFor) &&
            Objects.deepEquals(this.reason, other.reason) &&
            Objects.deepEquals(this.reconcileTaxMethod, other.reconcileTaxMethod) &&
            Objects.deepEquals(this.fileQuarterlyForms, other.fileQuarterlyForms) &&
            Objects.deepEquals(this.fileYearlyForms, other.fileYearlyForms) &&
            Objects.deepEquals(this.comments, other.comments) &&
            Objects.deepEquals(this.taxRefunds, other.taxRefunds);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            companyUuid,
            effectiveDate,
            leavingFor,
            reason,
            reconcileTaxMethod,
            fileQuarterlyForms,
            fileYearlyForms,
            comments,
            taxRefunds);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanySuspension.class,
                "uuid", uuid,
                "companyUuid", companyUuid,
                "effectiveDate", effectiveDate,
                "leavingFor", leavingFor,
                "reason", reason,
                "reconcileTaxMethod", reconcileTaxMethod,
                "fileQuarterlyForms", fileQuarterlyForms,
                "fileYearlyForms", fileYearlyForms,
                "comments", comments,
                "taxRefunds", taxRefunds);
    }
    
    public final static class Builder {
 
        private Optional<String> uuid = Optional.empty();
 
        private Optional<String> companyUuid = Optional.empty();
 
        private Optional<String> effectiveDate = Optional.empty();
 
        private Optional<String> leavingFor = Optional.empty();
 
        private Optional<String> reason = Optional.empty();
 
        private Optional<? extends ReconcileTaxMethod> reconcileTaxMethod = Optional.empty();
 
        private Optional<Boolean> fileQuarterlyForms = Optional.empty();
 
        private Optional<Boolean> fileYearlyForms = Optional.empty();
 
        private Optional<String> comments = Optional.empty();
 
        private Optional<? extends TaxRefunds> taxRefunds = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for this suspension.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = Optional.ofNullable(uuid);
            return this;
        }

        /**
         * Unique identifier for this suspension.
         */
        public Builder uuid(Optional<String> uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * Unique identifier for the company which is suspended.
         */
        public Builder companyUuid(String companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = Optional.ofNullable(companyUuid);
            return this;
        }

        /**
         * Unique identifier for the company which is suspended.
         */
        public Builder companyUuid(Optional<String> companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = companyUuid;
            return this;
        }

        /**
         * Date that the suspension took effect.
         */
        public Builder effectiveDate(String effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = Optional.ofNullable(effectiveDate);
            return this;
        }

        /**
         * Date that the suspension took effect.
         */
        public Builder effectiveDate(Optional<String> effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * Which competitor the company is joining instead. Only required if `reason` is `'switching_provider'`.
         */
        public Builder leavingFor(String leavingFor) {
            Utils.checkNotNull(leavingFor, "leavingFor");
            this.leavingFor = Optional.ofNullable(leavingFor);
            return this;
        }

        /**
         * Which competitor the company is joining instead. Only required if `reason` is `'switching_provider'`.
         */
        public Builder leavingFor(Optional<String> leavingFor) {
            Utils.checkNotNull(leavingFor, "leavingFor");
            this.leavingFor = leavingFor;
            return this;
        }

        /**
         * Explanation for why the company's account was suspended.
         */
        public Builder reason(String reason) {
            Utils.checkNotNull(reason, "reason");
            this.reason = Optional.ofNullable(reason);
            return this;
        }

        /**
         * Explanation for why the company's account was suspended.
         */
        public Builder reason(Optional<String> reason) {
            Utils.checkNotNull(reason, "reason");
            this.reason = reason;
            return this;
        }

        /**
         * How Gusto will handle taxes already collected.
         */
        public Builder reconcileTaxMethod(ReconcileTaxMethod reconcileTaxMethod) {
            Utils.checkNotNull(reconcileTaxMethod, "reconcileTaxMethod");
            this.reconcileTaxMethod = Optional.ofNullable(reconcileTaxMethod);
            return this;
        }

        /**
         * How Gusto will handle taxes already collected.
         */
        public Builder reconcileTaxMethod(Optional<? extends ReconcileTaxMethod> reconcileTaxMethod) {
            Utils.checkNotNull(reconcileTaxMethod, "reconcileTaxMethod");
            this.reconcileTaxMethod = reconcileTaxMethod;
            return this;
        }

        /**
         * Should Gusto file quarterly tax forms on behalf of the company? The correct answer can depend on why the company
         * is suspending their account, and how taxes are being reconciled.
         */
        public Builder fileQuarterlyForms(boolean fileQuarterlyForms) {
            Utils.checkNotNull(fileQuarterlyForms, "fileQuarterlyForms");
            this.fileQuarterlyForms = Optional.ofNullable(fileQuarterlyForms);
            return this;
        }

        /**
         * Should Gusto file quarterly tax forms on behalf of the company? The correct answer can depend on why the company
         * is suspending their account, and how taxes are being reconciled.
         */
        public Builder fileQuarterlyForms(Optional<Boolean> fileQuarterlyForms) {
            Utils.checkNotNull(fileQuarterlyForms, "fileQuarterlyForms");
            this.fileQuarterlyForms = fileQuarterlyForms;
            return this;
        }

        /**
         * Should Gusto file yearly tax forms on behalf of the company? The correct answer can depend on why the company
         * is suspending their account, and how taxes are being reconciled.
         */
        public Builder fileYearlyForms(boolean fileYearlyForms) {
            Utils.checkNotNull(fileYearlyForms, "fileYearlyForms");
            this.fileYearlyForms = Optional.ofNullable(fileYearlyForms);
            return this;
        }

        /**
         * Should Gusto file yearly tax forms on behalf of the company? The correct answer can depend on why the company
         * is suspending their account, and how taxes are being reconciled.
         */
        public Builder fileYearlyForms(Optional<Boolean> fileYearlyForms) {
            Utils.checkNotNull(fileYearlyForms, "fileYearlyForms");
            this.fileYearlyForms = fileYearlyForms;
            return this;
        }

        /**
         * User-supplied comments describing why then are suspending their account.
         */
        public Builder comments(String comments) {
            Utils.checkNotNull(comments, "comments");
            this.comments = Optional.ofNullable(comments);
            return this;
        }

        /**
         * User-supplied comments describing why then are suspending their account.
         */
        public Builder comments(Optional<String> comments) {
            Utils.checkNotNull(comments, "comments");
            this.comments = comments;
            return this;
        }

        /**
         * Describes the taxes which are refundable to the company for this suspension. These may be refunded, or paid
         * by Gusto, depending on the value in `reconcile_tax_method`.
         */
        public Builder taxRefunds(TaxRefunds taxRefunds) {
            Utils.checkNotNull(taxRefunds, "taxRefunds");
            this.taxRefunds = Optional.ofNullable(taxRefunds);
            return this;
        }

        /**
         * Describes the taxes which are refundable to the company for this suspension. These may be refunded, or paid
         * by Gusto, depending on the value in `reconcile_tax_method`.
         */
        public Builder taxRefunds(Optional<? extends TaxRefunds> taxRefunds) {
            Utils.checkNotNull(taxRefunds, "taxRefunds");
            this.taxRefunds = taxRefunds;
            return this;
        }
        
        public CompanySuspension build() {
            return new CompanySuspension(
                uuid,
                companyUuid,
                effectiveDate,
                leavingFor,
                reason,
                reconcileTaxMethod,
                fileQuarterlyForms,
                fileYearlyForms,
                comments,
                taxRefunds);
        }
    }
}

