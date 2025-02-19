/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutV1TimeOffPoliciesTimeOffPolicyUuidDeactivateRequestBuilder {

    private String timeOffPolicyUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallPutV1TimeOffPoliciesTimeOffPolicyUuidDeactivate sdk;

    public PutV1TimeOffPoliciesTimeOffPolicyUuidDeactivateRequestBuilder(SDKMethodInterfaces.MethodCallPutV1TimeOffPoliciesTimeOffPolicyUuidDeactivate sdk) {
        this.sdk = sdk;
    }

    public PutV1TimeOffPoliciesTimeOffPolicyUuidDeactivateRequestBuilder timeOffPolicyUuid(String timeOffPolicyUuid) {
        Utils.checkNotNull(timeOffPolicyUuid, "timeOffPolicyUuid");
        this.timeOffPolicyUuid = timeOffPolicyUuid;
        return this;
    }
                
    public PutV1TimeOffPoliciesTimeOffPolicyUuidDeactivateRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1TimeOffPoliciesTimeOffPolicyUuidDeactivateRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1TimeOffPoliciesTimeOffPolicyUuidDeactivateResponse call() throws Exception {

        return sdk.deactivate(
            timeOffPolicyUuid,
            xGustoAPIVersion);
    }
}
