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
import java.util.Objects;
import java.util.Optional;
/**
 * ExternalPayrollMetadata
 * 
 * <p>Stores metadata of the external payroll.
 */

public class ExternalPayrollMetadata {

    /**
     * Determines if the external payroll can be deleted.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("deletable")
    private Optional<Boolean> deletable;

    @JsonCreator
    public ExternalPayrollMetadata(
            @JsonProperty("deletable") Optional<Boolean> deletable) {
        Utils.checkNotNull(deletable, "deletable");
        this.deletable = deletable;
    }
    
    public ExternalPayrollMetadata() {
        this(Optional.empty());
    }

    /**
     * Determines if the external payroll can be deleted.
     */
    @JsonIgnore
    public Optional<Boolean> deletable() {
        return deletable;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Determines if the external payroll can be deleted.
     */
    public ExternalPayrollMetadata withDeletable(boolean deletable) {
        Utils.checkNotNull(deletable, "deletable");
        this.deletable = Optional.ofNullable(deletable);
        return this;
    }

    /**
     * Determines if the external payroll can be deleted.
     */
    public ExternalPayrollMetadata withDeletable(Optional<Boolean> deletable) {
        Utils.checkNotNull(deletable, "deletable");
        this.deletable = deletable;
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
        ExternalPayrollMetadata other = (ExternalPayrollMetadata) o;
        return 
            Objects.deepEquals(this.deletable, other.deletable);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            deletable);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ExternalPayrollMetadata.class,
                "deletable", deletable);
    }
    
    public final static class Builder {
 
        private Optional<Boolean> deletable = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Determines if the external payroll can be deleted.
         */
        public Builder deletable(boolean deletable) {
            Utils.checkNotNull(deletable, "deletable");
            this.deletable = Optional.ofNullable(deletable);
            return this;
        }

        /**
         * Determines if the external payroll can be deleted.
         */
        public Builder deletable(Optional<Boolean> deletable) {
            Utils.checkNotNull(deletable, "deletable");
            this.deletable = deletable;
            return this;
        }
        
        public ExternalPayrollMetadata build() {
            return new ExternalPayrollMetadata(
                deletable);
        }
    }
}

