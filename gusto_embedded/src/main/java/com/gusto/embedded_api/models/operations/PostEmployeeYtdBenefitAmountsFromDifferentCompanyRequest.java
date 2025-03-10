/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.PostEmployeeYtdBenefitAmountsFromDifferentCompany;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest {

    /**
     * The UUID of the employee
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=employee_id")
    private String employeeId;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @SpeakeasyMetadata("request:mediaType=application/json")
    private PostEmployeeYtdBenefitAmountsFromDifferentCompany postEmployeeYtdBenefitAmountsFromDifferentCompany;

    @JsonCreator
    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest(
            String employeeId,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PostEmployeeYtdBenefitAmountsFromDifferentCompany postEmployeeYtdBenefitAmountsFromDifferentCompany) {
        Utils.checkNotNull(employeeId, "employeeId");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        Utils.checkNotNull(postEmployeeYtdBenefitAmountsFromDifferentCompany, "postEmployeeYtdBenefitAmountsFromDifferentCompany");
        this.employeeId = employeeId;
        this.xGustoAPIVersion = xGustoAPIVersion;
        this.postEmployeeYtdBenefitAmountsFromDifferentCompany = postEmployeeYtdBenefitAmountsFromDifferentCompany;
    }
    
    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest(
            String employeeId,
            PostEmployeeYtdBenefitAmountsFromDifferentCompany postEmployeeYtdBenefitAmountsFromDifferentCompany) {
        this(employeeId, Optional.empty(), postEmployeeYtdBenefitAmountsFromDifferentCompany);
    }

    /**
     * The UUID of the employee
     */
    @JsonIgnore
    public String employeeId() {
        return employeeId;
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
    public PostEmployeeYtdBenefitAmountsFromDifferentCompany postEmployeeYtdBenefitAmountsFromDifferentCompany() {
        return postEmployeeYtdBenefitAmountsFromDifferentCompany;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the employee
     */
    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest withEmployeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest withPostEmployeeYtdBenefitAmountsFromDifferentCompany(PostEmployeeYtdBenefitAmountsFromDifferentCompany postEmployeeYtdBenefitAmountsFromDifferentCompany) {
        Utils.checkNotNull(postEmployeeYtdBenefitAmountsFromDifferentCompany, "postEmployeeYtdBenefitAmountsFromDifferentCompany");
        this.postEmployeeYtdBenefitAmountsFromDifferentCompany = postEmployeeYtdBenefitAmountsFromDifferentCompany;
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
        PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest other = (PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest) o;
        return 
            Objects.deepEquals(this.employeeId, other.employeeId) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion) &&
            Objects.deepEquals(this.postEmployeeYtdBenefitAmountsFromDifferentCompany, other.postEmployeeYtdBenefitAmountsFromDifferentCompany);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            employeeId,
            xGustoAPIVersion,
            postEmployeeYtdBenefitAmountsFromDifferentCompany);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest.class,
                "employeeId", employeeId,
                "xGustoAPIVersion", xGustoAPIVersion,
                "postEmployeeYtdBenefitAmountsFromDifferentCompany", postEmployeeYtdBenefitAmountsFromDifferentCompany);
    }
    
    public final static class Builder {
 
        private String employeeId;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion;
 
        private PostEmployeeYtdBenefitAmountsFromDifferentCompany postEmployeeYtdBenefitAmountsFromDifferentCompany;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the employee
         */
        public Builder employeeId(String employeeId) {
            Utils.checkNotNull(employeeId, "employeeId");
            this.employeeId = employeeId;
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

        public Builder postEmployeeYtdBenefitAmountsFromDifferentCompany(PostEmployeeYtdBenefitAmountsFromDifferentCompany postEmployeeYtdBenefitAmountsFromDifferentCompany) {
            Utils.checkNotNull(postEmployeeYtdBenefitAmountsFromDifferentCompany, "postEmployeeYtdBenefitAmountsFromDifferentCompany");
            this.postEmployeeYtdBenefitAmountsFromDifferentCompany = postEmployeeYtdBenefitAmountsFromDifferentCompany;
            return this;
        }
        
        public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest build() {
            if (xGustoAPIVersion == null) {
                xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
            }            return new PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequest(
                employeeId,
                xGustoAPIVersion,
                postEmployeeYtdBenefitAmountsFromDifferentCompany);
        }

        private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
                new LazySingletonValue<>(
                        "X-Gusto-API-Version",
                        "\"2024-04-01\"",
                        new TypeReference<Optional<? extends VersionHeader>>() {});
    }
}

