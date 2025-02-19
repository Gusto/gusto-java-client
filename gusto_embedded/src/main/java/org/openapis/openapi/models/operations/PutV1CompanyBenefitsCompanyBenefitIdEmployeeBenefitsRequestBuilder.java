/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefitsRequestBuilder {

    private String companyBenefitId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefitsRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefits sdk;

    public PutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefitsRequestBuilder(SDKMethodInterfaces.MethodCallPutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefits sdk) {
        this.sdk = sdk;
    }

    public PutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefitsRequestBuilder companyBenefitId(String companyBenefitId) {
        Utils.checkNotNull(companyBenefitId, "companyBenefitId");
        this.companyBenefitId = companyBenefitId;
        return this;
    }
                
    public PutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefitsRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefitsRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefitsRequestBuilder requestBody(PutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefitsRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1CompanyBenefitsCompanyBenefitIdEmployeeBenefitsResponse call() throws Exception {

        return sdk.updateEmployeeBenefits(
            companyBenefitId,
            xGustoAPIVersion,
            requestBody);
    }
}
