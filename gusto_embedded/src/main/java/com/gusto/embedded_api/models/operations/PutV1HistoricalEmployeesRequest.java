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

public class PutV1HistoricalEmployeesRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_uuid")
    private String companyUuid;

    /**
     * The UUID of the historical employee
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=historical_employee_uuid")
    private String historicalEmployeeUuid;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    /**
     * Update a historical employee.
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    private PutV1HistoricalEmployeesRequestBody requestBody;

    @JsonCreator
    public PutV1HistoricalEmployeesRequest(
            String companyUuid,
            String historicalEmployeeUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutV1HistoricalEmployeesRequestBody requestBody) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        Utils.checkNotNull(historicalEmployeeUuid, "historicalEmployeeUuid");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(requestBody, "requestBody");
        this.companyUuid = companyUuid;
        this.historicalEmployeeUuid = historicalEmployeeUuid;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.requestBody = requestBody;
    }
    
    public PutV1HistoricalEmployeesRequest(
            String companyUuid,
            String historicalEmployeeUuid,
            PutV1HistoricalEmployeesRequestBody requestBody) {
        this(companyUuid, historicalEmployeeUuid, Optional.empty(), requestBody);
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyUuid() {
        return companyUuid;
    }

    /**
     * The UUID of the historical employee
     */
    @JsonIgnore
    public String historicalEmployeeUuid() {
        return historicalEmployeeUuid;
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
     * Update a historical employee.
     */
    @JsonIgnore
    public PutV1HistoricalEmployeesRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the company
     */
    public PutV1HistoricalEmployeesRequest withCompanyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    /**
     * The UUID of the historical employee
     */
    public PutV1HistoricalEmployeesRequest withHistoricalEmployeeUuid(String historicalEmployeeUuid) {
        Utils.checkNotNull(historicalEmployeeUuid, "historicalEmployeeUuid");
        this.historicalEmployeeUuid = historicalEmployeeUuid;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1HistoricalEmployeesRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1HistoricalEmployeesRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    /**
     * Update a historical employee.
     */
    public PutV1HistoricalEmployeesRequest withRequestBody(PutV1HistoricalEmployeesRequestBody requestBody) {
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
        PutV1HistoricalEmployeesRequest other = (PutV1HistoricalEmployeesRequest) o;
        return 
            Objects.deepEquals(this.companyUuid, other.companyUuid) &&
            Objects.deepEquals(this.historicalEmployeeUuid, other.historicalEmployeeUuid) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyUuid,
            historicalEmployeeUuid,
            xGustoAPIVersion,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1HistoricalEmployeesRequest.class,
                "companyUuid", companyUuid,
                "historicalEmployeeUuid", historicalEmployeeUuid,
                "xGustoAPIVersion", xGustoAPIVersion,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String companyUuid;
 
        private String historicalEmployeeUuid;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;
 
        private PutV1HistoricalEmployeesRequestBody requestBody;  
        
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
         * The UUID of the historical employee
         */
        public Builder historicalEmployeeUuid(String historicalEmployeeUuid) {
            Utils.checkNotNull(historicalEmployeeUuid, "historicalEmployeeUuid");
            this.historicalEmployeeUuid = historicalEmployeeUuid;
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
         * Update a historical employee.
         */
        public Builder requestBody(PutV1HistoricalEmployeesRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public PutV1HistoricalEmployeesRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new PutV1HistoricalEmployeesRequest(
                companyUuid,
                historicalEmployeeUuid,
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

