/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetV1EmployeesEmployeeIdFederalTaxesRequestBuilder {

    private String employeeUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1EmployeesEmployeeIdFederalTaxes sdk;

    public GetV1EmployeesEmployeeIdFederalTaxesRequestBuilder(SDKMethodInterfaces.MethodCallGetV1EmployeesEmployeeIdFederalTaxes sdk) {
        this.sdk = sdk;
    }

    public GetV1EmployeesEmployeeIdFederalTaxesRequestBuilder employeeUuid(String employeeUuid) {
        Utils.checkNotNull(employeeUuid, "employeeUuid");
        this.employeeUuid = employeeUuid;
        return this;
    }
                
    public GetV1EmployeesEmployeeIdFederalTaxesRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1EmployeesEmployeeIdFederalTaxesRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1EmployeesEmployeeIdFederalTaxesResponse call() throws Exception {

        return sdk.getFederalTaxes(
            employeeUuid,
            xGustoAPIVersion);
    }
}
