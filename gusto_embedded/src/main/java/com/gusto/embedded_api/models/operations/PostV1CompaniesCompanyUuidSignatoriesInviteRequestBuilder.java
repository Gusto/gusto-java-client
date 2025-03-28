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

public class PostV1CompaniesCompanyUuidSignatoriesInviteRequestBuilder {

    private String companyUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private PostV1CompaniesCompanyUuidSignatoriesInviteRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPostV1CompaniesCompanyUuidSignatoriesInvite sdk;

    public PostV1CompaniesCompanyUuidSignatoriesInviteRequestBuilder(SDKMethodInterfaces.MethodCallPostV1CompaniesCompanyUuidSignatoriesInvite sdk) {
        this.sdk = sdk;
    }

    public PostV1CompaniesCompanyUuidSignatoriesInviteRequestBuilder companyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }
                
    public PostV1CompaniesCompanyUuidSignatoriesInviteRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PostV1CompaniesCompanyUuidSignatoriesInviteRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PostV1CompaniesCompanyUuidSignatoriesInviteRequestBuilder requestBody(PostV1CompaniesCompanyUuidSignatoriesInviteRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PostV1CompaniesCompanyUuidSignatoriesInviteResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.invite(
            companyUuid,
            xGustoAPIVersion,
            requestBody);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
