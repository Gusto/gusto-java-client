/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetV1CompanyFormRequestBuilder {

    private String formId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1CompanyForm sdk;

    public GetV1CompanyFormRequestBuilder(SDKMethodInterfaces.MethodCallGetV1CompanyForm sdk) {
        this.sdk = sdk;
    }

    public GetV1CompanyFormRequestBuilder formId(String formId) {
        Utils.checkNotNull(formId, "formId");
        this.formId = formId;
        return this;
    }
                
    public GetV1CompanyFormRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1CompanyFormRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1CompanyFormResponse call() throws Exception {

        return sdk.get(
            formId,
            xGustoAPIVersion);
    }
}
