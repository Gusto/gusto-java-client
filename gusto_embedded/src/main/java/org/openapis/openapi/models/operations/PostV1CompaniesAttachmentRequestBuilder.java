/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PostV1CompaniesAttachmentRequestBuilder {

    private String companyId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PostV1CompaniesAttachmentRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPostV1CompaniesAttachment sdk;

    public PostV1CompaniesAttachmentRequestBuilder(SDKMethodInterfaces.MethodCallPostV1CompaniesAttachment sdk) {
        this.sdk = sdk;
    }

    public PostV1CompaniesAttachmentRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }
                
    public PostV1CompaniesAttachmentRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PostV1CompaniesAttachmentRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PostV1CompaniesAttachmentRequestBuilder requestBody(PostV1CompaniesAttachmentRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PostV1CompaniesAttachmentResponse call() throws Exception {

        return sdk.create(
            companyId,
            xGustoAPIVersion,
            requestBody);
    }
}
