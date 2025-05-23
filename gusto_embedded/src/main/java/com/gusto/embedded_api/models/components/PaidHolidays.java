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
/**
 * PaidHolidays
 * 
 * <p>Representation of a company's paid holidays as descibed by their Holiday Pay Policy
 */

public class PaidHolidays {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schema")
    private Optional<? extends Schema> schema;

    @JsonCreator
    public PaidHolidays(
            @JsonProperty("schema") Optional<? extends Schema> schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = schema;
    }
    
    public PaidHolidays() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Schema> schema() {
        return (Optional<Schema>) schema;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PaidHolidays withSchema(Schema schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = Optional.ofNullable(schema);
        return this;
    }

    public PaidHolidays withSchema(Optional<? extends Schema> schema) {
        Utils.checkNotNull(schema, "schema");
        this.schema = schema;
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
        PaidHolidays other = (PaidHolidays) o;
        return 
            Objects.deepEquals(this.schema, other.schema);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            schema);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PaidHolidays.class,
                "schema", schema);
    }
    
    public final static class Builder {
 
        private Optional<? extends Schema> schema = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder schema(Schema schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = Optional.ofNullable(schema);
            return this;
        }

        public Builder schema(Optional<? extends Schema> schema) {
            Utils.checkNotNull(schema, "schema");
            this.schema = schema;
            return this;
        }
        
        public PaidHolidays build() {
            return new PaidHolidays(
                schema);
        }
    }
}

