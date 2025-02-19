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


public class GetV1WebhookSubscriptionVerificationTokenUuidRequest {

    /**
     * The webhook subscription UUID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=webhook_subscription_uuid")
    private String webhookSubscriptionUuid;

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Gusto-API-Version")
    private Optional<? extends VersionHeader> xGustoAPIVersion;

    @JsonCreator
    public GetV1WebhookSubscriptionVerificationTokenUuidRequest(
            String webhookSubscriptionUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(webhookSubscriptionUuid, "webhookSubscriptionUuid");
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.webhookSubscriptionUuid = webhookSubscriptionUuid;
        this.xGustoAPIVersion = xGustoAPIVersion;
    }
    
    public GetV1WebhookSubscriptionVerificationTokenUuidRequest(
            String webhookSubscriptionUuid) {
        this(webhookSubscriptionUuid, Optional.empty());
    }

    /**
     * The webhook subscription UUID.
     */
    @JsonIgnore
    public String webhookSubscriptionUuid() {
        return webhookSubscriptionUuid;
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
     * The webhook subscription UUID.
     */
    public GetV1WebhookSubscriptionVerificationTokenUuidRequest withWebhookSubscriptionUuid(String webhookSubscriptionUuid) {
        Utils.checkNotNull(webhookSubscriptionUuid, "webhookSubscriptionUuid");
        this.webhookSubscriptionUuid = webhookSubscriptionUuid;
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1WebhookSubscriptionVerificationTokenUuidRequest withXGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.ofNullable(xGustoAPIVersion);
        return this;
    }

    /**
     * Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.
     */
    public GetV1WebhookSubscriptionVerificationTokenUuidRequest withXGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
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
        GetV1WebhookSubscriptionVerificationTokenUuidRequest other = (GetV1WebhookSubscriptionVerificationTokenUuidRequest) o;
        return 
            Objects.deepEquals(this.webhookSubscriptionUuid, other.webhookSubscriptionUuid) &&
            Objects.deepEquals(this.xGustoAPIVersion, other.xGustoAPIVersion);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            webhookSubscriptionUuid,
            xGustoAPIVersion);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1WebhookSubscriptionVerificationTokenUuidRequest.class,
                "webhookSubscriptionUuid", webhookSubscriptionUuid,
                "xGustoAPIVersion", xGustoAPIVersion);
    }
    
    public final static class Builder {
 
        private String webhookSubscriptionUuid;
 
        private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The webhook subscription UUID.
         */
        public Builder webhookSubscriptionUuid(String webhookSubscriptionUuid) {
            Utils.checkNotNull(webhookSubscriptionUuid, "webhookSubscriptionUuid");
            this.webhookSubscriptionUuid = webhookSubscriptionUuid;
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
        
        public GetV1WebhookSubscriptionVerificationTokenUuidRequest build() {
            return new GetV1WebhookSubscriptionVerificationTokenUuidRequest(
                webhookSubscriptionUuid,
                xGustoAPIVersion);
        }
    }
}

