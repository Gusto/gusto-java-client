/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.PayScheduleAssignmentBody;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest {

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

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PayScheduleAssignmentBody payScheduleAssignmentBody;

    @JsonCreator
    public PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest(
            String companyId,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PayScheduleAssignmentBody payScheduleAssignmentBody) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(payScheduleAssignmentBody, "payScheduleAssignmentBody");
        this.companyId = companyId;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.payScheduleAssignmentBody = payScheduleAssignmentBody;
    }
    
    public PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest(
            String companyId,
            PayScheduleAssignmentBody payScheduleAssignmentBody) {
        this(companyId, Optional.empty(), payScheduleAssignmentBody);
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

    @JsonIgnore
    public PayScheduleAssignmentBody payScheduleAssignmentBody() {
        return payScheduleAssignmentBody;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the company
     */
    public PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest withPayScheduleAssignmentBody(PayScheduleAssignmentBody payScheduleAssignmentBody) {
        Utils.checkNotNull(payScheduleAssignmentBody, "payScheduleAssignmentBody");
        this.payScheduleAssignmentBody = payScheduleAssignmentBody;
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
        PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest other = (PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.payScheduleAssignmentBody, other.payScheduleAssignmentBody);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            xGustoAPIVersion,
            payScheduleAssignmentBody);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest.class,
                "companyId", companyId,
                "xGustoAPIVersion", xGustoAPIVersion,
                "payScheduleAssignmentBody", payScheduleAssignmentBody);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
 
        private PayScheduleAssignmentBody payScheduleAssignmentBody;  
        
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

        public Builder payScheduleAssignmentBody(PayScheduleAssignmentBody payScheduleAssignmentBody) {
            Utils.checkNotNull(payScheduleAssignmentBody, "payScheduleAssignmentBody");
            this.payScheduleAssignmentBody = payScheduleAssignmentBody;
            return this;
        }
        
        public PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest build() {
            return new PostV1CompaniesCompanyIdPaySchedulesAssignmentPreviewRequest(
                companyId,
                xGustoAPIVersion,
                payScheduleAssignmentBody);
        }
    }
}

