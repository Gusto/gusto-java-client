/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class DeleteDepartmentRequestBuilder {

    private String departmentUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallDeleteDepartment sdk;

    public DeleteDepartmentRequestBuilder(SDKMethodInterfaces.MethodCallDeleteDepartment sdk) {
        this.sdk = sdk;
    }

    public DeleteDepartmentRequestBuilder departmentUuid(String departmentUuid) {
        Utils.checkNotNull(departmentUuid, "departmentUuid");
        this.departmentUuid = departmentUuid;
        return this;
    }
                
    public DeleteDepartmentRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public DeleteDepartmentRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public DeleteDepartmentResponse call() throws Exception {

        return sdk.delete(
            departmentUuid,
            xGustoAPIVersion);
    }
}
