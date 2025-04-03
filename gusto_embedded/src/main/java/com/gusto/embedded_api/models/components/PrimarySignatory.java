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
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * PrimarySignatory
 * 
 * <p>The primary signatory of the company.
 */

public class PrimarySignatory {

    /**
     * The UUID of the company's primary signatory.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    private Optional<String> uuid;

    /**
     * The company's primary signatory's first name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private Optional<String> firstName;

    /**
     * The company's primary signatory's middle initial.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("middle_initial")
    private JsonNullable<String> middleInitial;

    /**
     * The company's primary signatory's last name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private Optional<String> lastName;

    /**
     * The company's primary signatory's phone number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private Optional<String> phone;

    /**
     * The company's primary signatory's email address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    /**
     * The company's primary signatory's home address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("home_address")
    private Optional<? extends CompanyHomeAddress> homeAddress;

    @JsonCreator
    public PrimarySignatory(
            @JsonProperty("uuid") Optional<String> uuid,
            @JsonProperty("first_name") Optional<String> firstName,
            @JsonProperty("middle_initial") JsonNullable<String> middleInitial,
            @JsonProperty("last_name") Optional<String> lastName,
            @JsonProperty("phone") Optional<String> phone,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("home_address") Optional<? extends CompanyHomeAddress> homeAddress) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(middleInitial, "middleInitial");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(homeAddress, "homeAddress");
        this.uuid = uuid;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.homeAddress = homeAddress;
    }
    
    public PrimarySignatory() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the company's primary signatory.
     */
    @JsonIgnore
    public Optional<String> uuid() {
        return uuid;
    }

    /**
     * The company's primary signatory's first name.
     */
    @JsonIgnore
    public Optional<String> firstName() {
        return firstName;
    }

    /**
     * The company's primary signatory's middle initial.
     */
    @JsonIgnore
    public JsonNullable<String> middleInitial() {
        return middleInitial;
    }

    /**
     * The company's primary signatory's last name.
     */
    @JsonIgnore
    public Optional<String> lastName() {
        return lastName;
    }

    /**
     * The company's primary signatory's phone number.
     */
    @JsonIgnore
    public Optional<String> phone() {
        return phone;
    }

    /**
     * The company's primary signatory's email address.
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    /**
     * The company's primary signatory's home address.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<CompanyHomeAddress> homeAddress() {
        return (Optional<CompanyHomeAddress>) homeAddress;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the company's primary signatory.
     */
    public PrimarySignatory withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = Optional.ofNullable(uuid);
        return this;
    }

    /**
     * The UUID of the company's primary signatory.
     */
    public PrimarySignatory withUuid(Optional<String> uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The company's primary signatory's first name.
     */
    public PrimarySignatory withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    /**
     * The company's primary signatory's first name.
     */
    public PrimarySignatory withFirstName(Optional<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * The company's primary signatory's middle initial.
     */
    public PrimarySignatory withMiddleInitial(String middleInitial) {
        Utils.checkNotNull(middleInitial, "middleInitial");
        this.middleInitial = JsonNullable.of(middleInitial);
        return this;
    }

    /**
     * The company's primary signatory's middle initial.
     */
    public PrimarySignatory withMiddleInitial(JsonNullable<String> middleInitial) {
        Utils.checkNotNull(middleInitial, "middleInitial");
        this.middleInitial = middleInitial;
        return this;
    }

    /**
     * The company's primary signatory's last name.
     */
    public PrimarySignatory withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    /**
     * The company's primary signatory's last name.
     */
    public PrimarySignatory withLastName(Optional<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * The company's primary signatory's phone number.
     */
    public PrimarySignatory withPhone(String phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = Optional.ofNullable(phone);
        return this;
    }

    /**
     * The company's primary signatory's phone number.
     */
    public PrimarySignatory withPhone(Optional<String> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    /**
     * The company's primary signatory's email address.
     */
    public PrimarySignatory withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * The company's primary signatory's email address.
     */
    public PrimarySignatory withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * The company's primary signatory's home address.
     */
    public PrimarySignatory withHomeAddress(CompanyHomeAddress homeAddress) {
        Utils.checkNotNull(homeAddress, "homeAddress");
        this.homeAddress = Optional.ofNullable(homeAddress);
        return this;
    }

    /**
     * The company's primary signatory's home address.
     */
    public PrimarySignatory withHomeAddress(Optional<? extends CompanyHomeAddress> homeAddress) {
        Utils.checkNotNull(homeAddress, "homeAddress");
        this.homeAddress = homeAddress;
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
        PrimarySignatory other = (PrimarySignatory) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.middleInitial, other.middleInitial) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.phone, other.phone) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.homeAddress, other.homeAddress);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            firstName,
            middleInitial,
            lastName,
            phone,
            email,
            homeAddress);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PrimarySignatory.class,
                "uuid", uuid,
                "firstName", firstName,
                "middleInitial", middleInitial,
                "lastName", lastName,
                "phone", phone,
                "email", email,
                "homeAddress", homeAddress);
    }
    
    public final static class Builder {
 
        private Optional<String> uuid = Optional.empty();
 
        private Optional<String> firstName = Optional.empty();
 
        private JsonNullable<String> middleInitial = JsonNullable.undefined();
 
        private Optional<String> lastName = Optional.empty();
 
        private Optional<String> phone = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private Optional<? extends CompanyHomeAddress> homeAddress = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the company's primary signatory.
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = Optional.ofNullable(uuid);
            return this;
        }

        /**
         * The UUID of the company's primary signatory.
         */
        public Builder uuid(Optional<String> uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The company's primary signatory's first name.
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        /**
         * The company's primary signatory's first name.
         */
        public Builder firstName(Optional<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * The company's primary signatory's middle initial.
         */
        public Builder middleInitial(String middleInitial) {
            Utils.checkNotNull(middleInitial, "middleInitial");
            this.middleInitial = JsonNullable.of(middleInitial);
            return this;
        }

        /**
         * The company's primary signatory's middle initial.
         */
        public Builder middleInitial(JsonNullable<String> middleInitial) {
            Utils.checkNotNull(middleInitial, "middleInitial");
            this.middleInitial = middleInitial;
            return this;
        }

        /**
         * The company's primary signatory's last name.
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        /**
         * The company's primary signatory's last name.
         */
        public Builder lastName(Optional<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * The company's primary signatory's phone number.
         */
        public Builder phone(String phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = Optional.ofNullable(phone);
            return this;
        }

        /**
         * The company's primary signatory's phone number.
         */
        public Builder phone(Optional<String> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }

        /**
         * The company's primary signatory's email address.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * The company's primary signatory's email address.
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * The company's primary signatory's home address.
         */
        public Builder homeAddress(CompanyHomeAddress homeAddress) {
            Utils.checkNotNull(homeAddress, "homeAddress");
            this.homeAddress = Optional.ofNullable(homeAddress);
            return this;
        }

        /**
         * The company's primary signatory's home address.
         */
        public Builder homeAddress(Optional<? extends CompanyHomeAddress> homeAddress) {
            Utils.checkNotNull(homeAddress, "homeAddress");
            this.homeAddress = homeAddress;
            return this;
        }
        
        public PrimarySignatory build() {
            return new PrimarySignatory(
                uuid,
                firstName,
                middleInitial,
                lastName,
                phone,
                email,
                homeAddress);
        }
    }
}

