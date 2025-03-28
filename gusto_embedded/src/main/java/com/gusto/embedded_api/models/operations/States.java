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
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class States {

    @JsonProperty("state")
    private String state;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("questions")
    private Optional<? extends List<Questions>> questions;

    @JsonCreator
    public States(
            @JsonProperty("state") String state,
            @JsonProperty("questions") Optional<? extends List<Questions>> questions) {
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(questions, "questions");
        this.state = state;
        this.questions = questions;
    }
    
    public States(
            String state) {
        this(state, Optional.empty());
    }

    @JsonIgnore
    public String state() {
        return state;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Questions>> questions() {
        return (Optional<List<Questions>>) questions;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public States withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public States withQuestions(List<Questions> questions) {
        Utils.checkNotNull(questions, "questions");
        this.questions = Optional.ofNullable(questions);
        return this;
    }

    public States withQuestions(Optional<? extends List<Questions>> questions) {
        Utils.checkNotNull(questions, "questions");
        this.questions = questions;
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
        States other = (States) o;
        return 
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.questions, other.questions);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            state,
            questions);
    }
    
    @Override
    public String toString() {
        return Utils.toString(States.class,
                "state", state,
                "questions", questions);
    }
    
    public final static class Builder {
 
        private String state;
 
        private Optional<? extends List<Questions>> questions = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        public Builder questions(List<Questions> questions) {
            Utils.checkNotNull(questions, "questions");
            this.questions = Optional.ofNullable(questions);
            return this;
        }

        public Builder questions(Optional<? extends List<Questions>> questions) {
            Utils.checkNotNull(questions, "questions");
            this.questions = questions;
            return this;
        }
        
        public States build() {
            return new States(
                state,
                questions);
        }
    }
}

