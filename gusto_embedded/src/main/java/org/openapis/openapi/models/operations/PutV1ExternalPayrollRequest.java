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


public class PutV1ExternalPayrollRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_uuid")
    private String companyUuid;

    /**
     * The UUID of the external payroll
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=external_payroll_id")
    private String externalPayrollId;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PutV1ExternalPayrollRequestBody requestBody;

    @JsonCreator
    public PutV1ExternalPayrollRequest(
            String companyUuid,
            String externalPayrollId,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutV1ExternalPayrollRequestBody requestBody) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(externalPayrollId, "externalPayrollId");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(requestBody, "requestBody");
        this.companyUuid = companyUuid;
        this.externalPayrollId = externalPayrollId;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.requestBody = requestBody;
    }
    
    public PutV1ExternalPayrollRequest(
            String companyUuid,
            String externalPayrollId,
            PutV1ExternalPayrollRequestBody requestBody) {
        this(companyUuid, externalPayrollId, Optional.empty(), requestBody);
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyUuid() {
        return companyUuid;
    }

    /**
     * The UUID of the external payroll
     */
    @JsonIgnore
    public String externalPayrollId() {
        return externalPayrollId;
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
    public PutV1ExternalPayrollRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the company
     */
    public PutV1ExternalPayrollRequest withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * The UUID of the external payroll
     */
    public PutV1ExternalPayrollRequest withExternalPayrollId(String externalPayrollId) {
        Utils.checkNotNull(externalPayrollId, "externalPayrollId");
        this.externalPayrollId = externalPayrollId;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1ExternalPayrollRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1ExternalPayrollRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1ExternalPayrollRequest withRequestBody(PutV1ExternalPayrollRequestBody requestBody) {
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
        PutV1ExternalPayrollRequest other = (PutV1ExternalPayrollRequest) o;
        return 
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.externalPayrollId, other.externalPayrollId) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyUuid,
            externalPayrollId,
            xGustoAPIVersion,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1ExternalPayrollRequest.class,
                "companyUuid", companyUuid,
                "externalPayrollId", externalPayrollId,
                "xGustoAPIVersion", xGustoAPIVersion,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String companyUuid;
 
        private String externalPayrollId;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
 
        private PutV1ExternalPayrollRequestBody requestBody;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the company
         */
        public Builder companyUuid(String companyUuid) {
            Utils.checkNotNull(companyUuid, "companyUuid");
            this.companyUuid = companyUuid;
            return this;
        }

        /**
         * The UUID of the external payroll
         */
        public Builder externalPayrollId(String externalPayrollId) {
            Utils.checkNotNull(externalPayrollId, "externalPayrollId");
            this.externalPayrollId = externalPayrollId;
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

        public Builder requestBody(PutV1ExternalPayrollRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public PutV1ExternalPayrollRequest build() {
            return new PutV1ExternalPayrollRequest(
                companyUuid,
                externalPayrollId,
                xGustoAPIVersion,
                requestBody);
        }
    }
}

