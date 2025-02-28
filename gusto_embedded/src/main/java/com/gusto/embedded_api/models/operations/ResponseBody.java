/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class ResponseBody {

    /**
     * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
     */
    @JsonProperty("state")
    private String state;

    /**
     * If all requirements for the state have been satisfied such that the company can complete
     * onboarding, the company is `setup_complete` in the state. A company must be `setup_complete` in
     * all relevant states to complete the `state_setup` company onboarding step.
     */
    @JsonProperty("setup_complete")
    private boolean setupComplete;

    @JsonCreator
    public ResponseBody(
            @JsonProperty("state") String state,
            @JsonProperty("setup_complete") boolean setupComplete) {
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(setupComplete, "setupComplete");
        this.state = state;
        this.setupComplete = setupComplete;
    }

    /**
     * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
     */
    @JsonIgnore
    public String state() {
        return state;
    }

    /**
     * If all requirements for the state have been satisfied such that the company can complete
     * onboarding, the company is `setup_complete` in the state. A company must be `setup_complete` in
     * all relevant states to complete the `state_setup` company onboarding step.
     */
    @JsonIgnore
    public boolean setupComplete() {
        return setupComplete;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
     */
    public ResponseBody withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    /**
     * If all requirements for the state have been satisfied such that the company can complete
     * onboarding, the company is `setup_complete` in the state. A company must be `setup_complete` in
     * all relevant states to complete the `state_setup` company onboarding step.
     */
    public ResponseBody withSetupComplete(boolean setupComplete) {
        Utils.checkNotNull(setupComplete, "setupComplete");
        this.setupComplete = setupComplete;
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
        ResponseBody other = (ResponseBody) o;
        return 
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.setupComplete, other.setupComplete);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            state,
            setupComplete);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ResponseBody.class,
                "state", state,
                "setupComplete", setupComplete);
    }
    
    public final static class Builder {
 
        private String state;
 
        private Boolean setupComplete;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * One of the two-letter state abbreviations for the fifty United States and the District of Columbia (DC)
         */
        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        /**
         * If all requirements for the state have been satisfied such that the company can complete
         * onboarding, the company is `setup_complete` in the state. A company must be `setup_complete` in
         * all relevant states to complete the `state_setup` company onboarding step.
         */
        public Builder setupComplete(boolean setupComplete) {
            Utils.checkNotNull(setupComplete, "setupComplete");
            this.setupComplete = setupComplete;
            return this;
        }
        
        public ResponseBody build() {
            return new ResponseBody(
                state,
                setupComplete);
        }
    }
}

