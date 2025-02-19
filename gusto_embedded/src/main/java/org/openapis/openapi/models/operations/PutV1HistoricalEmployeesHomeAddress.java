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
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class PutV1HistoricalEmployeesHomeAddress {

    @JsonProperty("street_1")
    private String street1;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("street_2")
    private JsonNullable<String> street2;

    @JsonProperty("city")
    private String city;

    @JsonProperty("state")
    private String state;

    @JsonProperty("zip")
    private String zip;

    @JsonCreator
    public PutV1HistoricalEmployeesHomeAddress(
            @JsonProperty("street_1") String street1,
            @JsonProperty("street_2") JsonNullable<String> street2,
            @JsonProperty("city") String city,
            @JsonProperty("state") String state,
            @JsonProperty("zip") String zip) {
        Utils.checkNotNull(street1, "street1");
        Utils.checkNotNull(street2, "street2");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(zip, "zip");
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    
    public PutV1HistoricalEmployeesHomeAddress(
            String street1,
            String city,
            String state,
            String zip) {
        this(street1, JsonNullable.undefined(), city, state, zip);
    }

    @JsonIgnore
    public String street1() {
        return street1;
    }

    @JsonIgnore
    public JsonNullable<String> street2() {
        return street2;
    }

    @JsonIgnore
    public String city() {
        return city;
    }

    @JsonIgnore
    public String state() {
        return state;
    }

    @JsonIgnore
    public String zip() {
        return zip;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PutV1HistoricalEmployeesHomeAddress withStreet1(String street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = street1;
        return this;
    }

    public PutV1HistoricalEmployeesHomeAddress withStreet2(String street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = JsonNullable.of(street2);
        return this;
    }

    public PutV1HistoricalEmployeesHomeAddress withStreet2(JsonNullable<String> street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = street2;
        return this;
    }

    public PutV1HistoricalEmployeesHomeAddress withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    public PutV1HistoricalEmployeesHomeAddress withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public PutV1HistoricalEmployeesHomeAddress withZip(String zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = zip;
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
        PutV1HistoricalEmployeesHomeAddress other = (PutV1HistoricalEmployeesHomeAddress) o;
        return 
            Objects.deepEquals(this.street1, other.street1) &&
            Objects.deepEquals(this.street2, other.street2) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.zip, other.zip);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            street1,
            street2,
            city,
            state,
            zip);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1HistoricalEmployeesHomeAddress.class,
                "street1", street1,
                "street2", street2,
                "city", city,
                "state", state,
                "zip", zip);
    }
    
    public final static class Builder {
 
        private String street1;
 
        private JsonNullable<String> street2 = JsonNullable.undefined();
 
        private String city;
 
        private String state;
 
        private String zip;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder street1(String street1) {
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
            this.city = city;
            return this;
        }

        public Builder state(String state) {
            Utils.checkNotNull(state, "state");
            this.state = state;
            return this;
        }

        public Builder zip(String zip) {
            Utils.checkNotNull(zip, "zip");
            this.zip = zip;
            return this;
        }
        
        public PutV1HistoricalEmployeesHomeAddress build() {
            return new PutV1HistoricalEmployeesHomeAddress(
                street1,
                street2,
                city,
                state,
                zip);
        }
    }
}

