/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.Double;
import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder {

    private String employeeId;
    private Optional<Double> page = Optional.empty();
    private Optional<Double> per = Optional.empty();
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1EmployeesEmployeeIdCustomFields sdk;

    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder(SDKMethodInterfaces.MethodCallGetV1EmployeesEmployeeIdCustomFields sdk) {
        this.sdk = sdk;
    }

    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }
                
    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder page(double page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.of(page);
        return this;
    }

    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder page(Optional<Double> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }
                
    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder per(double per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.of(per);
        return this;
    }

    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder per(Optional<Double> per) {
        Utils.checkNotNull(per, "per");
        this.per = per;
        return this;
    }
                
    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1EmployeesEmployeeIdCustomFieldsResponse call() throws Exception {

        return sdk.getCustomFields(
            employeeId,
            page,
            per,
            xGustoAPIVersion);
    }
}
