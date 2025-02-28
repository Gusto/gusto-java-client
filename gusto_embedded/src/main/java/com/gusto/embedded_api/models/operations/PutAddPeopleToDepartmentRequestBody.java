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
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PutAddPeopleToDepartmentRequestBody {

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("version")
    private Optional<String> version;

    /**
     * Array of employees to add to the department
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("employees")
    private Optional<? extends List<Employees>> employees;

    /**
     * Array of contractors to add to the department
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contractors")
    private Optional<? extends List<Contractors>> contractors;

    @JsonCreator
    public PutAddPeopleToDepartmentRequestBody(
            @JsonProperty("version") Optional<String> version,
            @JsonProperty("employees") Optional<? extends List<Employees>> employees,
            @JsonProperty("contractors") Optional<? extends List<Contractors>> contractors) {
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(employees, "employees");
        Utils.checkNotNull(contractors, "contractors");
        this.version = version;
        this.employees = employees;
        this.contractors = contractors;
    }
    
    public PutAddPeopleToDepartmentRequestBody() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    @JsonIgnore
    public Optional<String> version() {
        return version;
    }

    /**
     * Array of employees to add to the department
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Employees>> employees() {
        return (Optional<List<Employees>>) employees;
    }

    /**
     * Array of contractors to add to the department
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Contractors>> contractors() {
        return (Optional<List<Contractors>>) contractors;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    public PutAddPeopleToDepartmentRequestBody withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = Optional.ofNullable(version);
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
     */
    public PutAddPeopleToDepartmentRequestBody withVersion(Optional<String> version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * Array of employees to add to the department
     */
    public PutAddPeopleToDepartmentRequestBody withEmployees(List<Employees> employees) {
        Utils.checkNotNull(employees, "employees");
        this.employees = Optional.ofNullable(employees);
        return this;
    }

    /**
     * Array of employees to add to the department
     */
    public PutAddPeopleToDepartmentRequestBody withEmployees(Optional<? extends List<Employees>> employees) {
        Utils.checkNotNull(employees, "employees");
        this.employees = employees;
        return this;
    }

    /**
     * Array of contractors to add to the department
     */
    public PutAddPeopleToDepartmentRequestBody withContractors(List<Contractors> contractors) {
        Utils.checkNotNull(contractors, "contractors");
        this.contractors = Optional.ofNullable(contractors);
        return this;
    }

    /**
     * Array of contractors to add to the department
     */
    public PutAddPeopleToDepartmentRequestBody withContractors(Optional<? extends List<Contractors>> contractors) {
        Utils.checkNotNull(contractors, "contractors");
        this.contractors = contractors;
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
        PutAddPeopleToDepartmentRequestBody other = (PutAddPeopleToDepartmentRequestBody) o;
        return 
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.employees, other.employees) &&
            Objects.deepEquals(this.contractors, other.contractors);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            version,
            employees,
            contractors);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutAddPeopleToDepartmentRequestBody.class,
                "version", version,
                "employees", employees,
                "contractors", contractors);
    }
    
    public final static class Builder {
 
        private Optional<String> version = Optional.empty();
 
        private Optional<? extends List<Employees>> employees = Optional.empty();
 
        private Optional<? extends List<Contractors>> contractors = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = Optional.ofNullable(version);
            return this;
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/versioning#object-layer) for information on how to use this field.
         */
        public Builder version(Optional<String> version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        /**
         * Array of employees to add to the department
         */
        public Builder employees(List<Employees> employees) {
            Utils.checkNotNull(employees, "employees");
            this.employees = Optional.ofNullable(employees);
            return this;
        }

        /**
         * Array of employees to add to the department
         */
        public Builder employees(Optional<? extends List<Employees>> employees) {
            Utils.checkNotNull(employees, "employees");
            this.employees = employees;
            return this;
        }

        /**
         * Array of contractors to add to the department
         */
        public Builder contractors(List<Contractors> contractors) {
            Utils.checkNotNull(contractors, "contractors");
            this.contractors = Optional.ofNullable(contractors);
            return this;
        }

        /**
         * Array of contractors to add to the department
         */
        public Builder contractors(Optional<? extends List<Contractors>> contractors) {
            Utils.checkNotNull(contractors, "contractors");
            this.contractors = contractors;
            return this;
        }
        
        public PutAddPeopleToDepartmentRequestBody build() {
            return new PutAddPeopleToDepartmentRequestBody(
                version,
                employees,
                contractors);
        }
    }
}

