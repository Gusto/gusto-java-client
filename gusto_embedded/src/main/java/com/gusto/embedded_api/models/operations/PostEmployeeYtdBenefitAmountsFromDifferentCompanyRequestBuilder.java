/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.PostEmployeeYtdBenefitAmountsFromDifferentCompany;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder {

    private String employeeId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PostEmployeeYtdBenefitAmountsFromDifferentCompany postEmployeeYtdBenefitAmountsFromDifferentCompany;
    private final SDKMethodInterfaces.MethodCallPostEmployeeYtdBenefitAmountsFromDifferentCompany sdk;

    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder(SDKMethodInterfaces.MethodCallPostEmployeeYtdBenefitAmountsFromDifferentCompany sdk) {
        this.sdk = sdk;
    }

    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }
                
    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyRequestBuilder postEmployeeYtdBenefitAmountsFromDifferentCompany(PostEmployeeYtdBenefitAmountsFromDifferentCompany postEmployeeYtdBenefitAmountsFromDifferentCompany) {
        Utils.checkNotNull(postEmployeeYtdBenefitAmountsFromDifferentCompany, "postEmployeeYtdBenefitAmountsFromDifferentCompany");
        this.postEmployeeYtdBenefitAmountsFromDifferentCompany = postEmployeeYtdBenefitAmountsFromDifferentCompany;
        return this;
    }

    public PostEmployeeYtdBenefitAmountsFromDifferentCompanyResponse call() throws Exception {

        return sdk.createYtdBenefitAmountsFromDifferentCompany(
            employeeId,
            xGustoAPIVersion,
            postEmployeeYtdBenefitAmountsFromDifferentCompany);
    }
}
