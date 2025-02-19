/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


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


public class PutCompaniesCompanyUuidHolidayPayPolicyLaborDay {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("selected")
    private Optional<Boolean> selected;

    @JsonCreator
    public PutCompaniesCompanyUuidHolidayPayPolicyLaborDay(
            @JsonProperty("selected") Optional<Boolean> selected) {
        Utils.checkNotNull(selected, "selected");
        this.selected = selected;
    }
    
    public PutCompaniesCompanyUuidHolidayPayPolicyLaborDay() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<Boolean> selected() {
        return selected;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PutCompaniesCompanyUuidHolidayPayPolicyLaborDay withSelected(boolean selected) {
        Utils.checkNotNull(selected, "selected");
        this.selected = Optional.ofNullable(selected);
        return this;
    }

    public PutCompaniesCompanyUuidHolidayPayPolicyLaborDay withSelected(Optional<Boolean> selected) {
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
        PutCompaniesCompanyUuidHolidayPayPolicyLaborDay other = (PutCompaniesCompanyUuidHolidayPayPolicyLaborDay) o;
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
        return Utils.toString(PutCompaniesCompanyUuidHolidayPayPolicyLaborDay.class,
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
        
        public PutCompaniesCompanyUuidHolidayPayPolicyLaborDay build() {
            return new PutCompaniesCompanyUuidHolidayPayPolicyLaborDay(
                selected);
        }
    }
}

