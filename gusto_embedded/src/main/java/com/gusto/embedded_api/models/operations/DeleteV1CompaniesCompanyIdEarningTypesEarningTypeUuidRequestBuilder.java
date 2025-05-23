/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class DeleteV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBuilder {

    private String companyId;
    private String earningTypeUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private final SDKMethodInterfaces.MethodCallDeleteV1CompaniesCompanyIdEarningTypesEarningTypeUuid sdk;

    public DeleteV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBuilder(SDKMethodInterfaces.MethodCallDeleteV1CompaniesCompanyIdEarningTypesEarningTypeUuid sdk) {
        this.sdk = sdk;
    }

    public DeleteV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    public DeleteV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBuilder earningTypeUuid(String earningTypeUuid) {
        Utils.checkNotNull(earningTypeUuid, "earningTypeUuid");
        this.earningTypeUuid = earningTypeUuid;
        return this;
    }
                
    public DeleteV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public DeleteV1CompaniesCompanyIdEarningTypesEarningTypeUuidRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public DeleteV1CompaniesCompanyIdEarningTypesEarningTypeUuidResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.delete(
            companyId,
            earningTypeUuid,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
