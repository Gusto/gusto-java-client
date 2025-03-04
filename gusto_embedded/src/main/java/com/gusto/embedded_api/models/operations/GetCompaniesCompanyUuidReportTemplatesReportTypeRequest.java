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

public class GetCompaniesCompanyUuidReportTemplatesReportTypeRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_uuid")
    private String companyUuid;

    /**
     * The report type
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=report_type")
    private String reportType;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetCompaniesCompanyUuidReportTemplatesReportTypeRequest(
            String companyUuid,
            String reportType,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(reportType, "reportType");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.companyUuid = companyUuid;
        this.reportType = reportType;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetCompaniesCompanyUuidReportTemplatesReportTypeRequest(
            String companyUuid,
            String reportType) {
        this(companyUuid, reportType, Optional.empty());
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyUuid() {
        return companyUuid;
    }

    /**
     * The report type
     */
    @JsonIgnore
    public String reportType() {
        return reportType;
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
    public GetCompaniesCompanyUuidReportTemplatesReportTypeRequest withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * The report type
     */
    public GetCompaniesCompanyUuidReportTemplatesReportTypeRequest withReportType(String reportType) {
        Utils.checkNotNull(reportType, "reportType");
        this.reportType = reportType;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetCompaniesCompanyUuidReportTemplatesReportTypeRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetCompaniesCompanyUuidReportTemplatesReportTypeRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetCompaniesCompanyUuidReportTemplatesReportTypeRequest other = (GetCompaniesCompanyUuidReportTemplatesReportTypeRequest) o;
        return 
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.reportType, other.reportType) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyUuid,
            reportType,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCompaniesCompanyUuidReportTemplatesReportTypeRequest.class,
                "companyUuid", companyUuid,
                "reportType", reportType,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String companyUuid;
 
        private String reportType;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;  
        
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
         * The report type
         */
        public Builder reportType(String reportType) {
            Utils.checkNotNull(reportType, "reportType");
            this.reportType = reportType;
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
        
        public GetCompaniesCompanyUuidReportTemplatesReportTypeRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new GetCompaniesCompanyUuidReportTemplatesReportTypeRequest(
                companyUuid,
                reportType,
                xGustoAPIVersion);
        }

        private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
                new LazySingletonValue<>(
                        "X-Gusto-API-Version",
                        "\"2024-04-01\"",
                        new TypeReference<Optional<? extends VersionHeader>>() {});
    }
}

