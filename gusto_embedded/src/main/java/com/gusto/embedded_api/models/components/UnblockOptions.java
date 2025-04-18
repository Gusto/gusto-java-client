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
import java.util.Objects;
import java.util.Optional;

public class UnblockOptions {

    /**
     * The type of unblock option for the submission blocker.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unblock_type")
    private Optional<String> unblockType;

    /**
     * The payment check date associated with the unblock option.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("check_date")
    private Optional<String> checkDate;

    /**
     * Additional data associated with the unblock option.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    private Optional<? extends PayrollSubmissionBlockersTypeMetadata> metadata;

    @JsonCreator
    public UnblockOptions(
            @JsonProperty("unblock_type") Optional<String> unblockType,
            @JsonProperty("check_date") Optional<String> checkDate,
            @JsonProperty("metadata") Optional<? extends PayrollSubmissionBlockersTypeMetadata> metadata) {
        Utils.checkNotNull(unblockType, "unblockType");
        Utils.checkNotNull(checkDate, "checkDate");
        Utils.checkNotNull(metadata, "metadata");
        this.unblockType = unblockType;
        this.checkDate = checkDate;
        this.metadata = metadata;
    }
    
    public UnblockOptions() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The type of unblock option for the submission blocker.
     */
    @JsonIgnore
    public Optional<String> unblockType() {
        return unblockType;
    }

    /**
     * The payment check date associated with the unblock option.
     */
    @JsonIgnore
    public Optional<String> checkDate() {
        return checkDate;
    }

    /**
     * Additional data associated with the unblock option.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PayrollSubmissionBlockersTypeMetadata> metadata() {
        return (Optional<PayrollSubmissionBlockersTypeMetadata>) metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of unblock option for the submission blocker.
     */
    public UnblockOptions withUnblockType(String unblockType) {
        Utils.checkNotNull(unblockType, "unblockType");
        this.unblockType = Optional.ofNullable(unblockType);
        return this;
    }

    /**
     * The type of unblock option for the submission blocker.
     */
    public UnblockOptions withUnblockType(Optional<String> unblockType) {
        Utils.checkNotNull(unblockType, "unblockType");
        this.unblockType = unblockType;
        return this;
    }

    /**
     * The payment check date associated with the unblock option.
     */
    public UnblockOptions withCheckDate(String checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = Optional.ofNullable(checkDate);
        return this;
    }

    /**
     * The payment check date associated with the unblock option.
     */
    public UnblockOptions withCheckDate(Optional<String> checkDate) {
        Utils.checkNotNull(checkDate, "checkDate");
        this.checkDate = checkDate;
        return this;
    }

    /**
     * Additional data associated with the unblock option.
     */
    public UnblockOptions withMetadata(PayrollSubmissionBlockersTypeMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Additional data associated with the unblock option.
     */
    public UnblockOptions withMetadata(Optional<? extends PayrollSubmissionBlockersTypeMetadata> metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
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
        UnblockOptions other = (UnblockOptions) o;
        return 
            Objects.deepEquals(this.unblockType, other.unblockType) &&
            Objects.deepEquals(this.checkDate, other.checkDate) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            unblockType,
            checkDate,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(UnblockOptions.class,
                "unblockType", unblockType,
                "checkDate", checkDate,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Optional<String> unblockType = Optional.empty();
 
        private Optional<String> checkDate = Optional.empty();
 
        private Optional<? extends PayrollSubmissionBlockersTypeMetadata> metadata = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of unblock option for the submission blocker.
         */
        public Builder unblockType(String unblockType) {
            Utils.checkNotNull(unblockType, "unblockType");
            this.unblockType = Optional.ofNullable(unblockType);
            return this;
        }

        /**
         * The type of unblock option for the submission blocker.
         */
        public Builder unblockType(Optional<String> unblockType) {
            Utils.checkNotNull(unblockType, "unblockType");
            this.unblockType = unblockType;
            return this;
        }

        /**
         * The payment check date associated with the unblock option.
         */
        public Builder checkDate(String checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = Optional.ofNullable(checkDate);
            return this;
        }

        /**
         * The payment check date associated with the unblock option.
         */
        public Builder checkDate(Optional<String> checkDate) {
            Utils.checkNotNull(checkDate, "checkDate");
            this.checkDate = checkDate;
            return this;
        }

        /**
         * Additional data associated with the unblock option.
         */
        public Builder metadata(PayrollSubmissionBlockersTypeMetadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        /**
         * Additional data associated with the unblock option.
         */
        public Builder metadata(Optional<? extends PayrollSubmissionBlockersTypeMetadata> metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public UnblockOptions build() {
            return new UnblockOptions(
                unblockType,
                checkDate,
                metadata);
        }
    }
}

