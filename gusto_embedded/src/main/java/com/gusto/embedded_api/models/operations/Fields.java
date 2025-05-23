/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
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

public class Fields {

    /**
     * Unique identifier of the field
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    /**
     * Value for the field
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("value")
    private Optional<String> value;

    @JsonCreator
    public Fields(
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("value") Optional<String> value) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(value, "value");
        this.key = key;
        this.value = value;
    }
    
    public Fields() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier of the field
     */
    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    /**
     * Value for the field
     */
    @JsonIgnore
    public Optional<String> value() {
        return value;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier of the field
     */
    public Fields withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    /**
     * Unique identifier of the field
     */
    public Fields withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * Value for the field
     */
    public Fields withValue(String value) {
        Utils.checkNotNull(value, "value");
        this.value = Optional.ofNullable(value);
        return this;
    }

    /**
     * Value for the field
     */
    public Fields withValue(Optional<String> value) {
        Utils.checkNotNull(value, "value");
        this.value = value;
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
        Fields other = (Fields) o;
        return 
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.value, other.value);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key,
            value);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Fields.class,
                "key", key,
                "value", value);
    }
    
    public final static class Builder {
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> value = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier of the field
         */
        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        /**
         * Unique identifier of the field
         */
        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        /**
         * Value for the field
         */
        public Builder value(String value) {
            Utils.checkNotNull(value, "value");
            this.value = Optional.ofNullable(value);
            return this;
        }

        /**
         * Value for the field
         */
        public Builder value(Optional<String> value) {
            Utils.checkNotNull(value, "value");
            this.value = value;
            return this;
        }
        
        public Fields build() {
            return new Fields(
                key,
                value);
        }
    }
}

