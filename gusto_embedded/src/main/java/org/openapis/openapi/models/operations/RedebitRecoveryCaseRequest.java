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


public class RedebitRecoveryCaseRequest {

    /**
     * The UUID of the recovery case
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=recovery_case_uuid")
    private String recoveryCaseUuid;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public RedebitRecoveryCaseRequest(
            String recoveryCaseUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(recoveryCaseUuid, "recoveryCaseUuid");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.recoveryCaseUuid = recoveryCaseUuid;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public RedebitRecoveryCaseRequest(
            String recoveryCaseUuid) {
        this(recoveryCaseUuid, Optional.empty());
    }

    /**
     * The UUID of the recovery case
     */
    @JsonIgnore
    public String recoveryCaseUuid() {
        return recoveryCaseUuid;
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
     * The UUID of the recovery case
     */
    public RedebitRecoveryCaseRequest withRecoveryCaseUuid(String recoveryCaseUuid) {
        Utils.checkNotNull(recoveryCaseUuid, "recoveryCaseUuid");
        this.recoveryCaseUuid = recoveryCaseUuid;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public RedebitRecoveryCaseRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public RedebitRecoveryCaseRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        RedebitRecoveryCaseRequest other = (RedebitRecoveryCaseRequest) o;
        return 
            Objects.deepEquals(this.recoveryCaseUuid, other.recoveryCaseUuid) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            recoveryCaseUuid,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(RedebitRecoveryCaseRequest.class,
                "recoveryCaseUuid", recoveryCaseUuid,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String recoveryCaseUuid;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the recovery case
         */
        public Builder recoveryCaseUuid(String recoveryCaseUuid) {
            Utils.checkNotNull(recoveryCaseUuid, "recoveryCaseUuid");
            this.recoveryCaseUuid = recoveryCaseUuid;
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
        
        public RedebitRecoveryCaseRequest build() {
            return new RedebitRecoveryCaseRequest(
                recoveryCaseUuid,
                xGustoAPIVersion);
        }
    }
}

