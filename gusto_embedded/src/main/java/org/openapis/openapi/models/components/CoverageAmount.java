/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;

/**
 * CoverageAmount - The amount that the employee is insured for. Note: company contribution cannot be present if coverage amount is set.
 */

public class CoverageAmount {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<Boolean> required;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("editable")
    private Optional<Boolean> editable;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_value")
    private Optional<? extends BenefitTypeRequirementsCoverageAmountDefaultValue> defaultValue;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("choices")
    private Optional<? extends List<String>> choices;

    @JsonCreator
    public CoverageAmount(
            @JsonProperty("required") Optional<Boolean> required,
            @JsonProperty("editable") Optional<Boolean> editable,
            @JsonProperty("default_value") Optional<? extends BenefitTypeRequirementsCoverageAmountDefaultValue> defaultValue,
            @JsonProperty("choices") Optional<? extends List<String>> choices) {
        Utils.checkNotNull(required, "required");
        Utils.checkNotNull(editable, "editable");
        Utils.checkNotNull(defaultValue, "defaultValue");
        Utils.checkNotNull(choices, "choices");
        this.required = required;
        this.editable = editable;
        this.defaultValue = defaultValue;
        this.choices = choices;
    }
    
    public CoverageAmount() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Boolean> required() {
        return required;
    }

    @JsonIgnore
    public Optional<Boolean> editable() {
        return editable;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<BenefitTypeRequirementsCoverageAmountDefaultValue> defaultValue() {
        return (Optional<BenefitTypeRequirementsCoverageAmountDefaultValue>) defaultValue;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> choices() {
        return (Optional<List<String>>) choices;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CoverageAmount withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }

    public CoverageAmount withRequired(Optional<Boolean> required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
        return this;
    }

    public CoverageAmount withEditable(boolean editable) {
        Utils.checkNotNull(editable, "editable");
        this.editable = Optional.ofNullable(editable);
        return this;
    }

    public CoverageAmount withEditable(Optional<Boolean> editable) {
        Utils.checkNotNull(editable, "editable");
        this.editable = editable;
        return this;
    }

    public CoverageAmount withDefaultValue(BenefitTypeRequirementsCoverageAmountDefaultValue defaultValue) {
        Utils.checkNotNull(defaultValue, "defaultValue");
        this.defaultValue = Optional.ofNullable(defaultValue);
        return this;
    }

    public CoverageAmount withDefaultValue(Optional<? extends BenefitTypeRequirementsCoverageAmountDefaultValue> defaultValue) {
        Utils.checkNotNull(defaultValue, "defaultValue");
        this.defaultValue = defaultValue;
        return this;
    }

    public CoverageAmount withChoices(List<String> choices) {
        Utils.checkNotNull(choices, "choices");
        this.choices = Optional.ofNullable(choices);
        return this;
    }

    public CoverageAmount withChoices(Optional<? extends List<String>> choices) {
        Utils.checkNotNull(choices, "choices");
        this.choices = choices;
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
        CoverageAmount other = (CoverageAmount) o;
        return 
            Objects.deepEquals(this.required, other.required) &&
            Objects.deepEquals(this.editable, other.editable) &&
            Objects.deepEquals(this.defaultValue, other.defaultValue) &&
            Objects.deepEquals(this.choices, other.choices);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            required,
            editable,
            defaultValue,
            choices);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CoverageAmount.class,
                "required", required,
                "editable", editable,
                "defaultValue", defaultValue,
                "choices", choices);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> required = Optional.empty();
 
        private Optional<Boolean> editable = Optional.empty();
 
        private Optional<? extends BenefitTypeRequirementsCoverageAmountDefaultValue> defaultValue = Optional.empty();
 
        private Optional<? extends List<String>> choices = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder required(boolean required) {
            Utils.checkNotNull(required, "required");
            this.required = Optional.ofNullable(required);
            return this;
        }

        public Builder required(Optional<Boolean> required) {
            Utils.checkNotNull(required, "required");
            this.required = required;
            return this;
        }

        public Builder editable(boolean editable) {
            Utils.checkNotNull(editable, "editable");
            this.editable = Optional.ofNullable(editable);
            return this;
        }

        public Builder editable(Optional<Boolean> editable) {
            Utils.checkNotNull(editable, "editable");
            this.editable = editable;
            return this;
        }

        public Builder defaultValue(BenefitTypeRequirementsCoverageAmountDefaultValue defaultValue) {
            Utils.checkNotNull(defaultValue, "defaultValue");
            this.defaultValue = Optional.ofNullable(defaultValue);
            return this;
        }

        public Builder defaultValue(Optional<? extends BenefitTypeRequirementsCoverageAmountDefaultValue> defaultValue) {
            Utils.checkNotNull(defaultValue, "defaultValue");
            this.defaultValue = defaultValue;
            return this;
        }

        public Builder choices(List<String> choices) {
            Utils.checkNotNull(choices, "choices");
            this.choices = Optional.ofNullable(choices);
            return this;
        }

        public Builder choices(Optional<? extends List<String>> choices) {
            Utils.checkNotNull(choices, "choices");
            this.choices = choices;
            return this;
        }
        
        public CoverageAmount build() {
            return new CoverageAmount(
                required,
                editable,
                defaultValue,
                choices);
        }
    }
}

