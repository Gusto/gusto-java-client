/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * Category
 * 
 * <p>The category of the company attachment
 */
public enum Category {
    GEP_NOTICE("gep_notice"),
    COMPLIANCE("compliance"),
    OTHER("other");

    @JsonValue
    private final String value;

    private Category(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Category> fromValue(String value) {
        for (Category o: Category.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
