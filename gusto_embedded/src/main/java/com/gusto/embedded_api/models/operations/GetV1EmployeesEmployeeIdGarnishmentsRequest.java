/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class GetV1EmployeesEmployeeIdGarnishmentsRequest {

    /**
     * The UUID of the employee
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=employee_id")
    private String employeeId;

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<Double> page;

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=per")
    private Optional<Double> per;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetV1EmployeesEmployeeIdGarnishmentsRequest(
            String employeeId,
            Optional<Double> page,
            Optional<Double> per,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(employeeId, "employeeId");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(per, "per");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.employeeId = employeeId;
        this.page = page;
        this.per = per;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1EmployeesEmployeeIdGarnishmentsRequest(
            String employeeId) {
        this(employeeId, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the employee
     */
    @JsonIgnore
    public String employeeId() {
        return employeeId;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    @JsonIgnore
    public Optional<Double> page() {
        return page;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    @JsonIgnore
    public Optional<Double> per() {
        return per;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VersionHeader> xGustoAPIVersion() {
        return (Optional<VersionHeader>) xGustoAPIVersion;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the employee
     */
    public GetV1EmployeesEmployeeIdGarnishmentsRequest withEmployeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetV1EmployeesEmployeeIdGarnishmentsRequest withPage(double page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetV1EmployeesEmployeeIdGarnishmentsRequest withPage(Optional<Double> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetV1EmployeesEmployeeIdGarnishmentsRequest withPer(double per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.ofNullable(per);
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetV1EmployeesEmployeeIdGarnishmentsRequest withPer(Optional<Double> per) {
        Utils.checkNotNull(per, "per");
        this.per = per;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1EmployeesEmployeeIdGarnishmentsRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1EmployeesEmployeeIdGarnishmentsRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
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
        GetV1EmployeesEmployeeIdGarnishmentsRequest other = (GetV1EmployeesEmployeeIdGarnishmentsRequest) o;
        return 
            Objects.deepEquals(this.employeeId, other.employeeId) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.per, other.per) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employeeId,
            page,
            per,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1EmployeesEmployeeIdGarnishmentsRequest.class,
                "employeeId", employeeId,
                "page", page,
                "per", per,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String employeeId;
 
        private Optional<Double> page = Optional.empty();
 
        private Optional<Double> per = Optional.empty();
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the employee
         */
        public Builder employeeId(String employeeId) {
            Utils.checkNotNull(employeeId, "employeeId");
            this.employeeId = employeeId;
            return this;
        }

        /**
         * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
         */
        public Builder page(double page) {
            Utils.checkNotNull(page, "page");
            this.page = Optional.ofNullable(page);
            return this;
        }

        /**
         * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
         */
        public Builder page(Optional<Double> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * Number of objects per page. For majority of endpoints will default to 25
         */
        public Builder per(double per) {
            Utils.checkNotNull(per, "per");
            this.per = Optional.ofNullable(per);
            return this;
        }

        /**
         * Number of objects per page. For majority of endpoints will default to 25
         */
        public Builder per(Optional<Double> per) {
            Utils.checkNotNull(per, "per");
            this.per = per;
            return this;
        }

        /**
         * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
         */
        public Builder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
            Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
            this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
            return this;
        }

        /**
         * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
         */
        public Builder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
            Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
            this.xGustoAPIVersion = xGustoAPIVersion;
            return this;
        }
        
        public GetV1EmployeesEmployeeIdGarnishmentsRequest build() {
            return new GetV1EmployeesEmployeeIdGarnishmentsRequest(
                employeeId,
                page,
                per,
                xGustoAPIVersion);
        }
    }
}

