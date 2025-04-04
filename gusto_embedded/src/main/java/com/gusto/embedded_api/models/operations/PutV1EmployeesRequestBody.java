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
/**
 * PutV1EmployeesRequestBody
 * 
 * <p>Update an employee.
 */

public class PutV1EmployeesRequestBody {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("first_name")
    private Optional<String> firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("middle_initial")
    private Optional<String> middleInitial;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("last_name")
    private Optional<String> lastName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("preferred_first_name")
    private Optional<String> preferredFirstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("date_of_birth")
    private Optional<String> dateOfBirth;

    /**
     * The employee's personal email address.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ssn")
    private Optional<String> ssn;

    /**
     * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("two_percent_shareholder")
    private Optional<Boolean> twoPercentShareholder;

    @JsonCreator
    public PutV1EmployeesRequestBody(
            @JsonProperty("version") String version,
            @JsonProperty("first_name") Optional<String> firstName,
            @JsonProperty("middle_initial") Optional<String> middleInitial,
            @JsonProperty("last_name") Optional<String> lastName,
            @JsonProperty("preferred_first_name") Optional<String> preferredFirstName,
            @JsonProperty("date_of_birth") Optional<String> dateOfBirth,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("ssn") Optional<String> ssn,
            @JsonProperty("two_percent_shareholder") Optional<Boolean> twoPercentShareholder) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(middleInitial, "middleInitial");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(preferredFirstName, "preferredFirstName");
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(ssn, "ssn");
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        this.version = version;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.preferredFirstName = preferredFirstName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.ssn = ssn;
        this.twoPercentShareholder = twoPercentShareholder;
    }
    
    public PutV1EmployeesRequestBody(
            String version) {
        this(version, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
    }

    @JsonIgnore
    public Optional<String> firstName() {
        return firstName;
    }

    @JsonIgnore
    public Optional<String> middleInitial() {
        return middleInitial;
    }

    @JsonIgnore
    public Optional<String> lastName() {
        return lastName;
    }

    @JsonIgnore
    public Optional<String> preferredFirstName() {
        return preferredFirstName;
    }

    @JsonIgnore
    public Optional<String> dateOfBirth() {
        return dateOfBirth;
    }

    /**
     * The employee's personal email address.
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @JsonIgnore
    public Optional<String> ssn() {
        return ssn;
    }

    /**
     * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
     */
    @JsonIgnore
    public Optional<Boolean> twoPercentShareholder() {
        return twoPercentShareholder;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    public PutV1EmployeesRequestBody withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    public PutV1EmployeesRequestBody withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = Optional.ofNullable(firstName);
        return this;
    }

    public PutV1EmployeesRequestBody withFirstName(Optional<String> firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public PutV1EmployeesRequestBody withMiddleInitial(String middleInitial) {
        Utils.checkNotNull(middleInitial, "middleInitial");
        this.middleInitial = Optional.ofNullable(middleInitial);
        return this;
    }

    public PutV1EmployeesRequestBody withMiddleInitial(Optional<String> middleInitial) {
        Utils.checkNotNull(middleInitial, "middleInitial");
        this.middleInitial = middleInitial;
        return this;
    }

    public PutV1EmployeesRequestBody withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = Optional.ofNullable(lastName);
        return this;
    }

    public PutV1EmployeesRequestBody withLastName(Optional<String> lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public PutV1EmployeesRequestBody withPreferredFirstName(String preferredFirstName) {
        Utils.checkNotNull(preferredFirstName, "preferredFirstName");
        this.preferredFirstName = Optional.ofNullable(preferredFirstName);
        return this;
    }

    public PutV1EmployeesRequestBody withPreferredFirstName(Optional<String> preferredFirstName) {
        Utils.checkNotNull(preferredFirstName, "preferredFirstName");
        this.preferredFirstName = preferredFirstName;
        return this;
    }

    public PutV1EmployeesRequestBody withDateOfBirth(String dateOfBirth) {
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        this.dateOfBirth = Optional.ofNullable(dateOfBirth);
        return this;
    }

    public PutV1EmployeesRequestBody withDateOfBirth(Optional<String> dateOfBirth) {
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * The employee's personal email address.
     */
    public PutV1EmployeesRequestBody withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * The employee's personal email address.
     */
    public PutV1EmployeesRequestBody withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public PutV1EmployeesRequestBody withSsn(String ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = Optional.ofNullable(ssn);
        return this;
    }

    public PutV1EmployeesRequestBody withSsn(Optional<String> ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = ssn;
        return this;
    }

    /**
     * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
     */
    public PutV1EmployeesRequestBody withTwoPercentShareholder(boolean twoPercentShareholder) {
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        this.twoPercentShareholder = Optional.ofNullable(twoPercentShareholder);
        return this;
    }

    /**
     * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
     */
    public PutV1EmployeesRequestBody withTwoPercentShareholder(Optional<Boolean> twoPercentShareholder) {
        Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
        this.twoPercentShareholder = twoPercentShareholder;
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
        PutV1EmployeesRequestBody other = (PutV1EmployeesRequestBody) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.middleInitial, other.middleInitial) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.preferredFirstName, other.preferredFirstName) &&
            Objects.deepEquals(this.dateOfBirth, other.dateOfBirth) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.ssn, other.ssn) &&
            Objects.deepEquals(this.twoPercentShareholder, other.twoPercentShareholder);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            version,
            firstName,
            middleInitial,
            lastName,
            preferredFirstName,
            dateOfBirth,
            email,
            ssn,
            twoPercentShareholder);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1EmployeesRequestBody.class,
                "version", version,
                "firstName", firstName,
                "middleInitial", middleInitial,
                "lastName", lastName,
                "preferredFirstName", preferredFirstName,
                "dateOfBirth", dateOfBirth,
                "email", email,
                "ssn", ssn,
                "twoPercentShareholder", twoPercentShareholder);
    }
    
    public final static class Builder {
 
        private String version;
 
        private Optional<String> firstName = Optional.empty();
 
        private Optional<String> middleInitial = Optional.empty();
 
        private Optional<String> lastName = Optional.empty();
 
        private Optional<String> preferredFirstName = Optional.empty();
 
        private Optional<String> dateOfBirth = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> ssn = Optional.empty();
 
        private Optional<Boolean> twoPercentShareholder = Optional.empty();  
        
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

        public Builder firstName(String firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = Optional.ofNullable(firstName);
            return this;
        }

        public Builder firstName(Optional<String> firstName) {
            Utils.checkNotNull(firstName, "firstName");
            this.firstName = firstName;
            return this;
        }

        public Builder middleInitial(String middleInitial) {
            Utils.checkNotNull(middleInitial, "middleInitial");
            this.middleInitial = Optional.ofNullable(middleInitial);
            return this;
        }

        public Builder middleInitial(Optional<String> middleInitial) {
            Utils.checkNotNull(middleInitial, "middleInitial");
            this.middleInitial = middleInitial;
            return this;
        }

        public Builder lastName(String lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = Optional.ofNullable(lastName);
            return this;
        }

        public Builder lastName(Optional<String> lastName) {
            Utils.checkNotNull(lastName, "lastName");
            this.lastName = lastName;
            return this;
        }

        public Builder preferredFirstName(String preferredFirstName) {
            Utils.checkNotNull(preferredFirstName, "preferredFirstName");
            this.preferredFirstName = Optional.ofNullable(preferredFirstName);
            return this;
        }

        public Builder preferredFirstName(Optional<String> preferredFirstName) {
            Utils.checkNotNull(preferredFirstName, "preferredFirstName");
            this.preferredFirstName = preferredFirstName;
            return this;
        }

        public Builder dateOfBirth(String dateOfBirth) {
            Utils.checkNotNull(dateOfBirth, "dateOfBirth");
            this.dateOfBirth = Optional.ofNullable(dateOfBirth);
            return this;
        }

        public Builder dateOfBirth(Optional<String> dateOfBirth) {
            Utils.checkNotNull(dateOfBirth, "dateOfBirth");
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        /**
         * The employee's personal email address.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * The employee's personal email address.
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder ssn(String ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = Optional.ofNullable(ssn);
            return this;
        }

        public Builder ssn(Optional<String> ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = ssn;
            return this;
        }

        /**
         * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
         */
        public Builder twoPercentShareholder(boolean twoPercentShareholder) {
            Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
            this.twoPercentShareholder = Optional.ofNullable(twoPercentShareholder);
            return this;
        }

        /**
         * Whether the employee is a two percent shareholder of the company. This field only applies to companies with an S-Corp entity type.
         */
        public Builder twoPercentShareholder(Optional<Boolean> twoPercentShareholder) {
            Utils.checkNotNull(twoPercentShareholder, "twoPercentShareholder");
            this.twoPercentShareholder = twoPercentShareholder;
            return this;
        }
        
        public PutV1EmployeesRequestBody build() {
            return new PutV1EmployeesRequestBody(
                version,
                firstName,
                middleInitial,
                lastName,
                preferredFirstName,
                dateOfBirth,
                email,
                ssn,
                twoPercentShareholder);
        }
    }
}

