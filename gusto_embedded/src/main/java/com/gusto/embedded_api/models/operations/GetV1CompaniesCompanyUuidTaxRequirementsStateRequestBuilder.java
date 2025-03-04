/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;

public class GetV1CompaniesCompanyUuidTaxRequirementsStateRequestBuilder {

    private String companyUuid;
    private String state;
    private Optional<Boolean> scheduling = Optional.empty();
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private final SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyUuidTaxRequirementsState sdk;

    public GetV1CompaniesCompanyUuidTaxRequirementsStateRequestBuilder(SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyUuidTaxRequirementsState sdk) {
        this.sdk = sdk;
    }

    public GetV1CompaniesCompanyUuidTaxRequirementsStateRequestBuilder companyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }

    public GetV1CompaniesCompanyUuidTaxRequirementsStateRequestBuilder state(String state) {
        Utils.checkNotNull(state, "state");
        this.state = state;
        return this;
    }
                
    public GetV1CompaniesCompanyUuidTaxRequirementsStateRequestBuilder scheduling(boolean scheduling) {
        Utils.checkNotNull(scheduling, "scheduling");
        this.scheduling = Optional.of(scheduling);
        return this;
    }

    public GetV1CompaniesCompanyUuidTaxRequirementsStateRequestBuilder scheduling(Optional<Boolean> scheduling) {
        Utils.checkNotNull(scheduling, "scheduling");
        this.scheduling = scheduling;
        return this;
    }
                
    public GetV1CompaniesCompanyUuidTaxRequirementsStateRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1CompaniesCompanyUuidTaxRequirementsStateRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1CompaniesCompanyUuidTaxRequirementsStateResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.get(
            companyUuid,
            state,
            scheduling,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
