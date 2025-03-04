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

public class GetV1CompaniesCompanyIdUnprocessedTerminationPayPeriodsRequestBuilder {

    private String companyId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private final SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyIdUnprocessedTerminationPayPeriods sdk;

    public GetV1CompaniesCompanyIdUnprocessedTerminationPayPeriodsRequestBuilder(SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyIdUnprocessedTerminationPayPeriods sdk) {
        this.sdk = sdk;
    }

    public GetV1CompaniesCompanyIdUnprocessedTerminationPayPeriodsRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }
                
    public GetV1CompaniesCompanyIdUnprocessedTerminationPayPeriodsRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1CompaniesCompanyIdUnprocessedTerminationPayPeriodsRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1CompaniesCompanyIdUnprocessedTerminationPayPeriodsResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.getUnprocessedTerminationPeriods(
            companyId,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
