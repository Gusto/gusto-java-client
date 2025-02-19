/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutV1EmployeesEmployeeIdOnboardingStatusRequestBuilder {

    private String employeeId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1EmployeesEmployeeIdOnboardingStatusRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1EmployeesEmployeeIdOnboardingStatus sdk;

    public PutV1EmployeesEmployeeIdOnboardingStatusRequestBuilder(SDKMethodInterfaces.MethodCallPutV1EmployeesEmployeeIdOnboardingStatus sdk) {
        this.sdk = sdk;
    }

    public PutV1EmployeesEmployeeIdOnboardingStatusRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }
                
    public PutV1EmployeesEmployeeIdOnboardingStatusRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1EmployeesEmployeeIdOnboardingStatusRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1EmployeesEmployeeIdOnboardingStatusRequestBuilder requestBody(PutV1EmployeesEmployeeIdOnboardingStatusRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1EmployeesEmployeeIdOnboardingStatusResponse call() throws Exception {

        return sdk.updateOnboardingStatus(
            employeeId,
            xGustoAPIVersion,
            requestBody);
    }
}
