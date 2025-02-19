/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutV1ContractorsContractorUuidAddressRequestBuilder {

    private String contractorUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1ContractorsContractorUuidAddressRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1ContractorsContractorUuidAddress sdk;

    public PutV1ContractorsContractorUuidAddressRequestBuilder(SDKMethodInterfaces.MethodCallPutV1ContractorsContractorUuidAddress sdk) {
        this.sdk = sdk;
    }

    public PutV1ContractorsContractorUuidAddressRequestBuilder contractorUuid(String contractorUuid) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        this.contractorUuid = contractorUuid;
        return this;
    }
                
    public PutV1ContractorsContractorUuidAddressRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1ContractorsContractorUuidAddressRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1ContractorsContractorUuidAddressRequestBuilder requestBody(PutV1ContractorsContractorUuidAddressRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1ContractorsContractorUuidAddressResponse call() throws Exception {

        return sdk.updateAddress(
            contractorUuid,
            xGustoAPIVersion,
            requestBody);
    }
}
