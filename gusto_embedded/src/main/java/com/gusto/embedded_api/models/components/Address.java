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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Address
 * 
 * <p>The contractor’s home address.
 */

public class Address {

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
    public Address(
            @JsonProperty("street_1") Optional<String> street1,
            @JsonProperty("street_2") JsonNullable<String> street2,
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("zip") Optional<String> zip,
            @JsonProperty("country") Optional<String> country) {
        Utils.checkNotNull(street1, "street1");
        Utils.checkNotNull(street2, "street2");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(zip, "zip");
        Utils.checkNotNull(country, "country");
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
    
    public Address() {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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

    public Address withStreet1(String street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = Optional.ofNullable(street1);
        return this;
    }

    public Address withStreet1(Optional<String> street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = street1;
        return this;
    }

    public Address withStreet2(String street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = JsonNullable.of(street2);
        return this;
    }

    public Address withStreet2(JsonNullable<String> street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = street2;
        return this;
    }

    public Address withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    public Address withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    public Address withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    public Address withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public Address withZip(String zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = Optional.ofNullable(zip);
        return this;
    }

    public Address withZip(Optional<String> zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = zip;
        return this;
    }

    public Address withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    public Address withCountry(Optional<String> country) {
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
        Address other = (Address) o;
        return 
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
            street1,
            street2,
            city,
            state,
            zip,
            country);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Address.class,
                "street1", street1,
                "street2", street2,
                "city", city,
                "state", state,
                "zip", zip,
                "country", country);
    }
    
    public final static class Builder {
 
        private Optional<String> street1 = Optional.empty();
 
        private JsonNullable<String> street2 = JsonNullable.undefined();
 
        private Optional<String> city = Optional.empty();
 
        private Optional<String> state = Optional.empty();
 
        private Optional<String> zip = Optional.empty();
 
        private Optional<String> country = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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
        
        public Address build() {
            return new Address(
                street1,
                street2,
                city,
                state,
                zip,
                country);
        }
    }
}

