/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * ContractorPaymentGroupStatus
 * 
 * <p>The status of the contractor payment group.  Will be `Funded` if all payments that should be funded (i.e. have `Direct Deposit` for payment method) are funded.  A group can have status `Funded` while having associated payments that have status `Unfunded`, i.e. payment with `Check` payment method.
 */
public enum ContractorPaymentGroupStatus {
    UNFUNDED("Unfunded"),
    FUNDED("Funded");

    @JsonValue
    private final String value;

    private ContractorPaymentGroupStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ContractorPaymentGroupStatus> fromValue(String value) {
        for (ContractorPaymentGroupStatus o: ContractorPaymentGroupStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
