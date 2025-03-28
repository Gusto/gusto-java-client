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
import org.openapitools.jackson.nullable.JsonNullable;

public class TaxRequirementMetadata {

    /**
     * Describes the type of requirement - each type may have additional metadata properties to describe possible values, formats, etc.
     * 
     * <p>- `text`: free-text input, no additional requirements
     * - `currency`: a value representing a dollar amount, e.g. `374.55` representing `$374.55`
     * - `radio`: choose one of options provided, see `options`
     * - `select`: choose one of options provided, see `options`
     * - `percent`: A decimal value representing a percentage, e.g. `0.034` representing `3.4%`
     * - `account_number`: An account number for a tax agency, more information provided by `mask` and `prefix`
     * - `tax_rate`: A decimal value representing a tax rate, e.g. `0.034` representing a tax rate of `3.4%`, see `validation` for additional validation guidance
     * - `workers_compensation_rate`: A decimal value representing a percentage, see `risk_class_code`, `risk_class_description`, and `rate_type`
     */
    @JsonProperty("type")
    private TaxRequirementMetadataType type;

    /**
     * [for `select` or `radio`] An array of objects describing the possible values.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("options")
    private Optional<? extends List<TaxRequirementMetadataOptions>> options;

    /**
     * [for `workers_compensation_rate`] The industry risk class code for the rate being requested
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("risk_class_code")
    private Optional<String> riskClassCode;

    /**
     * [for `workers_compensation_rate`] A description of the industry risk class for the rate being requested
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("risk_class_description")
    private Optional<String> riskClassDescription;

    /**
     * [for `workers_compensation_rate`] The type of rate being collected. Either:
     *  - `percent`: A percentage formatted as a decimal, e.g. `0.01` for 1%
     *  - `currency_per_hour`: A dollar amount per hour, e.g. `3.24` for $3.24/hr
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rate_type")
    private Optional<? extends RateType> rateType;

    /**
     * [for `account_number`] A pattern describing the format of the account number
     * 
     * <p>The mask is a sequence of characters representing the requirements of the actual account number. Each character in the mask represents a single character in the account number as follows:
     * - `#`: a digit (`\d`)
     * - `@`: a upper or lower case letter (`[a-zA-Z]`)
     * - `^`: an uppercase letter (`[A-Z]`)
     * - `%`: a digit or uppercase letter (`[0-9A-Z]`)
     * - any other character represents the literal character
     * 
     * <p>Examples:
     * - mask: `WHT-######` represents `WHT-` followed by 5 digits, e.g. `WHT-33421`
     * - mask: `%####-^^` supports values of `75544-AB` and `Z7654-HK`
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mask")
    private JsonNullable<String> mask;

    /**
     * [for `account_number`] A value that precedes the value to be collected - useful for display, but should not be submitted as part of the value. E.g. some tax agencies use an account number that is a company's federal ein plus two digits. In that case the mask would be `##` and the prefix `XXXXX1234`.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefix")
    private JsonNullable<String> prefix;

    /**
     * [for `tax_rate`] Describes the validation required for the tax rate
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("validation")
    private Optional<? extends Validation> validation;

    @JsonCreator
    public TaxRequirementMetadata(
            @JsonProperty("type") TaxRequirementMetadataType type,
            @JsonProperty("options") Optional<? extends List<TaxRequirementMetadataOptions>> options,
            @JsonProperty("risk_class_code") Optional<String> riskClassCode,
            @JsonProperty("risk_class_description") Optional<String> riskClassDescription,
            @JsonProperty("rate_type") Optional<? extends RateType> rateType,
            @JsonProperty("mask") JsonNullable<String> mask,
            @JsonProperty("prefix") JsonNullable<String> prefix,
            @JsonProperty("validation") Optional<? extends Validation> validation) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(options, "options");
        Utils.checkNotNull(riskClassCode, "riskClassCode");
        Utils.checkNotNull(riskClassDescription, "riskClassDescription");
        Utils.checkNotNull(rateType, "rateType");
        Utils.checkNotNull(mask, "mask");
        Utils.checkNotNull(prefix, "prefix");
        Utils.checkNotNull(validation, "validation");
        this.type = type;
        this.options = options;
        this.riskClassCode = riskClassCode;
        this.riskClassDescription = riskClassDescription;
        this.rateType = rateType;
        this.mask = mask;
        this.prefix = prefix;
        this.validation = validation;
    }
    
    public TaxRequirementMetadata(
            TaxRequirementMetadataType type) {
        this(type, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * Describes the type of requirement - each type may have additional metadata properties to describe possible values, formats, etc.
     * 
     * <p>- `text`: free-text input, no additional requirements
     * - `currency`: a value representing a dollar amount, e.g. `374.55` representing `$374.55`
     * - `radio`: choose one of options provided, see `options`
     * - `select`: choose one of options provided, see `options`
     * - `percent`: A decimal value representing a percentage, e.g. `0.034` representing `3.4%`
     * - `account_number`: An account number for a tax agency, more information provided by `mask` and `prefix`
     * - `tax_rate`: A decimal value representing a tax rate, e.g. `0.034` representing a tax rate of `3.4%`, see `validation` for additional validation guidance
     * - `workers_compensation_rate`: A decimal value representing a percentage, see `risk_class_code`, `risk_class_description`, and `rate_type`
     */
    @JsonIgnore
    public TaxRequirementMetadataType type() {
        return type;
    }

    /**
     * [for `select` or `radio`] An array of objects describing the possible values.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<TaxRequirementMetadataOptions>> options() {
        return (Optional<List<TaxRequirementMetadataOptions>>) options;
    }

    /**
     * [for `workers_compensation_rate`] The industry risk class code for the rate being requested
     */
    @JsonIgnore
    public Optional<String> riskClassCode() {
        return riskClassCode;
    }

    /**
     * [for `workers_compensation_rate`] A description of the industry risk class for the rate being requested
     */
    @JsonIgnore
    public Optional<String> riskClassDescription() {
        return riskClassDescription;
    }

    /**
     * [for `workers_compensation_rate`] The type of rate being collected. Either:
     *  - `percent`: A percentage formatted as a decimal, e.g. `0.01` for 1%
     *  - `currency_per_hour`: A dollar amount per hour, e.g. `3.24` for $3.24/hr
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<RateType> rateType() {
        return (Optional<RateType>) rateType;
    }

    /**
     * [for `account_number`] A pattern describing the format of the account number
     * 
     * <p>The mask is a sequence of characters representing the requirements of the actual account number. Each character in the mask represents a single character in the account number as follows:
     * - `#`: a digit (`\d`)
     * - `@`: a upper or lower case letter (`[a-zA-Z]`)
     * - `^`: an uppercase letter (`[A-Z]`)
     * - `%`: a digit or uppercase letter (`[0-9A-Z]`)
     * - any other character represents the literal character
     * 
     * <p>Examples:
     * - mask: `WHT-######` represents `WHT-` followed by 5 digits, e.g. `WHT-33421`
     * - mask: `%####-^^` supports values of `75544-AB` and `Z7654-HK`
     */
    @JsonIgnore
    public JsonNullable<String> mask() {
        return mask;
    }

    /**
     * [for `account_number`] A value that precedes the value to be collected - useful for display, but should not be submitted as part of the value. E.g. some tax agencies use an account number that is a company's federal ein plus two digits. In that case the mask would be `##` and the prefix `XXXXX1234`.
     */
    @JsonIgnore
    public JsonNullable<String> prefix() {
        return prefix;
    }

    /**
     * [for `tax_rate`] Describes the validation required for the tax rate
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Validation> validation() {
        return (Optional<Validation>) validation;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Describes the type of requirement - each type may have additional metadata properties to describe possible values, formats, etc.
     * 
     * <p>- `text`: free-text input, no additional requirements
     * - `currency`: a value representing a dollar amount, e.g. `374.55` representing `$374.55`
     * - `radio`: choose one of options provided, see `options`
     * - `select`: choose one of options provided, see `options`
     * - `percent`: A decimal value representing a percentage, e.g. `0.034` representing `3.4%`
     * - `account_number`: An account number for a tax agency, more information provided by `mask` and `prefix`
     * - `tax_rate`: A decimal value representing a tax rate, e.g. `0.034` representing a tax rate of `3.4%`, see `validation` for additional validation guidance
     * - `workers_compensation_rate`: A decimal value representing a percentage, see `risk_class_code`, `risk_class_description`, and `rate_type`
     */
    public TaxRequirementMetadata withType(TaxRequirementMetadataType type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    /**
     * [for `select` or `radio`] An array of objects describing the possible values.
     */
    public TaxRequirementMetadata withOptions(List<TaxRequirementMetadataOptions> options) {
        Utils.checkNotNull(options, "options");
        this.options = Optional.ofNullable(options);
        return this;
    }

    /**
     * [for `select` or `radio`] An array of objects describing the possible values.
     */
    public TaxRequirementMetadata withOptions(Optional<? extends List<TaxRequirementMetadataOptions>> options) {
        Utils.checkNotNull(options, "options");
        this.options = options;
        return this;
    }

    /**
     * [for `workers_compensation_rate`] The industry risk class code for the rate being requested
     */
    public TaxRequirementMetadata withRiskClassCode(String riskClassCode) {
        Utils.checkNotNull(riskClassCode, "riskClassCode");
        this.riskClassCode = Optional.ofNullable(riskClassCode);
        return this;
    }

    /**
     * [for `workers_compensation_rate`] The industry risk class code for the rate being requested
     */
    public TaxRequirementMetadata withRiskClassCode(Optional<String> riskClassCode) {
        Utils.checkNotNull(riskClassCode, "riskClassCode");
        this.riskClassCode = riskClassCode;
        return this;
    }

    /**
     * [for `workers_compensation_rate`] A description of the industry risk class for the rate being requested
     */
    public TaxRequirementMetadata withRiskClassDescription(String riskClassDescription) {
        Utils.checkNotNull(riskClassDescription, "riskClassDescription");
        this.riskClassDescription = Optional.ofNullable(riskClassDescription);
        return this;
    }

    /**
     * [for `workers_compensation_rate`] A description of the industry risk class for the rate being requested
     */
    public TaxRequirementMetadata withRiskClassDescription(Optional<String> riskClassDescription) {
        Utils.checkNotNull(riskClassDescription, "riskClassDescription");
        this.riskClassDescription = riskClassDescription;
        return this;
    }

    /**
     * [for `workers_compensation_rate`] The type of rate being collected. Either:
     *  - `percent`: A percentage formatted as a decimal, e.g. `0.01` for 1%
     *  - `currency_per_hour`: A dollar amount per hour, e.g. `3.24` for $3.24/hr
     */
    public TaxRequirementMetadata withRateType(RateType rateType) {
        Utils.checkNotNull(rateType, "rateType");
        this.rateType = Optional.ofNullable(rateType);
        return this;
    }

    /**
     * [for `workers_compensation_rate`] The type of rate being collected. Either:
     *  - `percent`: A percentage formatted as a decimal, e.g. `0.01` for 1%
     *  - `currency_per_hour`: A dollar amount per hour, e.g. `3.24` for $3.24/hr
     */
    public TaxRequirementMetadata withRateType(Optional<? extends RateType> rateType) {
        Utils.checkNotNull(rateType, "rateType");
        this.rateType = rateType;
        return this;
    }

    /**
     * [for `account_number`] A pattern describing the format of the account number
     * 
     * <p>The mask is a sequence of characters representing the requirements of the actual account number. Each character in the mask represents a single character in the account number as follows:
     * - `#`: a digit (`\d`)
     * - `@`: a upper or lower case letter (`[a-zA-Z]`)
     * - `^`: an uppercase letter (`[A-Z]`)
     * - `%`: a digit or uppercase letter (`[0-9A-Z]`)
     * - any other character represents the literal character
     * 
     * <p>Examples:
     * - mask: `WHT-######` represents `WHT-` followed by 5 digits, e.g. `WHT-33421`
     * - mask: `%####-^^` supports values of `75544-AB` and `Z7654-HK`
     */
    public TaxRequirementMetadata withMask(String mask) {
        Utils.checkNotNull(mask, "mask");
        this.mask = JsonNullable.of(mask);
        return this;
    }

    /**
     * [for `account_number`] A pattern describing the format of the account number
     * 
     * <p>The mask is a sequence of characters representing the requirements of the actual account number. Each character in the mask represents a single character in the account number as follows:
     * - `#`: a digit (`\d`)
     * - `@`: a upper or lower case letter (`[a-zA-Z]`)
     * - `^`: an uppercase letter (`[A-Z]`)
     * - `%`: a digit or uppercase letter (`[0-9A-Z]`)
     * - any other character represents the literal character
     * 
     * <p>Examples:
     * - mask: `WHT-######` represents `WHT-` followed by 5 digits, e.g. `WHT-33421`
     * - mask: `%####-^^` supports values of `75544-AB` and `Z7654-HK`
     */
    public TaxRequirementMetadata withMask(JsonNullable<String> mask) {
        Utils.checkNotNull(mask, "mask");
        this.mask = mask;
        return this;
    }

    /**
     * [for `account_number`] A value that precedes the value to be collected - useful for display, but should not be submitted as part of the value. E.g. some tax agencies use an account number that is a company's federal ein plus two digits. In that case the mask would be `##` and the prefix `XXXXX1234`.
     */
    public TaxRequirementMetadata withPrefix(String prefix) {
        Utils.checkNotNull(prefix, "prefix");
        this.prefix = JsonNullable.of(prefix);
        return this;
    }

    /**
     * [for `account_number`] A value that precedes the value to be collected - useful for display, but should not be submitted as part of the value. E.g. some tax agencies use an account number that is a company's federal ein plus two digits. In that case the mask would be `##` and the prefix `XXXXX1234`.
     */
    public TaxRequirementMetadata withPrefix(JsonNullable<String> prefix) {
        Utils.checkNotNull(prefix, "prefix");
        this.prefix = prefix;
        return this;
    }

    /**
     * [for `tax_rate`] Describes the validation required for the tax rate
     */
    public TaxRequirementMetadata withValidation(Validation validation) {
        Utils.checkNotNull(validation, "validation");
        this.validation = Optional.ofNullable(validation);
        return this;
    }

    /**
     * [for `tax_rate`] Describes the validation required for the tax rate
     */
    public TaxRequirementMetadata withValidation(Optional<? extends Validation> validation) {
        Utils.checkNotNull(validation, "validation");
        this.validation = validation;
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
        TaxRequirementMetadata other = (TaxRequirementMetadata) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.options, other.options) &&
            Objects.deepEquals(this.riskClassCode, other.riskClassCode) &&
            Objects.deepEquals(this.riskClassDescription, other.riskClassDescription) &&
            Objects.deepEquals(this.rateType, other.rateType) &&
            Objects.deepEquals(this.mask, other.mask) &&
            Objects.deepEquals(this.prefix, other.prefix) &&
            Objects.deepEquals(this.validation, other.validation);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            options,
            riskClassCode,
            riskClassDescription,
            rateType,
            mask,
            prefix,
            validation);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxRequirementMetadata.class,
                "type", type,
                "options", options,
                "riskClassCode", riskClassCode,
                "riskClassDescription", riskClassDescription,
                "rateType", rateType,
                "mask", mask,
                "prefix", prefix,
                "validation", validation);
    }
    
    public final static class Builder {
 
        private TaxRequirementMetadataType type;
 
        private Optional<? extends List<TaxRequirementMetadataOptions>> options = Optional.empty();
 
        private Optional<String> riskClassCode = Optional.empty();
 
        private Optional<String> riskClassDescription = Optional.empty();
 
        private Optional<? extends RateType> rateType = Optional.empty();
 
        private JsonNullable<String> mask = JsonNullable.undefined();
 
        private JsonNullable<String> prefix = JsonNullable.undefined();
 
        private Optional<? extends Validation> validation = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Describes the type of requirement - each type may have additional metadata properties to describe possible values, formats, etc.
         * 
         * <p>- `text`: free-text input, no additional requirements
         * - `currency`: a value representing a dollar amount, e.g. `374.55` representing `$374.55`
         * - `radio`: choose one of options provided, see `options`
         * - `select`: choose one of options provided, see `options`
         * - `percent`: A decimal value representing a percentage, e.g. `0.034` representing `3.4%`
         * - `account_number`: An account number for a tax agency, more information provided by `mask` and `prefix`
         * - `tax_rate`: A decimal value representing a tax rate, e.g. `0.034` representing a tax rate of `3.4%`, see `validation` for additional validation guidance
         * - `workers_compensation_rate`: A decimal value representing a percentage, see `risk_class_code`, `risk_class_description`, and `rate_type`
         */
        public Builder type(TaxRequirementMetadataType type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        /**
         * [for `select` or `radio`] An array of objects describing the possible values.
         */
        public Builder options(List<TaxRequirementMetadataOptions> options) {
            Utils.checkNotNull(options, "options");
            this.options = Optional.ofNullable(options);
            return this;
        }

        /**
         * [for `select` or `radio`] An array of objects describing the possible values.
         */
        public Builder options(Optional<? extends List<TaxRequirementMetadataOptions>> options) {
            Utils.checkNotNull(options, "options");
            this.options = options;
            return this;
        }

        /**
         * [for `workers_compensation_rate`] The industry risk class code for the rate being requested
         */
        public Builder riskClassCode(String riskClassCode) {
            Utils.checkNotNull(riskClassCode, "riskClassCode");
            this.riskClassCode = Optional.ofNullable(riskClassCode);
            return this;
        }

        /**
         * [for `workers_compensation_rate`] The industry risk class code for the rate being requested
         */
        public Builder riskClassCode(Optional<String> riskClassCode) {
            Utils.checkNotNull(riskClassCode, "riskClassCode");
            this.riskClassCode = riskClassCode;
            return this;
        }

        /**
         * [for `workers_compensation_rate`] A description of the industry risk class for the rate being requested
         */
        public Builder riskClassDescription(String riskClassDescription) {
            Utils.checkNotNull(riskClassDescription, "riskClassDescription");
            this.riskClassDescription = Optional.ofNullable(riskClassDescription);
            return this;
        }

        /**
         * [for `workers_compensation_rate`] A description of the industry risk class for the rate being requested
         */
        public Builder riskClassDescription(Optional<String> riskClassDescription) {
            Utils.checkNotNull(riskClassDescription, "riskClassDescription");
            this.riskClassDescription = riskClassDescription;
            return this;
        }

        /**
         * [for `workers_compensation_rate`] The type of rate being collected. Either:
         *  - `percent`: A percentage formatted as a decimal, e.g. `0.01` for 1%
         *  - `currency_per_hour`: A dollar amount per hour, e.g. `3.24` for $3.24/hr
         */
        public Builder rateType(RateType rateType) {
            Utils.checkNotNull(rateType, "rateType");
            this.rateType = Optional.ofNullable(rateType);
            return this;
        }

        /**
         * [for `workers_compensation_rate`] The type of rate being collected. Either:
         *  - `percent`: A percentage formatted as a decimal, e.g. `0.01` for 1%
         *  - `currency_per_hour`: A dollar amount per hour, e.g. `3.24` for $3.24/hr
         */
        public Builder rateType(Optional<? extends RateType> rateType) {
            Utils.checkNotNull(rateType, "rateType");
            this.rateType = rateType;
            return this;
        }

        /**
         * [for `account_number`] A pattern describing the format of the account number
         * 
         * <p>The mask is a sequence of characters representing the requirements of the actual account number. Each character in the mask represents a single character in the account number as follows:
         * - `#`: a digit (`\d`)
         * - `@`: a upper or lower case letter (`[a-zA-Z]`)
         * - `^`: an uppercase letter (`[A-Z]`)
         * - `%`: a digit or uppercase letter (`[0-9A-Z]`)
         * - any other character represents the literal character
         * 
         * <p>Examples:
         * - mask: `WHT-######` represents `WHT-` followed by 5 digits, e.g. `WHT-33421`
         * - mask: `%####-^^` supports values of `75544-AB` and `Z7654-HK`
         */
        public Builder mask(String mask) {
            Utils.checkNotNull(mask, "mask");
            this.mask = JsonNullable.of(mask);
            return this;
        }

        /**
         * [for `account_number`] A pattern describing the format of the account number
         * 
         * <p>The mask is a sequence of characters representing the requirements of the actual account number. Each character in the mask represents a single character in the account number as follows:
         * - `#`: a digit (`\d`)
         * - `@`: a upper or lower case letter (`[a-zA-Z]`)
         * - `^`: an uppercase letter (`[A-Z]`)
         * - `%`: a digit or uppercase letter (`[0-9A-Z]`)
         * - any other character represents the literal character
         * 
         * <p>Examples:
         * - mask: `WHT-######` represents `WHT-` followed by 5 digits, e.g. `WHT-33421`
         * - mask: `%####-^^` supports values of `75544-AB` and `Z7654-HK`
         */
        public Builder mask(JsonNullable<String> mask) {
            Utils.checkNotNull(mask, "mask");
            this.mask = mask;
            return this;
        }

        /**
         * [for `account_number`] A value that precedes the value to be collected - useful for display, but should not be submitted as part of the value. E.g. some tax agencies use an account number that is a company's federal ein plus two digits. In that case the mask would be `##` and the prefix `XXXXX1234`.
         */
        public Builder prefix(String prefix) {
            Utils.checkNotNull(prefix, "prefix");
            this.prefix = JsonNullable.of(prefix);
            return this;
        }

        /**
         * [for `account_number`] A value that precedes the value to be collected - useful for display, but should not be submitted as part of the value. E.g. some tax agencies use an account number that is a company's federal ein plus two digits. In that case the mask would be `##` and the prefix `XXXXX1234`.
         */
        public Builder prefix(JsonNullable<String> prefix) {
            Utils.checkNotNull(prefix, "prefix");
            this.prefix = prefix;
            return this;
        }

        /**
         * [for `tax_rate`] Describes the validation required for the tax rate
         */
        public Builder validation(Validation validation) {
            Utils.checkNotNull(validation, "validation");
            this.validation = Optional.ofNullable(validation);
            return this;
        }

        /**
         * [for `tax_rate`] Describes the validation required for the tax rate
         */
        public Builder validation(Optional<? extends Validation> validation) {
            Utils.checkNotNull(validation, "validation");
            this.validation = validation;
            return this;
        }
        
        public TaxRequirementMetadata build() {
            return new TaxRequirementMetadata(
                type,
                options,
                riskClassCode,
                riskClassDescription,
                rateType,
                mask,
                prefix,
                validation);
        }
    }
}

