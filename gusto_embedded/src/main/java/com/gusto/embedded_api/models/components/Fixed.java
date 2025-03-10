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

public class Fixed {

    /**
     * The name of the fixed compensation.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonCreator
    public Fixed(
            @JsonProperty("name") Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
    }
    
    public Fixed() {
        this(Optional.empty());
    }

    /**
     * The name of the fixed compensation.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the fixed compensation.
     */
    public Fixed withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the fixed compensation.
     */
    public Fixed withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
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
        Fixed other = (Fixed) o;
        return 
            Objects.deepEquals(this.name, other.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            name);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Fixed.class,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the fixed compensation.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of the fixed compensation.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public Fixed build() {
            return new Fixed(
                name);
        }
    }
}

