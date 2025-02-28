/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest {

    /**
     * The UUID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=company_id")
    private String companyId;

    /**
     * The UUID of the pay schedule
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pay_schedule_id")
    private String payScheduleId;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBody requestBody;

    @JsonCreator
    public PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest(
            String companyId,
            String payScheduleId,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBody requestBody) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(payScheduleId, "payScheduleId");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(requestBody, "requestBody");
        this.companyId = companyId;
        this.payScheduleId = payScheduleId;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.requestBody = requestBody;
    }
    
    public PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest(
            String companyId,
            String payScheduleId,
            PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBody requestBody) {
        this(companyId, payScheduleId, Optional.empty(), requestBody);
    }

    /**
     * The UUID of the company
     */
    @JsonIgnore
    public String companyId() {
        return companyId;
    }

    /**
     * The UUID of the pay schedule
     */
    @JsonIgnore
    public String payScheduleId() {
        return payScheduleId;
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
    public PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBody requestBody() {
        return requestBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the company
     */
    public PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The UUID of the pay schedule
     */
    public PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest withPayScheduleId(String payScheduleId) {
        Utils.checkNotNull(payScheduleId, "payScheduleId");
        this.payScheduleId = payScheduleId;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest withRequestBody(PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBody requestBody) {
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
        PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest other = (PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.payScheduleId, other.payScheduleId) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.requestBody, other.requestBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            payScheduleId,
            xGustoAPIVersion,
            requestBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest.class,
                "companyId", companyId,
                "payScheduleId", payScheduleId,
                "xGustoAPIVersion", xGustoAPIVersion,
                "requestBody", requestBody);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String payScheduleId;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
 
        private PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBody requestBody;  
        
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
         * The UUID of the pay schedule
         */
        public Builder payScheduleId(String payScheduleId) {
            Utils.checkNotNull(payScheduleId, "payScheduleId");
            this.payScheduleId = payScheduleId;
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

        public Builder requestBody(PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBody requestBody) {
            Utils.checkNotNull(requestBody, "requestBody");
            this.requestBody = requestBody;
            return this;
        }
        
        public PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest build() {
            return new PutV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest(
                companyId,
                payScheduleId,
                xGustoAPIVersion,
                requestBody);
        }
    }
}

