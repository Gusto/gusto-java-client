/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.PayScheduleAssignmentBody;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class PostV1CompaniesCompanyIdPaySchedulesAssignRequestBuilder {

    private String companyId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private PayScheduleAssignmentBody payScheduleAssignmentBody;
    private final SDKMethodInterfaces.MethodCallPostV1CompaniesCompanyIdPaySchedulesAssign sdk;

    public PostV1CompaniesCompanyIdPaySchedulesAssignRequestBuilder(SDKMethodInterfaces.MethodCallPostV1CompaniesCompanyIdPaySchedulesAssign sdk) {
        this.sdk = sdk;
    }

    public PostV1CompaniesCompanyIdPaySchedulesAssignRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }
                
    public PostV1CompaniesCompanyIdPaySchedulesAssignRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PostV1CompaniesCompanyIdPaySchedulesAssignRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PostV1CompaniesCompanyIdPaySchedulesAssignRequestBuilder payScheduleAssignmentBody(PayScheduleAssignmentBody payScheduleAssignmentBody) {
        Utils.checkNotNull(payScheduleAssignmentBody, "payScheduleAssignmentBody");
        this.payScheduleAssignmentBody = payScheduleAssignmentBody;
        return this;
    }

    public PostV1CompaniesCompanyIdPaySchedulesAssignResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.assign(
            companyId,
            xGustoAPIVersion,
            payScheduleAssignmentBody);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
