/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder {

    private String employeeId;
    private Optional<Long> page = Optional.empty();
    private Optional<Long> per = Optional.empty();
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
                
    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder page(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.of(page);
        return this;
    }

    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder page(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }
                
    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder per(long per) {
        Utils.checkNotNull(per, "per");
        this.per = Optional.of(per);
        return this;
    }

    public GetV1EmployeesEmployeeIdCustomFieldsRequestBuilder per(Optional<Long> per) {
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
