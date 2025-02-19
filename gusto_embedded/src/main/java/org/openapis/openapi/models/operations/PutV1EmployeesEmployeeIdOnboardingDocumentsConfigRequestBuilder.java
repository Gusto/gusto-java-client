/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutV1EmployeesEmployeeIdOnboardingDocumentsConfigRequestBuilder {

    private String employeeId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1EmployeesEmployeeIdOnboardingDocumentsConfigRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1EmployeesEmployeeIdOnboardingDocumentsConfig sdk;

    public PutV1EmployeesEmployeeIdOnboardingDocumentsConfigRequestBuilder(SDKMethodInterfaces.MethodCallPutV1EmployeesEmployeeIdOnboardingDocumentsConfig sdk) {
        this.sdk = sdk;
    }

    public PutV1EmployeesEmployeeIdOnboardingDocumentsConfigRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }
                
    public PutV1EmployeesEmployeeIdOnboardingDocumentsConfigRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1EmployeesEmployeeIdOnboardingDocumentsConfigRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1EmployeesEmployeeIdOnboardingDocumentsConfigRequestBuilder requestBody(PutV1EmployeesEmployeeIdOnboardingDocumentsConfigRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1EmployeesEmployeeIdOnboardingDocumentsConfigResponse call() throws Exception {

        return sdk.updateOnboardingDocumentsConfig(
            employeeId,
            xGustoAPIVersion,
            requestBody);
    }
}
