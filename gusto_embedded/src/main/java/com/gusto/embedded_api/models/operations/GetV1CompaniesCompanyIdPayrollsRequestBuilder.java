/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.utils.Utils;
import java.lang.Exception;

public class GetV1CompaniesCompanyIdPayrollsRequestBuilder {

    private GetV1CompaniesCompanyIdPayrollsRequest request;
    private final SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyIdPayrolls sdk;

    public GetV1CompaniesCompanyIdPayrollsRequestBuilder(SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyIdPayrolls sdk) {
        this.sdk = sdk;
    }

    public GetV1CompaniesCompanyIdPayrollsRequestBuilder request(GetV1CompaniesCompanyIdPayrollsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetV1CompaniesCompanyIdPayrollsResponse call() throws Exception {

        return sdk.list(
            request);
    }
}
