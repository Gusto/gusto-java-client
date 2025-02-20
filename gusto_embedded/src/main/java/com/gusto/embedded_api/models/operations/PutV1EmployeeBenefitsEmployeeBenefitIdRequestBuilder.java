/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class PutV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder {

    private String employeeBenefitId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1EmployeeBenefitsEmployeeBenefitIdRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1EmployeeBenefitsEmployeeBenefitId sdk;

    public PutV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder(SDKMethodInterfaces.MethodCallPutV1EmployeeBenefitsEmployeeBenefitId sdk) {
        this.sdk = sdk;
    }

    public PutV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder employeeBenefitId(String employeeBenefitId) {
        Utils.checkNotNull(employeeBenefitId, "employeeBenefitId");
        this.employeeBenefitId = employeeBenefitId;
        return this;
    }
                
    public PutV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1EmployeeBenefitsEmployeeBenefitIdRequestBuilder requestBody(PutV1EmployeeBenefitsEmployeeBenefitIdRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1EmployeeBenefitsEmployeeBenefitIdResponse call() throws Exception {

        return sdk.update(
            employeeBenefitId,
            xGustoAPIVersion,
            requestBody);
    }
}
