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
import java.util.Objects;
import java.util.Optional;

public class PutCompaniesCompanyUuidHolidayPayPolicyRequestBody {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

    /**
     * An object containing federal holiday objects, each containing a boolean selected property.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("federal_holidays")
    private Optional<? extends PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays> federalHolidays;

    @JsonCreator
    public PutCompaniesCompanyUuidHolidayPayPolicyRequestBody(
            @JsonProperty("version") String version,
            @JsonProperty("federal_holidays") Optional<? extends PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays> federalHolidays) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(federalHolidays, "federalHolidays");
        this.version = version;
        this.federalHolidays = federalHolidays;
    }
    
    public PutCompaniesCompanyUuidHolidayPayPolicyRequestBody(
            String version) {
        this(version, Optional.empty());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
    }

    /**
     * An object containing federal holiday objects, each containing a boolean selected property.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays> federalHolidays() {
        return (Optional<PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays>) federalHolidays;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public PutCompaniesCompanyUuidHolidayPayPolicyRequestBody withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * An object containing federal holiday objects, each containing a boolean selected property.
     */
    public PutCompaniesCompanyUuidHolidayPayPolicyRequestBody withFederalHolidays(PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays federalHolidays) {
        Utils.checkNotNull(federalHolidays, "federalHolidays");
        this.federalHolidays = Optional.ofNullable(federalHolidays);
        return this;
    }

    /**
     * An object containing federal holiday objects, each containing a boolean selected property.
     */
    public PutCompaniesCompanyUuidHolidayPayPolicyRequestBody withFederalHolidays(Optional<? extends PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays> federalHolidays) {
        Utils.checkNotNull(federalHolidays, "federalHolidays");
        this.federalHolidays = federalHolidays;
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
        PutCompaniesCompanyUuidHolidayPayPolicyRequestBody other = (PutCompaniesCompanyUuidHolidayPayPolicyRequestBody) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.federalHolidays, other.federalHolidays);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            version,
            federalHolidays);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutCompaniesCompanyUuidHolidayPayPolicyRequestBody.class,
                "version", version,
                "federalHolidays", federalHolidays);
    }
    
    public final static class Builder {
 
        private String version;
 
        private Optional<? extends PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays> federalHolidays = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        /**
         * An object containing federal holiday objects, each containing a boolean selected property.
         */
        public Builder federalHolidays(PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays federalHolidays) {
            Utils.checkNotNull(federalHolidays, "federalHolidays");
            this.federalHolidays = Optional.ofNullable(federalHolidays);
            return this;
        }

        /**
         * An object containing federal holiday objects, each containing a boolean selected property.
         */
        public Builder federalHolidays(Optional<? extends PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays> federalHolidays) {
            Utils.checkNotNull(federalHolidays, "federalHolidays");
            this.federalHolidays = federalHolidays;
            return this;
        }
        
        public PutCompaniesCompanyUuidHolidayPayPolicyRequestBody build() {
            return new PutCompaniesCompanyUuidHolidayPayPolicyRequestBody(
                version,
                federalHolidays);
        }
    }
}

