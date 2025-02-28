/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * TaxRequirementMetadataType - Describes the type of requirement - each type may have additional metadata properties to describe possible values, formats, etc.
 * 
 * - `text`: free-text input, no additional requirements
 * - `currency`: a value representing a dollar amount, e.g. `374.55` representing `$374.55`
 * - `radio`: choose one of options provided, see `options`
 * - `select`: choose one of options provided, see `options`
 * - `percent`: A decimal value representing a percentage, e.g. `0.034` representing `3.4%`
 * - `account_number`: An account number for a tax agency, more information provided by `mask` and `prefix`
 * - `tax_rate`: A decimal value representing a tax rate, e.g. `0.034` representing a tax rate of `3.4%`, see `validation` for additional validation guidance
 * - `workers_compensation_rate`: A decimal value representing a percentage, see `risk_class_code`, `risk_class_description`, and `rate_type`
 * 
 */
public enum TaxRequirementMetadataType {
    TEXT("text"),
    CURRENCY("currency"),
    RADIO("radio"),
    SELECT("select"),
    PERCENT("percent"),
    ACCOUNT_NUMBER("account_number"),
    TAX_RATE("tax_rate"),
    WORKERS_COMPENSATION_RATE("workers_compensation_rate");

    @JsonValue
    private final String value;

    private TaxRequirementMetadataType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TaxRequirementMetadataType> fromValue(String value) {
        for (TaxRequirementMetadataType o: TaxRequirementMetadataType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
