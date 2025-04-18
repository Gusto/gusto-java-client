/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
public enum PostV1EmployeesEmployeeIdBankAccountsAccountType {
    CHECKING("Checking"),
    SAVINGS("Savings");

    @JsonValue
    private final String value;

    private PostV1EmployeesEmployeeIdBankAccountsAccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PostV1EmployeesEmployeeIdBankAccountsAccountType> fromValue(String value) {
        for (PostV1EmployeesEmployeeIdBankAccountsAccountType o: PostV1EmployeesEmployeeIdBankAccountsAccountType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
