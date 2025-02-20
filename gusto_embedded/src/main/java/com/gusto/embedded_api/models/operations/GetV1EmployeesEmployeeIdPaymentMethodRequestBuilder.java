/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class GetV1EmployeesEmployeeIdPaymentMethodRequestBuilder {

    private String employeeId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1EmployeesEmployeeIdPaymentMethod sdk;

    public GetV1EmployeesEmployeeIdPaymentMethodRequestBuilder(SDKMethodInterfaces.MethodCallGetV1EmployeesEmployeeIdPaymentMethod sdk) {
        this.sdk = sdk;
    }

    public GetV1EmployeesEmployeeIdPaymentMethodRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }
                
    public GetV1EmployeesEmployeeIdPaymentMethodRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1EmployeesEmployeeIdPaymentMethodRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1EmployeesEmployeeIdPaymentMethodResponse call() throws Exception {

        return sdk.get(
            employeeId,
            xGustoAPIVersion);
    }
}
