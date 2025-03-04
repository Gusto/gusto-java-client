/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest {

    /**
     * The UUID of the employee
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=employee_id")
    private String employeeId;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody requestBody;

    @JsonCreator
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest(
            String employeeId,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody requestBody) {
        Utils.checkNotNull(employeeId, "employeeId");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(requestBody, "requestBody");
        this.employeeId = employeeId;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.requestBody = requestBody;
    }
    
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest(
            String employeeId,
            PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody requestBody) {
        this(employeeId, Optional.empty(), requestBody);
    }

    /**
     * The UUID of the employee
     */
    @JsonIgnore
    public String employeeId() {
        return employeeId;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VersionHeader> xGustoAPIVersion() {
        return (Optional<VersionHeader>) xGustoAPIVersion;
    }

    @JsonIgnore
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the employee
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest withEmployeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest withRequestBody(PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
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
        PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest other = (PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest) o;
        return 
            Objects.deepEquals(this.employeeId, other.employeeId) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employeeId,
            xGustoAPIVersion,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest.class,
                "employeeId", employeeId,
                "xGustoAPIVersion", xGustoAPIVersion,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String employeeId;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;
 
        private PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody requestBody;  
        
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

        public Builder requestBody(PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new PutV1EmployeesEmployeeIdI9AuthorizationDocumentsRequest(
                employeeId,
                xGustoAPIVersion,
                requestBody);
        }

        private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
                new LazySingletonValue<>(
                        "X-Gusto-API-Version",
                        "\"2024-04-01\"",
                        new TypeReference<Optional<? extends VersionHeader>>() {});
    }
}

