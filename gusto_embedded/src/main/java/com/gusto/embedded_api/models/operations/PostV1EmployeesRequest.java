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

public class PostV1EmployeesRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_id")
    private String companyId;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    /**
     * Create an employee.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private PostV1EmployeesRequestBody requestBody;

    @JsonCreator
    public PostV1EmployeesRequest(
            String companyId,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PostV1EmployeesRequestBody requestBody) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(requestBody, "requestBody");
        this.companyId = companyId;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.requestBody = requestBody;
    }
    
    public PostV1EmployeesRequest(
            String companyId,
            PostV1EmployeesRequestBody requestBody) {
        this(companyId, Optional.empty(), requestBody);
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<VersionHeader> xGustoAPIVersion() {
        return (Optional<VersionHeader>) xGustoAPIVersion;
    }

    /**
     * Create an employee.
     */
    @JsonIgnore
    public PostV1EmployeesRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the company
     */
    public PostV1EmployeesRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PostV1EmployeesRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PostV1EmployeesRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    /**
     * Create an employee.
     */
    public PostV1EmployeesRequest withRequestBody(PostV1EmployeesRequestBody requestBody) {
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
        PostV1EmployeesRequest other = (PostV1EmployeesRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            xGustoAPIVersion,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1EmployeesRequest.class,
                "companyId", companyId,
                "xGustoAPIVersion", xGustoAPIVersion,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;
 
        private PostV1EmployeesRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the company
         */
        public Builder companyId(String companyId) {
            Utils.checkNotNull(companyId, "companyId");
            this.companyId = companyId;
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

        /**
         * Create an employee.
         */
        public Builder requestBody(PostV1EmployeesRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public PostV1EmployeesRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new PostV1EmployeesRequest(
                companyId,
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

