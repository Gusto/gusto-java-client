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

public class GetV1ContractorsContractorUuidBankAccountsRequestBuilder {

    private String contractorUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private final SDKMethodInterfaces.MethodCallGetV1ContractorsContractorUuidBankAccounts sdk;

    public GetV1ContractorsContractorUuidBankAccountsRequestBuilder(SDKMethodInterfaces.MethodCallGetV1ContractorsContractorUuidBankAccounts sdk) {
        this.sdk = sdk;
    }

    public GetV1ContractorsContractorUuidBankAccountsRequestBuilder contractorUuid(String contractorUuid) {
        Utils.checkNotNull(contractorUuid, "contractorUuid");
        this.contractorUuid = contractorUuid;
        return this;
    }
                
    public GetV1ContractorsContractorUuidBankAccountsRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1ContractorsContractorUuidBankAccountsRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1ContractorsContractorUuidBankAccountsResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.getBankAccounts(
            contractorUuid,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
