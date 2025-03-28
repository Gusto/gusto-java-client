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
/**
 * PayrollBlocker
 * 
 * <p>Example response
 */

public class PayrollBlocker {

    /**
     * The unique identifier of the reason
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    /**
     * User-friendly message describing the payroll blocker.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<String> message;

    @JsonCreator
    public PayrollBlocker(
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("message") Optional<String> message) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(message, "message");
        this.key = key;
        this.message = message;
    }
    
    public PayrollBlocker() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * The unique identifier of the reason
     */
    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    /**
     * User-friendly message describing the payroll blocker.
     */
    @JsonIgnore
    public Optional<String> message() {
        return message;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier of the reason
     */
    public PayrollBlocker withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    /**
     * The unique identifier of the reason
     */
    public PayrollBlocker withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    /**
     * User-friendly message describing the payroll blocker.
     */
    public PayrollBlocker withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * User-friendly message describing the payroll blocker.
     */
    public PayrollBlocker withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
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
        PayrollBlocker other = (PayrollBlocker) o;
        return 
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.message, other.message);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key,
            message);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PayrollBlocker.class,
                "key", key,
                "message", message);
    }
    
    public final static class Builder {
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> message = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier of the reason
         */
        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        /**
         * The unique identifier of the reason
         */
        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        /**
         * User-friendly message describing the payroll blocker.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        /**
         * User-friendly message describing the payroll blocker.
         */
        public Builder message(Optional<String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }
        
        public PayrollBlocker build() {
            return new PayrollBlocker(
                key,
                message);
        }
    }
}

