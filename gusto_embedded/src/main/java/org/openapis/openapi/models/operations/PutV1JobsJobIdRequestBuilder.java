/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutV1JobsJobIdRequestBuilder {

    private String jobId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1JobsJobIdRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1JobsJobId sdk;

    public PutV1JobsJobIdRequestBuilder(SDKMethodInterfaces.MethodCallPutV1JobsJobId sdk) {
        this.sdk = sdk;
    }

    public PutV1JobsJobIdRequestBuilder jobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }
                
    public PutV1JobsJobIdRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1JobsJobIdRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1JobsJobIdRequestBuilder requestBody(PutV1JobsJobIdRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1JobsJobIdResponse call() throws Exception {

        return sdk.update(
            jobId,
            xGustoAPIVersion,
            requestBody);
    }
}
