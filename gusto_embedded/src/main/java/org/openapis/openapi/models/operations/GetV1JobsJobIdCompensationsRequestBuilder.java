/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.Utils;

public class GetV1JobsJobIdCompensationsRequestBuilder {

    private GetV1JobsJobIdCompensationsRequest request;
    private final SDKMethodInterfaces.MethodCallGetV1JobsJobIdCompensations sdk;

    public GetV1JobsJobIdCompensationsRequestBuilder(SDKMethodInterfaces.MethodCallGetV1JobsJobIdCompensations sdk) {
        this.sdk = sdk;
    }

    public GetV1JobsJobIdCompensationsRequestBuilder request(GetV1JobsJobIdCompensationsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetV1JobsJobIdCompensationsResponse call() throws Exception {

        return sdk.getCompensations(
            request);
    }
}
