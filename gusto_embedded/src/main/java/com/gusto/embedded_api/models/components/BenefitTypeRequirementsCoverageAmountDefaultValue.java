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

public class BenefitTypeRequirementsCoverageAmountDefaultValue {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<String> value;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonCreator
    public BenefitTypeRequirementsCoverageAmountDefaultValue(
            @JsonProperty("value") Optional<String> value,
            @JsonProperty("type") Optional<String> type) {
        Utils.checkNotNull(value, "value");
        Utils.checkNotNull(type, "type");
        this.value = value;
        this.type = type;
    }
    
    public BenefitTypeRequirementsCoverageAmountDefaultValue() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> value() {
        return value;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BenefitTypeRequirementsCoverageAmountDefaultValue withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    public BenefitTypeRequirementsCoverageAmountDefaultValue withValue(Optional<String> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
        return this;
    }

    public BenefitTypeRequirementsCoverageAmountDefaultValue withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public BenefitTypeRequirementsCoverageAmountDefaultValue withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
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
        BenefitTypeRequirementsCoverageAmountDefaultValue other = (BenefitTypeRequirementsCoverageAmountDefaultValue) o;
        return 
            Objects.deepEquals(this.value, other.value) &&
            Objects.deepEquals(this.type, other.type);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            value,
            type);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BenefitTypeRequirementsCoverageAmountDefaultValue.class,
                "value", value,
                "type", type);
    }
    
    public final static class Builder {
 
        private Optional<String> value = Optional.empty();
 
        private Optional<String> type = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        public Builder value(Optional<String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }
        
        public BenefitTypeRequirementsCoverageAmountDefaultValue build() {
            return new BenefitTypeRequirementsCoverageAmountDefaultValue(
                value,
                type);
        }
    }
}

