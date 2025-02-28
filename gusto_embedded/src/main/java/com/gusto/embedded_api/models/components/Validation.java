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
 * Validation - [for `tax_rate`] Describes the validation required for the tax rate
 */

public class Validation {

    /**
     * Describes the type of tax_rate validation rule
     */
    @JsonProperty("type")
    private TaxRequirementMetadataValidationType type;

    /**
     * [for `min_max`] The inclusive lower bound of the tax rate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("min")
    private Optional<String> min;

    /**
     * [for `min_max`] The inclusive upper bound of the tax rate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("max")
    private Optional<String> max;

    /**
     * [for `one_of`] The possible, unformatted tax rates for selection.
     * - e.g. ["0.0", "0.001"] representing 0% and 0.1%
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rates")
    private Optional<? extends List<String>> rates;

    @JsonCreator
    public Validation(
            @JsonProperty("type") TaxRequirementMetadataValidationType type,
            @JsonProperty("min") Optional<String> min,
            @JsonProperty("max") Optional<String> max,
            @JsonProperty("rates") Optional<? extends List<String>> rates) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(min, "min");
        Utils.checkNotNull(max, "max");
        Utils.checkNotNull(rates, "rates");
        this.type = type;
        this.min = min;
        this.max = max;
        this.rates = rates;
    }
    
    public Validation(
            TaxRequirementMetadataValidationType type) {
        this(type, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Describes the type of tax_rate validation rule
     */
    @JsonIgnore
    public TaxRequirementMetadataValidationType type() {
        return type;
    }

    /**
     * [for `min_max`] The inclusive lower bound of the tax rate
     */
    @JsonIgnore
    public Optional<String> min() {
        return min;
    }

    /**
     * [for `min_max`] The inclusive upper bound of the tax rate
     */
    @JsonIgnore
    public Optional<String> max() {
        return max;
    }

    /**
     * [for `one_of`] The possible, unformatted tax rates for selection.
     * - e.g. ["0.0", "0.001"] representing 0% and 0.1%
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> rates() {
        return (Optional<List<String>>) rates;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Describes the type of tax_rate validation rule
     */
    public Validation withType(TaxRequirementMetadataValidationType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * [for `min_max`] The inclusive lower bound of the tax rate
     */
    public Validation withMin(String min) {
        Utils.checkNotNull(min, "min");
        this.min = Optional.ofNullable(min);
        return this;
    }

    /**
     * [for `min_max`] The inclusive lower bound of the tax rate
     */
    public Validation withMin(Optional<String> min) {
        Utils.checkNotNull(min, "min");
        this.min = min;
        return this;
    }

    /**
     * [for `min_max`] The inclusive upper bound of the tax rate
     */
    public Validation withMax(String max) {
        Utils.checkNotNull(max, "max");
        this.max = Optional.ofNullable(max);
        return this;
    }

    /**
     * [for `min_max`] The inclusive upper bound of the tax rate
     */
    public Validation withMax(Optional<String> max) {
        Utils.checkNotNull(max, "max");
        this.max = max;
        return this;
    }

    /**
     * [for `one_of`] The possible, unformatted tax rates for selection.
     * - e.g. ["0.0", "0.001"] representing 0% and 0.1%
     * 
     */
    public Validation withRates(List<String> rates) {
        Utils.checkNotNull(rates, "rates");
        this.rates = Optional.ofNullable(rates);
        return this;
    }

    /**
     * [for `one_of`] The possible, unformatted tax rates for selection.
     * - e.g. ["0.0", "0.001"] representing 0% and 0.1%
     * 
     */
    public Validation withRates(Optional<? extends List<String>> rates) {
        Utils.checkNotNull(rates, "rates");
        this.rates = rates;
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
        Validation other = (Validation) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.min, other.min) &&
            Objects.deepEquals(this.max, other.max) &&
            Objects.deepEquals(this.rates, other.rates);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            min,
            max,
            rates);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Validation.class,
                "type", type,
                "min", min,
                "max", max,
                "rates", rates);
    }
    
    public final static class Builder {
 
        private TaxRequirementMetadataValidationType type;
 
        private Optional<String> min = Optional.empty();
 
        private Optional<String> max = Optional.empty();
 
        private Optional<? extends List<String>> rates = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Describes the type of tax_rate validation rule
         */
        public Builder type(TaxRequirementMetadataValidationType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * [for `min_max`] The inclusive lower bound of the tax rate
         */
        public Builder min(String min) {
            Utils.checkNotNull(min, "min");
            this.min = Optional.ofNullable(min);
            return this;
        }

        /**
         * [for `min_max`] The inclusive lower bound of the tax rate
         */
        public Builder min(Optional<String> min) {
            Utils.checkNotNull(min, "min");
            this.min = min;
            return this;
        }

        /**
         * [for `min_max`] The inclusive upper bound of the tax rate
         */
        public Builder max(String max) {
            Utils.checkNotNull(max, "max");
            this.max = Optional.ofNullable(max);
            return this;
        }

        /**
         * [for `min_max`] The inclusive upper bound of the tax rate
         */
        public Builder max(Optional<String> max) {
            Utils.checkNotNull(max, "max");
            this.max = max;
            return this;
        }

        /**
         * [for `one_of`] The possible, unformatted tax rates for selection.
         * - e.g. ["0.0", "0.001"] representing 0% and 0.1%
         * 
         */
        public Builder rates(List<String> rates) {
            Utils.checkNotNull(rates, "rates");
            this.rates = Optional.ofNullable(rates);
            return this;
        }

        /**
         * [for `one_of`] The possible, unformatted tax rates for selection.
         * - e.g. ["0.0", "0.001"] representing 0% and 0.1%
         * 
         */
        public Builder rates(Optional<? extends List<String>> rates) {
            Utils.checkNotNull(rates, "rates");
            this.rates = rates;
            return this;
        }
        
        public Validation build() {
            return new Validation(
                type,
                min,
                max,
                rates);
        }
    }
}

