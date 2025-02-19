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
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;


public class PutV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBody {

    /**
     * The name of the custom earning type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonCreator
    public PutV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBody(
            @JsonProperty("name") Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
    }
    
    public PutV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBody() {
        this(Optional.empty());
    }

    /**
     * The name of the custom earning type.
     */
    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the custom earning type.
     */
    public PutV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBody withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The name of the custom earning type.
     */
    public PutV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBody withName(Optional<String> name) {
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
        PutV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBody other = (PutV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBody) o;
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
        return Utils.toString(PutV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBody.class,
                "name", name);
    }
    
    public final static class Builder {
 
        private Optional<String> name = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the custom earning type.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        /**
         * The name of the custom earning type.
         */
        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }
        
        public PutV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBody build() {
            return new PutV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBody(
                name);
        }
    }
}

