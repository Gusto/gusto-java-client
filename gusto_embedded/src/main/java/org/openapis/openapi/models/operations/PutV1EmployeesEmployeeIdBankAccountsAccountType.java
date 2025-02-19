/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum PutV1EmployeesEmployeeIdBankAccountsAccountType {
    CHECKING("Checking"),
    SAVINGS("Savings");

    @JsonValue
    private final String value;

    private PutV1EmployeesEmployeeIdBankAccountsAccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PutV1EmployeesEmployeeIdBankAccountsAccountType> fromValue(String value) {
        for (PutV1EmployeesEmployeeIdBankAccountsAccountType o: PutV1EmployeesEmployeeIdBankAccountsAccountType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
