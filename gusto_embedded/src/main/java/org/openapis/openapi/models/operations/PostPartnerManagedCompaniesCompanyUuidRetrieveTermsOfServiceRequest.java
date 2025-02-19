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


public class PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_uuid")
    private String companyUuid;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequestBody requestBody;

    @JsonCreator
    public PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest(
            String companyUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequestBody requestBody) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(requestBody, "requestBody");
        this.companyUuid = companyUuid;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.requestBody = requestBody;
    }
    
    public PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest(
            String companyUuid,
            PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequestBody requestBody) {
        this(companyUuid, Optional.empty(), requestBody);
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyUuid() {
        return companyUuid;
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
    public PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the company
     */
    public PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest withRequestBody(PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequestBody requestBody) {
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
        PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest other = (PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest) o;
        return 
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyUuid,
            xGustoAPIVersion,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest.class,
                "companyUuid", companyUuid,
                "xGustoAPIVersion", xGustoAPIVersion,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String companyUuid;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
 
        private PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequestBody requestBody;  
        
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

        public Builder requestBody(PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest build() {
            return new PostPartnerManagedCompaniesCompanyUuidRetrieveTermsOfServiceRequest(
                companyUuid,
                xGustoAPIVersion,
                requestBody);
        }
    }
}

