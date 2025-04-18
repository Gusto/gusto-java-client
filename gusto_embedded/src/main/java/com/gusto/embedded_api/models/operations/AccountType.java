/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * AccountType
 * 
 * <p>The bank account type
 */
public enum AccountType {
    CHECKING("Checking"),
    SAVINGS("Savings");

    @JsonValue
    private final String value;

    private AccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AccountType> fromValue(String value) {
        for (AccountType o: AccountType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
