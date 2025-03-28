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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Agencies {

    /**
     * Two letter state abbreviation
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<String> state;

    /**
     * Name of state child support agency
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    /**
     * Specifies if remitting payment to the agency is required outside of Gusto. If true, Gusto includes garnishment amounts for this agency in payroll calculation, but does not debit for or remit payment to the agency automatically. As of September 2024, only garnishments for South Carolina Integrated Child Support Services require manual payment.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("manual_payment_required")
    private Optional<Boolean> manualPaymentRequired;

    /**
     * FIPS codes for state or county child support orders
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fips_codes")
    private Optional<? extends List<FipsCodes>> fipsCodes;

    /**
     * Describes which child support case identifying attributes are required for this agency. While most agencies only require a single identifier, some (e.g. OH) require multiple identifiers.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required_attributes")
    private Optional<? extends List<RequiredAttributes>> requiredAttributes;

    @JsonCreator
    public Agencies(
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("manual_payment_required") Optional<Boolean> manualPaymentRequired,
            @JsonProperty("fips_codes") Optional<? extends List<FipsCodes>> fipsCodes,
            @JsonProperty("required_attributes") Optional<? extends List<RequiredAttributes>> requiredAttributes) {
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(manualPaymentRequired, "manualPaymentRequired");
        Utils.checkNotNull(fipsCodes, "fipsCodes");
        Utils.checkNotNull(requiredAttributes, "requiredAttributes");
        this.state = state;
        this.name = name;
        this.manualPaymentRequired = manualPaymentRequired;
        this.fipsCodes = fipsCodes;
        this.requiredAttributes = requiredAttributes;
    }
    
    public Agencies() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Two letter state abbreviation
     */
    @JsonIgnore
    public Optional<String> state() {
        return state;
    }

    /**
     * Name of state child support agency
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    /**
     * Specifies if remitting payment to the agency is required outside of Gusto. If true, Gusto includes garnishment amounts for this agency in payroll calculation, but does not debit for or remit payment to the agency automatically. As of September 2024, only garnishments for South Carolina Integrated Child Support Services require manual payment.
     */
    @JsonIgnore
    public Optional<Boolean> manualPaymentRequired() {
        return manualPaymentRequired;
    }

    /**
     * FIPS codes for state or county child support orders
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<FipsCodes>> fipsCodes() {
        return (Optional<List<FipsCodes>>) fipsCodes;
    }

    /**
     * Describes which child support case identifying attributes are required for this agency. While most agencies only require a single identifier, some (e.g. OH) require multiple identifiers.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<RequiredAttributes>> requiredAttributes() {
        return (Optional<List<RequiredAttributes>>) requiredAttributes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Two letter state abbreviation
     */
    public Agencies withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * Two letter state abbreviation
     */
    public Agencies withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    /**
     * Name of state child support agency
     */
    public Agencies withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Name of state child support agency
     */
    public Agencies withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    /**
     * Specifies if remitting payment to the agency is required outside of Gusto. If true, Gusto includes garnishment amounts for this agency in payroll calculation, but does not debit for or remit payment to the agency automatically. As of September 2024, only garnishments for South Carolina Integrated Child Support Services require manual payment.
     */
    public Agencies withManualPaymentRequired(boolean manualPaymentRequired) {
        Utils.checkNotNull(manualPaymentRequired, "manualPaymentRequired");
        this.manualPaymentRequired = Optional.ofNullable(manualPaymentRequired);
        return this;
    }

    /**
     * Specifies if remitting payment to the agency is required outside of Gusto. If true, Gusto includes garnishment amounts for this agency in payroll calculation, but does not debit for or remit payment to the agency automatically. As of September 2024, only garnishments for South Carolina Integrated Child Support Services require manual payment.
     */
    public Agencies withManualPaymentRequired(Optional<Boolean> manualPaymentRequired) {
        Utils.checkNotNull(manualPaymentRequired, "manualPaymentRequired");
        this.manualPaymentRequired = manualPaymentRequired;
        return this;
    }

    /**
     * FIPS codes for state or county child support orders
     */
    public Agencies withFipsCodes(List<FipsCodes> fipsCodes) {
        Utils.checkNotNull(fipsCodes, "fipsCodes");
        this.fipsCodes = Optional.ofNullable(fipsCodes);
        return this;
    }

    /**
     * FIPS codes for state or county child support orders
     */
    public Agencies withFipsCodes(Optional<? extends List<FipsCodes>> fipsCodes) {
        Utils.checkNotNull(fipsCodes, "fipsCodes");
        this.fipsCodes = fipsCodes;
        return this;
    }

    /**
     * Describes which child support case identifying attributes are required for this agency. While most agencies only require a single identifier, some (e.g. OH) require multiple identifiers.
     */
    public Agencies withRequiredAttributes(List<RequiredAttributes> requiredAttributes) {
        Utils.checkNotNull(requiredAttributes, "requiredAttributes");
        this.requiredAttributes = Optional.ofNullable(requiredAttributes);
        return this;
    }

    /**
     * Describes which child support case identifying attributes are required for this agency. While most agencies only require a single identifier, some (e.g. OH) require multiple identifiers.
     */
    public Agencies withRequiredAttributes(Optional<? extends List<RequiredAttributes>> requiredAttributes) {
        Utils.checkNotNull(requiredAttributes, "requiredAttributes");
        this.requiredAttributes = requiredAttributes;
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
        Agencies other = (Agencies) o;
        return 
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.manualPaymentRequired, other.manualPaymentRequired) &&
            Objects.deepEquals(this.fipsCodes, other.fipsCodes) &&
            Objects.deepEquals(this.requiredAttributes, other.requiredAttributes);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            state,
            name,
            manualPaymentRequired,
            fipsCodes,
            requiredAttributes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Agencies.class,
                "state", state,
                "name", name,
                "manualPaymentRequired", manualPaymentRequired,
                "fipsCodes", fipsCodes,
                "requiredAttributes", requiredAttributes);
    }
    
    public final static class Builder {
 
        private Optional<String> state = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<Boolean> manualPaymentRequired = Optional.empty();
 
        private Optional<? extends List<FipsCodes>> fipsCodes = Optional.empty();
 
        private Optional<? extends List<RequiredAttributes>> requiredAttributes = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Two letter state abbreviation
         */
        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        /**
         * Two letter state abbreviation
         */
        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        /**
         * Name of state child support agency
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * Name of state child support agency
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        /**
         * Specifies if remitting payment to the agency is required outside of Gusto. If true, Gusto includes garnishment amounts for this agency in payroll calculation, but does not debit for or remit payment to the agency automatically. As of September 2024, only garnishments for South Carolina Integrated Child Support Services require manual payment.
         */
        public Builder manualPaymentRequired(boolean manualPaymentRequired) {
            Utils.checkNotNull(manualPaymentRequired, "manualPaymentRequired");
            this.manualPaymentRequired = Optional.ofNullable(manualPaymentRequired);
            return this;
        }

        /**
         * Specifies if remitting payment to the agency is required outside of Gusto. If true, Gusto includes garnishment amounts for this agency in payroll calculation, but does not debit for or remit payment to the agency automatically. As of September 2024, only garnishments for South Carolina Integrated Child Support Services require manual payment.
         */
        public Builder manualPaymentRequired(Optional<Boolean> manualPaymentRequired) {
            Utils.checkNotNull(manualPaymentRequired, "manualPaymentRequired");
            this.manualPaymentRequired = manualPaymentRequired;
            return this;
        }

        /**
         * FIPS codes for state or county child support orders
         */
        public Builder fipsCodes(List<FipsCodes> fipsCodes) {
            Utils.checkNotNull(fipsCodes, "fipsCodes");
            this.fipsCodes = Optional.ofNullable(fipsCodes);
            return this;
        }

        /**
         * FIPS codes for state or county child support orders
         */
        public Builder fipsCodes(Optional<? extends List<FipsCodes>> fipsCodes) {
            Utils.checkNotNull(fipsCodes, "fipsCodes");
            this.fipsCodes = fipsCodes;
            return this;
        }

        /**
         * Describes which child support case identifying attributes are required for this agency. While most agencies only require a single identifier, some (e.g. OH) require multiple identifiers.
         */
        public Builder requiredAttributes(List<RequiredAttributes> requiredAttributes) {
            Utils.checkNotNull(requiredAttributes, "requiredAttributes");
            this.requiredAttributes = Optional.ofNullable(requiredAttributes);
            return this;
        }

        /**
         * Describes which child support case identifying attributes are required for this agency. While most agencies only require a single identifier, some (e.g. OH) require multiple identifiers.
         */
        public Builder requiredAttributes(Optional<? extends List<RequiredAttributes>> requiredAttributes) {
            Utils.checkNotNull(requiredAttributes, "requiredAttributes");
            this.requiredAttributes = requiredAttributes;
            return this;
        }
        
        public Agencies build() {
            return new Agencies(
                state,
                name,
                manualPaymentRequired,
                fipsCodes,
                requiredAttributes);
        }
    }
}

