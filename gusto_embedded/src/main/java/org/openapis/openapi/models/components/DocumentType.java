/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum DocumentType {
    PRINTABLE_PAYROLL_CHECKS("printable_payroll_checks");

    @JsonValue
    private final String value;

    private DocumentType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<DocumentType> fromValue(String value) {
        for (DocumentType o: DocumentType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
