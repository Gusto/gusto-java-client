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
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;


public class PostV1EmployeesEmployeeIdHomeAddressesRequestBody {

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
    @JsonProperty("effective_date")
    private Optional<LocalDate> effectiveDate;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("courtesy_withholding")
    private Optional<Boolean> courtesyWithholding;

    @JsonCreator
    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody(
            @JsonProperty("street_1") Optional<String> street1,
            @JsonProperty("street_2") JsonNullable<String> street2,
            @JsonProperty("city") Optional<String> city,
            @JsonProperty("state") Optional<String> state,
            @JsonProperty("zip") Optional<String> zip,
            @JsonProperty("effective_date") Optional<LocalDate> effectiveDate,
            @JsonProperty("courtesy_withholding") Optional<Boolean> courtesyWithholding) {
        Utils.checkNotNull(street1, "street1");
        Utils.checkNotNull(street2, "street2");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(state, "state");
        Utils.checkNotNull(zip, "zip");
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        Utils.checkNotNull(courtesyWithholding, "courtesyWithholding");
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.effectiveDate = effectiveDate;
        this.courtesyWithholding = courtesyWithholding;
    }
    
    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody() {
        this(Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public Optional<LocalDate> effectiveDate() {
        return effectiveDate;
    }

    @JsonIgnore
    public Optional<Boolean> courtesyWithholding() {
        return courtesyWithholding;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withStreet1(String street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = Optional.ofNullable(street1);
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withStreet1(Optional<String> street1) {
        Utils.checkNotNull(street1, "street1");
        this.street1 = street1;
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withStreet2(String street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = JsonNullable.of(street2);
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withStreet2(JsonNullable<String> street2) {
        Utils.checkNotNull(street2, "street2");
        this.street2 = street2;
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withCity(Optional<String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withState(String state) {
        Utils.checkNotNull(state, "state");
        this.state = Optional.ofNullable(state);
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withState(Optional<String> state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withZip(String zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = Optional.ofNullable(zip);
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withZip(Optional<String> zip) {
        Utils.checkNotNull(zip, "zip");
        this.zip = zip;
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withEffectiveDate(LocalDate effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = Optional.ofNullable(effectiveDate);
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withEffectiveDate(Optional<LocalDate> effectiveDate) {
        Utils.checkNotNull(effectiveDate, "effectiveDate");
        this.effectiveDate = effectiveDate;
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withCourtesyWithholding(boolean courtesyWithholding) {
        Utils.checkNotNull(courtesyWithholding, "courtesyWithholding");
        this.courtesyWithholding = Optional.ofNullable(courtesyWithholding);
        return this;
    }

    public PostV1EmployeesEmployeeIdHomeAddressesRequestBody withCourtesyWithholding(Optional<Boolean> courtesyWithholding) {
        Utils.checkNotNull(courtesyWithholding, "courtesyWithholding");
        this.courtesyWithholding = courtesyWithholding;
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
        PostV1EmployeesEmployeeIdHomeAddressesRequestBody other = (PostV1EmployeesEmployeeIdHomeAddressesRequestBody) o;
        return 
            Objects.deepEquals(this.street1, other.street1) &&
            Objects.deepEquals(this.street2, other.street2) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.state, other.state) &&
            Objects.deepEquals(this.zip, other.zip) &&
            Objects.deepEquals(this.effectiveDate, other.effectiveDate) &&
            Objects.deepEquals(this.courtesyWithholding, other.courtesyWithholding);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            street1,
            street2,
            city,
            state,
            zip,
            effectiveDate,
            courtesyWithholding);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1EmployeesEmployeeIdHomeAddressesRequestBody.class,
                "street1", street1,
                "street2", street2,
                "city", city,
                "state", state,
                "zip", zip,
                "effectiveDate", effectiveDate,
                "courtesyWithholding", courtesyWithholding);
    }
    
    public final static class Builder {
 
        private Optional<String> street1 = Optional.empty();
 
        private JsonNullable<String> street2 = JsonNullable.undefined();
 
        private Optional<String> city = Optional.empty();
 
        private Optional<String> state = Optional.empty();
 
        private Optional<String> zip = Optional.empty();
 
        private Optional<LocalDate> effectiveDate = Optional.empty();
 
        private Optional<Boolean> courtesyWithholding = Optional.empty();  
        
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

        public Builder effectiveDate(LocalDate effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = Optional.ofNullable(effectiveDate);
            return this;
        }

        public Builder effectiveDate(Optional<LocalDate> effectiveDate) {
            Utils.checkNotNull(effectiveDate, "effectiveDate");
            this.effectiveDate = effectiveDate;
            return this;
        }

        public Builder courtesyWithholding(boolean courtesyWithholding) {
            Utils.checkNotNull(courtesyWithholding, "courtesyWithholding");
            this.courtesyWithholding = Optional.ofNullable(courtesyWithholding);
            return this;
        }

        public Builder courtesyWithholding(Optional<Boolean> courtesyWithholding) {
            Utils.checkNotNull(courtesyWithholding, "courtesyWithholding");
            this.courtesyWithholding = courtesyWithholding;
            return this;
        }
        
        public PostV1EmployeesEmployeeIdHomeAddressesRequestBody build() {
            return new PostV1EmployeesEmployeeIdHomeAddressesRequestBody(
                street1,
                street2,
                city,
                state,
                zip,
                effectiveDate,
                courtesyWithholding);
        }
    }
}

