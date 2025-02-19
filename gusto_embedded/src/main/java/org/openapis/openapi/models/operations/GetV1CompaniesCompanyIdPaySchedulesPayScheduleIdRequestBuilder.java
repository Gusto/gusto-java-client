/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBuilder {

    private String companyId;
    private String payScheduleId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyIdPaySchedulesPayScheduleId sdk;

    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBuilder(SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyIdPaySchedulesPayScheduleId sdk) {
        this.sdk = sdk;
    }

    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }

    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBuilder payScheduleId(String payScheduleId) {
        Utils.checkNotNull(payScheduleId, "payScheduleId");
        this.payScheduleId = payScheduleId;
        return this;
    }
                
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse call() throws Exception {

        return sdk.get(
            companyId,
            payScheduleId,
            xGustoAPIVersion);
    }
}
