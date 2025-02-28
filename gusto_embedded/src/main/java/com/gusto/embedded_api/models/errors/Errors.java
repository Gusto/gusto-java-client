/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.errors;
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

public class Errors {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("base")
    private Optional<? extends List<Base>> base;

    @JsonCreator
    public Errors(
            @JsonProperty("base") Optional<? extends List<Base>> base) {
        Utils.checkNotNull(base, "base");
        this.base = base;
    }
    
    public Errors() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Base>> base() {
        return (Optional<List<Base>>) base;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Errors withBase(List<Base> base) {
        Utils.checkNotNull(base, "base");
        this.base = Optional.ofNullable(base);
        return this;
    }

    public Errors withBase(Optional<? extends List<Base>> base) {
        Utils.checkNotNull(base, "base");
        this.base = base;
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
        Errors other = (Errors) o;
        return 
            Objects.deepEquals(this.base, other.base);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            base);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Errors.class,
                "base", base);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Base>> base = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder base(List<Base> base) {
            Utils.checkNotNull(base, "base");
            this.base = Optional.ofNullable(base);
            return this;
        }

        public Builder base(Optional<? extends List<Base>> base) {
            Utils.checkNotNull(base, "base");
            this.base = base;
            return this;
        }
        
        public Errors build() {
            return new Errors(
                base);
        }
    }
}

