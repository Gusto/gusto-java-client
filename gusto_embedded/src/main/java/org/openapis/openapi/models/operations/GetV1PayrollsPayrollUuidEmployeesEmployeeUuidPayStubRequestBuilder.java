/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubRequestBuilder {

    private String payrollId;
    private String employeeId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStub sdk;

    public GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubRequestBuilder(SDKMethodInterfaces.MethodCallGetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStub sdk) {
        this.sdk = sdk;
    }

    public GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubRequestBuilder payrollId(String payrollId) {
        Utils.checkNotNull(payrollId, "payrollId");
        this.payrollId = payrollId;
        return this;
    }

    public GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }
                
    public GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubResponse call() throws Exception {

        return sdk.getPayStub(
            payrollId,
            employeeId,
            xGustoAPIVersion);
    }
}
