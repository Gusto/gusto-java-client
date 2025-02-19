/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapis.openapi.utils.Utils;


public class PutV1CompaniesRequestBody {

    /**
     * Whether the company only supports contractors. Must be updated in order for the company to start supporting W-2 employees. Can only be updated from true to false. Note that updating this value will require additional onboarding steps to be completed in order for the company to support W-2 employees.
     */
    @JsonProperty("contractor_only")
    private boolean contractorOnly;

    @JsonCreator
    public PutV1CompaniesRequestBody(
            @JsonProperty("contractor_only") boolean contractorOnly) {
        Utils.checkNotNull(contractorOnly, "contractorOnly");
        this.contractorOnly = contractorOnly;
    }

    /**
     * Whether the company only supports contractors. Must be updated in order for the company to start supporting W-2 employees. Can only be updated from true to false. Note that updating this value will require additional onboarding steps to be completed in order for the company to support W-2 employees.
     */
    @JsonIgnore
    public boolean contractorOnly() {
        return contractorOnly;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether the company only supports contractors. Must be updated in order for the company to start supporting W-2 employees. Can only be updated from true to false. Note that updating this value will require additional onboarding steps to be completed in order for the company to support W-2 employees.
     */
    public PutV1CompaniesRequestBody withContractorOnly(boolean contractorOnly) {
        Utils.checkNotNull(contractorOnly, "contractorOnly");
        this.contractorOnly = contractorOnly;
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
        PutV1CompaniesRequestBody other = (PutV1CompaniesRequestBody) o;
        return 
            Objects.deepEquals(this.contractorOnly, other.contractorOnly);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contractorOnly);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1CompaniesRequestBody.class,
                "contractorOnly", contractorOnly);
    }
    
    public final static class Builder {
 
        private Boolean contractorOnly;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether the company only supports contractors. Must be updated in order for the company to start supporting W-2 employees. Can only be updated from true to false. Note that updating this value will require additional onboarding steps to be completed in order for the company to support W-2 employees.
         */
        public Builder contractorOnly(boolean contractorOnly) {
            Utils.checkNotNull(contractorOnly, "contractorOnly");
            this.contractorOnly = contractorOnly;
            return this;
        }
        
        public PutV1CompaniesRequestBody build() {
            return new PutV1CompaniesRequestBody(
                contractorOnly);
        }
    }
}

