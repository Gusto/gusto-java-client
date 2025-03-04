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

public class PostV1CompaniesCompanyIdPaySchedulesRequestBuilder {

    private String companyId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private PostV1CompaniesCompanyIdPaySchedulesRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPostV1CompaniesCompanyIdPaySchedules sdk;

    public PostV1CompaniesCompanyIdPaySchedulesRequestBuilder(SDKMethodInterfaces.MethodCallPostV1CompaniesCompanyIdPaySchedules sdk) {
        this.sdk = sdk;
    }

    public PostV1CompaniesCompanyIdPaySchedulesRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }
                
    public PostV1CompaniesCompanyIdPaySchedulesRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PostV1CompaniesCompanyIdPaySchedulesRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PostV1CompaniesCompanyIdPaySchedulesRequestBuilder requestBody(PostV1CompaniesCompanyIdPaySchedulesRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PostV1CompaniesCompanyIdPaySchedulesResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.create(
            companyId,
            xGustoAPIVersion,
            requestBody);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
