/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutTimeOffPoliciesTimeOffPolicyUuidRequestBuilder {

    private String timeOffPolicyUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutTimeOffPoliciesTimeOffPolicyUuidRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutTimeOffPoliciesTimeOffPolicyUuid sdk;

    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBuilder(SDKMethodInterfaces.MethodCallPutTimeOffPoliciesTimeOffPolicyUuid sdk) {
        this.sdk = sdk;
    }

    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBuilder timeOffPolicyUuid(String timeOffPolicyUuid) {
        Utils.checkNotNull(timeOffPolicyUuid, "timeOffPolicyUuid");
        this.timeOffPolicyUuid = timeOffPolicyUuid;
        return this;
    }
                
    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutTimeOffPoliciesTimeOffPolicyUuidRequestBuilder requestBody(PutTimeOffPoliciesTimeOffPolicyUuidRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutTimeOffPoliciesTimeOffPolicyUuidResponse call() throws Exception {

        return sdk.update(
            timeOffPolicyUuid,
            xGustoAPIVersion,
            requestBody);
    }
}
