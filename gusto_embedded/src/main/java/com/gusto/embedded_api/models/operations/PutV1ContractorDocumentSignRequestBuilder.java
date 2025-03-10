/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class PutV1ContractorDocumentSignRequestBuilder {

    private String documentUuid;
    private Optional<String> xGustoClientIp = Optional.empty();
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
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
                
    public PutV1ContractorDocumentSignRequestBuilder xGustoClientIp(String xGustoClientIp) {
        Utils.checkNotNull(xGustoClientIp, "xGustoClientIp");
        this.xGustoClientIp = Optional.of(xGustoClientIp);
        return this;
    }

    public PutV1ContractorDocumentSignRequestBuilder xGustoClientIp(Optional<String> xGustoClientIp) {
        Utils.checkNotNull(xGustoClientIp, "xGustoClientIp");
        this.xGustoClientIp = xGustoClientIp;
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
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.sign(
            documentUuid,
            xGustoClientIp,
            xGustoAPIVersion,
            requestBody);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
