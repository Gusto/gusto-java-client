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

public class GetV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder {

    private String employeeBenefitId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private final SDKMethodInterfaces.MethodCallGetV1EmployeeBenefitsEmployeeBenefitId sdk;

    public GetV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder(SDKMethodInterfaces.MethodCallGetV1EmployeeBenefitsEmployeeBenefitId sdk) {
        this.sdk = sdk;
    }

    public GetV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder employeeBenefitId(String employeeBenefitId) {
        Utils.checkNotNull(employeeBenefitId, "employeeBenefitId");
        this.employeeBenefitId = employeeBenefitId;
        return this;
    }
                
    public GetV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1EmployeeBenefitsEmployeeBenefitIdResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.retrieve(
            employeeBenefitId,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
