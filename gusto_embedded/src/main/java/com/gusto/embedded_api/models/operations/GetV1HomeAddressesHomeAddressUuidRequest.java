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

public class GetV1HomeAddressesHomeAddressUuidRequest {

    /**
     * The UUID of the home address
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=home_address_uuid")
    private String homeAddressUuid;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetV1HomeAddressesHomeAddressUuidRequest(
            String homeAddressUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(homeAddressUuid, "homeAddressUuid");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.homeAddressUuid = homeAddressUuid;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1HomeAddressesHomeAddressUuidRequest(
            String homeAddressUuid) {
        this(homeAddressUuid, Optional.empty());
    }

    /**
     * The UUID of the home address
     */
    @JsonIgnore
    public String homeAddressUuid() {
        return homeAddressUuid;
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
     * The UUID of the home address
     */
    public GetV1HomeAddressesHomeAddressUuidRequest withHomeAddressUuid(String homeAddressUuid) {
        Utils.checkNotNull(homeAddressUuid, "homeAddressUuid");
        this.homeAddressUuid = homeAddressUuid;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1HomeAddressesHomeAddressUuidRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1HomeAddressesHomeAddressUuidRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetV1HomeAddressesHomeAddressUuidRequest other = (GetV1HomeAddressesHomeAddressUuidRequest) o;
        return 
            Objects.deepEquals(this.homeAddressUuid, other.homeAddressUuid) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            homeAddressUuid,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1HomeAddressesHomeAddressUuidRequest.class,
                "homeAddressUuid", homeAddressUuid,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String homeAddressUuid;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the home address
         */
        public Builder homeAddressUuid(String homeAddressUuid) {
            Utils.checkNotNull(homeAddressUuid, "homeAddressUuid");
            this.homeAddressUuid = homeAddressUuid;
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
        
        public GetV1HomeAddressesHomeAddressUuidRequest build() {
            return new GetV1HomeAddressesHomeAddressUuidRequest(
                homeAddressUuid,
                xGustoAPIVersion);
        }
    }
}

