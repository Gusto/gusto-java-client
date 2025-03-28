/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * AuthorizationStatus
 * 
 * <p>The employee's authorization status
 * 
 * <p>  * `citizen`: A citizen is someone who was born in the United States or is a naturalized citizen living in the United States.
 *   * `noncitizen`: A noncitizen national is someone born in American Samoa, certain former citizens of the former Trust Territory of the Pacific Islands, and certain children of noncitizen nationals born abroad.
 *   * `permanent_resident`: A lawful permanent resident is someone who is not a US citizen and who resides under legally recognized and lawfully recorded permanent residence as an immigrant.
 *   * `alien`: Also referred to as a "noncitizen authorized to work". This includes anyone who is authorized to work in the United States but is not a US citizen, US national or lawful permanent resident.
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
