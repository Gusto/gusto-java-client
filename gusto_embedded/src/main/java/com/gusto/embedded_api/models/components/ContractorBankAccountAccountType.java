/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * ContractorBankAccountAccountType - Bank account type
 */
public enum ContractorBankAccountAccountType {
    CHECKING("Checking"),
    SAVINGS("Savings");

    @JsonValue
    private final String value;

    private ContractorBankAccountAccountType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ContractorBankAccountAccountType> fromValue(String value) {
        for (ContractorBankAccountAccountType o: ContractorBankAccountAccountType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
