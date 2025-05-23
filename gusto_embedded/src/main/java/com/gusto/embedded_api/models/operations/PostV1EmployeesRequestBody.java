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
 * PostV1EmployeesRequestBody
 * 
 * <p>Create an employee.
 */

public class PostV1EmployeesRequestBody {

    @JsonProperty("first_name")
    private String firstName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("middle_initial")
    private Optional<String> middleInitial;

    @JsonProperty("last_name")
    private String lastName;

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
     * If true, employee is expected to self-onboard. If false, payroll admin is expected to enter in the employee's onboarding information
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("self_onboarding")
    private Optional<Boolean> selfOnboarding;

    @JsonCreator
    public PostV1EmployeesRequestBody(
            @JsonProperty("first_name") String firstName,
            @JsonProperty("middle_initial") Optional<String> middleInitial,
            @JsonProperty("last_name") String lastName,
            @JsonProperty("preferred_first_name") Optional<String> preferredFirstName,
            @JsonProperty("date_of_birth") Optional<String> dateOfBirth,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("ssn") Optional<String> ssn,
            @JsonProperty("self_onboarding") Optional<Boolean> selfOnboarding) {
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(middleInitial, "middleInitial");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(preferredFirstName, "preferredFirstName");
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(ssn, "ssn");
        Utils.checkNotNull(selfOnboarding, "selfOnboarding");
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.preferredFirstName = preferredFirstName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.ssn = ssn;
        this.selfOnboarding = selfOnboarding;
    }
    
    public PostV1EmployeesRequestBody(
            String firstName,
            String lastName) {
        this(firstName, Optional.empty(), lastName, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public String firstName() {
        return firstName;
    }

    @JsonIgnore
    public Optional<String> middleInitial() {
        return middleInitial;
    }

    @JsonIgnore
    public String lastName() {
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
     * If true, employee is expected to self-onboard. If false, payroll admin is expected to enter in the employee's onboarding information
     */
    @JsonIgnore
    public Optional<Boolean> selfOnboarding() {
        return selfOnboarding;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public PostV1EmployeesRequestBody withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public PostV1EmployeesRequestBody withMiddleInitial(String middleInitial) {
        Utils.checkNotNull(middleInitial, "middleInitial");
        this.middleInitial = Optional.ofNullable(middleInitial);
        return this;
    }

    public PostV1EmployeesRequestBody withMiddleInitial(Optional<String> middleInitial) {
        Utils.checkNotNull(middleInitial, "middleInitial");
        this.middleInitial = middleInitial;
        return this;
    }

    public PostV1EmployeesRequestBody withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public PostV1EmployeesRequestBody withPreferredFirstName(String preferredFirstName) {
        Utils.checkNotNull(preferredFirstName, "preferredFirstName");
        this.preferredFirstName = Optional.ofNullable(preferredFirstName);
        return this;
    }

    public PostV1EmployeesRequestBody withPreferredFirstName(Optional<String> preferredFirstName) {
        Utils.checkNotNull(preferredFirstName, "preferredFirstName");
        this.preferredFirstName = preferredFirstName;
        return this;
    }

    public PostV1EmployeesRequestBody withDateOfBirth(String dateOfBirth) {
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        this.dateOfBirth = Optional.ofNullable(dateOfBirth);
        return this;
    }

    public PostV1EmployeesRequestBody withDateOfBirth(Optional<String> dateOfBirth) {
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * The employee's personal email address.
     */
    public PostV1EmployeesRequestBody withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * The employee's personal email address.
     */
    public PostV1EmployeesRequestBody withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public PostV1EmployeesRequestBody withSsn(String ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = Optional.ofNullable(ssn);
        return this;
    }

    public PostV1EmployeesRequestBody withSsn(Optional<String> ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = ssn;
        return this;
    }

    /**
     * If true, employee is expected to self-onboard. If false, payroll admin is expected to enter in the employee's onboarding information
     */
    public PostV1EmployeesRequestBody withSelfOnboarding(boolean selfOnboarding) {
        Utils.checkNotNull(selfOnboarding, "selfOnboarding");
        this.selfOnboarding = Optional.ofNullable(selfOnboarding);
        return this;
    }

    /**
     * If true, employee is expected to self-onboard. If false, payroll admin is expected to enter in the employee's onboarding information
     */
    public PostV1EmployeesRequestBody withSelfOnboarding(Optional<Boolean> selfOnboarding) {
        Utils.checkNotNull(selfOnboarding, "selfOnboarding");
        this.selfOnboarding = selfOnboarding;
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
        PostV1EmployeesRequestBody other = (PostV1EmployeesRequestBody) o;
        return 
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.middleInitial, other.middleInitial) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.preferredFirstName, other.preferredFirstName) &&
            Objects.deepEquals(this.dateOfBirth, other.dateOfBirth) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.ssn, other.ssn) &&
            Objects.deepEquals(this.selfOnboarding, other.selfOnboarding);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            firstName,
            middleInitial,
            lastName,
            preferredFirstName,
            dateOfBirth,
            email,
            ssn,
            selfOnboarding);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1EmployeesRequestBody.class,
                "firstName", firstName,
                "middleInitial", middleInitial,
                "lastName", lastName,
                "preferredFirstName", preferredFirstName,
                "dateOfBirth", dateOfBirth,
                "email", email,
                "ssn", ssn,
                "selfOnboarding", selfOnboarding);
    }
    
    public final static class Builder {
 
        private String firstName;
 
        private Optional<String> middleInitial = Optional.empty();
 
        private String lastName;
 
        private Optional<String> preferredFirstName = Optional.empty();
 
        private Optional<String> dateOfBirth = Optional.empty();
 
        private Optional<String> email = Optional.empty();
 
        private Optional<String> ssn = Optional.empty();
 
        private Optional<Boolean> selfOnboarding = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder firstName(String firstName) {
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
         * If true, employee is expected to self-onboard. If false, payroll admin is expected to enter in the employee's onboarding information
         */
        public Builder selfOnboarding(boolean selfOnboarding) {
            Utils.checkNotNull(selfOnboarding, "selfOnboarding");
            this.selfOnboarding = Optional.ofNullable(selfOnboarding);
            return this;
        }

        /**
         * If true, employee is expected to self-onboard. If false, payroll admin is expected to enter in the employee's onboarding information
         */
        public Builder selfOnboarding(Optional<Boolean> selfOnboarding) {
            Utils.checkNotNull(selfOnboarding, "selfOnboarding");
            this.selfOnboarding = selfOnboarding;
            return this;
        }
        
        public PostV1EmployeesRequestBody build() {
            return new PostV1EmployeesRequestBody(
                firstName,
                middleInitial,
                lastName,
                preferredFirstName,
                dateOfBirth,
                email,
                ssn,
                selfOnboarding);
        }
    }
}

