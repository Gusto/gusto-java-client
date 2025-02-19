/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.Double;
import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetV1CompaniesCompanyIdPayrollReversalsRequestBuilder {

    private String companyId;
    private Optional<Double> page = Optional.empty();
    private Optional<Double> per = Optional.empty();
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyIdPayrollReversals sdk;

    public GetV1CompaniesCompanyIdPayrollReversalsRequestBuilder(SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyIdPayrollReversals sdk) {
        this.sdk = sdk;
    }

    public GetV1CompaniesCompanyIdPayrollReversalsRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }
                
    public GetV1CompaniesCompanyIdPayrollReversalsRequestBuilder page(double page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.of(page);
        return this;
    }

    public GetV1CompaniesCompanyIdPayrollReversalsRequestBuilder page(Optional<Double> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }
                
    public GetV1CompaniesCompanyIdPayrollReversalsRequestBuilder per(double per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.of(per);
        return this;
    }

    public GetV1CompaniesCompanyIdPayrollReversalsRequestBuilder per(Optional<Double> per) {
        Utils.checkNotNull(per, "per");
        this.per = per;
        return this;
    }
                
    public GetV1CompaniesCompanyIdPayrollReversalsRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1CompaniesCompanyIdPayrollReversalsRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1CompaniesCompanyIdPayrollReversalsResponse call() throws Exception {

        return sdk.getApprovedReversals(
            companyId,
            page,
            per,
            xGustoAPIVersion);
    }
}
