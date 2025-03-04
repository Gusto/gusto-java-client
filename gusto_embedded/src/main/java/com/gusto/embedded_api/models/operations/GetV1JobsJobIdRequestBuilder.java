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

public class GetV1JobsJobIdRequestBuilder {

    private String jobId;
    private Optional<? extends GetV1JobsJobIdQueryParamInclude> include = Optional.empty();
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private final SDKMethodInterfaces.MethodCallGetV1JobsJobId sdk;

    public GetV1JobsJobIdRequestBuilder(SDKMethodInterfaces.MethodCallGetV1JobsJobId sdk) {
        this.sdk = sdk;
    }

    public GetV1JobsJobIdRequestBuilder jobId(String jobId) {
        Utils.checkNotNull(jobId, "jobId");
        this.jobId = jobId;
        return this;
    }
                
    public GetV1JobsJobIdRequestBuilder include(GetV1JobsJobIdQueryParamInclude include) {
        Utils.checkNotNull(include, "include");
        this.include = Optional.of(include);
        return this;
    }

    public GetV1JobsJobIdRequestBuilder include(Optional<? extends GetV1JobsJobIdQueryParamInclude> include) {
        Utils.checkNotNull(include, "include");
        this.include = include;
        return this;
    }
                
    public GetV1JobsJobIdRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1JobsJobIdRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1JobsJobIdResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.getJob(
            jobId,
            include,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
