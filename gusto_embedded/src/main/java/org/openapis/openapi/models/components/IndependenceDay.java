/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;


public class IndependenceDay {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selected")
    private Optional<Boolean> selected;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date")
    private Optional<String> date;

    @JsonCreator
    public IndependenceDay(
            @JsonProperty("selected") Optional<Boolean> selected,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("date") Optional<String> date) {
        Utils.checkNotNull(selected, "selected");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(date, "date");
        this.selected = selected;
        this.name = name;
        this.date = date;
    }
    
    public IndependenceDay() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Boolean> selected() {
        return selected;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> date() {
        return date;
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

    public IndependenceDay withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public IndependenceDay withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public IndependenceDay withDate(String date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.ofNullable(date);
        return this;
    }

    public IndependenceDay withDate(Optional<String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
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
            Objects.deepEquals(this.selected, other.selected) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.date, other.date);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            selected,
            name,
            date);
    }
    
    @Override
    public String toString() {
        return Utils.toString(IndependenceDay.class,
                "selected", selected,
                "name", name,
                "date", date);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> selected = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> date = Optional.empty();  
        
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

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder date(String date) {
            Utils.checkNotNull(date, "date");
            this.date = Optional.ofNullable(date);
            return this;
        }

        public Builder date(Optional<String> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }
        
        public IndependenceDay build() {
            return new IndependenceDay(
                selected,
                name,
                date);
        }
    }
}

