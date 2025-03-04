/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBuilder {

    private String timeOffPolicyUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployees sdk;

    public PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBuilder(SDKMethodInterfaces.MethodCallPutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployees sdk) {
        this.sdk = sdk;
    }

    public PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBuilder timeOffPolicyUuid(String timeOffPolicyUuid) {
        Utils.checkNotNull(timeOffPolicyUuid, "timeOffPolicyUuid");
        this.timeOffPolicyUuid = timeOffPolicyUuid;
        return this;
    }
                
    public PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBuilder requestBody(PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.addEmployees(
            timeOffPolicyUuid,
            xGustoAPIVersion,
            requestBody);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
