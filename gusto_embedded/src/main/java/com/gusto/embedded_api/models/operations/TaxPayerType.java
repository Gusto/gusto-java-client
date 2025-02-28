/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * TaxPayerType - What type of tax entity the company is
 */
public enum TaxPayerType {
    C_CORPORATION("C-Corporation"),
    S_CORPORATION("S-Corporation"),
    SOLE_PROPRIETOR("Sole proprietor"),
    LLC("LLC"),
    LLP("LLP"),
    LIMITED_PARTNERSHIP("Limited partnership"),
    CO_OWNERSHIP("Co-ownership"),
    ASSOCIATION("Association"),
    TRUSTEESHIP("Trusteeship"),
    GENERAL_PARTNERSHIP("General partnership"),
    JOINT_VENTURE("Joint venture"),
    NON_PROFIT("Non-Profit");

    @JsonValue
    private final String value;

    private TaxPayerType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TaxPayerType> fromValue(String value) {
        for (TaxPayerType o: TaxPayerType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
