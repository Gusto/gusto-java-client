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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
/**
 * CompanyOnboardingStatus - The representation of a company's onboarding status
 */

public class CompanyOnboardingStatus {

    /**
     * the UUID of the company
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * a boolean flag for the company's onboarding status
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("onboarding_completed")
    private Optional<Boolean> onboardingCompleted;

    /**
     * a list of company onboarding steps
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("onboarding_steps")
    private Optional<? extends List<OnboardingStep>> onboardingSteps;

    @JsonCreator
    public CompanyOnboardingStatus(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("onboarding_completed") Optional<Boolean> onboardingCompleted,
            @JsonProperty("onboarding_steps") Optional<? extends List<OnboardingStep>> onboardingSteps) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(onboardingCompleted, "onboardingCompleted");
        Utils.checkNotNull(onboardingSteps, "onboardingSteps");
        this.uuid = uuid;
        this.onboardingCompleted = onboardingCompleted;
        this.onboardingSteps = onboardingSteps;
    }
    
    public CompanyOnboardingStatus(
            String uuid) {
        this(uuid, Optional.empty(), Optional.empty());
    }

    /**
     * the UUID of the company
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * a boolean flag for the company's onboarding status
     */
    @JsonIgnore
    public Optional<Boolean> onboardingCompleted() {
        return onboardingCompleted;
    }

    /**
     * a list of company onboarding steps
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<OnboardingStep>> onboardingSteps() {
        return (Optional<List<OnboardingStep>>) onboardingSteps;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * the UUID of the company
     */
    public CompanyOnboardingStatus withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * a boolean flag for the company's onboarding status
     */
    public CompanyOnboardingStatus withOnboardingCompleted(boolean onboardingCompleted) {
        Utils.checkNotNull(onboardingCompleted, "onboardingCompleted");
        this.onboardingCompleted = Optional.ofNullable(onboardingCompleted);
        return this;
    }

    /**
     * a boolean flag for the company's onboarding status
     */
    public CompanyOnboardingStatus withOnboardingCompleted(Optional<Boolean> onboardingCompleted) {
        Utils.checkNotNull(onboardingCompleted, "onboardingCompleted");
        this.onboardingCompleted = onboardingCompleted;
        return this;
    }

    /**
     * a list of company onboarding steps
     */
    public CompanyOnboardingStatus withOnboardingSteps(List<OnboardingStep> onboardingSteps) {
        Utils.checkNotNull(onboardingSteps, "onboardingSteps");
        this.onboardingSteps = Optional.ofNullable(onboardingSteps);
        return this;
    }

    /**
     * a list of company onboarding steps
     */
    public CompanyOnboardingStatus withOnboardingSteps(Optional<? extends List<OnboardingStep>> onboardingSteps) {
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
        CompanyOnboardingStatus other = (CompanyOnboardingStatus) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.onboardingCompleted, other.onboardingCompleted) &&
            Objects.deepEquals(this.onboardingSteps, other.onboardingSteps);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            onboardingCompleted,
            onboardingSteps);
    }
    
    @Override
    public String toString() {
        return Utils.toString(CompanyOnboardingStatus.class,
                "uuid", uuid,
                "onboardingCompleted", onboardingCompleted,
                "onboardingSteps", onboardingSteps);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<Boolean> onboardingCompleted = Optional.empty();
 
        private Optional<? extends List<OnboardingStep>> onboardingSteps = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * the UUID of the company
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * a boolean flag for the company's onboarding status
         */
        public Builder onboardingCompleted(boolean onboardingCompleted) {
            Utils.checkNotNull(onboardingCompleted, "onboardingCompleted");
            this.onboardingCompleted = Optional.ofNullable(onboardingCompleted);
            return this;
        }

        /**
         * a boolean flag for the company's onboarding status
         */
        public Builder onboardingCompleted(Optional<Boolean> onboardingCompleted) {
            Utils.checkNotNull(onboardingCompleted, "onboardingCompleted");
            this.onboardingCompleted = onboardingCompleted;
            return this;
        }

        /**
         * a list of company onboarding steps
         */
        public Builder onboardingSteps(List<OnboardingStep> onboardingSteps) {
            Utils.checkNotNull(onboardingSteps, "onboardingSteps");
            this.onboardingSteps = Optional.ofNullable(onboardingSteps);
            return this;
        }

        /**
         * a list of company onboarding steps
         */
        public Builder onboardingSteps(Optional<? extends List<OnboardingStep>> onboardingSteps) {
            Utils.checkNotNull(onboardingSteps, "onboardingSteps");
            this.onboardingSteps = onboardingSteps;
            return this;
        }
        
        public CompanyOnboardingStatus build() {
            return new CompanyOnboardingStatus(
                uuid,
                onboardingCompleted,
                onboardingSteps);
        }
    }
}

