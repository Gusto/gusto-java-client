/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * PutV1ContractorsContractorUuidWageType - The contractor’s wage type.
 * 
 */
public enum PutV1ContractorsContractorUuidWageType {
    FIXED("Fixed"),
    HOURLY("Hourly");

    @JsonValue
    private final String value;

    private PutV1ContractorsContractorUuidWageType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<PutV1ContractorsContractorUuidWageType> fromValue(String value) {
        for (PutV1ContractorsContractorUuidWageType o: PutV1ContractorsContractorUuidWageType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
