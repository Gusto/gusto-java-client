/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Exception;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder {

    private String employeeId;
    private Optional<Long> taxYear = Optional.empty();
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private final SDKMethodInterfaces.MethodCallGetEmployeeYtdBenefitAmountsFromDifferentCompany sdk;

    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder(SDKMethodInterfaces.MethodCallGetEmployeeYtdBenefitAmountsFromDifferentCompany sdk) {
        this.sdk = sdk;
    }

    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }
                
    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder taxYear(long taxYear) {
        Utils.checkNotNull(taxYear, "taxYear");
        this.taxYear = Optional.of(taxYear);
        return this;
    }

    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder taxYear(Optional<Long> taxYear) {
        Utils.checkNotNull(taxYear, "taxYear");
        this.taxYear = taxYear;
        return this;
    }
                
    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetEmployeeYtdBenefitAmountsFromDifferentCompanyResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.getYtdBenefitAmountsFromDifferentCompany(
            employeeId,
            taxYear,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
