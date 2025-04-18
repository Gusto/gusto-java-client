/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.gusto.embedded_api.utils.OneOfDeserializer;
import com.gusto.embedded_api.utils.TypedObject;
import com.gusto.embedded_api.utils.Utils.JsonShape;
import com.gusto.embedded_api.utils.Utils.TypeReferenceWithShape;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
/**
 * TaxRequirementValue
 * 
 * <p>The required value of the requirement identified by `key`
 */

@JsonDeserialize(using = TaxRequirementValue._Deserializer.class)
public class TaxRequirementValue {

    @JsonValue
    private TypedObject value;
    
    private TaxRequirementValue(TypedObject value) {
        this.value = value;
    }

    public static TaxRequirementValue of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new TaxRequirementValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }

    public static TaxRequirementValue of(String value) {
        Utils.checkNotNull(value, "value");
        return new TaxRequirementValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<String>(){}));
    }

    public static TaxRequirementValue of(double value) {
        Utils.checkNotNull(value, "value");
        return new TaxRequirementValue(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Double>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code boolean}</li>
     * <li>{@code java.lang.String}</li>
     * <li>{@code double}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaxRequirementValue other = (TaxRequirementValue) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<TaxRequirementValue> {

        public _Deserializer() {
            super(TaxRequirementValue.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Double>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<String>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(TaxRequirementValue.class,
                "value", value);
    }
 
}
