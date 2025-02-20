/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetV1CompanyPaymentConfigsRequestBuilder {

    private String companyUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1CompanyPaymentConfigs sdk;

    public GetV1CompanyPaymentConfigsRequestBuilder(SDKMethodInterfaces.MethodCallGetV1CompanyPaymentConfigs sdk) {
        this.sdk = sdk;
    }

    public GetV1CompanyPaymentConfigsRequestBuilder companyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }
                
    public GetV1CompanyPaymentConfigsRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1CompanyPaymentConfigsRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1CompanyPaymentConfigsResponse call() throws Exception {

        return sdk.get(
            companyUuid,
            xGustoAPIVersion);
    }
}
