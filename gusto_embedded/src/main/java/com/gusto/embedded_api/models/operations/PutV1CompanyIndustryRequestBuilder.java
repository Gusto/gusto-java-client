/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class PutV1CompanyIndustryRequestBuilder {

    private String companyId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1CompanyIndustryRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1CompanyIndustry sdk;

    public PutV1CompanyIndustryRequestBuilder(SDKMethodInterfaces.MethodCallPutV1CompanyIndustry sdk) {
        this.sdk = sdk;
    }

    public PutV1CompanyIndustryRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }
                
    public PutV1CompanyIndustryRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1CompanyIndustryRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1CompanyIndustryRequestBuilder requestBody(PutV1CompanyIndustryRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1CompanyIndustryResponse call() throws Exception {

        return sdk.update(
            companyId,
            xGustoAPIVersion,
            requestBody);
    }
}
