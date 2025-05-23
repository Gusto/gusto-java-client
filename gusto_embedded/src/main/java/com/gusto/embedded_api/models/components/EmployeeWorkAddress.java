/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * EmployeeWorkAddress
 * 
 * <p>List of employee work addresses
 */

public class EmployeeWorkAddress {

    /**
     * The unique identifier of this work address.
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * The date the employee began working at this location.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("effective_date")
    private Optional<String> effectiveDate;

    /**
     * Signifies if this address is the active work address for the current date
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<Boolean> active;

    /**
     * UUID reference to the company location for this work address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location_uuid")
    private Optional<String> locationUuid;

    /**
     * UUID reference to the employee for this work address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_uuid")
    private Optional<String> employeeUuid;

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("street_1")
    private Optional<String> street1;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("street_2")
    private JsonNullable<String> street2;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<String> city;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("state")
    private Optional<String> state;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("zip")
    private Optional<String> zip;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<String> country;

    @JsonCreator
    public EmployeeWorkAddress(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("effective_date") Optional<String> effectiveDate,
            @JsonProperty("active") Optional<Boolean> active,
            @JsonProperty("location_uuid") Optional<String> locationUuid,
            @JsonProperty("employee_uuid") Optional<String> employeeUuid,
            @JsonProperty("version") String version,
            @JsonProperty("street_1") Optional<String> street1,
            @JsonProperty("street_2") JsonNullable<String> street2,
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("zip") Optional<String> zip,
            @JsonProperty("country") Optional<String> country) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(locationUuid, "locationUuid");
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(street1, "street1");
        Utils.checkNotNull(street2, "street2");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(zip, "zip");
        Utils.checkNotNull(country, "country");
        this.uuid = uuid;
        this.effectiveDate = effectiveDate;
        this.active = active;
        this.locationUuid = locationUuid;
        this.employeeUuid = employeeUuid;
        this.version = version;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
    
    public EmployeeWorkAddress(
            String uuid,
            String version) {
        this(uuid, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), version, Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The unique identifier of this work address.
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * The date the employee began working at this location.
     */
    @JsonIgnore
    public Optional<String> effectiveDate() {
        return effectiveDate;
    }

    /**
     * Signifies if this address is the active work address for the current date
     */
    @JsonIgnore
    public Optional<Boolean> active() {
        return active;
    }

    /**
     * UUID reference to the company location for this work address.
     */
    @JsonIgnore
    public Optional<String> locationUuid() {
        return locationUuid;
    }

    /**
     * UUID reference to the employee for this work address.
     */
    @JsonIgnore
    public Optional<String> employeeUuid() {
        return employeeUuid;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
    }

    @JsonIgnore
    public Optional<String> street1() {
        return street1;
    }

    @JsonIgnore
    public JsonNullable<String> street2() {
        return street2;
    }

    @JsonIgnore
    public Optional<String> city() {
        return city;
    }

    @JsonIgnore
    public Optional<String> state() {
        return state;
    }

    @JsonIgnore
    public Optional<String> zip() {
        return zip;
    }

    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The unique identifier of this work address.
     */
    public EmployeeWorkAddress withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The date the employee began working at this location.
     */
    public EmployeeWorkAddress withEffectiveDate(String effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = Optional.ofNullable(effectiveDate);
        return this;
    }

    /**
     * The date the employee began working at this location.
     */
    public EmployeeWorkAddress withEffectiveDate(Optional<String> effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Signifies if this address is the active work address for the current date
     */
    public EmployeeWorkAddress withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    /**
     * Signifies if this address is the active work address for the current date
     */
    public EmployeeWorkAddress withActive(Optional<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * UUID reference to the company location for this work address.
     */
    public EmployeeWorkAddress withLocationUuid(String locationUuid) {
        Utils.checkNotNull(locationUuid, "locationUuid");
        this.locationUuid = Optional.ofNullable(locationUuid);
        return this;
    }

    /**
     * UUID reference to the company location for this work address.
     */
    public EmployeeWorkAddress withLocationUuid(Optional<String> locationUuid) {
        Utils.checkNotNull(locationUuid, "locationUuid");
        this.locationUuid = locationUuid;
        return this;
    }

    /**
     * UUID reference to the employee for this work address.
     */
    public EmployeeWorkAddress withEmployeeUuid(String employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = Optional.ofNullable(employeeUuid);
        return this;
    }

    /**
     * UUID reference to the employee for this work address.
     */
    public EmployeeWorkAddress withEmployeeUuid(Optional<String> employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = employeeUuid;
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public EmployeeWorkAddress withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    public EmployeeWorkAddress withStreet1(String street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = Optional.ofNullable(street1);
        return this;
    }

    public EmployeeWorkAddress withStreet1(Optional<String> street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = street1;
        return this;
    }

    public EmployeeWorkAddress withStreet2(String street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = JsonNullable.of(street2);
        return this;
    }

    public EmployeeWorkAddress withStreet2(JsonNullable<String> street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = street2;
        return this;
    }

    public EmployeeWorkAddress withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    public EmployeeWorkAddress withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    public EmployeeWorkAddress withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    public EmployeeWorkAddress withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public EmployeeWorkAddress withZip(String zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = Optional.ofNullable(zip);
        return this;
    }

    public EmployeeWorkAddress withZip(Optional<String> zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = zip;
        return this;
    }

    public EmployeeWorkAddress withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    public EmployeeWorkAddress withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
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
        EmployeeWorkAddress other = (EmployeeWorkAddress) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.effectiveDate, other.effectiveDate) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.locationUuid, other.locationUuid) &&
            Objects.deepEquals(this.employeeUuid, other.employeeUuid) &&
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.street1, other.street1) &&
            Objects.deepEquals(this.street2, other.street2) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.zip, other.zip) &&
            Objects.deepEquals(this.country, other.country);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            effectiveDate,
            active,
            locationUuid,
            employeeUuid,
            version,
            street1,
            street2,
            city,
            state,
            zip,
            country);
    }
    
    @Override
    public String toString() {
        return Utils.toString(EmployeeWorkAddress.class,
                "uuid", uuid,
                "effectiveDate", effectiveDate,
                "active", active,
                "locationUuid", locationUuid,
                "employeeUuid", employeeUuid,
                "version", version,
                "street1", street1,
                "street2", street2,
                "city", city,
                "state", state,
                "zip", zip,
                "country", country);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<String> effectiveDate = Optional.empty();
 
        private Optional<Boolean> active = Optional.empty();
 
        private Optional<String> locationUuid = Optional.empty();
 
        private Optional<String> employeeUuid = Optional.empty();
 
        private String version;
 
        private Optional<String> street1 = Optional.empty();
 
        private JsonNullable<String> street2 = JsonNullable.undefined();
 
        private Optional<String> city = Optional.empty();
 
        private Optional<String> state = Optional.empty();
 
        private Optional<String> zip = Optional.empty();
 
        private Optional<String> country;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The unique identifier of this work address.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The date the employee began working at this location.
         */
        public Builder effectiveDate(String effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = Optional.ofNullable(effectiveDate);
            return this;
        }

        /**
         * The date the employee began working at this location.
         */
        public Builder effectiveDate(Optional<String> effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * Signifies if this address is the active work address for the current date
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        /**
         * Signifies if this address is the active work address for the current date
         */
        public Builder active(Optional<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * UUID reference to the company location for this work address.
         */
        public Builder locationUuid(String locationUuid) {
            Utils.checkNotNull(locationUuid, "locationUuid");
            this.locationUuid = Optional.ofNullable(locationUuid);
            return this;
        }

        /**
         * UUID reference to the company location for this work address.
         */
        public Builder locationUuid(Optional<String> locationUuid) {
            Utils.checkNotNull(locationUuid, "locationUuid");
            this.locationUuid = locationUuid;
            return this;
        }

        /**
         * UUID reference to the employee for this work address.
         */
        public Builder employeeUuid(String employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = Optional.ofNullable(employeeUuid);
            return this;
        }

        /**
         * UUID reference to the employee for this work address.
         */
        public Builder employeeUuid(Optional<String> employeeUuid) {
            Utils.checkNotNull(employeeUuid, "employeeUuid");
            this.employeeUuid = employeeUuid;
            return this;
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        public Builder street1(String street1) {
            Utils.checkNotNull(street1, "street1");
            this.street1 = Optional.ofNullable(street1);
            return this;
        }

        public Builder street1(Optional<String> street1) {
            Utils.checkNotNull(street1, "street1");
            this.street1 = street1;
            return this;
        }

        public Builder street2(String street2) {
            Utils.checkNotNull(street2, "street2");
            this.street2 = JsonNullable.of(street2);
            return this;
        }

        public Builder street2(JsonNullable<String> street2) {
            Utils.checkNotNull(street2, "street2");
            this.street2 = street2;
            return this;
        }

        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = Optional.ofNullable(city);
            return this;
        }

        public Builder city(Optional<String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = Optional.ofNullable(state);
            return this;
        }

        public Builder state(Optional<String> state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        public Builder zip(String zip) {
            Utils.checkNotNull(zip, "zip");
            this.zip = Optional.ofNullable(zip);
            return this;
        }

        public Builder zip(Optional<String> zip) {
            Utils.checkNotNull(zip, "zip");
            this.zip = zip;
            return this;
        }

        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        public Builder country(Optional<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }
        
        public EmployeeWorkAddress build() {
            if (country == null) {
                country = _SINGLETON_VALUE_Country.value();
            }            return new EmployeeWorkAddress(
                uuid,
                effectiveDate,
                active,
                locationUuid,
                employeeUuid,
                version,
                street1,
                street2,
                city,
                state,
                zip,
                country);
        }

        private static final LazySingletonValue<Optional<String>> _SINGLETON_VALUE_Country =
                new LazySingletonValue<>(
                        "country",
                        "\"USA\"",
                        new TypeReference<Optional<String>>() {});
    }
}

