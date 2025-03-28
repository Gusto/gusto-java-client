/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.RehireBody;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class PostV1EmployeesEmployeeIdRehireRequestBuilder {

    private String employeeId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private RehireBody rehireBody;
    private final SDKMethodInterfaces.MethodCallPostV1EmployeesEmployeeIdRehire sdk;

    public PostV1EmployeesEmployeeIdRehireRequestBuilder(SDKMethodInterfaces.MethodCallPostV1EmployeesEmployeeIdRehire sdk) {
        this.sdk = sdk;
    }

    public PostV1EmployeesEmployeeIdRehireRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }
                
    public PostV1EmployeesEmployeeIdRehireRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PostV1EmployeesEmployeeIdRehireRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PostV1EmployeesEmployeeIdRehireRequestBuilder rehireBody(RehireBody rehireBody) {
        Utils.checkNotNull(rehireBody, "rehireBody");
        this.rehireBody = rehireBody;
        return this;
    }

    public PostV1EmployeesEmployeeIdRehireResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.createRehire(
            employeeId,
            xGustoAPIVersion,
            rehireBody);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
