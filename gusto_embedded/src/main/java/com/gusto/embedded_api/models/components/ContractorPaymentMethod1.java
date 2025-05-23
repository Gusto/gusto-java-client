/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * ContractorPaymentMethod1
 * 
 * <p>The contractor's payment method.
 */
public enum ContractorPaymentMethod1 {
    DIRECT_DEPOSIT("Direct Deposit"),
    CHECK("Check");

    @JsonValue
    private final String value;

    private ContractorPaymentMethod1(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ContractorPaymentMethod1> fromValue(String value) {
        for (ContractorPaymentMethod1 o: ContractorPaymentMethod1.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
