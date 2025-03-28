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
/**
 * LimitOption
 * 
 * <p>Some benefits require additional information to determine their limit. For example, for an HSA benefit, the limit option should be either 'Family' or 'Individual'. For a Dependent Care FSA benefit, the limit option should be either 'Joint Filing or Single' or 'Married and Filing Separately'.
 */

public class LimitOption {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("required")
    private Optional<Boolean> required;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("editable")
    private Optional<Boolean> editable;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("default_value")
    private Optional<? extends BenefitTypeRequirementsLimitOptionDefaultValue> defaultValue;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("choices")
    private Optional<? extends List<String>> choices;

    @JsonCreator
    public LimitOption(
            @JsonProperty("required") Optional<Boolean> required,
            @JsonProperty("editable") Optional<Boolean> editable,
            @JsonProperty("default_value") Optional<? extends BenefitTypeRequirementsLimitOptionDefaultValue> defaultValue,
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
    
    public LimitOption() {
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
    public Optional<BenefitTypeRequirementsLimitOptionDefaultValue> defaultValue() {
        return (Optional<BenefitTypeRequirementsLimitOptionDefaultValue>) defaultValue;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> choices() {
        return (Optional<List<String>>) choices;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public LimitOption withRequired(boolean required) {
        Utils.checkNotNull(required, "required");
        this.required = Optional.ofNullable(required);
        return this;
    }

    public LimitOption withRequired(Optional<Boolean> required) {
        Utils.checkNotNull(required, "required");
        this.required = required;
        return this;
    }

    public LimitOption withEditable(boolean editable) {
        Utils.checkNotNull(editable, "editable");
        this.editable = Optional.ofNullable(editable);
        return this;
    }

    public LimitOption withEditable(Optional<Boolean> editable) {
        Utils.checkNotNull(editable, "editable");
        this.editable = editable;
        return this;
    }

    public LimitOption withDefaultValue(BenefitTypeRequirementsLimitOptionDefaultValue defaultValue) {
        Utils.checkNotNull(defaultValue, "defaultValue");
        this.defaultValue = Optional.ofNullable(defaultValue);
        return this;
    }

    public LimitOption withDefaultValue(Optional<? extends BenefitTypeRequirementsLimitOptionDefaultValue> defaultValue) {
        Utils.checkNotNull(defaultValue, "defaultValue");
        this.defaultValue = defaultValue;
        return this;
    }

    public LimitOption withChoices(List<String> choices) {
        Utils.checkNotNull(choices, "choices");
        this.choices = Optional.ofNullable(choices);
        return this;
    }

    public LimitOption withChoices(Optional<? extends List<String>> choices) {
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
        LimitOption other = (LimitOption) o;
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
        return Utils.toString(LimitOption.class,
                "required", required,
                "editable", editable,
                "defaultValue", defaultValue,
                "choices", choices);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> required = Optional.empty();
 
        private Optional<Boolean> editable = Optional.empty();
 
        private Optional<? extends BenefitTypeRequirementsLimitOptionDefaultValue> defaultValue = Optional.empty();
 
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

        public Builder defaultValue(BenefitTypeRequirementsLimitOptionDefaultValue defaultValue) {
            Utils.checkNotNull(defaultValue, "defaultValue");
            this.defaultValue = Optional.ofNullable(defaultValue);
            return this;
        }

        public Builder defaultValue(Optional<? extends BenefitTypeRequirementsLimitOptionDefaultValue> defaultValue) {
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
        
        public LimitOption build() {
            return new LimitOption(
                required,
                editable,
                defaultValue,
                choices);
        }
    }
}

