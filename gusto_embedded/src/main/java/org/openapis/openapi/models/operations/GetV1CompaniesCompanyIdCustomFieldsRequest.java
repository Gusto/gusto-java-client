/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;


public class GetV1CompaniesCompanyIdCustomFieldsRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_id")
    private String companyId;

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
    public GetV1CompaniesCompanyIdCustomFieldsRequest(
            String companyId,
            Optional<Double> page,
            Optional<Double> per,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(per, "per");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.companyId = companyId;
        this.page = page;
        this.per = per;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1CompaniesCompanyIdCustomFieldsRequest(
            String companyId) {
        this(companyId, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
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
     * The UUID of the company
     */
    public GetV1CompaniesCompanyIdCustomFieldsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetV1CompaniesCompanyIdCustomFieldsRequest withPage(double page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetV1CompaniesCompanyIdCustomFieldsRequest withPage(Optional<Double> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetV1CompaniesCompanyIdCustomFieldsRequest withPer(double per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.ofNullable(per);
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetV1CompaniesCompanyIdCustomFieldsRequest withPer(Optional<Double> per) {
        Utils.checkNotNull(per, "per");
        this.per = per;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdCustomFieldsRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdCustomFieldsRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetV1CompaniesCompanyIdCustomFieldsRequest other = (GetV1CompaniesCompanyIdCustomFieldsRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.per, other.per) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            page,
            per,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1CompaniesCompanyIdCustomFieldsRequest.class,
                "companyId", companyId,
                "page", page,
                "per", per,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Optional<Double> page = Optional.empty();
 
        private Optional<Double> per = Optional.empty();
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();  
        
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
        
        public GetV1CompaniesCompanyIdCustomFieldsRequest build() {
            return new GetV1CompaniesCompanyIdCustomFieldsRequest(
                companyId,
                page,
                per,
                xGustoAPIVersion);
        }
    }
}

