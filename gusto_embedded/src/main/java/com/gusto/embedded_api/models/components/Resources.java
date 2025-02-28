/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class Resources {

    /**
     * The type of entity being described, could be “Contractor”, “Employee”, “BankAccount”, “Payroll”, “ContractorPayment”, “RecoveryCase”, or “Signatory”
     */
    @JsonProperty("entity_type")
    private String entityType;

    /**
     * Unique identifier of the entity
     */
    @JsonProperty("entity_uuid")
    private String entityUuid;

    /**
     * Optional. The type of a resource that is related to the one described by entity_type and entity_uuid. For instance, if the entity_type is “BankAccount”, the reference_type could be the “Employee” or “Contractor” to whom the bank account belongs.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference_type")
    private Optional<String> referenceType;

    /**
     * Optional. Unique identifier of the reference.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference_uuid")
    private Optional<String> referenceUuid;

    @JsonCreator
    public Resources(
            @JsonProperty("entity_type") String entityType,
            @JsonProperty("entity_uuid") String entityUuid,
            @JsonProperty("reference_type") Optional<String> referenceType,
            @JsonProperty("reference_uuid") Optional<String> referenceUuid) {
        Utils.checkNotNull(entityType, "entityType");
        Utils.checkNotNull(entityUuid, "entityUuid");
        Utils.checkNotNull(referenceType, "referenceType");
        Utils.checkNotNull(referenceUuid, "referenceUuid");
        this.entityType = entityType;
        this.entityUuid = entityUuid;
        this.referenceType = referenceType;
        this.referenceUuid = referenceUuid;
    }
    
    public Resources(
            String entityType,
            String entityUuid) {
        this(entityType, entityUuid, Optional.empty(), Optional.empty());
    }

    /**
     * The type of entity being described, could be “Contractor”, “Employee”, “BankAccount”, “Payroll”, “ContractorPayment”, “RecoveryCase”, or “Signatory”
     */
    @JsonIgnore
    public String entityType() {
        return entityType;
    }

    /**
     * Unique identifier of the entity
     */
    @JsonIgnore
    public String entityUuid() {
        return entityUuid;
    }

    /**
     * Optional. The type of a resource that is related to the one described by entity_type and entity_uuid. For instance, if the entity_type is “BankAccount”, the reference_type could be the “Employee” or “Contractor” to whom the bank account belongs.
     */
    @JsonIgnore
    public Optional<String> referenceType() {
        return referenceType;
    }

    /**
     * Optional. Unique identifier of the reference.
     */
    @JsonIgnore
    public Optional<String> referenceUuid() {
        return referenceUuid;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The type of entity being described, could be “Contractor”, “Employee”, “BankAccount”, “Payroll”, “ContractorPayment”, “RecoveryCase”, or “Signatory”
     */
    public Resources withEntityType(String entityType) {
        Utils.checkNotNull(entityType, "entityType");
        this.entityType = entityType;
        return this;
    }

    /**
     * Unique identifier of the entity
     */
    public Resources withEntityUuid(String entityUuid) {
        Utils.checkNotNull(entityUuid, "entityUuid");
        this.entityUuid = entityUuid;
        return this;
    }

    /**
     * Optional. The type of a resource that is related to the one described by entity_type and entity_uuid. For instance, if the entity_type is “BankAccount”, the reference_type could be the “Employee” or “Contractor” to whom the bank account belongs.
     */
    public Resources withReferenceType(String referenceType) {
        Utils.checkNotNull(referenceType, "referenceType");
        this.referenceType = Optional.ofNullable(referenceType);
        return this;
    }

    /**
     * Optional. The type of a resource that is related to the one described by entity_type and entity_uuid. For instance, if the entity_type is “BankAccount”, the reference_type could be the “Employee” or “Contractor” to whom the bank account belongs.
     */
    public Resources withReferenceType(Optional<String> referenceType) {
        Utils.checkNotNull(referenceType, "referenceType");
        this.referenceType = referenceType;
        return this;
    }

    /**
     * Optional. Unique identifier of the reference.
     */
    public Resources withReferenceUuid(String referenceUuid) {
        Utils.checkNotNull(referenceUuid, "referenceUuid");
        this.referenceUuid = Optional.ofNullable(referenceUuid);
        return this;
    }

    /**
     * Optional. Unique identifier of the reference.
     */
    public Resources withReferenceUuid(Optional<String> referenceUuid) {
        Utils.checkNotNull(referenceUuid, "referenceUuid");
        this.referenceUuid = referenceUuid;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resources other = (Resources) o;
        return 
            Objects.deepEquals(this.entityType, other.entityType) &&
            Objects.deepEquals(this.entityUuid, other.entityUuid) &&
            Objects.deepEquals(this.referenceType, other.referenceType) &&
            Objects.deepEquals(this.referenceUuid, other.referenceUuid);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            entityType,
            entityUuid,
            referenceType,
            referenceUuid);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Resources.class,
                "entityType", entityType,
                "entityUuid", entityUuid,
                "referenceType", referenceType,
                "referenceUuid", referenceUuid);
    }
    
    public final static class Builder {
 
        private String entityType;
 
        private String entityUuid;
 
        private Optional<String> referenceType = Optional.empty();
 
        private Optional<String> referenceUuid = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The type of entity being described, could be “Contractor”, “Employee”, “BankAccount”, “Payroll”, “ContractorPayment”, “RecoveryCase”, or “Signatory”
         */
        public Builder entityType(String entityType) {
            Utils.checkNotNull(entityType, "entityType");
            this.entityType = entityType;
            return this;
        }

        /**
         * Unique identifier of the entity
         */
        public Builder entityUuid(String entityUuid) {
            Utils.checkNotNull(entityUuid, "entityUuid");
            this.entityUuid = entityUuid;
            return this;
        }

        /**
         * Optional. The type of a resource that is related to the one described by entity_type and entity_uuid. For instance, if the entity_type is “BankAccount”, the reference_type could be the “Employee” or “Contractor” to whom the bank account belongs.
         */
        public Builder referenceType(String referenceType) {
            Utils.checkNotNull(referenceType, "referenceType");
            this.referenceType = Optional.ofNullable(referenceType);
            return this;
        }

        /**
         * Optional. The type of a resource that is related to the one described by entity_type and entity_uuid. For instance, if the entity_type is “BankAccount”, the reference_type could be the “Employee” or “Contractor” to whom the bank account belongs.
         */
        public Builder referenceType(Optional<String> referenceType) {
            Utils.checkNotNull(referenceType, "referenceType");
            this.referenceType = referenceType;
            return this;
        }

        /**
         * Optional. Unique identifier of the reference.
         */
        public Builder referenceUuid(String referenceUuid) {
            Utils.checkNotNull(referenceUuid, "referenceUuid");
            this.referenceUuid = Optional.ofNullable(referenceUuid);
            return this;
        }

        /**
         * Optional. Unique identifier of the reference.
         */
        public Builder referenceUuid(Optional<String> referenceUuid) {
            Utils.checkNotNull(referenceUuid, "referenceUuid");
            this.referenceUuid = referenceUuid;
            return this;
        }
        
        public Resources build() {
            return new Resources(
                entityType,
                entityUuid,
                referenceType,
                referenceUuid);
        }
    }
}

