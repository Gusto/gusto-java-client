/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class PutV1CompensationsCompensationIdRequestBuilder {

    private String compensationId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1CompensationsCompensationIdRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1CompensationsCompensationId sdk;

    public PutV1CompensationsCompensationIdRequestBuilder(SDKMethodInterfaces.MethodCallPutV1CompensationsCompensationId sdk) {
        this.sdk = sdk;
    }

    public PutV1CompensationsCompensationIdRequestBuilder compensationId(String compensationId) {
        Utils.checkNotNull(compensationId, "compensationId");
        this.compensationId = compensationId;
        return this;
    }
                
    public PutV1CompensationsCompensationIdRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1CompensationsCompensationIdRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1CompensationsCompensationIdRequestBuilder requestBody(PutV1CompensationsCompensationIdRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1CompensationsCompensationIdResponse call() throws Exception {

        return sdk.updateCompensation(
            compensationId,
            xGustoAPIVersion,
            requestBody);
    }
}
