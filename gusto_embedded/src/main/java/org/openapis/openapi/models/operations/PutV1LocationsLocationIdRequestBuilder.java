/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutV1LocationsLocationIdRequestBuilder {

    private String locationId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1LocationsLocationIdRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1LocationsLocationId sdk;

    public PutV1LocationsLocationIdRequestBuilder(SDKMethodInterfaces.MethodCallPutV1LocationsLocationId sdk) {
        this.sdk = sdk;
    }

    public PutV1LocationsLocationIdRequestBuilder locationId(String locationId) {
        Utils.checkNotNull(locationId, "locationId");
        this.locationId = locationId;
        return this;
    }
                
    public PutV1LocationsLocationIdRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1LocationsLocationIdRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1LocationsLocationIdRequestBuilder requestBody(PutV1LocationsLocationIdRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1LocationsLocationIdResponse call() throws Exception {

        return sdk.update(
            locationId,
            xGustoAPIVersion,
            requestBody);
    }
}
