/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetV1CompaniesCompanyIdEmployeesRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_id")
    private String companyId;

    /**
     * Filters employees by the provided boolean
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=terminated")
    private Optional<Boolean> terminated;

    /**
     * Include the requested attribute(s) in each employee response, multiple options are comma separated. Available options:
     * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
     * - custom_fields: Include employees' custom fields
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=false,name=include")
    private Optional<? extends List<Include>> include;

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
     * A string to search for in the object's names
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=search_term")
    private Optional<String> searchTerm;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetV1CompaniesCompanyIdEmployeesRequest(
            String companyId,
            Optional<Boolean> terminated,
            Optional<? extends List<Include>> include,
            Optional<Double> page,
            Optional<Double> per,
            Optional<String> searchTerm,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(terminated, "terminated");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(per, "per");
        Utils.checkNotNull(searchTerm, "searchTerm");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.companyId = companyId;
        this.terminated = terminated;
        this.include = include;
        this.page = page;
        this.per = per;
        this.searchTerm = searchTerm;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1CompaniesCompanyIdEmployeesRequest(
            String companyId) {
        this(companyId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * Filters employees by the provided boolean
     */
    @JsonIgnore
    public Optional<Boolean> terminated() {
        return terminated;
    }

    /**
     * Include the requested attribute(s) in each employee response, multiple options are comma separated. Available options:
     * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
     * - custom_fields: Include employees' custom fields
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Include>> include() {
        return (Optional<List<Include>>) include;
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
     * A string to search for in the object's names
     */
    @JsonIgnore
    public Optional<String> searchTerm() {
        return searchTerm;
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
    public GetV1CompaniesCompanyIdEmployeesRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Filters employees by the provided boolean
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withTerminated(boolean terminated) {
        Utils.checkNotNull(terminated, "terminated");
        this.terminated = Optional.ofNullable(terminated);
        return this;
    }

    /**
     * Filters employees by the provided boolean
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withTerminated(Optional<Boolean> terminated) {
        Utils.checkNotNull(terminated, "terminated");
        this.terminated = terminated;
        return this;
    }

    /**
     * Include the requested attribute(s) in each employee response, multiple options are comma separated. Available options:
     * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
     * - custom_fields: Include employees' custom fields
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withInclude(List<Include> include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * Include the requested attribute(s) in each employee response, multiple options are comma separated. Available options:
     * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
     * - custom_fields: Include employees' custom fields
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withInclude(Optional<? extends List<Include>> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withPage(double page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withPage(Optional<Double> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withPer(double per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.ofNullable(per);
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withPer(Optional<Double> per) {
        Utils.checkNotNull(per, "per");
        this.per = per;
        return this;
    }

    /**
     * A string to search for in the object's names
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withSearchTerm(String searchTerm) {
        Utils.checkNotNull(searchTerm, "searchTerm");
        this.searchTerm = Optional.ofNullable(searchTerm);
        return this;
    }

    /**
     * A string to search for in the object's names
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withSearchTerm(Optional<String> searchTerm) {
        Utils.checkNotNull(searchTerm, "searchTerm");
        this.searchTerm = searchTerm;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdEmployeesRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetV1CompaniesCompanyIdEmployeesRequest other = (GetV1CompaniesCompanyIdEmployeesRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.terminated, other.terminated) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.per, other.per) &&
            Objects.deepEquals(this.searchTerm, other.searchTerm) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            terminated,
            include,
            page,
            per,
            searchTerm,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1CompaniesCompanyIdEmployeesRequest.class,
                "companyId", companyId,
                "terminated", terminated,
                "include", include,
                "page", page,
                "per", per,
                "searchTerm", searchTerm,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Optional<Boolean> terminated = Optional.empty();
 
        private Optional<? extends List<Include>> include = Optional.empty();
 
        private Optional<Double> page = Optional.empty();
 
        private Optional<Double> per = Optional.empty();
 
        private Optional<String> searchTerm = Optional.empty();
 
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
         * Filters employees by the provided boolean
         */
        public Builder terminated(boolean terminated) {
            Utils.checkNotNull(terminated, "terminated");
            this.terminated = Optional.ofNullable(terminated);
            return this;
        }

        /**
         * Filters employees by the provided boolean
         */
        public Builder terminated(Optional<Boolean> terminated) {
            Utils.checkNotNull(terminated, "terminated");
            this.terminated = terminated;
            return this;
        }

        /**
         * Include the requested attribute(s) in each employee response, multiple options are comma separated. Available options:
         * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
         * - custom_fields: Include employees' custom fields
         */
        public Builder include(List<Include> include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * Include the requested attribute(s) in each employee response, multiple options are comma separated. Available options:
         * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
         * - custom_fields: Include employees' custom fields
         */
        public Builder include(Optional<? extends List<Include>> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
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
         * A string to search for in the object's names
         */
        public Builder searchTerm(String searchTerm) {
            Utils.checkNotNull(searchTerm, "searchTerm");
            this.searchTerm = Optional.ofNullable(searchTerm);
            return this;
        }

        /**
         * A string to search for in the object's names
         */
        public Builder searchTerm(Optional<String> searchTerm) {
            Utils.checkNotNull(searchTerm, "searchTerm");
            this.searchTerm = searchTerm;
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
        
        public GetV1CompaniesCompanyIdEmployeesRequest build() {
            return new GetV1CompaniesCompanyIdEmployeesRequest(
                companyId,
                terminated,
                include,
                page,
                per,
                searchTerm,
                xGustoAPIVersion);
        }
    }
}

