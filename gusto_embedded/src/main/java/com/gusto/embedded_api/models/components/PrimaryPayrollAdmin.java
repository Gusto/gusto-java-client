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
 * PrimaryPayrollAdmin
 * 
 * <p>The primary payroll admin of the company.
 */

public class PrimaryPayrollAdmin {

    /**
     * The company's primary payroll admin's first name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private Optional<String> firstName;

    /**
     * The company's primary payroll admin's last name.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private Optional<String> lastName;

    /**
     * The company's primary payroll admin's phone number.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("phone")
    private JsonNullable<String> phone;

    /**
     * The company's primary payroll admin's email address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonCreator
    public PrimaryPayrollAdmin(
            @JsonProperty("first_name") Optional<String> firstName,
            @JsonProperty("last_name") Optional<String> lastName,
            @JsonProperty("phone") JsonNullable<String> phone,
            @JsonProperty("email") Optional<String> email) {
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(phone, "phone");
        Utils.checkNotNull(email, "email");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }
    
    public PrimaryPayrollAdmin() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty());
    }

    /**
     * The company's primary payroll admin's first name.
     */
    @JsonIgnore
    public Optional<String> firstName() {
        return firstName;
    }

    /**
     * The company's primary payroll admin's last name.
     */
    @JsonIgnore
    public Optional<String> lastName() {
        return lastName;
    }

    /**
     * The company's primary payroll admin's phone number.
     */
    @JsonIgnore
    public JsonNullable<String> phone() {
        return phone;
    }

    /**
     * The company's primary payroll admin's email address.
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The company's primary payroll admin's first name.
     */
    public PrimaryPayrollAdmin withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    /**
     * The company's primary payroll admin's first name.
     */
    public PrimaryPayrollAdmin withFirstName(Optional<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    /**
     * The company's primary payroll admin's last name.
     */
    public PrimaryPayrollAdmin withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    /**
     * The company's primary payroll admin's last name.
     */
    public PrimaryPayrollAdmin withLastName(Optional<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    /**
     * The company's primary payroll admin's phone number.
     */
    public PrimaryPayrollAdmin withPhone(String phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = JsonNullable.of(phone);
        return this;
    }

    /**
     * The company's primary payroll admin's phone number.
     */
    public PrimaryPayrollAdmin withPhone(JsonNullable<String> phone) {
        Utils.checkNotNull(phone, "phone");
        this.phone = phone;
        return this;
    }

    /**
     * The company's primary payroll admin's email address.
     */
    public PrimaryPayrollAdmin withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * The company's primary payroll admin's email address.
     */
    public PrimaryPayrollAdmin withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
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
        PrimaryPayrollAdmin other = (PrimaryPayrollAdmin) o;
        return 
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.phone, other.phone) &&
            Objects.deepEquals(this.email, other.email);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            firstName,
            lastName,
            phone,
            email);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PrimaryPayrollAdmin.class,
                "firstName", firstName,
                "lastName", lastName,
                "phone", phone,
                "email", email);
    }
    
    public final static class Builder {
 
        private Optional<String> firstName = Optional.empty();
 
        private Optional<String> lastName = Optional.empty();
 
        private JsonNullable<String> phone = JsonNullable.undefined();
 
        private Optional<String> email = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The company's primary payroll admin's first name.
         */
        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        /**
         * The company's primary payroll admin's first name.
         */
        public Builder firstName(Optional<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        /**
         * The company's primary payroll admin's last name.
         */
        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        /**
         * The company's primary payroll admin's last name.
         */
        public Builder lastName(Optional<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        /**
         * The company's primary payroll admin's phone number.
         */
        public Builder phone(String phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = JsonNullable.of(phone);
            return this;
        }

        /**
         * The company's primary payroll admin's phone number.
         */
        public Builder phone(JsonNullable<String> phone) {
            Utils.checkNotNull(phone, "phone");
            this.phone = phone;
            return this;
        }

        /**
         * The company's primary payroll admin's email address.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * The company's primary payroll admin's email address.
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }
        
        public PrimaryPayrollAdmin build() {
            return new PrimaryPayrollAdmin(
                firstName,
                lastName,
                phone,
                email);
        }
    }
}

