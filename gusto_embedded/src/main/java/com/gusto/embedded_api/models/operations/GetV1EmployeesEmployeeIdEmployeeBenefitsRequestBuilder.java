/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Double;
import java.lang.String;
import java.util.Optional;

public class GetV1EmployeesEmployeeIdEmployeeBenefitsRequestBuilder {

    private String employeeId;
    private Optional<Double> page = Optional.empty();
    private Optional<Double> per = Optional.empty();
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1EmployeesEmployeeIdEmployeeBenefits sdk;

    public GetV1EmployeesEmployeeIdEmployeeBenefitsRequestBuilder(SDKMethodInterfaces.MethodCallGetV1EmployeesEmployeeIdEmployeeBenefits sdk) {
        this.sdk = sdk;
    }

    public GetV1EmployeesEmployeeIdEmployeeBenefitsRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }
                
    public GetV1EmployeesEmployeeIdEmployeeBenefitsRequestBuilder page(double page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.of(page);
        return this;
    }

    public GetV1EmployeesEmployeeIdEmployeeBenefitsRequestBuilder page(Optional<Double> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }
                
    public GetV1EmployeesEmployeeIdEmployeeBenefitsRequestBuilder per(double per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.of(per);
        return this;
    }

    public GetV1EmployeesEmployeeIdEmployeeBenefitsRequestBuilder per(Optional<Double> per) {
        Utils.checkNotNull(per, "per");
        this.per = per;
        return this;
    }
                
    public GetV1EmployeesEmployeeIdEmployeeBenefitsRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1EmployeesEmployeeIdEmployeeBenefitsRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1EmployeesEmployeeIdEmployeeBenefitsResponse call() throws Exception {

        return sdk.get(
            employeeId,
            page,
            per,
            xGustoAPIVersion);
    }
}
