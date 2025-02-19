/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * PutV1ContractorsContractorIdPaymentMethodType - The payment method type. If type is Direct Deposit, the contractor is required to have a bank account.
 * see [Bank account endpoint](./post-v1-contractors-contractor_uuid-bank_accounts)
 */
public enum PutV1ContractorsContractorIdPaymentMethodType {
    DIRECT_DEPOSIT("Direct Deposit"),
    CHECK("Check");

    @JsonValue
    private final String value;

    private PutV1ContractorsContractorIdPaymentMethodType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PutV1ContractorsContractorIdPaymentMethodType> fromValue(String value) {
        for (PutV1ContractorsContractorIdPaymentMethodType o: PutV1ContractorsContractorIdPaymentMethodType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
