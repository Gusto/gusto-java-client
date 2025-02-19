/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;


public class Termination {

    /**
     * Date the employee was terminated from the company
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_date")
    private Optional<LocalDate> effectiveDate;

    @JsonCreator
    public Termination(
            @JsonProperty("effective_date") Optional<LocalDate> effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
    }
    
    public Termination() {
        this(Optional.empty());
    }

    /**
     * Date the employee was terminated from the company
     */
    @JsonIgnore
    public Optional<LocalDate> effectiveDate() {
        return effectiveDate;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Date the employee was terminated from the company
     */
    public Termination withEffectiveDate(LocalDate effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = Optional.ofNullable(effectiveDate);
        return this;
    }

    /**
     * Date the employee was terminated from the company
     */
    public Termination withEffectiveDate(Optional<LocalDate> effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
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
        Termination other = (Termination) o;
        return 
            Objects.deepEquals(this.effectiveDate, other.effectiveDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            effectiveDate);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Termination.class,
                "effectiveDate", effectiveDate);
    }
    
    public final static class Builder {
 
        private Optional<LocalDate> effectiveDate = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Date the employee was terminated from the company
         */
        public Builder effectiveDate(LocalDate effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = Optional.ofNullable(effectiveDate);
            return this;
        }

        /**
         * Date the employee was terminated from the company
         */
        public Builder effectiveDate(Optional<LocalDate> effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = effectiveDate;
            return this;
        }
        
        public Termination build() {
            return new Termination(
                effectiveDate);
        }
    }
}

