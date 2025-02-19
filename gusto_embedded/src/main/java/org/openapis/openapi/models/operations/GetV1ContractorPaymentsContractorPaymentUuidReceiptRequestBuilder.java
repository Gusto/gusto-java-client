/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class GetV1ContractorPaymentsContractorPaymentUuidReceiptRequestBuilder {

    private String contractorPaymentUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1ContractorPaymentsContractorPaymentUuidReceipt sdk;

    public GetV1ContractorPaymentsContractorPaymentUuidReceiptRequestBuilder(SDKMethodInterfaces.MethodCallGetV1ContractorPaymentsContractorPaymentUuidReceipt sdk) {
        this.sdk = sdk;
    }

    public GetV1ContractorPaymentsContractorPaymentUuidReceiptRequestBuilder contractorPaymentUuid(String contractorPaymentUuid) {
        Utils.checkNotNull(contractorPaymentUuid, "contractorPaymentUuid");
        this.contractorPaymentUuid = contractorPaymentUuid;
        return this;
    }
                
    public GetV1ContractorPaymentsContractorPaymentUuidReceiptRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1ContractorPaymentsContractorPaymentUuidReceiptRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1ContractorPaymentsContractorPaymentUuidReceiptResponse call() throws Exception {

        return sdk.getReceipt(
            contractorPaymentUuid,
            xGustoAPIVersion);
    }
}
