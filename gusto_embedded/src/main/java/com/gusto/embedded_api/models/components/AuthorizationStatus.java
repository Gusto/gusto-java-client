/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * AuthorizationStatus
 * 
 * <p>The employee's authorization status
 */
public enum AuthorizationStatus {
    CITIZEN("citizen"),
    NONCITIZEN("noncitizen"),
    PERMANENT_RESIDENT("permanent_resident"),
    ALIEN("alien");

    @JsonValue
    private final String value;

    private AuthorizationStatus(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<AuthorizationStatus> fromValue(String value) {
        for (AuthorizationStatus o: AuthorizationStatus.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
