/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetTimeOffPoliciesTimeOffPolicyUuidRequestBuilder {

    private String timeOffPolicyUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetTimeOffPoliciesTimeOffPolicyUuid sdk;

    public GetTimeOffPoliciesTimeOffPolicyUuidRequestBuilder(SDKMethodInterfaces.MethodCallGetTimeOffPoliciesTimeOffPolicyUuid sdk) {
        this.sdk = sdk;
    }

    public GetTimeOffPoliciesTimeOffPolicyUuidRequestBuilder timeOffPolicyUuid(String timeOffPolicyUuid) {
        Utils.checkNotNull(timeOffPolicyUuid, "timeOffPolicyUuid");
        this.timeOffPolicyUuid = timeOffPolicyUuid;
        return this;
    }
                
    public GetTimeOffPoliciesTimeOffPolicyUuidRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetTimeOffPoliciesTimeOffPolicyUuidRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetTimeOffPoliciesTimeOffPolicyUuidResponse call() throws Exception {

        return sdk.get(
            timeOffPolicyUuid,
            xGustoAPIVersion);
    }
}
