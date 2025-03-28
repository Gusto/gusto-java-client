/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.LazySingletonValue;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Exception;
import java.lang.String;
import java.util.Optional;

public class DeleteV1EmployeesEmployeeIdBankAccountsBankAccountIdRequestBuilder {

    private String employeeId;
    private String bankAccountUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Utils.readDefaultOrConstValue(
                            "xGustoAPIVersion",
                            "\"2024-04-01\"",
                            new TypeReference<Optional<? extends VersionHeader>>() {});
    private final SDKMethodInterfaces.MethodCallDeleteV1EmployeesEmployeeIdBankAccountsBankAccountId sdk;

    public DeleteV1EmployeesEmployeeIdBankAccountsBankAccountIdRequestBuilder(SDKMethodInterfaces.MethodCallDeleteV1EmployeesEmployeeIdBankAccountsBankAccountId sdk) {
        this.sdk = sdk;
    }

    public DeleteV1EmployeesEmployeeIdBankAccountsBankAccountIdRequestBuilder employeeId(String employeeId) {
        Utils.checkNotNull(employeeId, "employeeId");
        this.employeeId = employeeId;
        return this;
    }

    public DeleteV1EmployeesEmployeeIdBankAccountsBankAccountIdRequestBuilder bankAccountUuid(String bankAccountUuid) {
        Utils.checkNotNull(bankAccountUuid, "bankAccountUuid");
        this.bankAccountUuid = bankAccountUuid;
        return this;
    }
                
    public DeleteV1EmployeesEmployeeIdBankAccountsBankAccountIdRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public DeleteV1EmployeesEmployeeIdBankAccountsBankAccountIdRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public DeleteV1EmployeesEmployeeIdBankAccountsBankAccountIdResponse call() throws Exception {
        if (xGustoAPIVersion == null) {
            xGustoAPIVersion = _SINGLETON_VALUE_XGustoAPIVersion.value();
        }
        return sdk.deleteBankAccount(
            employeeId,
            bankAccountUuid,
            xGustoAPIVersion);
    }

    private static final LazySingletonValue<Optional<? extends VersionHeader>> _SINGLETON_VALUE_XGustoAPIVersion =
            new LazySingletonValue<>(
                    "xGustoAPIVersion",
                    "\"2024-04-01\"",
                    new TypeReference<Optional<? extends VersionHeader>>() {});
}
