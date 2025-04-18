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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class PutV1CompanyBenefitsCompanyBenefitIdRequestBody {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

    /**
     * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<Boolean> active;

    /**
     * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<String> description;

    @JsonCreator
    public PutV1CompanyBenefitsCompanyBenefitIdRequestBody(
            @JsonProperty("version") String version,
            @JsonProperty("active") Optional<Boolean> active,
            @JsonProperty("description") Optional<String> description) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(description, "description");
        this.version = version;
        this.active = active;
        this.description = description;
    }
    
    public PutV1CompanyBenefitsCompanyBenefitIdRequestBody(
            String version) {
        this(version, Optional.empty(), Optional.empty());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
    }

    /**
     * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
     */
    @JsonIgnore
    public Optional<Boolean> active() {
        return active;
    }

    /**
     * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
     */
    @JsonIgnore
    public Optional<String> description() {
        return description;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    public PutV1CompanyBenefitsCompanyBenefitIdRequestBody withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
     */
    public PutV1CompanyBenefitsCompanyBenefitIdRequestBody withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    /**
     * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
     */
    public PutV1CompanyBenefitsCompanyBenefitIdRequestBody withActive(Optional<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
     */
    public PutV1CompanyBenefitsCompanyBenefitIdRequestBody withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
     */
    public PutV1CompanyBenefitsCompanyBenefitIdRequestBody withDescription(Optional<String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
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
        PutV1CompanyBenefitsCompanyBenefitIdRequestBody other = (PutV1CompanyBenefitsCompanyBenefitIdRequestBody) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.description, other.description);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            version,
            active,
            description);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1CompanyBenefitsCompanyBenefitIdRequestBody.class,
                "version", version,
                "active", active,
                "description", description);
    }
    
    public final static class Builder {
 
        private String version;
 
        private Optional<Boolean> active = Optional.empty();
 
        private Optional<String> description = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        /**
         * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        /**
         * Whether this benefit is active for employee participation. Company benefits may only be deactivated if no employees are actively participating.
         */
        public Builder active(Optional<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        /**
         * The description of the company benefit. For example, a company may offer multiple benefits with an ID of 1 (for Medical Insurance). The description would show something more specific like “Kaiser Permanente” or “Blue Cross/ Blue Shield”.
         */
        public Builder description(Optional<String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }
        
        public PutV1CompanyBenefitsCompanyBenefitIdRequestBody build() {
            return new PutV1CompanyBenefitsCompanyBenefitIdRequestBody(
                version,
                active,
                description);
        }
    }
}

