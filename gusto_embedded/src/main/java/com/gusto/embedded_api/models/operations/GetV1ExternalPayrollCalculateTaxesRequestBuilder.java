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

public class GetV1ExternalPayrollCalculateTaxesRequestBuilder {

    private String companyUuid;
    private String externalPayrollId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private final SDKMethodInterfaces.MethodCallGetV1ExternalPayrollCalculateTaxes sdk;

    public GetV1ExternalPayrollCalculateTaxesRequestBuilder(SDKMethodInterfaces.MethodCallGetV1ExternalPayrollCalculateTaxes sdk) {
        this.sdk = sdk;
    }

    public GetV1ExternalPayrollCalculateTaxesRequestBuilder companyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    public GetV1ExternalPayrollCalculateTaxesRequestBuilder externalPayrollId(String externalPayrollId) {
        Utils.checkNotNull(externalPayrollId, "externalPayrollId");
        this.externalPayrollId = externalPayrollId;
        return this;
    }
                
    public GetV1ExternalPayrollCalculateTaxesRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1ExternalPayrollCalculateTaxesRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1ExternalPayrollCalculateTaxesResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.calculateTaxes(
            companyUuid,
            externalPayrollId,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
