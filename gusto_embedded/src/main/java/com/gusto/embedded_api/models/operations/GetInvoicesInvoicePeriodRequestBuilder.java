/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.utils.Utils;
import java.lang.Exception;

public class GetInvoicesInvoicePeriodRequestBuilder {

    private GetInvoicesInvoicePeriodRequest request;
    private GetInvoicesInvoicePeriodSecurity security;
    private final SDKMethodInterfaces.MethodCallGetInvoicesInvoicePeriod sdk;

    public GetInvoicesInvoicePeriodRequestBuilder(SDKMethodInterfaces.MethodCallGetInvoicesInvoicePeriod sdk) {
        this.sdk = sdk;
    }

    public GetInvoicesInvoicePeriodRequestBuilder request(GetInvoicesInvoicePeriodRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetInvoicesInvoicePeriodRequestBuilder security(GetInvoicesInvoicePeriodSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }

    public GetInvoicesInvoicePeriodResponse call() throws Exception {

        return sdk.get(
            request,
            security);
    }
}
