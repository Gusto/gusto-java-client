/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutCompaniesCompanyUuidHolidayPayPolicyRequestBuilder {

    private String companyUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutCompaniesCompanyUuidHolidayPayPolicyRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutCompaniesCompanyUuidHolidayPayPolicy sdk;

    public PutCompaniesCompanyUuidHolidayPayPolicyRequestBuilder(SDKMethodInterfaces.MethodCallPutCompaniesCompanyUuidHolidayPayPolicy sdk) {
        this.sdk = sdk;
    }

    public PutCompaniesCompanyUuidHolidayPayPolicyRequestBuilder companyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }
                
    public PutCompaniesCompanyUuidHolidayPayPolicyRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutCompaniesCompanyUuidHolidayPayPolicyRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutCompaniesCompanyUuidHolidayPayPolicyRequestBuilder requestBody(PutCompaniesCompanyUuidHolidayPayPolicyRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutCompaniesCompanyUuidHolidayPayPolicyResponse call() throws Exception {

        return sdk.update(
            companyUuid,
            xGustoAPIVersion,
            requestBody);
    }
}
