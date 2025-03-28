/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.utils.Utils;
import java.lang.Exception;

public class GetAchTransactionsRequestBuilder {

    private GetAchTransactionsRequest request;
    private final SDKMethodInterfaces.MethodCallGetAchTransactions sdk;

    public GetAchTransactionsRequestBuilder(SDKMethodInterfaces.MethodCallGetAchTransactions sdk) {
        this.sdk = sdk;
    }

    public GetAchTransactionsRequestBuilder request(GetAchTransactionsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAchTransactionsResponse call() throws Exception {

        return sdk.getAll(
            request);
    }
}
