/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.DocumentType;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetV1GeneratedDocumentsDocumentTypeRequestUuidRequestBuilder {

    private DocumentType documentType;
    private String requestUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1GeneratedDocumentsDocumentTypeRequestUuid sdk;

    public GetV1GeneratedDocumentsDocumentTypeRequestUuidRequestBuilder(SDKMethodInterfaces.MethodCallGetV1GeneratedDocumentsDocumentTypeRequestUuid sdk) {
        this.sdk = sdk;
    }

    public GetV1GeneratedDocumentsDocumentTypeRequestUuidRequestBuilder documentType(DocumentType documentType) {
        Utils.checkNotNull(documentType, "documentType");
        this.documentType = documentType;
        return this;
    }

    public GetV1GeneratedDocumentsDocumentTypeRequestUuidRequestBuilder requestUuid(String requestUuid) {
        Utils.checkNotNull(requestUuid, "requestUuid");
        this.requestUuid = requestUuid;
        return this;
    }
                
    public GetV1GeneratedDocumentsDocumentTypeRequestUuidRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1GeneratedDocumentsDocumentTypeRequestUuidRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse call() throws Exception {

        return sdk.get(
            documentType,
            requestUuid,
            xGustoAPIVersion);
    }
}
