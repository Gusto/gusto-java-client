/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import org.openapis.openapi.utils.Utils;

public class GetV1EmployeesEmployeeIdJobsRequestBuilder {

    private GetV1EmployeesEmployeeIdJobsRequest request;
    private final SDKMethodInterfaces.MethodCallGetV1EmployeesEmployeeIdJobs sdk;

    public GetV1EmployeesEmployeeIdJobsRequestBuilder(SDKMethodInterfaces.MethodCallGetV1EmployeesEmployeeIdJobs sdk) {
        this.sdk = sdk;
    }

    public GetV1EmployeesEmployeeIdJobsRequestBuilder request(GetV1EmployeesEmployeeIdJobsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetV1EmployeesEmployeeIdJobsResponse call() throws Exception {

        return sdk.getJobs(
            request);
    }
}
