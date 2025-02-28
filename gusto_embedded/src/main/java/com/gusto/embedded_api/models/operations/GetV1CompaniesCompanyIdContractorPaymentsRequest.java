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
import java.util.Objects;
import java.util.Optional;

public class GetV1CompaniesCompanyIdContractorPaymentsRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_id")
    private String companyId;

    /**
     * The time period for which to retrieve contractor payments
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=start_date")
    private String startDate;

    /**
     * The time period for which to retrieve contractor payments. If left empty, defaults to today's date.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=end_date")
    private String endDate;

    /**
     * The UUID of the contractor. When specified, will load all payments for that contractor.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=contractor_uuid")
    private Optional<String> contractorUuid;

    /**
     * Display contractor payments results group by check date if set to true.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=group_by_date")
    private Optional<Boolean> groupByDate;

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
    public GetV1CompaniesCompanyIdContractorPaymentsRequest(
            String companyId,
            String startDate,
            String endDate,
            Optional<String> contractorUuid,
            Optional<Boolean> groupByDate,
            Optional<Double> page,
            Optional<Double> per,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(startDate, "startDate");
        Utils.checkNotNull(endDate, "endDate");
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        Utils.checkNotNull(groupByDate, "groupByDate");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(per, "per");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.companyId = companyId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractorUuid = contractorUuid;
        this.groupByDate = groupByDate;
        this.page = page;
        this.per = per;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1CompaniesCompanyIdContractorPaymentsRequest(
            String companyId,
            String startDate,
            String endDate) {
        this(companyId, startDate, endDate, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * The time period for which to retrieve contractor payments
     */
    @JsonIgnore
    public String startDate() {
        return startDate;
    }

    /**
     * The time period for which to retrieve contractor payments. If left empty, defaults to today's date.
     */
    @JsonIgnore
    public String endDate() {
        return endDate;
    }

    /**
     * The UUID of the contractor. When specified, will load all payments for that contractor.
     */
    @JsonIgnore
    public Optional<String> contractorUuid() {
        return contractorUuid;
    }

    /**
     * Display contractor payments results group by check date if set to true.
     */
    @JsonIgnore
    public Optional<Boolean> groupByDate() {
        return groupByDate;
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
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The time period for which to retrieve contractor payments
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withStartDate(String startDate) {
        Utils.checkNotNull(startDate, "startDate");
        this.startDate = startDate;
        return this;
    }

    /**
     * The time period for which to retrieve contractor payments. If left empty, defaults to today's date.
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withEndDate(String endDate) {
        Utils.checkNotNull(endDate, "endDate");
        this.endDate = endDate;
        return this;
    }

    /**
     * The UUID of the contractor. When specified, will load all payments for that contractor.
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withContractorUuid(String contractorUuid) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        this.contractorUuid = Optional.ofNullable(contractorUuid);
        return this;
    }

    /**
     * The UUID of the contractor. When specified, will load all payments for that contractor.
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withContractorUuid(Optional<String> contractorUuid) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        this.contractorUuid = contractorUuid;
        return this;
    }

    /**
     * Display contractor payments results group by check date if set to true.
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withGroupByDate(boolean groupByDate) {
        Utils.checkNotNull(groupByDate, "groupByDate");
        this.groupByDate = Optional.ofNullable(groupByDate);
        return this;
    }

    /**
     * Display contractor payments results group by check date if set to true.
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withGroupByDate(Optional<Boolean> groupByDate) {
        Utils.checkNotNull(groupByDate, "groupByDate");
        this.groupByDate = groupByDate;
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withPage(double page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withPage(Optional<Double> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withPer(double per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.ofNullable(per);
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withPer(Optional<Double> per) {
        Utils.checkNotNull(per, "per");
        this.per = per;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdContractorPaymentsRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetV1CompaniesCompanyIdContractorPaymentsRequest other = (GetV1CompaniesCompanyIdContractorPaymentsRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.startDate, other.startDate) &&
            Objects.deepEquals(this.endDate, other.endDate) &&
            Objects.deepEquals(this.contractorUuid, other.contractorUuid) &&
            Objects.deepEquals(this.groupByDate, other.groupByDate) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.per, other.per) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            startDate,
            endDate,
            contractorUuid,
            groupByDate,
            page,
            per,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1CompaniesCompanyIdContractorPaymentsRequest.class,
                "companyId", companyId,
                "startDate", startDate,
                "endDate", endDate,
                "contractorUuid", contractorUuid,
                "groupByDate", groupByDate,
                "page", page,
                "per", per,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String startDate;
 
        private String endDate;
 
        private Optional<String> contractorUuid = Optional.empty();
 
        private Optional<Boolean> groupByDate = Optional.empty();
 
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
         * The time period for which to retrieve contractor payments
         */
        public Builder startDate(String startDate) {
            Utils.checkNotNull(startDate, "startDate");
            this.startDate = startDate;
            return this;
        }

        /**
         * The time period for which to retrieve contractor payments. If left empty, defaults to today's date.
         */
        public Builder endDate(String endDate) {
            Utils.checkNotNull(endDate, "endDate");
            this.endDate = endDate;
            return this;
        }

        /**
         * The UUID of the contractor. When specified, will load all payments for that contractor.
         */
        public Builder contractorUuid(String contractorUuid) {
            Utils.checkNotNull(contractorUuid, "contractorUuid");
            this.contractorUuid = Optional.ofNullable(contractorUuid);
            return this;
        }

        /**
         * The UUID of the contractor. When specified, will load all payments for that contractor.
         */
        public Builder contractorUuid(Optional<String> contractorUuid) {
            Utils.checkNotNull(contractorUuid, "contractorUuid");
            this.contractorUuid = contractorUuid;
            return this;
        }

        /**
         * Display contractor payments results group by check date if set to true.
         */
        public Builder groupByDate(boolean groupByDate) {
            Utils.checkNotNull(groupByDate, "groupByDate");
            this.groupByDate = Optional.ofNullable(groupByDate);
            return this;
        }

        /**
         * Display contractor payments results group by check date if set to true.
         */
        public Builder groupByDate(Optional<Boolean> groupByDate) {
            Utils.checkNotNull(groupByDate, "groupByDate");
            this.groupByDate = groupByDate;
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
        
        public GetV1CompaniesCompanyIdContractorPaymentsRequest build() {
            return new GetV1CompaniesCompanyIdContractorPaymentsRequest(
                companyId,
                startDate,
                endDate,
                contractorUuid,
                groupByDate,
                page,
                per,
                xGustoAPIVersion);
        }
    }
}

