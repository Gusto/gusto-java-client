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

public class GetV1JobsJobIdRequest {

    /**
     * The UUID of the job
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=job_id")
    private String jobId;

    /**
     * Available options:
     * - all_compensations: Include all effective dated compensations for the job instead of only the current compensation
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include")
    private Optional<? extends GetV1JobsJobIdQueryParamInclude> include;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetV1JobsJobIdRequest(
            String jobId,
            Optional<? extends GetV1JobsJobIdQueryParamInclude> include,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.jobId = jobId;
        this.include = include;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1JobsJobIdRequest(
            String jobId) {
        this(jobId, Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the job
     */
    @JsonIgnore
    public String jobId() {
        return jobId;
    }

    /**
     * Available options:
     * - all_compensations: Include all effective dated compensations for the job instead of only the current compensation
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetV1JobsJobIdQueryParamInclude> include() {
        return (Optional<GetV1JobsJobIdQueryParamInclude>) include;
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
     * The UUID of the job
     */
    public GetV1JobsJobIdRequest withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    /**
     * Available options:
     * - all_compensations: Include all effective dated compensations for the job instead of only the current compensation
     */
    public GetV1JobsJobIdRequest withInclude(GetV1JobsJobIdQueryParamInclude include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * Available options:
     * - all_compensations: Include all effective dated compensations for the job instead of only the current compensation
     */
    public GetV1JobsJobIdRequest withInclude(Optional<? extends GetV1JobsJobIdQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1JobsJobIdRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1JobsJobIdRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetV1JobsJobIdRequest other = (GetV1JobsJobIdRequest) o;
        return 
            Objects.deepEquals(this.jobId, other.jobId) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            jobId,
            include,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1JobsJobIdRequest.class,
                "jobId", jobId,
                "include", include,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String jobId;
 
        private Optional<? extends GetV1JobsJobIdQueryParamInclude> include = Optional.empty();
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the job
         */
        public Builder jobId(String jobId) {
            Utils.checkNotNull(jobId, "jobId");
            this.jobId = jobId;
            return this;
        }

        /**
         * Available options:
         * - all_compensations: Include all effective dated compensations for the job instead of only the current compensation
         */
        public Builder include(GetV1JobsJobIdQueryParamInclude include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * Available options:
         * - all_compensations: Include all effective dated compensations for the job instead of only the current compensation
         */
        public Builder include(Optional<? extends GetV1JobsJobIdQueryParamInclude> include) {
            Utils.checkNotNull(include, "include");
            this.include = include;
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
        
        public GetV1JobsJobIdRequest build() {
            return new GetV1JobsJobIdRequest(
                jobId,
                include,
                xGustoAPIVersion);
        }
    }
}

