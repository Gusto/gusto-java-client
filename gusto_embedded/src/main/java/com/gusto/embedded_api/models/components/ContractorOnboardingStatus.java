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
/**
 * ContractorOnboardingStatus
 * 
 * <p>The representation of an contractor's onboarding status.
 */

public class ContractorOnboardingStatus {

    /**
     * Unique identifier for this contractor.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * One of the "onboarding_status" enum values.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("onboarding_status")
    private Optional<? extends ContractorOnboardingStatusOnboardingStatus> onboardingStatus;

    /**
     * List of steps required to onboard a contractor.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("onboarding_steps")
    private Optional<? extends List<ContractorOnboardingStatusOnboardingStep>> onboardingSteps;

    @JsonCreator
    public ContractorOnboardingStatus(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("onboarding_status") Optional<? extends ContractorOnboardingStatusOnboardingStatus> onboardingStatus,
            @JsonProperty("onboarding_steps") Optional<? extends List<ContractorOnboardingStatusOnboardingStep>> onboardingSteps) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(onboardingStatus, "onboardingStatus");
        Utils.checkNotNull(onboardingSteps, "onboardingSteps");
        this.uuid = uuid;
        this.onboardingStatus = onboardingStatus;
        this.onboardingSteps = onboardingSteps;
    }
    
    public ContractorOnboardingStatus(
            String uuid) {
        this(uuid, Optional.empty(), Optional.empty());
    }

    /**
     * Unique identifier for this contractor.
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * One of the "onboarding_status" enum values.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ContractorOnboardingStatusOnboardingStatus> onboardingStatus() {
        return (Optional<ContractorOnboardingStatusOnboardingStatus>) onboardingStatus;
    }

    /**
     * List of steps required to onboard a contractor.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ContractorOnboardingStatusOnboardingStep>> onboardingSteps() {
        return (Optional<List<ContractorOnboardingStatusOnboardingStep>>) onboardingSteps;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier for this contractor.
     */
    public ContractorOnboardingStatus withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * One of the "onboarding_status" enum values.
     */
    public ContractorOnboardingStatus withOnboardingStatus(ContractorOnboardingStatusOnboardingStatus onboardingStatus) {
        Utils.checkNotNull(onboardingStatus, "onboardingStatus");
        this.onboardingStatus = Optional.ofNullable(onboardingStatus);
        return this;
    }

    /**
     * One of the "onboarding_status" enum values.
     */
    public ContractorOnboardingStatus withOnboardingStatus(Optional<? extends ContractorOnboardingStatusOnboardingStatus> onboardingStatus) {
        Utils.checkNotNull(onboardingStatus, "onboardingStatus");
        this.onboardingStatus = onboardingStatus;
        return this;
    }

    /**
     * List of steps required to onboard a contractor.
     */
    public ContractorOnboardingStatus withOnboardingSteps(List<ContractorOnboardingStatusOnboardingStep> onboardingSteps) {
        Utils.checkNotNull(onboardingSteps, "onboardingSteps");
        this.onboardingSteps = Optional.ofNullable(onboardingSteps);
        return this;
    }

    /**
     * List of steps required to onboard a contractor.
     */
    public ContractorOnboardingStatus withOnboardingSteps(Optional<? extends List<ContractorOnboardingStatusOnboardingStep>> onboardingSteps) {
        Utils.checkNotNull(onboardingSteps, "onboardingSteps");
        this.onboardingSteps = onboardingSteps;
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
        ContractorOnboardingStatus other = (ContractorOnboardingStatus) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.onboardingStatus, other.onboardingStatus) &&
            Objects.deepEquals(this.onboardingSteps, other.onboardingSteps);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            onboardingStatus,
            onboardingSteps);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ContractorOnboardingStatus.class,
                "uuid", uuid,
                "onboardingStatus", onboardingStatus,
                "onboardingSteps", onboardingSteps);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<? extends ContractorOnboardingStatusOnboardingStatus> onboardingStatus = Optional.empty();
 
        private Optional<? extends List<ContractorOnboardingStatusOnboardingStep>> onboardingSteps = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique identifier for this contractor.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * One of the "onboarding_status" enum values.
         */
        public Builder onboardingStatus(ContractorOnboardingStatusOnboardingStatus onboardingStatus) {
            Utils.checkNotNull(onboardingStatus, "onboardingStatus");
            this.onboardingStatus = Optional.ofNullable(onboardingStatus);
            return this;
        }

        /**
         * One of the "onboarding_status" enum values.
         */
        public Builder onboardingStatus(Optional<? extends ContractorOnboardingStatusOnboardingStatus> onboardingStatus) {
            Utils.checkNotNull(onboardingStatus, "onboardingStatus");
            this.onboardingStatus = onboardingStatus;
            return this;
        }

        /**
         * List of steps required to onboard a contractor.
         */
        public Builder onboardingSteps(List<ContractorOnboardingStatusOnboardingStep> onboardingSteps) {
            Utils.checkNotNull(onboardingSteps, "onboardingSteps");
            this.onboardingSteps = Optional.ofNullable(onboardingSteps);
            return this;
        }

        /**
         * List of steps required to onboard a contractor.
         */
        public Builder onboardingSteps(Optional<? extends List<ContractorOnboardingStatusOnboardingStep>> onboardingSteps) {
            Utils.checkNotNull(onboardingSteps, "onboardingSteps");
            this.onboardingSteps = onboardingSteps;
            return this;
        }
        
        public ContractorOnboardingStatus build() {
            return new ContractorOnboardingStatus(
                uuid,
                onboardingStatus,
                onboardingSteps);
        }
    }
}

