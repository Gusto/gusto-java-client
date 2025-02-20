/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Double;
import java.lang.String;
import java.util.Optional;

public class GetV1CompaniesCompanyIdPaySchedulesRequestBuilder {

    private String companyId;
    private Optional<Double> page = Optional.empty();
    private Optional<Double> per = Optional.empty();
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyIdPaySchedules sdk;

    public GetV1CompaniesCompanyIdPaySchedulesRequestBuilder(SDKMethodInterfaces.MethodCallGetV1CompaniesCompanyIdPaySchedules sdk) {
        this.sdk = sdk;
    }

    public GetV1CompaniesCompanyIdPaySchedulesRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }
                
    public GetV1CompaniesCompanyIdPaySchedulesRequestBuilder page(double page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.of(page);
        return this;
    }

    public GetV1CompaniesCompanyIdPaySchedulesRequestBuilder page(Optional<Double> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }
                
    public GetV1CompaniesCompanyIdPaySchedulesRequestBuilder per(double per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.of(per);
        return this;
    }

    public GetV1CompaniesCompanyIdPaySchedulesRequestBuilder per(Optional<Double> per) {
        Utils.checkNotNull(per, "per");
        this.per = per;
        return this;
    }
                
    public GetV1CompaniesCompanyIdPaySchedulesRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1CompaniesCompanyIdPaySchedulesRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1CompaniesCompanyIdPaySchedulesResponse call() throws Exception {

        return sdk.getAll(
            companyId,
            page,
            per,
            xGustoAPIVersion);
    }
}
