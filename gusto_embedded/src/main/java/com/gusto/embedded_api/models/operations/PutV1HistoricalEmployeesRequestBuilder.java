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

public class PutV1HistoricalEmployeesRequestBuilder {

    private String companyUuid;
    private String historicalEmployeeUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private PutV1HistoricalEmployeesRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1HistoricalEmployees sdk;

    public PutV1HistoricalEmployeesRequestBuilder(SDKMethodInterfaces.MethodCallPutV1HistoricalEmployees sdk) {
        this.sdk = sdk;
    }

    public PutV1HistoricalEmployeesRequestBuilder companyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBuilder historicalEmployeeUuid(String historicalEmployeeUuid) {
        Utils.checkNotNull(historicalEmployeeUuid, "historicalEmployeeUuid");
        this.historicalEmployeeUuid = historicalEmployeeUuid;
        return this;
    }
                
    public PutV1HistoricalEmployeesRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1HistoricalEmployeesRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1HistoricalEmployeesRequestBuilder requestBody(PutV1HistoricalEmployeesRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1HistoricalEmployeesResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.update(
            companyUuid,
            historicalEmployeeUuid,
            xGustoAPIVersion,
            requestBody);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
