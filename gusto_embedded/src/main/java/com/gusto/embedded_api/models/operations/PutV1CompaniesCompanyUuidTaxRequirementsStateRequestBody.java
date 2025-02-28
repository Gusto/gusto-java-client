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

public class PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("requirement_sets")
    private Optional<? extends List<RequirementSets>> requirementSets;

    @JsonCreator
    public PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody(
            @JsonProperty("requirement_sets") Optional<? extends List<RequirementSets>> requirementSets) {
        Utils.checkNotNull(requirementSets, "requirementSets");
        this.requirementSets = requirementSets;
    }
    
    public PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<RequirementSets>> requirementSets() {
        return (Optional<List<RequirementSets>>) requirementSets;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody withRequirementSets(List<RequirementSets> requirementSets) {
        Utils.checkNotNull(requirementSets, "requirementSets");
        this.requirementSets = Optional.ofNullable(requirementSets);
        return this;
    }

    public PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody withRequirementSets(Optional<? extends List<RequirementSets>> requirementSets) {
        Utils.checkNotNull(requirementSets, "requirementSets");
        this.requirementSets = requirementSets;
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
        PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody other = (PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody) o;
        return 
            Objects.deepEquals(this.requirementSets, other.requirementSets);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            requirementSets);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody.class,
                "requirementSets", requirementSets);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<RequirementSets>> requirementSets = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder requirementSets(List<RequirementSets> requirementSets) {
            Utils.checkNotNull(requirementSets, "requirementSets");
            this.requirementSets = Optional.ofNullable(requirementSets);
            return this;
        }

        public Builder requirementSets(Optional<? extends List<RequirementSets>> requirementSets) {
            Utils.checkNotNull(requirementSets, "requirementSets");
            this.requirementSets = requirementSets;
            return this;
        }
        
        public PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody build() {
            return new PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody(
                requirementSets);
        }
    }
}

