/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class PostV1EmployeesEmployeeIdWorkAddressesRequestBuilder {

    private String employeeId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private PostV1EmployeesEmployeeIdWorkAddressesRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPostV1EmployeesEmployeeIdWorkAddresses sdk;

    public PostV1EmployeesEmployeeIdWorkAddressesRequestBuilder(SDKMethodInterfaces.MethodCallPostV1EmployeesEmployeeIdWorkAddresses sdk) {
        this.sdk = sdk;
    }

    public PostV1EmployeesEmployeeIdWorkAddressesRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }
                
    public PostV1EmployeesEmployeeIdWorkAddressesRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PostV1EmployeesEmployeeIdWorkAddressesRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PostV1EmployeesEmployeeIdWorkAddressesRequestBuilder requestBody(PostV1EmployeesEmployeeIdWorkAddressesRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PostV1EmployeesEmployeeIdWorkAddressesResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.createWorkAddress(
            employeeId,
            xGustoAPIVersion,
            requestBody);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
