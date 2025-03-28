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

public class DeleteV1CompanyBenefitsCompanyBenefitIdRequestBuilder {

    private String companyBenefitId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private final SDKMethodInterfaces.MethodCallDeleteV1CompanyBenefitsCompanyBenefitId sdk;

    public DeleteV1CompanyBenefitsCompanyBenefitIdRequestBuilder(SDKMethodInterfaces.MethodCallDeleteV1CompanyBenefitsCompanyBenefitId sdk) {
        this.sdk = sdk;
    }

    public DeleteV1CompanyBenefitsCompanyBenefitIdRequestBuilder companyBenefitId(String companyBenefitId) {
        Utils.checkNotNull(companyBenefitId, "companyBenefitId");
        this.companyBenefitId = companyBenefitId;
        return this;
    }
                
    public DeleteV1CompanyBenefitsCompanyBenefitIdRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public DeleteV1CompanyBenefitsCompanyBenefitIdRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public DeleteV1CompanyBenefitsCompanyBenefitIdResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.delete(
            companyBenefitId,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
