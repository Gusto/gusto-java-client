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

public class GetCompaniesCompanyUuidPaidHolidaysRequestBuilder {

    private String companyUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private GetCompaniesCompanyUuidPaidHolidaysRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallGetCompaniesCompanyUuidPaidHolidays sdk;

    public GetCompaniesCompanyUuidPaidHolidaysRequestBuilder(SDKMethodInterfaces.MethodCallGetCompaniesCompanyUuidPaidHolidays sdk) {
        this.sdk = sdk;
    }

    public GetCompaniesCompanyUuidPaidHolidaysRequestBuilder companyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }
                
    public GetCompaniesCompanyUuidPaidHolidaysRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetCompaniesCompanyUuidPaidHolidaysRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetCompaniesCompanyUuidPaidHolidaysRequestBuilder requestBody(GetCompaniesCompanyUuidPaidHolidaysRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public GetCompaniesCompanyUuidPaidHolidaysResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.previewPaidHolidays(
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
