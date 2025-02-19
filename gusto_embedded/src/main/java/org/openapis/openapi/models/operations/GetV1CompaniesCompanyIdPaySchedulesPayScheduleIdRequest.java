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


public class GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest {

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

    @JsonCreator
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest(
            String companyId,
            String payScheduleId,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(companyId, "companyId");
        Utils.checkNotNull(payScheduleId, "payScheduleId");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.companyId = companyId;
        this.payScheduleId = payScheduleId;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest(
            String companyId,
            String payScheduleId) {
        this(companyId, payScheduleId, Optional.empty());
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the company
     */
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest withCompanyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    /**
     * The UUID of the pay schedule
     */
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest withPayScheduleId(String payScheduleId) {
        Utils.checkNotNull(payScheduleId, "payScheduleId");
        this.payScheduleId = payScheduleId;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest other = (GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest) o;
        return 
            Objects.deepEquals(this.companyId, other.companyId) &&
            Objects.deepEquals(this.payScheduleId, other.payScheduleId) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            companyId,
            payScheduleId,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest.class,
                "companyId", companyId,
                "payScheduleId", payScheduleId,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String companyId;
 
        private String payScheduleId;
 
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
        
        public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest build() {
            return new GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequest(
                companyId,
                payScheduleId,
                xGustoAPIVersion);
        }
    }
}

