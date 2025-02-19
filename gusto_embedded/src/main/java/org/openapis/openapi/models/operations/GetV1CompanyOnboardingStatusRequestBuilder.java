/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetV1CompanyOnboardingStatusRequestBuilder {

    private String companyUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1CompanyOnboardingStatus sdk;

    public GetV1CompanyOnboardingStatusRequestBuilder(SDKMethodInterfaces.MethodCallGetV1CompanyOnboardingStatus sdk) {
        this.sdk = sdk;
    }

    public GetV1CompanyOnboardingStatusRequestBuilder companyUuid(String companyUuid) {
        Utils.checkNotNull(companyUuid, "companyUuid");
        this.companyUuid = companyUuid;
        return this;
    }
                
    public GetV1CompanyOnboardingStatusRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1CompanyOnboardingStatusRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1CompanyOnboardingStatusResponse call() throws Exception {

        return sdk.getOnboardingStatus(
            companyUuid,
            xGustoAPIVersion);
    }
}
