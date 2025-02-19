/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class PutRemovePeopleFromDepartmentRequest {

    /**
     * The UUID of the department
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=department_uuid")
    private String departmentUuid;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PutRemovePeopleFromDepartmentRequestBody requestBody;

    @JsonCreator
    public PutRemovePeopleFromDepartmentRequest(
            String departmentUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutRemovePeopleFromDepartmentRequestBody requestBody) {
        Utils.checkNotNull(departmentUuid, "departmentUuid");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(requestBody, "requestBody");
        this.departmentUuid = departmentUuid;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.requestBody = requestBody;
    }
    
    public PutRemovePeopleFromDepartmentRequest(
            String departmentUuid,
            PutRemovePeopleFromDepartmentRequestBody requestBody) {
        this(departmentUuid, Optional.empty(), requestBody);
    }

    /**
     * The UUID of the department
     */
    @JsonIgnore
    public String departmentUuid() {
        return departmentUuid;
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
    public PutRemovePeopleFromDepartmentRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the department
     */
    public PutRemovePeopleFromDepartmentRequest withDepartmentUuid(String departmentUuid) {
        Utils.checkNotNull(departmentUuid, "departmentUuid");
        this.departmentUuid = departmentUuid;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutRemovePeopleFromDepartmentRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutRemovePeopleFromDepartmentRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutRemovePeopleFromDepartmentRequest withRequestBody(PutRemovePeopleFromDepartmentRequestBody requestBody) {
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
        PutRemovePeopleFromDepartmentRequest other = (PutRemovePeopleFromDepartmentRequest) o;
        return 
            Objects.deepEquals(this.departmentUuid, other.departmentUuid) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            departmentUuid,
            xGustoAPIVersion,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutRemovePeopleFromDepartmentRequest.class,
                "departmentUuid", departmentUuid,
                "xGustoAPIVersion", xGustoAPIVersion,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String departmentUuid;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
 
        private PutRemovePeopleFromDepartmentRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the department
         */
        public Builder departmentUuid(String departmentUuid) {
            Utils.checkNotNull(departmentUuid, "departmentUuid");
            this.departmentUuid = departmentUuid;
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

        public Builder requestBody(PutRemovePeopleFromDepartmentRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public PutRemovePeopleFromDepartmentRequest build() {
            return new PutRemovePeopleFromDepartmentRequest(
                departmentUuid,
                xGustoAPIVersion,
                requestBody);
        }
    }
}

