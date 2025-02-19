/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class PayrollSubmissionBlockersType {

    /**
     * The type of blocker that's blocking the payment submission.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("blocker_type")
    private Optional<String> blockerType;

    /**
     * The name of the submission blocker.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("blocker_name")
    private Optional<String> blockerName;

    /**
     * The available options to unblock a submission blocker.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("unblock_options")
    private Optional<? extends List<UnblockOptions>> unblockOptions;

    /**
     * The unblock option that's been selected to resolve the submission blocker.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selected_option")
    private JsonNullable<String> selectedOption;

    /**
     * The status of the submission blocker.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends PayrollSubmissionBlockersTypeStatus> status;

    @JsonCreator
    public PayrollSubmissionBlockersType(
            @JsonProperty("blocker_type") Optional<String> blockerType,
            @JsonProperty("blocker_name") Optional<String> blockerName,
            @JsonProperty("unblock_options") Optional<? extends List<UnblockOptions>> unblockOptions,
            @JsonProperty("selected_option") JsonNullable<String> selectedOption,
            @JsonProperty("status") Optional<? extends PayrollSubmissionBlockersTypeStatus> status) {
        Utils.checkNotNull(blockerType, "blockerType");
        Utils.checkNotNull(blockerName, "blockerName");
        Utils.checkNotNull(unblockOptions, "unblockOptions");
        Utils.checkNotNull(selectedOption, "selectedOption");
        Utils.checkNotNull(status, "status");
        this.blockerType = blockerType;
        this.blockerName = blockerName;
        this.unblockOptions = unblockOptions;
        this.selectedOption = selectedOption;
        this.status = status;
    }
    
    public PayrollSubmissionBlockersType() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The type of blocker that's blocking the payment submission.
     */
    @JsonIgnore
    public Optional<String> blockerType() {
        return blockerType;
    }

    /**
     * The name of the submission blocker.
     */
    @JsonIgnore
    public Optional<String> blockerName() {
        return blockerName;
    }

    /**
     * The available options to unblock a submission blocker.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<UnblockOptions>> unblockOptions() {
        return (Optional<List<UnblockOptions>>) unblockOptions;
    }

    /**
     * The unblock option that's been selected to resolve the submission blocker.
     */
    @JsonIgnore
    public JsonNullable<String> selectedOption() {
        return selectedOption;
    }

    /**
     * The status of the submission blocker.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PayrollSubmissionBlockersTypeStatus> status() {
        return (Optional<PayrollSubmissionBlockersTypeStatus>) status;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of blocker that's blocking the payment submission.
     */
    public PayrollSubmissionBlockersType withBlockerType(String blockerType) {
        Utils.checkNotNull(blockerType, "blockerType");
        this.blockerType = Optional.ofNullable(blockerType);
        return this;
    }

    /**
     * The type of blocker that's blocking the payment submission.
     */
    public PayrollSubmissionBlockersType withBlockerType(Optional<String> blockerType) {
        Utils.checkNotNull(blockerType, "blockerType");
        this.blockerType = blockerType;
        return this;
    }

    /**
     * The name of the submission blocker.
     */
    public PayrollSubmissionBlockersType withBlockerName(String blockerName) {
        Utils.checkNotNull(blockerName, "blockerName");
        this.blockerName = Optional.ofNullable(blockerName);
        return this;
    }

    /**
     * The name of the submission blocker.
     */
    public PayrollSubmissionBlockersType withBlockerName(Optional<String> blockerName) {
        Utils.checkNotNull(blockerName, "blockerName");
        this.blockerName = blockerName;
        return this;
    }

    /**
     * The available options to unblock a submission blocker.
     */
    public PayrollSubmissionBlockersType withUnblockOptions(List<UnblockOptions> unblockOptions) {
        Utils.checkNotNull(unblockOptions, "unblockOptions");
        this.unblockOptions = Optional.ofNullable(unblockOptions);
        return this;
    }

    /**
     * The available options to unblock a submission blocker.
     */
    public PayrollSubmissionBlockersType withUnblockOptions(Optional<? extends List<UnblockOptions>> unblockOptions) {
        Utils.checkNotNull(unblockOptions, "unblockOptions");
        this.unblockOptions = unblockOptions;
        return this;
    }

    /**
     * The unblock option that's been selected to resolve the submission blocker.
     */
    public PayrollSubmissionBlockersType withSelectedOption(String selectedOption) {
        Utils.checkNotNull(selectedOption, "selectedOption");
        this.selectedOption = JsonNullable.of(selectedOption);
        return this;
    }

    /**
     * The unblock option that's been selected to resolve the submission blocker.
     */
    public PayrollSubmissionBlockersType withSelectedOption(JsonNullable<String> selectedOption) {
        Utils.checkNotNull(selectedOption, "selectedOption");
        this.selectedOption = selectedOption;
        return this;
    }

    /**
     * The status of the submission blocker.
     */
    public PayrollSubmissionBlockersType withStatus(PayrollSubmissionBlockersTypeStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * The status of the submission blocker.
     */
    public PayrollSubmissionBlockersType withStatus(Optional<? extends PayrollSubmissionBlockersTypeStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
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
        PayrollSubmissionBlockersType other = (PayrollSubmissionBlockersType) o;
        return 
            Objects.deepEquals(this.blockerType, other.blockerType) &&
            Objects.deepEquals(this.blockerName, other.blockerName) &&
            Objects.deepEquals(this.unblockOptions, other.unblockOptions) &&
            Objects.deepEquals(this.selectedOption, other.selectedOption) &&
            Objects.deepEquals(this.status, other.status);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            blockerType,
            blockerName,
            unblockOptions,
            selectedOption,
            status);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PayrollSubmissionBlockersType.class,
                "blockerType", blockerType,
                "blockerName", blockerName,
                "unblockOptions", unblockOptions,
                "selectedOption", selectedOption,
                "status", status);
    }
    
    public final static class Builder {
 
        private Optional<String> blockerType = Optional.empty();
 
        private Optional<String> blockerName = Optional.empty();
 
        private Optional<? extends List<UnblockOptions>> unblockOptions = Optional.empty();
 
        private JsonNullable<String> selectedOption = JsonNullable.undefined();
 
        private Optional<? extends PayrollSubmissionBlockersTypeStatus> status = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of blocker that's blocking the payment submission.
         */
        public Builder blockerType(String blockerType) {
            Utils.checkNotNull(blockerType, "blockerType");
            this.blockerType = Optional.ofNullable(blockerType);
            return this;
        }

        /**
         * The type of blocker that's blocking the payment submission.
         */
        public Builder blockerType(Optional<String> blockerType) {
            Utils.checkNotNull(blockerType, "blockerType");
            this.blockerType = blockerType;
            return this;
        }

        /**
         * The name of the submission blocker.
         */
        public Builder blockerName(String blockerName) {
            Utils.checkNotNull(blockerName, "blockerName");
            this.blockerName = Optional.ofNullable(blockerName);
            return this;
        }

        /**
         * The name of the submission blocker.
         */
        public Builder blockerName(Optional<String> blockerName) {
            Utils.checkNotNull(blockerName, "blockerName");
            this.blockerName = blockerName;
            return this;
        }

        /**
         * The available options to unblock a submission blocker.
         */
        public Builder unblockOptions(List<UnblockOptions> unblockOptions) {
            Utils.checkNotNull(unblockOptions, "unblockOptions");
            this.unblockOptions = Optional.ofNullable(unblockOptions);
            return this;
        }

        /**
         * The available options to unblock a submission blocker.
         */
        public Builder unblockOptions(Optional<? extends List<UnblockOptions>> unblockOptions) {
            Utils.checkNotNull(unblockOptions, "unblockOptions");
            this.unblockOptions = unblockOptions;
            return this;
        }

        /**
         * The unblock option that's been selected to resolve the submission blocker.
         */
        public Builder selectedOption(String selectedOption) {
            Utils.checkNotNull(selectedOption, "selectedOption");
            this.selectedOption = JsonNullable.of(selectedOption);
            return this;
        }

        /**
         * The unblock option that's been selected to resolve the submission blocker.
         */
        public Builder selectedOption(JsonNullable<String> selectedOption) {
            Utils.checkNotNull(selectedOption, "selectedOption");
            this.selectedOption = selectedOption;
            return this;
        }

        /**
         * The status of the submission blocker.
         */
        public Builder status(PayrollSubmissionBlockersTypeStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * The status of the submission blocker.
         */
        public Builder status(Optional<? extends PayrollSubmissionBlockersTypeStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }
        
        public PayrollSubmissionBlockersType build() {
            return new PayrollSubmissionBlockersType(
                blockerType,
                blockerName,
                unblockOptions,
                selectedOption,
                status);
        }
    }
}

