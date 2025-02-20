/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.lang.String;
import java.util.Optional;

public class PutV1CompaniesCompanyIdBankAccountsVerifyRequestBuilder {

    private String bankAccountUuid;
    private String companyId;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1CompaniesCompanyIdBankAccountsVerify sdk;

    public PutV1CompaniesCompanyIdBankAccountsVerifyRequestBuilder(SDKMethodInterfaces.MethodCallPutV1CompaniesCompanyIdBankAccountsVerify sdk) {
        this.sdk = sdk;
    }

    public PutV1CompaniesCompanyIdBankAccountsVerifyRequestBuilder bankAccountUuid(String bankAccountUuid) {
        Utils.checkNotNull(bankAccountUuid, "bankAccountUuid");
        this.bankAccountUuid = bankAccountUuid;
        return this;
    }

    public PutV1CompaniesCompanyIdBankAccountsVerifyRequestBuilder companyId(String companyId) {
        Utils.checkNotNull(companyId, "companyId");
        this.companyId = companyId;
        return this;
    }
                
    public PutV1CompaniesCompanyIdBankAccountsVerifyRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1CompaniesCompanyIdBankAccountsVerifyRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1CompaniesCompanyIdBankAccountsVerifyRequestBuilder requestBody(PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1CompaniesCompanyIdBankAccountsVerifyResponse call() throws Exception {

        return sdk.verify(
            bankAccountUuid,
            companyId,
            xGustoAPIVersion,
            requestBody);
    }
}
