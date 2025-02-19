/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetV1CompanyFormPdfRequestBuilder {

    private String formId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1CompanyFormPdf sdk;

    public GetV1CompanyFormPdfRequestBuilder(SDKMethodInterfaces.MethodCallGetV1CompanyFormPdf sdk) {
        this.sdk = sdk;
    }

    public GetV1CompanyFormPdfRequestBuilder formId(String formId) {
        Utils.checkNotNull(formId, "formId");
        this.formId = formId;
        return this;
    }
                
    public GetV1CompanyFormPdfRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1CompanyFormPdfRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1CompanyFormPdfResponse call() throws Exception {

        return sdk.getPdf(
            formId,
            xGustoAPIVersion);
    }
}
