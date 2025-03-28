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
/**
 * PutV1HistoricalEmployeesRequestBody
 * 
 * <p>Update a historical employee.
 */

public class PutV1HistoricalEmployeesRequestBody {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

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

    @JsonProperty("date_of_birth")
    private String dateOfBirth;

    @JsonProperty("ssn")
    private String ssn;

    @JsonProperty("work_address")
    private WorkAddress workAddress;

    @JsonProperty("home_address")
    private PutV1HistoricalEmployeesHomeAddress homeAddress;

    @JsonProperty("termination")
    private Termination termination;

    /**
     * Optional. If provided, the email address will be saved to the employee.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("email")
    private Optional<String> email;

    @JsonProperty("job")
    private Job job;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employee_state_taxes")
    private Optional<? extends EmployeeStateTaxes> employeeStateTaxes;

    @JsonCreator
    public PutV1HistoricalEmployeesRequestBody(
            @JsonProperty("version") String version,
            @JsonProperty("first_name") String firstName,
            @JsonProperty("middle_initial") Optional<String> middleInitial,
            @JsonProperty("last_name") String lastName,
            @JsonProperty("preferred_first_name") Optional<String> preferredFirstName,
            @JsonProperty("date_of_birth") String dateOfBirth,
            @JsonProperty("ssn") String ssn,
            @JsonProperty("work_address") WorkAddress workAddress,
            @JsonProperty("home_address") PutV1HistoricalEmployeesHomeAddress homeAddress,
            @JsonProperty("termination") Termination termination,
            @JsonProperty("email") Optional<String> email,
            @JsonProperty("job") Job job,
            @JsonProperty("employee_state_taxes") Optional<? extends EmployeeStateTaxes> employeeStateTaxes) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(firstName, "firstName");
        Utils.checkNotNull(middleInitial, "middleInitial");
        Utils.checkNotNull(lastName, "lastName");
        Utils.checkNotNull(preferredFirstName, "preferredFirstName");
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        Utils.checkNotNull(ssn, "ssn");
        Utils.checkNotNull(workAddress, "workAddress");
        Utils.checkNotNull(homeAddress, "homeAddress");
        Utils.checkNotNull(termination, "termination");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(job, "job");
        Utils.checkNotNull(employeeStateTaxes, "employeeStateTaxes");
        this.version = version;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.preferredFirstName = preferredFirstName;
        this.dateOfBirth = dateOfBirth;
        this.ssn = ssn;
        this.workAddress = workAddress;
        this.homeAddress = homeAddress;
        this.termination = termination;
        this.email = email;
        this.job = job;
        this.employeeStateTaxes = employeeStateTaxes;
    }
    
    public PutV1HistoricalEmployeesRequestBody(
            String version,
            String firstName,
            String lastName,
            String dateOfBirth,
            String ssn,
            WorkAddress workAddress,
            PutV1HistoricalEmployeesHomeAddress homeAddress,
            Termination termination,
            Job job) {
        this(version, firstName, Optional.empty(), lastName, Optional.empty(), dateOfBirth, ssn, workAddress, homeAddress, termination, Optional.empty(), job, Optional.empty());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
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
    public String dateOfBirth() {
        return dateOfBirth;
    }

    @JsonIgnore
    public String ssn() {
        return ssn;
    }

    @JsonIgnore
    public WorkAddress workAddress() {
        return workAddress;
    }

    @JsonIgnore
    public PutV1HistoricalEmployeesHomeAddress homeAddress() {
        return homeAddress;
    }

    @JsonIgnore
    public Termination termination() {
        return termination;
    }

    /**
     * Optional. If provided, the email address will be saved to the employee.
     */
    @JsonIgnore
    public Optional<String> email() {
        return email;
    }

    @JsonIgnore
    public Job job() {
        return job;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<EmployeeStateTaxes> employeeStateTaxes() {
        return (Optional<EmployeeStateTaxes>) employeeStateTaxes;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public PutV1HistoricalEmployeesRequestBody withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withFirstName(String firstName) {
        Utils.checkNotNull(firstName, "firstName");
        this.firstName = firstName;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withMiddleInitial(String middleInitial) {
        Utils.checkNotNull(middleInitial, "middleInitial");
        this.middleInitial = Optional.ofNullable(middleInitial);
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withMiddleInitial(Optional<String> middleInitial) {
        Utils.checkNotNull(middleInitial, "middleInitial");
        this.middleInitial = middleInitial;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withLastName(String lastName) {
        Utils.checkNotNull(lastName, "lastName");
        this.lastName = lastName;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withPreferredFirstName(String preferredFirstName) {
        Utils.checkNotNull(preferredFirstName, "preferredFirstName");
        this.preferredFirstName = Optional.ofNullable(preferredFirstName);
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withPreferredFirstName(Optional<String> preferredFirstName) {
        Utils.checkNotNull(preferredFirstName, "preferredFirstName");
        this.preferredFirstName = preferredFirstName;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withDateOfBirth(String dateOfBirth) {
        Utils.checkNotNull(dateOfBirth, "dateOfBirth");
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withSsn(String ssn) {
        Utils.checkNotNull(ssn, "ssn");
        this.ssn = ssn;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withWorkAddress(WorkAddress workAddress) {
        Utils.checkNotNull(workAddress, "workAddress");
        this.workAddress = workAddress;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withHomeAddress(PutV1HistoricalEmployeesHomeAddress homeAddress) {
        Utils.checkNotNull(homeAddress, "homeAddress");
        this.homeAddress = homeAddress;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withTermination(Termination termination) {
        Utils.checkNotNull(termination, "termination");
        this.termination = termination;
        return this;
    }

    /**
     * Optional. If provided, the email address will be saved to the employee.
     */
    public PutV1HistoricalEmployeesRequestBody withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * Optional. If provided, the email address will be saved to the employee.
     */
    public PutV1HistoricalEmployeesRequestBody withEmail(Optional<String> email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withJob(Job job) {
        Utils.checkNotNull(job, "job");
        this.job = job;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withEmployeeStateTaxes(EmployeeStateTaxes employeeStateTaxes) {
        Utils.checkNotNull(employeeStateTaxes, "employeeStateTaxes");
        this.employeeStateTaxes = Optional.ofNullable(employeeStateTaxes);
        return this;
    }

    public PutV1HistoricalEmployeesRequestBody withEmployeeStateTaxes(Optional<? extends EmployeeStateTaxes> employeeStateTaxes) {
        Utils.checkNotNull(employeeStateTaxes, "employeeStateTaxes");
        this.employeeStateTaxes = employeeStateTaxes;
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
        PutV1HistoricalEmployeesRequestBody other = (PutV1HistoricalEmployeesRequestBody) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.firstName, other.firstName) &&
            Objects.deepEquals(this.middleInitial, other.middleInitial) &&
            Objects.deepEquals(this.lastName, other.lastName) &&
            Objects.deepEquals(this.preferredFirstName, other.preferredFirstName) &&
            Objects.deepEquals(this.dateOfBirth, other.dateOfBirth) &&
            Objects.deepEquals(this.ssn, other.ssn) &&
            Objects.deepEquals(this.workAddress, other.workAddress) &&
            Objects.deepEquals(this.homeAddress, other.homeAddress) &&
            Objects.deepEquals(this.termination, other.termination) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.job, other.job) &&
            Objects.deepEquals(this.employeeStateTaxes, other.employeeStateTaxes);
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
            ssn,
            workAddress,
            homeAddress,
            termination,
            email,
            job,
            employeeStateTaxes);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1HistoricalEmployeesRequestBody.class,
                "version", version,
                "firstName", firstName,
                "middleInitial", middleInitial,
                "lastName", lastName,
                "preferredFirstName", preferredFirstName,
                "dateOfBirth", dateOfBirth,
                "ssn", ssn,
                "workAddress", workAddress,
                "homeAddress", homeAddress,
                "termination", termination,
                "email", email,
                "job", job,
                "employeeStateTaxes", employeeStateTaxes);
    }
    
    public final static class Builder {
 
        private String version;
 
        private String firstName;
 
        private Optional<String> middleInitial = Optional.empty();
 
        private String lastName;
 
        private Optional<String> preferredFirstName = Optional.empty();
 
        private String dateOfBirth;
 
        private String ssn;
 
        private WorkAddress workAddress;
 
        private PutV1HistoricalEmployeesHomeAddress homeAddress;
 
        private Termination termination;
 
        private Optional<String> email = Optional.empty();
 
        private Job job;
 
        private Optional<? extends EmployeeStateTaxes> employeeStateTaxes = Optional.empty();  
        
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
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder ssn(String ssn) {
            Utils.checkNotNull(ssn, "ssn");
            this.ssn = ssn;
            return this;
        }

        public Builder workAddress(WorkAddress workAddress) {
            Utils.checkNotNull(workAddress, "workAddress");
            this.workAddress = workAddress;
            return this;
        }

        public Builder homeAddress(PutV1HistoricalEmployeesHomeAddress homeAddress) {
            Utils.checkNotNull(homeAddress, "homeAddress");
            this.homeAddress = homeAddress;
            return this;
        }

        public Builder termination(Termination termination) {
            Utils.checkNotNull(termination, "termination");
            this.termination = termination;
            return this;
        }

        /**
         * Optional. If provided, the email address will be saved to the employee.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = Optional.ofNullable(email);
            return this;
        }

        /**
         * Optional. If provided, the email address will be saved to the employee.
         */
        public Builder email(Optional<String> email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        public Builder job(Job job) {
            Utils.checkNotNull(job, "job");
            this.job = job;
            return this;
        }

        public Builder employeeStateTaxes(EmployeeStateTaxes employeeStateTaxes) {
            Utils.checkNotNull(employeeStateTaxes, "employeeStateTaxes");
            this.employeeStateTaxes = Optional.ofNullable(employeeStateTaxes);
            return this;
        }

        public Builder employeeStateTaxes(Optional<? extends EmployeeStateTaxes> employeeStateTaxes) {
            Utils.checkNotNull(employeeStateTaxes, "employeeStateTaxes");
            this.employeeStateTaxes = employeeStateTaxes;
            return this;
        }
        
        public PutV1HistoricalEmployeesRequestBody build() {
            return new PutV1HistoricalEmployeesRequestBody(
                version,
                firstName,
                middleInitial,
                lastName,
                preferredFirstName,
                dateOfBirth,
                ssn,
                workAddress,
                homeAddress,
                termination,
                email,
                job,
                employeeStateTaxes);
        }
    }
}

