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
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;
/**
 * I9Authorization
 * 
 * <p>An employee's I-9 authorization
 */

public class I9Authorization {

    /**
     * The UUID of the I-9 authorization
     */
    @JsonProperty("uuid")
    private String uuid;

    /**
     * The UUID of the Form associated with this I-9 authorization. Use this with "Employee Forms" API endpoints.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("form_uuid")
    private Optional<String> formUuid;

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonProperty("version")
    private String version;

    /**
     * The employee's authorization status
     */
    @JsonProperty("authorization_status")
    private AuthorizationStatus authorizationStatus;

    /**
     * The document's document type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document_type")
    private Optional<? extends I9AuthorizationDocumentType> documentType;

    /**
     * Whether or not a `document_number` exists for this document.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("has_document_number")
    private Optional<Boolean> hasDocumentNumber;

    /**
     * The document's expiration date
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiration_date")
    private Optional<String> expirationDate;

    /**
     * The document's country of issuance
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<String> country;

    /**
     * Whether the employer has signed the Form I-9
     */
    @JsonProperty("employer_signed")
    private boolean employerSigned;

    /**
     * Whether the employee has signed the Form I-9
     */
    @JsonProperty("employee_signed")
    private boolean employeeSigned;

    /**
     * Any additional notes
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("additional_info")
    private Optional<String> additionalInfo;

    /**
     * Whether an alternative procedure authorized by DHS to examine documents was used
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("alt_procedure")
    private Optional<Boolean> altProcedure;

    @JsonCreator
    public I9Authorization(
            @JsonProperty("uuid") String uuid,
            @JsonProperty("form_uuid") Optional<String> formUuid,
            @JsonProperty("version") String version,
            @JsonProperty("authorization_status") AuthorizationStatus authorizationStatus,
            @JsonProperty("document_type") Optional<? extends I9AuthorizationDocumentType> documentType,
            @JsonProperty("has_document_number") Optional<Boolean> hasDocumentNumber,
            @JsonProperty("expiration_date") Optional<String> expirationDate,
            @JsonProperty("country") Optional<String> country,
            @JsonProperty("employer_signed") boolean employerSigned,
            @JsonProperty("employee_signed") boolean employeeSigned,
            @JsonProperty("additional_info") Optional<String> additionalInfo,
            @JsonProperty("alt_procedure") Optional<Boolean> altProcedure) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(formUuid, "formUuid");
        Utils.checkNotNull(version, "version");
        Utils.checkNotNull(authorizationStatus, "authorizationStatus");
        Utils.checkNotNull(documentType, "documentType");
        Utils.checkNotNull(hasDocumentNumber, "hasDocumentNumber");
        Utils.checkNotNull(expirationDate, "expirationDate");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(employerSigned, "employerSigned");
        Utils.checkNotNull(employeeSigned, "employeeSigned");
        Utils.checkNotNull(additionalInfo, "additionalInfo");
        Utils.checkNotNull(altProcedure, "altProcedure");
        this.uuid = uuid;
        this.formUuid = formUuid;
        this.version = version;
        this.authorizationStatus = authorizationStatus;
        this.documentType = documentType;
        this.hasDocumentNumber = hasDocumentNumber;
        this.expirationDate = expirationDate;
        this.country = country;
        this.employerSigned = employerSigned;
        this.employeeSigned = employeeSigned;
        this.additionalInfo = additionalInfo;
        this.altProcedure = altProcedure;
    }
    
    public I9Authorization(
            String uuid,
            String version,
            AuthorizationStatus authorizationStatus,
            boolean employerSigned,
            boolean employeeSigned) {
        this(uuid, Optional.empty(), version, authorizationStatus, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), employerSigned, employeeSigned, Optional.empty(), Optional.empty());
    }

    /**
     * The UUID of the I-9 authorization
     */
    @JsonIgnore
    public String uuid() {
        return uuid;
    }

    /**
     * The UUID of the Form associated with this I-9 authorization. Use this with "Employee Forms" API endpoints.
     */
    @JsonIgnore
    public Optional<String> formUuid() {
        return formUuid;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    @JsonIgnore
    public String version() {
        return version;
    }

    /**
     * The employee's authorization status
     */
    @JsonIgnore
    public AuthorizationStatus authorizationStatus() {
        return authorizationStatus;
    }

    /**
     * The document's document type
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<I9AuthorizationDocumentType> documentType() {
        return (Optional<I9AuthorizationDocumentType>) documentType;
    }

    /**
     * Whether or not a `document_number` exists for this document.
     */
    @JsonIgnore
    public Optional<Boolean> hasDocumentNumber() {
        return hasDocumentNumber;
    }

    /**
     * The document's expiration date
     */
    @JsonIgnore
    public Optional<String> expirationDate() {
        return expirationDate;
    }

    /**
     * The document's country of issuance
     */
    @JsonIgnore
    public Optional<String> country() {
        return country;
    }

    /**
     * Whether the employer has signed the Form I-9
     */
    @JsonIgnore
    public boolean employerSigned() {
        return employerSigned;
    }

    /**
     * Whether the employee has signed the Form I-9
     */
    @JsonIgnore
    public boolean employeeSigned() {
        return employeeSigned;
    }

    /**
     * Any additional notes
     */
    @JsonIgnore
    public Optional<String> additionalInfo() {
        return additionalInfo;
    }

    /**
     * Whether an alternative procedure authorized by DHS to examine documents was used
     */
    @JsonIgnore
    public Optional<Boolean> altProcedure() {
        return altProcedure;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The UUID of the I-9 authorization
     */
    public I9Authorization withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * The UUID of the Form associated with this I-9 authorization. Use this with "Employee Forms" API endpoints.
     */
    public I9Authorization withFormUuid(String formUuid) {
        Utils.checkNotNull(formUuid, "formUuid");
        this.formUuid = Optional.ofNullable(formUuid);
        return this;
    }

    /**
     * The UUID of the Form associated with this I-9 authorization. Use this with "Employee Forms" API endpoints.
     */
    public I9Authorization withFormUuid(Optional<String> formUuid) {
        Utils.checkNotNull(formUuid, "formUuid");
        this.formUuid = formUuid;
        return this;
    }

    /**
     * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
     */
    public I9Authorization withVersion(String version) {
        Utils.checkNotNull(version, "version");
        this.version = version;
        return this;
    }

    /**
     * The employee's authorization status
     */
    public I9Authorization withAuthorizationStatus(AuthorizationStatus authorizationStatus) {
        Utils.checkNotNull(authorizationStatus, "authorizationStatus");
        this.authorizationStatus = authorizationStatus;
        return this;
    }

    /**
     * The document's document type
     */
    public I9Authorization withDocumentType(I9AuthorizationDocumentType documentType) {
        Utils.checkNotNull(documentType, "documentType");
        this.documentType = Optional.ofNullable(documentType);
        return this;
    }

    /**
     * The document's document type
     */
    public I9Authorization withDocumentType(Optional<? extends I9AuthorizationDocumentType> documentType) {
        Utils.checkNotNull(documentType, "documentType");
        this.documentType = documentType;
        return this;
    }

    /**
     * Whether or not a `document_number` exists for this document.
     */
    public I9Authorization withHasDocumentNumber(boolean hasDocumentNumber) {
        Utils.checkNotNull(hasDocumentNumber, "hasDocumentNumber");
        this.hasDocumentNumber = Optional.ofNullable(hasDocumentNumber);
        return this;
    }

    /**
     * Whether or not a `document_number` exists for this document.
     */
    public I9Authorization withHasDocumentNumber(Optional<Boolean> hasDocumentNumber) {
        Utils.checkNotNull(hasDocumentNumber, "hasDocumentNumber");
        this.hasDocumentNumber = hasDocumentNumber;
        return this;
    }

    /**
     * The document's expiration date
     */
    public I9Authorization withExpirationDate(String expirationDate) {
        Utils.checkNotNull(expirationDate, "expirationDate");
        this.expirationDate = Optional.ofNullable(expirationDate);
        return this;
    }

    /**
     * The document's expiration date
     */
    public I9Authorization withExpirationDate(Optional<String> expirationDate) {
        Utils.checkNotNull(expirationDate, "expirationDate");
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * The document's country of issuance
     */
    public I9Authorization withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    /**
     * The document's country of issuance
     */
    public I9Authorization withCountry(Optional<String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * Whether the employer has signed the Form I-9
     */
    public I9Authorization withEmployerSigned(boolean employerSigned) {
        Utils.checkNotNull(employerSigned, "employerSigned");
        this.employerSigned = employerSigned;
        return this;
    }

    /**
     * Whether the employee has signed the Form I-9
     */
    public I9Authorization withEmployeeSigned(boolean employeeSigned) {
        Utils.checkNotNull(employeeSigned, "employeeSigned");
        this.employeeSigned = employeeSigned;
        return this;
    }

    /**
     * Any additional notes
     */
    public I9Authorization withAdditionalInfo(String additionalInfo) {
        Utils.checkNotNull(additionalInfo, "additionalInfo");
        this.additionalInfo = Optional.ofNullable(additionalInfo);
        return this;
    }

    /**
     * Any additional notes
     */
    public I9Authorization withAdditionalInfo(Optional<String> additionalInfo) {
        Utils.checkNotNull(additionalInfo, "additionalInfo");
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * Whether an alternative procedure authorized by DHS to examine documents was used
     */
    public I9Authorization withAltProcedure(boolean altProcedure) {
        Utils.checkNotNull(altProcedure, "altProcedure");
        this.altProcedure = Optional.ofNullable(altProcedure);
        return this;
    }

    /**
     * Whether an alternative procedure authorized by DHS to examine documents was used
     */
    public I9Authorization withAltProcedure(Optional<Boolean> altProcedure) {
        Utils.checkNotNull(altProcedure, "altProcedure");
        this.altProcedure = altProcedure;
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
        I9Authorization other = (I9Authorization) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.formUuid, other.formUuid) &&
            Objects.deepEquals(this.version, other.version) &&
            Objects.deepEquals(this.authorizationStatus, other.authorizationStatus) &&
            Objects.deepEquals(this.documentType, other.documentType) &&
            Objects.deepEquals(this.hasDocumentNumber, other.hasDocumentNumber) &&
            Objects.deepEquals(this.expirationDate, other.expirationDate) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.employerSigned, other.employerSigned) &&
            Objects.deepEquals(this.employeeSigned, other.employeeSigned) &&
            Objects.deepEquals(this.additionalInfo, other.additionalInfo) &&
            Objects.deepEquals(this.altProcedure, other.altProcedure);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            formUuid,
            version,
            authorizationStatus,
            documentType,
            hasDocumentNumber,
            expirationDate,
            country,
            employerSigned,
            employeeSigned,
            additionalInfo,
            altProcedure);
    }
    
    @Override
    public String toString() {
        return Utils.toString(I9Authorization.class,
                "uuid", uuid,
                "formUuid", formUuid,
                "version", version,
                "authorizationStatus", authorizationStatus,
                "documentType", documentType,
                "hasDocumentNumber", hasDocumentNumber,
                "expirationDate", expirationDate,
                "country", country,
                "employerSigned", employerSigned,
                "employeeSigned", employeeSigned,
                "additionalInfo", additionalInfo,
                "altProcedure", altProcedure);
    }
    
    public final static class Builder {
 
        private String uuid;
 
        private Optional<String> formUuid = Optional.empty();
 
        private String version;
 
        private AuthorizationStatus authorizationStatus;
 
        private Optional<? extends I9AuthorizationDocumentType> documentType = Optional.empty();
 
        private Optional<Boolean> hasDocumentNumber = Optional.empty();
 
        private Optional<String> expirationDate = Optional.empty();
 
        private Optional<String> country = Optional.empty();
 
        private Boolean employerSigned;
 
        private Boolean employeeSigned;
 
        private Optional<String> additionalInfo = Optional.empty();
 
        private Optional<Boolean> altProcedure = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The UUID of the I-9 authorization
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * The UUID of the Form associated with this I-9 authorization. Use this with "Employee Forms" API endpoints.
         */
        public Builder formUuid(String formUuid) {
            Utils.checkNotNull(formUuid, "formUuid");
            this.formUuid = Optional.ofNullable(formUuid);
            return this;
        }

        /**
         * The UUID of the Form associated with this I-9 authorization. Use this with "Employee Forms" API endpoints.
         */
        public Builder formUuid(Optional<String> formUuid) {
            Utils.checkNotNull(formUuid, "formUuid");
            this.formUuid = formUuid;
            return this;
        }

        /**
         * The current version of the object. See the [versioning guide](https://docs.gusto.com/embedded-payroll/docs/idempotency) for information on how to use this field.
         */
        public Builder version(String version) {
            Utils.checkNotNull(version, "version");
            this.version = version;
            return this;
        }

        /**
         * The employee's authorization status
         */
        public Builder authorizationStatus(AuthorizationStatus authorizationStatus) {
            Utils.checkNotNull(authorizationStatus, "authorizationStatus");
            this.authorizationStatus = authorizationStatus;
            return this;
        }

        /**
         * The document's document type
         */
        public Builder documentType(I9AuthorizationDocumentType documentType) {
            Utils.checkNotNull(documentType, "documentType");
            this.documentType = Optional.ofNullable(documentType);
            return this;
        }

        /**
         * The document's document type
         */
        public Builder documentType(Optional<? extends I9AuthorizationDocumentType> documentType) {
            Utils.checkNotNull(documentType, "documentType");
            this.documentType = documentType;
            return this;
        }

        /**
         * Whether or not a `document_number` exists for this document.
         */
        public Builder hasDocumentNumber(boolean hasDocumentNumber) {
            Utils.checkNotNull(hasDocumentNumber, "hasDocumentNumber");
            this.hasDocumentNumber = Optional.ofNullable(hasDocumentNumber);
            return this;
        }

        /**
         * Whether or not a `document_number` exists for this document.
         */
        public Builder hasDocumentNumber(Optional<Boolean> hasDocumentNumber) {
            Utils.checkNotNull(hasDocumentNumber, "hasDocumentNumber");
            this.hasDocumentNumber = hasDocumentNumber;
            return this;
        }

        /**
         * The document's expiration date
         */
        public Builder expirationDate(String expirationDate) {
            Utils.checkNotNull(expirationDate, "expirationDate");
            this.expirationDate = Optional.ofNullable(expirationDate);
            return this;
        }

        /**
         * The document's expiration date
         */
        public Builder expirationDate(Optional<String> expirationDate) {
            Utils.checkNotNull(expirationDate, "expirationDate");
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * The document's country of issuance
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        /**
         * The document's country of issuance
         */
        public Builder country(Optional<String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * Whether the employer has signed the Form I-9
         */
        public Builder employerSigned(boolean employerSigned) {
            Utils.checkNotNull(employerSigned, "employerSigned");
            this.employerSigned = employerSigned;
            return this;
        }

        /**
         * Whether the employee has signed the Form I-9
         */
        public Builder employeeSigned(boolean employeeSigned) {
            Utils.checkNotNull(employeeSigned, "employeeSigned");
            this.employeeSigned = employeeSigned;
            return this;
        }

        /**
         * Any additional notes
         */
        public Builder additionalInfo(String additionalInfo) {
            Utils.checkNotNull(additionalInfo, "additionalInfo");
            this.additionalInfo = Optional.ofNullable(additionalInfo);
            return this;
        }

        /**
         * Any additional notes
         */
        public Builder additionalInfo(Optional<String> additionalInfo) {
            Utils.checkNotNull(additionalInfo, "additionalInfo");
            this.additionalInfo = additionalInfo;
            return this;
        }

        /**
         * Whether an alternative procedure authorized by DHS to examine documents was used
         */
        public Builder altProcedure(boolean altProcedure) {
            Utils.checkNotNull(altProcedure, "altProcedure");
            this.altProcedure = Optional.ofNullable(altProcedure);
            return this;
        }

        /**
         * Whether an alternative procedure authorized by DHS to examine documents was used
         */
        public Builder altProcedure(Optional<Boolean> altProcedure) {
            Utils.checkNotNull(altProcedure, "altProcedure");
            this.altProcedure = altProcedure;
            return this;
        }
        
        public I9Authorization build() {
            return new I9Authorization(
                uuid,
                formUuid,
                version,
                authorizationStatus,
                documentType,
                hasDocumentNumber,
                expirationDate,
                country,
                employerSigned,
                employeeSigned,
                additionalInfo,
                altProcedure);
        }
    }
}

