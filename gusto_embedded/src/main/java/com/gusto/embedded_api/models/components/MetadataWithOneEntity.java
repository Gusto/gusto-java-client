/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
/**
 * MetadataWithOneEntity
 * 
 * <p>single entity
 */

public class MetadataWithOneEntity {

    /**
     * Name of the entity that the error corresponds to.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_type")
    private Optional<String> entityType;

    /**
     * Unique identifier for the entity.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("entity_uuid")
    private Optional<String> entityUuid;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("valid_from")
    private Optional<String> validFrom;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("valid_up_to")
    private Optional<String> validUpTo;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<String> state;

    @JsonIgnore
    private Map<String, Object> additionalProperties;

    @JsonCreator
    public MetadataWithOneEntity(
            @JsonProperty("entity_type") Optional<String> entityType,
            @JsonProperty("entity_uuid") Optional<String> entityUuid,
            @JsonProperty("valid_from") Optional<String> validFrom,
            @JsonProperty("valid_up_to") Optional<String> validUpTo,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("state") Optional<String> state) {
        Utils.checkNotNull(entityType, "entityType");
        Utils.checkNotNull(entityUuid, "entityUuid");
        Utils.checkNotNull(validFrom, "validFrom");
        Utils.checkNotNull(validUpTo, "validUpTo");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(state, "state");
        this.entityType = entityType;
        this.entityUuid = entityUuid;
        this.validFrom = validFrom;
        this.validUpTo = validUpTo;
        this.key = key;
        this.state = state;
        this.additionalProperties = new HashMap<>();
    }
    
    public MetadataWithOneEntity() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Name of the entity that the error corresponds to.
     */
    @JsonIgnore
    public Optional<String> entityType() {
        return entityType;
    }

    /**
     * Unique identifier for the entity.
     */
    @JsonIgnore
    public Optional<String> entityUuid() {
        return entityUuid;
    }

    @JsonIgnore
    public Optional<String> validFrom() {
        return validFrom;
    }

    @JsonIgnore
    public Optional<String> validUpTo() {
        return validUpTo;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> state() {
        return state;
    }

    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return additionalProperties;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Name of the entity that the error corresponds to.
     */
    public MetadataWithOneEntity withEntityType(String entityType) {
        Utils.checkNotNull(entityType, "entityType");
        this.entityType = Optional.ofNullable(entityType);
        return this;
    }

    /**
     * Name of the entity that the error corresponds to.
     */
    public MetadataWithOneEntity withEntityType(Optional<String> entityType) {
        Utils.checkNotNull(entityType, "entityType");
        this.entityType = entityType;
        return this;
    }

    /**
     * Unique identifier for the entity.
     */
    public MetadataWithOneEntity withEntityUuid(String entityUuid) {
        Utils.checkNotNull(entityUuid, "entityUuid");
        this.entityUuid = Optional.ofNullable(entityUuid);
        return this;
    }

    /**
     * Unique identifier for the entity.
     */
    public MetadataWithOneEntity withEntityUuid(Optional<String> entityUuid) {
        Utils.checkNotNull(entityUuid, "entityUuid");
        this.entityUuid = entityUuid;
        return this;
    }

    public MetadataWithOneEntity withValidFrom(String validFrom) {
        Utils.checkNotNull(validFrom, "validFrom");
        this.validFrom = Optional.ofNullable(validFrom);
        return this;
    }

    public MetadataWithOneEntity withValidFrom(Optional<String> validFrom) {
        Utils.checkNotNull(validFrom, "validFrom");
        this.validFrom = validFrom;
        return this;
    }

    public MetadataWithOneEntity withValidUpTo(String validUpTo) {
        Utils.checkNotNull(validUpTo, "validUpTo");
        this.validUpTo = Optional.ofNullable(validUpTo);
        return this;
    }

    public MetadataWithOneEntity withValidUpTo(Optional<String> validUpTo) {
        Utils.checkNotNull(validUpTo, "validUpTo");
        this.validUpTo = validUpTo;
        return this;
    }

    public MetadataWithOneEntity withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public MetadataWithOneEntity withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public MetadataWithOneEntity withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    public MetadataWithOneEntity withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    @JsonAnySetter
    public MetadataWithOneEntity withAdditionalProperty(String key, Object value) {
        // note that value can be null because of the way JsonAnySetter works
        Utils.checkNotNull(key, "key");
        additionalProperties.put(key, value); 
        return this;
    }
    
    public MetadataWithOneEntity withAdditionalProperties(Map<String, Object> additionalProperties) {
        Utils.checkNotNull(additionalProperties, "additionalProperties");
        this.additionalProperties = additionalProperties;
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
        MetadataWithOneEntity other = (MetadataWithOneEntity) o;
        return 
            Objects.deepEquals(this.entityType, other.entityType) &&
            Objects.deepEquals(this.entityUuid, other.entityUuid) &&
            Objects.deepEquals(this.validFrom, other.validFrom) &&
            Objects.deepEquals(this.validUpTo, other.validUpTo) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.additionalProperties, other.additionalProperties);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            entityType,
            entityUuid,
            validFrom,
            validUpTo,
            key,
            state,
            additionalProperties);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MetadataWithOneEntity.class,
                "entityType", entityType,
                "entityUuid", entityUuid,
                "validFrom", validFrom,
                "validUpTo", validUpTo,
                "key", key,
                "state", state,
                "additionalProperties", additionalProperties);
    }
    
    public final static class Builder {
 
        private Optional<String> entityType = Optional.empty();
 
        private Optional<String> entityUuid = Optional.empty();
 
        private Optional<String> validFrom = Optional.empty();
 
        private Optional<String> validUpTo = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> state = Optional.empty();
 
        private Map<String, Object> additionalProperties = new HashMap<>();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Name of the entity that the error corresponds to.
         */
        public Builder entityType(String entityType) {
            Utils.checkNotNull(entityType, "entityType");
            this.entityType = Optional.ofNullable(entityType);
            return this;
        }

        /**
         * Name of the entity that the error corresponds to.
         */
        public Builder entityType(Optional<String> entityType) {
            Utils.checkNotNull(entityType, "entityType");
            this.entityType = entityType;
            return this;
        }

        /**
         * Unique identifier for the entity.
         */
        public Builder entityUuid(String entityUuid) {
            Utils.checkNotNull(entityUuid, "entityUuid");
            this.entityUuid = Optional.ofNullable(entityUuid);
            return this;
        }

        /**
         * Unique identifier for the entity.
         */
        public Builder entityUuid(Optional<String> entityUuid) {
            Utils.checkNotNull(entityUuid, "entityUuid");
            this.entityUuid = entityUuid;
            return this;
        }

        public Builder validFrom(String validFrom) {
            Utils.checkNotNull(validFrom, "validFrom");
            this.validFrom = Optional.ofNullable(validFrom);
            return this;
        }

        public Builder validFrom(Optional<String> validFrom) {
            Utils.checkNotNull(validFrom, "validFrom");
            this.validFrom = validFrom;
            return this;
        }

        public Builder validUpTo(String validUpTo) {
            Utils.checkNotNull(validUpTo, "validUpTo");
            this.validUpTo = Optional.ofNullable(validUpTo);
            return this;
        }

        public Builder validUpTo(Optional<String> validUpTo) {
            Utils.checkNotNull(validUpTo, "validUpTo");
            this.validUpTo = validUpTo;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        public Builder additionalProperty(String key, Object value) {
            Utils.checkNotNull(key, "key");
            // we could be strict about null values (force the user
            // to pass `JsonNullable.of(null)`) but likely to be a bit 
            // annoying for additional properties building so we'll 
            // relax preconditions.
            this.additionalProperties.put(key, value);
            return this;
        }

        public Builder additionalProperties(Map<String, Object> additionalProperties) {
            Utils.checkNotNull(additionalProperties, "additionalProperties");
            this.additionalProperties = additionalProperties;
            return this;
        }
        
        public MetadataWithOneEntity build() {
            return new MetadataWithOneEntity(
                entityType,
                entityUuid,
                validFrom,
                validUpTo,
                key,
                state)
                .withAdditionalProperties(additionalProperties);
        }
    }
}

