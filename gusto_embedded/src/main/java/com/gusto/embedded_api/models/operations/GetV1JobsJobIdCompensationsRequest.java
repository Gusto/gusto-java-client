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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class GetV1JobsJobIdCompensationsRequest {

    /**
     * The UUID of the job
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=job_id")
    private String jobId;

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<Long> page;

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=per")
    private Optional<Long> per;

    /**
     * Available options:
     * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=include")
    private Optional<? extends GetV1JobsJobIdCompensationsQueryParamInclude> include;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetV1JobsJobIdCompensationsRequest(
            String jobId,
            Optional<Long> page,
            Optional<Long> per,
            Optional<? extends GetV1JobsJobIdCompensationsQueryParamInclude> include,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(jobId, "jobId");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(per, "per");
        Utils.checkNotNull(include, "include");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.jobId = jobId;
        this.page = page;
        this.per = per;
        this.include = include;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1JobsJobIdCompensationsRequest(
            String jobId) {
        this(jobId, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the job
     */
    @JsonIgnore
    public String jobId() {
        return jobId;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    @JsonIgnore
    public Optional<Long> page() {
        return page;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    @JsonIgnore
    public Optional<Long> per() {
        return per;
    }

    /**
     * Available options:
     * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetV1JobsJobIdCompensationsQueryParamInclude> include() {
        return (Optional<GetV1JobsJobIdCompensationsQueryParamInclude>) include;
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
    public GetV1JobsJobIdCompensationsRequest withJobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetV1JobsJobIdCompensationsRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
     */
    public GetV1JobsJobIdCompensationsRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetV1JobsJobIdCompensationsRequest withPer(long per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.ofNullable(per);
        return this;
    }

    /**
     * Number of objects per page. For majority of endpoints will default to 25
     */
    public GetV1JobsJobIdCompensationsRequest withPer(Optional<Long> per) {
        Utils.checkNotNull(per, "per");
        this.per = per;
        return this;
    }

    /**
     * Available options:
     * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
     */
    public GetV1JobsJobIdCompensationsRequest withInclude(GetV1JobsJobIdCompensationsQueryParamInclude include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.ofNullable(include);
        return this;
    }

    /**
     * Available options:
     * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
     */
    public GetV1JobsJobIdCompensationsRequest withInclude(Optional<? extends GetV1JobsJobIdCompensationsQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1JobsJobIdCompensationsRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1JobsJobIdCompensationsRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetV1JobsJobIdCompensationsRequest other = (GetV1JobsJobIdCompensationsRequest) o;
        return 
            Objects.deepEquals(this.jobId, other.jobId) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.per, other.per) &&
            Objects.deepEquals(this.include, other.include) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            jobId,
            page,
            per,
            include,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1JobsJobIdCompensationsRequest.class,
                "jobId", jobId,
                "page", page,
                "per", per,
                "include", include,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String jobId;
 
        private Optional<Long> page = Optional.empty();
 
        private Optional<Long> per = Optional.empty();
 
        private Optional<? extends GetV1JobsJobIdCompensationsQueryParamInclude> include = Optional.empty();
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;  
        
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
         * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
         */
        public Builder page(long page) {
            Utils.checkNotNull(page, "page");
            this.page = Optional.ofNullable(page);
            return this;
        }

        /**
         * The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.
         */
        public Builder page(Optional<Long> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * Number of objects per page. For majority of endpoints will default to 25
         */
        public Builder per(long per) {
            Utils.checkNotNull(per, "per");
            this.per = Optional.ofNullable(per);
            return this;
        }

        /**
         * Number of objects per page. For majority of endpoints will default to 25
         */
        public Builder per(Optional<Long> per) {
            Utils.checkNotNull(per, "per");
            this.per = per;
            return this;
        }

        /**
         * Available options:
         * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
         */
        public Builder include(GetV1JobsJobIdCompensationsQueryParamInclude include) {
            Utils.checkNotNull(include, "include");
            this.include = Optional.ofNullable(include);
            return this;
        }

        /**
         * Available options:
         * - all_compensations: Include all effective dated compensations for each job instead of only the current compensation
         */
        public Builder include(Optional<? extends GetV1JobsJobIdCompensationsQueryParamInclude> include) {
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
        
        public GetV1JobsJobIdCompensationsRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new GetV1JobsJobIdCompensationsRequest(
                jobId,
                page,
                per,
                include,
                xGustoAPIVersion);
        }

        private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
                new LazySingletonValue<>(
                        "X-Gusto-API-Version",
                        "\"2024-04-01\"",
                        new TypeReference<Optional<? extends VersionHeader>>() {});
    }
}

