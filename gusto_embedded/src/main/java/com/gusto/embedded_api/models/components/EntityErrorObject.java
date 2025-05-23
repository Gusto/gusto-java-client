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

public class EntityErrorObject {

    /**
     * Specifies where the error occurs. Typically this key identifies the attribute/parameter related to the error.
     */
    @JsonProperty("error_key")
    private String errorKey;

    /**
     * Specifies the type of error. The category provides error groupings and can be used to build custom error handling in your integration. If category is `nested_errors`, the object will contain a nested `errors` property with entity errors.
     */
    @JsonProperty("category")
    private String category;

    /**
     * Provides details about the error - generally this message can be surfaced to an end user.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<String> message;

    /**
     * Contains relevant data to identify the resource in question when applicable. For example, to identify an entity `entity_type` and `entity_uuid` will be provided.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends Metadata> metadata;

    /**
     * Will only exist if category is `nested_errors`. It is possible to have multiple levels of nested errors.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private Optional<? extends List<EntityErrorObject>> errors;

    @JsonCreator
    public EntityErrorObject(
            @JsonProperty("error_key") String errorKey,
            @JsonProperty("category") String category,
            @JsonProperty("message") Optional<String> message,
            @JsonProperty("metadata") Optional<? extends Metadata> metadata,
            @JsonProperty("errors") Optional<? extends List<EntityErrorObject>> errors) {
        Utils.checkNotNull(errorKey, "errorKey");
        Utils.checkNotNull(category, "category");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(metadata, "metadata");
        Utils.checkNotNull(errors, "errors");
        this.errorKey = errorKey;
        this.category = category;
        this.message = message;
        this.metadata = metadata;
        this.errors = errors;
    }
    
    public EntityErrorObject(
            String errorKey,
            String category) {
        this(errorKey, category, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Specifies where the error occurs. Typically this key identifies the attribute/parameter related to the error.
     */
    @JsonIgnore
    public String errorKey() {
        return errorKey;
    }

    /**
     * Specifies the type of error. The category provides error groupings and can be used to build custom error handling in your integration. If category is `nested_errors`, the object will contain a nested `errors` property with entity errors.
     */
    @JsonIgnore
    public String category() {
        return category;
    }

    /**
     * Provides details about the error - generally this message can be surfaced to an end user.
     */
    @JsonIgnore
    public Optional<String> message() {
        return message;
    }

    /**
     * Contains relevant data to identify the resource in question when applicable. For example, to identify an entity `entity_type` and `entity_uuid` will be provided.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Metadata> metadata() {
        return (Optional<Metadata>) metadata;
    }

    /**
     * Will only exist if category is `nested_errors`. It is possible to have multiple levels of nested errors.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<EntityErrorObject>> errors() {
        return (Optional<List<EntityErrorObject>>) errors;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Specifies where the error occurs. Typically this key identifies the attribute/parameter related to the error.
     */
    public EntityErrorObject withErrorKey(String errorKey) {
        Utils.checkNotNull(errorKey, "errorKey");
        this.errorKey = errorKey;
        return this;
    }

    /**
     * Specifies the type of error. The category provides error groupings and can be used to build custom error handling in your integration. If category is `nested_errors`, the object will contain a nested `errors` property with entity errors.
     */
    public EntityErrorObject withCategory(String category) {
        Utils.checkNotNull(category, "category");
        this.category = category;
        return this;
    }

    /**
     * Provides details about the error - generally this message can be surfaced to an end user.
     */
    public EntityErrorObject withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * Provides details about the error - generally this message can be surfaced to an end user.
     */
    public EntityErrorObject withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * Contains relevant data to identify the resource in question when applicable. For example, to identify an entity `entity_type` and `entity_uuid` will be provided.
     */
    public EntityErrorObject withMetadata(Metadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Contains relevant data to identify the resource in question when applicable. For example, to identify an entity `entity_type` and `entity_uuid` will be provided.
     */
    public EntityErrorObject withMetadata(Optional<? extends Metadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
        return this;
    }

    /**
     * Will only exist if category is `nested_errors`. It is possible to have multiple levels of nested errors.
     */
    public EntityErrorObject withErrors(List<EntityErrorObject> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = Optional.ofNullable(errors);
        return this;
    }

    /**
     * Will only exist if category is `nested_errors`. It is possible to have multiple levels of nested errors.
     */
    public EntityErrorObject withErrors(Optional<? extends List<EntityErrorObject>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
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
        EntityErrorObject other = (EntityErrorObject) o;
        return 
            Objects.deepEquals(this.errorKey, other.errorKey) &&
            Objects.deepEquals(this.category, other.category) &&
            Objects.deepEquals(this.message, other.message) &&
            Objects.deepEquals(this.metadata, other.metadata) &&
            Objects.deepEquals(this.errors, other.errors);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            errorKey,
            category,
            message,
            metadata,
            errors);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EntityErrorObject.class,
                "errorKey", errorKey,
                "category", category,
                "message", message,
                "metadata", metadata,
                "errors", errors);
    }
    
    public final static class Builder {
 
        private String errorKey;
 
        private String category;
 
        private Optional<String> message = Optional.empty();
 
        private Optional<? extends Metadata> metadata = Optional.empty();
 
        private Optional<? extends List<EntityErrorObject>> errors = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Specifies where the error occurs. Typically this key identifies the attribute/parameter related to the error.
         */
        public Builder errorKey(String errorKey) {
            Utils.checkNotNull(errorKey, "errorKey");
            this.errorKey = errorKey;
            return this;
        }

        /**
         * Specifies the type of error. The category provides error groupings and can be used to build custom error handling in your integration. If category is `nested_errors`, the object will contain a nested `errors` property with entity errors.
         */
        public Builder category(String category) {
            Utils.checkNotNull(category, "category");
            this.category = category;
            return this;
        }

        /**
         * Provides details about the error - generally this message can be surfaced to an end user.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        /**
         * Provides details about the error - generally this message can be surfaced to an end user.
         */
        public Builder message(Optional<String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * Contains relevant data to identify the resource in question when applicable. For example, to identify an entity `entity_type` and `entity_uuid` will be provided.
         */
        public Builder metadata(Metadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * Contains relevant data to identify the resource in question when applicable. For example, to identify an entity `entity_type` and `entity_uuid` will be provided.
         */
        public Builder metadata(Optional<? extends Metadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }

        /**
         * Will only exist if category is `nested_errors`. It is possible to have multiple levels of nested errors.
         */
        public Builder errors(List<EntityErrorObject> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = Optional.ofNullable(errors);
            return this;
        }

        /**
         * Will only exist if category is `nested_errors`. It is possible to have multiple levels of nested errors.
         */
        public Builder errors(Optional<? extends List<EntityErrorObject>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }
        
        public EntityErrorObject build() {
            return new EntityErrorObject(
                errorKey,
                category,
                message,
                metadata,
                errors);
        }
    }
}

