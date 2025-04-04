/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.DocumentType;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class GetV1GeneratedDocumentsDocumentTypeRequestUuidRequestBuilder {

    private DocumentType documentType;
    private String requestUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
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
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.get(
            documentType,
            requestUuid,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
