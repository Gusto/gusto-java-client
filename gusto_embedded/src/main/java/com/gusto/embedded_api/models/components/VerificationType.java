/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * VerificationType
 * 
 * <p>The verification type of the bank account.
 * 
 * <p>'bank_deposits' means the bank account is connected by entering routing and accounting numbers and verifying through micro-deposits.
 * 'plaid' means the bank account is connected through Plaid.
 */
public enum VerificationType {
    BANK_DEPOSITS("bank_deposits"),
    PLAID("plaid"),
    PLAID_EXTERNAL("plaid_external");

    @JsonValue
    private final String value;

    private VerificationType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<VerificationType> fromValue(String value) {
        for (VerificationType o: VerificationType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
