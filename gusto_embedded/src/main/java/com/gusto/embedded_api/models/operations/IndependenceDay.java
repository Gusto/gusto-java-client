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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class IndependenceDay {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selected")
    private Optional<Boolean> selected;

    @JsonCreator
    public IndependenceDay(
            @JsonProperty("selected") Optional<Boolean> selected) {
        Utils.checkNotNull(selected, "selected");
        this.selected = selected;
    }
    
    public IndependenceDay() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<Boolean> selected() {
        return selected;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public IndependenceDay withSelected(boolean selected) {
        Utils.checkNotNull(selected, "selected");
        this.selected = Optional.ofNullable(selected);
        return this;
    }

    public IndependenceDay withSelected(Optional<Boolean> selected) {
        Utils.checkNotNull(selected, "selected");
        this.selected = selected;
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
        IndependenceDay other = (IndependenceDay) o;
        return 
            Objects.deepEquals(this.selected, other.selected);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            selected);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IndependenceDay.class,
                "selected", selected);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> selected = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder selected(boolean selected) {
            Utils.checkNotNull(selected, "selected");
            this.selected = Optional.ofNullable(selected);
            return this;
        }

        public Builder selected(Optional<Boolean> selected) {
            Utils.checkNotNull(selected, "selected");
            this.selected = selected;
            return this;
        }
        
        public IndependenceDay build() {
            return new IndependenceDay(
                selected);
        }
    }
}

