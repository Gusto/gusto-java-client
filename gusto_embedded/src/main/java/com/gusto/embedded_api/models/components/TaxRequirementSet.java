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

public class TaxRequirementSet {

    /**
     * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<String> state;

    /**
     * An identifier for a set of requirements. A list of requirement sets can contain multiple sets with the same `key` and different `effective_from` values.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    /**
     * Customer facing label for the requirement set, e.g. "Registrations"
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("label")
    private Optional<String> label;

    /**
     * An ISO 8601 formatted date representing the date values became effective. Some requirement sets are effective dated, while others are not. Multiple requirement sets for the same state/key can/will exist with unique effective dates. If a requirement set is has an `effective_from` value, all requirement sets with the same key will also have an `effective_from` value.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_from")
    private JsonNullable<String> effectiveFrom;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requirements")
    private Optional<? extends List<TaxRequirement>> requirements;

    @JsonCreator
    public TaxRequirementSet(
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("label") Optional<String> label,
            @JsonProperty("effective_from") JsonNullable<String> effectiveFrom,
            @JsonProperty("requirements") Optional<? extends List<TaxRequirement>> requirements) {
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(label, "label");
        Utils.checkNotNull(effectiveFrom, "effectiveFrom");
        Utils.checkNotNull(requirements, "requirements");
        this.state = state;
        this.key = key;
        this.label = label;
        this.effectiveFrom = effectiveFrom;
        this.requirements = requirements;
    }
    
    public TaxRequirementSet() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
     */
    @JsonIgnore
    public Optional<String> state() {
        return state;
    }

    /**
     * An identifier for a set of requirements. A list of requirement sets can contain multiple sets with the same `key` and different `effective_from` values.
     */
    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    /**
     * Customer facing label for the requirement set, e.g. "Registrations"
     */
    @JsonIgnore
    public Optional<String> label() {
        return label;
    }

    /**
     * An ISO 8601 formatted date representing the date values became effective. Some requirement sets are effective dated, while others are not. Multiple requirement sets for the same state/key can/will exist with unique effective dates. If a requirement set is has an `effective_from` value, all requirement sets with the same key will also have an `effective_from` value.
     */
    @JsonIgnore
    public JsonNullable<String> effectiveFrom() {
        return effectiveFrom;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<TaxRequirement>> requirements() {
        return (Optional<List<TaxRequirement>>) requirements;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
     */
    public TaxRequirementSet withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
     */
    public TaxRequirementSet withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    /**
     * An identifier for a set of requirements. A list of requirement sets can contain multiple sets with the same `key` and different `effective_from` values.
     */
    public TaxRequirementSet withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    /**
     * An identifier for a set of requirements. A list of requirement sets can contain multiple sets with the same `key` and different `effective_from` values.
     */
    public TaxRequirementSet withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * Customer facing label for the requirement set, e.g. "Registrations"
     */
    public TaxRequirementSet withLabel(String label) {
        Utils.checkNotNull(label, "label");
        this.label = Optional.ofNullable(label);
        return this;
    }

    /**
     * Customer facing label for the requirement set, e.g. "Registrations"
     */
    public TaxRequirementSet withLabel(Optional<String> label) {
        Utils.checkNotNull(label, "label");
        this.label = label;
        return this;
    }

    /**
     * An ISO 8601 formatted date representing the date values became effective. Some requirement sets are effective dated, while others are not. Multiple requirement sets for the same state/key can/will exist with unique effective dates. If a requirement set is has an `effective_from` value, all requirement sets with the same key will also have an `effective_from` value.
     */
    public TaxRequirementSet withEffectiveFrom(String effectiveFrom) {
        Utils.checkNotNull(effectiveFrom, "effectiveFrom");
        this.effectiveFrom = JsonNullable.of(effectiveFrom);
        return this;
    }

    /**
     * An ISO 8601 formatted date representing the date values became effective. Some requirement sets are effective dated, while others are not. Multiple requirement sets for the same state/key can/will exist with unique effective dates. If a requirement set is has an `effective_from` value, all requirement sets with the same key will also have an `effective_from` value.
     */
    public TaxRequirementSet withEffectiveFrom(JsonNullable<String> effectiveFrom) {
        Utils.checkNotNull(effectiveFrom, "effectiveFrom");
        this.effectiveFrom = effectiveFrom;
        return this;
    }

    public TaxRequirementSet withRequirements(List<TaxRequirement> requirements) {
        Utils.checkNotNull(requirements, "requirements");
        this.requirements = Optional.ofNullable(requirements);
        return this;
    }

    public TaxRequirementSet withRequirements(Optional<? extends List<TaxRequirement>> requirements) {
        Utils.checkNotNull(requirements, "requirements");
        this.requirements = requirements;
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
        TaxRequirementSet other = (TaxRequirementSet) o;
        return 
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.label, other.label) &&
            Objects.deepEquals(this.effectiveFrom, other.effectiveFrom) &&
            Objects.deepEquals(this.requirements, other.requirements);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            state,
            key,
            label,
            effectiveFrom,
            requirements);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxRequirementSet.class,
                "state", state,
                "key", key,
                "label", label,
                "effectiveFrom", effectiveFrom,
                "requirements", requirements);
    }
    
    public final static class Builder {
 
        private Optional<String> state = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> label = Optional.empty();
 
        private JsonNullable<String> effectiveFrom = JsonNullable.undefined();
 
        private Optional<? extends List<TaxRequirement>> requirements = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
         */
        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        /**
         * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
         */
        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        /**
         * An identifier for a set of requirements. A list of requirement sets can contain multiple sets with the same `key` and different `effective_from` values.
         */
        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        /**
         * An identifier for a set of requirements. A list of requirement sets can contain multiple sets with the same `key` and different `effective_from` values.
         */
        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        /**
         * Customer facing label for the requirement set, e.g. "Registrations"
         */
        public Builder label(String label) {
            Utils.checkNotNull(label, "label");
            this.label = Optional.ofNullable(label);
            return this;
        }

        /**
         * Customer facing label for the requirement set, e.g. "Registrations"
         */
        public Builder label(Optional<String> label) {
            Utils.checkNotNull(label, "label");
            this.label = label;
            return this;
        }

        /**
         * An ISO 8601 formatted date representing the date values became effective. Some requirement sets are effective dated, while others are not. Multiple requirement sets for the same state/key can/will exist with unique effective dates. If a requirement set is has an `effective_from` value, all requirement sets with the same key will also have an `effective_from` value.
         */
        public Builder effectiveFrom(String effectiveFrom) {
            Utils.checkNotNull(effectiveFrom, "effectiveFrom");
            this.effectiveFrom = JsonNullable.of(effectiveFrom);
            return this;
        }

        /**
         * An ISO 8601 formatted date representing the date values became effective. Some requirement sets are effective dated, while others are not. Multiple requirement sets for the same state/key can/will exist with unique effective dates. If a requirement set is has an `effective_from` value, all requirement sets with the same key will also have an `effective_from` value.
         */
        public Builder effectiveFrom(JsonNullable<String> effectiveFrom) {
            Utils.checkNotNull(effectiveFrom, "effectiveFrom");
            this.effectiveFrom = effectiveFrom;
            return this;
        }

        public Builder requirements(List<TaxRequirement> requirements) {
            Utils.checkNotNull(requirements, "requirements");
            this.requirements = Optional.ofNullable(requirements);
            return this;
        }

        public Builder requirements(Optional<? extends List<TaxRequirement>> requirements) {
            Utils.checkNotNull(requirements, "requirements");
            this.requirements = requirements;
            return this;
        }
        
        public TaxRequirementSet build() {
            return new TaxRequirementSet(
                state,
                key,
                label,
                effectiveFrom,
                requirements);
        }
    }
}

