/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutV1ContractorDocumentSignRequestBuilder {

    private String documentUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1ContractorDocumentSignRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1ContractorDocumentSign sdk;

    public PutV1ContractorDocumentSignRequestBuilder(SDKMethodInterfaces.MethodCallPutV1ContractorDocumentSign sdk) {
        this.sdk = sdk;
    }

    public PutV1ContractorDocumentSignRequestBuilder documentUuid(String documentUuid) {
        Utils.checkNotNull(documentUuid, "documentUuid");
        this.documentUuid = documentUuid;
        return this;
    }
                
    public PutV1ContractorDocumentSignRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1ContractorDocumentSignRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1ContractorDocumentSignRequestBuilder requestBody(PutV1ContractorDocumentSignRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1ContractorDocumentSignResponse call() throws Exception {

        return sdk.sign(
            documentUuid,
            xGustoAPIVersion,
            requestBody);
    }
}
