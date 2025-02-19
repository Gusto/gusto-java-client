/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBuilder {

    private String timeOffPolicyUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutVersionTimeOffPoliciesTimeOffPolicyUuidBalance sdk;

    public PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBuilder(SDKMethodInterfaces.MethodCallPutVersionTimeOffPoliciesTimeOffPolicyUuidBalance sdk) {
        this.sdk = sdk;
    }

    public PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBuilder timeOffPolicyUuid(String timeOffPolicyUuid) {
        Utils.checkNotNull(timeOffPolicyUuid, "timeOffPolicyUuid");
        this.timeOffPolicyUuid = timeOffPolicyUuid;
        return this;
    }
                
    public PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBuilder requestBody(PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceResponse call() throws Exception {

        return sdk.updateBalance(
            timeOffPolicyUuid,
            xGustoAPIVersion,
            requestBody);
    }
}
