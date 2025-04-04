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
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * PutV1LocationsLocationIdRequestBody
 * 
 * <p>Update a location
 */

public class PutV1LocationsLocationIdRequestBody {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone_number")
    private Optional<String> phoneNumber;

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

    /**
     * For a company location, specify if this location is the company's mailing address. A company has a single mailing address, so this designation will override any previous selection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mailing_address")
    private Optional<Boolean> mailingAddress;

    /**
     * For a company location, specify if this location is the company's filing address. A company has a single filing address, so this designation will override any previous selection.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filing_address")
    private Optional<Boolean> filingAddress;

    @JsonCreator
    public PutV1LocationsLocationIdRequestBody(
            @JsonProperty("version") String version,
            @JsonProperty("phone_number") Optional<String> phoneNumber,
            @JsonProperty("street_1") Optional<String> street1,
            @JsonProperty("street_2") JsonNullable<String> street2,
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("zip") Optional<String> zip,
            @JsonProperty("country") Optional<String> country,
            @JsonProperty("mailing_address") Optional<Boolean> mailingAddress,
            @JsonProperty("filing_address") Optional<Boolean> filingAddress) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        Utils.checkNotNull(street1, "street1");
        Utils.checkNotNull(street2, "street2");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(zip, "zip");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(mailingAddress, "mailingAddress");
        Utils.checkNotNull(filingAddress, "filingAddress");
        this.version = version;
        this.phoneNumber = phoneNumber;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.mailingAddress = mailingAddress;
        this.filingAddress = filingAddress;
    }
    
    public PutV1LocationsLocationIdRequestBody(
            String version) {
        this(version, Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
    }

    @JsonIgnore
    public Optional<String> phoneNumber() {
        return phoneNumber;
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

    /**
     * For a company location, specify if this location is the company's mailing address. A company has a single mailing address, so this designation will override any previous selection.
     */
    @JsonIgnore
    public Optional<Boolean> mailingAddress() {
        return mailingAddress;
    }

    /**
     * For a company location, specify if this location is the company's filing address. A company has a single filing address, so this designation will override any previous selection.
     */
    @JsonIgnore
    public Optional<Boolean> filingAddress() {
        return filingAddress;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public PutV1LocationsLocationIdRequestBody withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withPhoneNumber(String phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = Optional.ofNullable(phoneNumber);
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withPhoneNumber(Optional<String> phoneNumber) {
        Utils.checkNotNull(phoneNumber, "phoneNumber");
        this.phoneNumber = phoneNumber;
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withStreet1(String street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = Optional.ofNullable(street1);
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withStreet1(Optional<String> street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = street1;
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withStreet2(String street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = JsonNullable.of(street2);
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withStreet2(JsonNullable<String> street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = street2;
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withZip(String zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = Optional.ofNullable(zip);
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withZip(Optional<String> zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = zip;
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    public PutV1LocationsLocationIdRequestBody withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * For a company location, specify if this location is the company's mailing address. A company has a single mailing address, so this designation will override any previous selection.
     */
    public PutV1LocationsLocationIdRequestBody withMailingAddress(boolean mailingAddress) {
        Utils.checkNotNull(mailingAddress, "mailingAddress");
        this.mailingAddress = Optional.ofNullable(mailingAddress);
        return this;
    }

    /**
     * For a company location, specify if this location is the company's mailing address. A company has a single mailing address, so this designation will override any previous selection.
     */
    public PutV1LocationsLocationIdRequestBody withMailingAddress(Optional<Boolean> mailingAddress) {
        Utils.checkNotNull(mailingAddress, "mailingAddress");
        this.mailingAddress = mailingAddress;
        return this;
    }

    /**
     * For a company location, specify if this location is the company's filing address. A company has a single filing address, so this designation will override any previous selection.
     */
    public PutV1LocationsLocationIdRequestBody withFilingAddress(boolean filingAddress) {
        Utils.checkNotNull(filingAddress, "filingAddress");
        this.filingAddress = Optional.ofNullable(filingAddress);
        return this;
    }

    /**
     * For a company location, specify if this location is the company's filing address. A company has a single filing address, so this designation will override any previous selection.
     */
    public PutV1LocationsLocationIdRequestBody withFilingAddress(Optional<Boolean> filingAddress) {
        Utils.checkNotNull(filingAddress, "filingAddress");
        this.filingAddress = filingAddress;
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
        PutV1LocationsLocationIdRequestBody other = (PutV1LocationsLocationIdRequestBody) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.phoneNumber, other.phoneNumber) &&
            Objects.deepEquals(this.street1, other.street1) &&
            Objects.deepEquals(this.street2, other.street2) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.zip, other.zip) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.mailingAddress, other.mailingAddress) &&
            Objects.deepEquals(this.filingAddress, other.filingAddress);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            version,
            phoneNumber,
            street1,
            street2,
            city,
            state,
            zip,
            country,
            mailingAddress,
            filingAddress);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1LocationsLocationIdRequestBody.class,
                "version", version,
                "phoneNumber", phoneNumber,
                "street1", street1,
                "street2", street2,
                "city", city,
                "state", state,
                "zip", zip,
                "country", country,
                "mailingAddress", mailingAddress,
                "filingAddress", filingAddress);
    }
    
    public final static class Builder {
 
        private String version;
 
        private Optional<String> phoneNumber = Optional.empty();
 
        private Optional<String> street1 = Optional.empty();
 
        private JsonNullable<String> street2 = JsonNullable.undefined();
 
        private Optional<String> city = Optional.empty();
 
        private Optional<String> state = Optional.empty();
 
        private Optional<String> zip = Optional.empty();
 
        private Optional<String> country = Optional.empty();
 
        private Optional<Boolean> mailingAddress = Optional.empty();
 
        private Optional<Boolean> filingAddress = Optional.empty();  
        
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

        public Builder phoneNumber(String phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = Optional.ofNullable(phoneNumber);
            return this;
        }

        public Builder phoneNumber(Optional<String> phoneNumber) {
            Utils.checkNotNull(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
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

        /**
         * For a company location, specify if this location is the company's mailing address. A company has a single mailing address, so this designation will override any previous selection.
         */
        public Builder mailingAddress(boolean mailingAddress) {
            Utils.checkNotNull(mailingAddress, "mailingAddress");
            this.mailingAddress = Optional.ofNullable(mailingAddress);
            return this;
        }

        /**
         * For a company location, specify if this location is the company's mailing address. A company has a single mailing address, so this designation will override any previous selection.
         */
        public Builder mailingAddress(Optional<Boolean> mailingAddress) {
            Utils.checkNotNull(mailingAddress, "mailingAddress");
            this.mailingAddress = mailingAddress;
            return this;
        }

        /**
         * For a company location, specify if this location is the company's filing address. A company has a single filing address, so this designation will override any previous selection.
         */
        public Builder filingAddress(boolean filingAddress) {
            Utils.checkNotNull(filingAddress, "filingAddress");
            this.filingAddress = Optional.ofNullable(filingAddress);
            return this;
        }

        /**
         * For a company location, specify if this location is the company's filing address. A company has a single filing address, so this designation will override any previous selection.
         */
        public Builder filingAddress(Optional<Boolean> filingAddress) {
            Utils.checkNotNull(filingAddress, "filingAddress");
            this.filingAddress = filingAddress;
            return this;
        }
        
        public PutV1LocationsLocationIdRequestBody build() {
            return new PutV1LocationsLocationIdRequestBody(
                version,
                phoneNumber,
                street1,
                street2,
                city,
                state,
                zip,
                country,
                mailingAddress,
                filingAddress);
        }
    }
}

