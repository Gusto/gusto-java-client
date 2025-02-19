/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.errors;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;


public class CheckDate {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("message")
    private Optional<String> message;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("full_message")
    private Optional<String> fullMessage;

    @JsonCreator
    public CheckDate(
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("message") Optional<String> message,
            @JsonProperty("full_message") Optional<String> fullMessage) {
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(fullMessage, "fullMessage");
        this.type = type;
        this.message = message;
        this.fullMessage = fullMessage;
    }
    
    public CheckDate() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @JsonIgnore
    public Optional<String> message() {
        return message;
    }

    @JsonIgnore
    public Optional<String> fullMessage() {
        return fullMessage;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public CheckDate withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public CheckDate withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public CheckDate withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = Optional.ofNullable(message);
        return this;
    }

    public CheckDate withMessage(Optional<String> message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    public CheckDate withFullMessage(String fullMessage) {
        Utils.checkNotNull(fullMessage, "fullMessage");
        this.fullMessage = Optional.ofNullable(fullMessage);
        return this;
    }

    public CheckDate withFullMessage(Optional<String> fullMessage) {
        Utils.checkNotNull(fullMessage, "fullMessage");
        this.fullMessage = fullMessage;
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
        CheckDate other = (CheckDate) o;
        return 
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.message, other.message) &&
            Objects.deepEquals(this.fullMessage, other.fullMessage);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            message,
            fullMessage);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CheckDate.class,
                "type", type,
                "message", message,
                "fullMessage", fullMessage);
    }
    
    public final static class Builder {
 
        private Optional<String> type = Optional.empty();
 
        private Optional<String> message = Optional.empty();
 
        private Optional<String> fullMessage = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = Optional.ofNullable(message);
            return this;
        }

        public Builder message(Optional<String> message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        public Builder fullMessage(String fullMessage) {
            Utils.checkNotNull(fullMessage, "fullMessage");
            this.fullMessage = Optional.ofNullable(fullMessage);
            return this;
        }

        public Builder fullMessage(Optional<String> fullMessage) {
            Utils.checkNotNull(fullMessage, "fullMessage");
            this.fullMessage = fullMessage;
            return this;
        }
        
        public CheckDate build() {
            return new CheckDate(
                type,
                message,
                fullMessage);
        }
    }
}

