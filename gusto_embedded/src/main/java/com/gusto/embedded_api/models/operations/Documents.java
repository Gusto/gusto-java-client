/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
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

public class Documents {

    /**
     * The document type
     */
    @JsonProperty("document_type")
    private String documentType;

    /**
     * The document title associated with the document type
     */
    @JsonProperty("document_title")
    private String documentTitle;

    /**
     * The document's document number
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document_number")
    private Optional<String> documentNumber;

    /**
     * The document's expiration date
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiration_date")
    private Optional<String> expirationDate;

    /**
     * The document's issuing authority
     */
    @JsonProperty("issuing_authority")
    private String issuingAuthority;

    @JsonCreator
    public Documents(
            @JsonProperty("document_type") String documentType,
            @JsonProperty("document_title") String documentTitle,
            @JsonProperty("document_number") Optional<String> documentNumber,
            @JsonProperty("expiration_date") Optional<String> expirationDate,
            @JsonProperty("issuing_authority") String issuingAuthority) {
        Utils.checkNotNull(documentType, "documentType");
        Utils.checkNotNull(documentTitle, "documentTitle");
        Utils.checkNotNull(documentNumber, "documentNumber");
        Utils.checkNotNull(expirationDate, "expirationDate");
        Utils.checkNotNull(issuingAuthority, "issuingAuthority");
        this.documentType = documentType;
        this.documentTitle = documentTitle;
        this.documentNumber = documentNumber;
        this.expirationDate = expirationDate;
        this.issuingAuthority = issuingAuthority;
    }
    
    public Documents(
            String documentType,
            String documentTitle,
            String issuingAuthority) {
        this(documentType, documentTitle, Optional.empty(), Optional.empty(), issuingAuthority);
    }

    /**
     * The document type
     */
    @JsonIgnore
    public String documentType() {
        return documentType;
    }

    /**
     * The document title associated with the document type
     */
    @JsonIgnore
    public String documentTitle() {
        return documentTitle;
    }

    /**
     * The document's document number
     */
    @JsonIgnore
    public Optional<String> documentNumber() {
        return documentNumber;
    }

    /**
     * The document's expiration date
     */
    @JsonIgnore
    public Optional<String> expirationDate() {
        return expirationDate;
    }

    /**
     * The document's issuing authority
     */
    @JsonIgnore
    public String issuingAuthority() {
        return issuingAuthority;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The document type
     */
    public Documents withDocumentType(String documentType) {
        Utils.checkNotNull(documentType, "documentType");
        this.documentType = documentType;
        return this;
    }

    /**
     * The document title associated with the document type
     */
    public Documents withDocumentTitle(String documentTitle) {
        Utils.checkNotNull(documentTitle, "documentTitle");
        this.documentTitle = documentTitle;
        return this;
    }

    /**
     * The document's document number
     */
    public Documents withDocumentNumber(String documentNumber) {
        Utils.checkNotNull(documentNumber, "documentNumber");
        this.documentNumber = Optional.ofNullable(documentNumber);
        return this;
    }

    /**
     * The document's document number
     */
    public Documents withDocumentNumber(Optional<String> documentNumber) {
        Utils.checkNotNull(documentNumber, "documentNumber");
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * The document's expiration date
     */
    public Documents withExpirationDate(String expirationDate) {
        Utils.checkNotNull(expirationDate, "expirationDate");
        this.expirationDate = Optional.ofNullable(expirationDate);
        return this;
    }

    /**
     * The document's expiration date
     */
    public Documents withExpirationDate(Optional<String> expirationDate) {
        Utils.checkNotNull(expirationDate, "expirationDate");
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * The document's issuing authority
     */
    public Documents withIssuingAuthority(String issuingAuthority) {
        Utils.checkNotNull(issuingAuthority, "issuingAuthority");
        this.issuingAuthority = issuingAuthority;
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
        Documents other = (Documents) o;
        return 
            Objects.deepEquals(this.documentType, other.documentType) &&
            Objects.deepEquals(this.documentTitle, other.documentTitle) &&
            Objects.deepEquals(this.documentNumber, other.documentNumber) &&
            Objects.deepEquals(this.expirationDate, other.expirationDate) &&
            Objects.deepEquals(this.issuingAuthority, other.issuingAuthority);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            documentType,
            documentTitle,
            documentNumber,
            expirationDate,
            issuingAuthority);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Documents.class,
                "documentType", documentType,
                "documentTitle", documentTitle,
                "documentNumber", documentNumber,
                "expirationDate", expirationDate,
                "issuingAuthority", issuingAuthority);
    }
    
    public final static class Builder {
 
        private String documentType;
 
        private String documentTitle;
 
        private Optional<String> documentNumber = Optional.empty();
 
        private Optional<String> expirationDate = Optional.empty();
 
        private String issuingAuthority;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The document type
         */
        public Builder documentType(String documentType) {
            Utils.checkNotNull(documentType, "documentType");
            this.documentType = documentType;
            return this;
        }

        /**
         * The document title associated with the document type
         */
        public Builder documentTitle(String documentTitle) {
            Utils.checkNotNull(documentTitle, "documentTitle");
            this.documentTitle = documentTitle;
            return this;
        }

        /**
         * The document's document number
         */
        public Builder documentNumber(String documentNumber) {
            Utils.checkNotNull(documentNumber, "documentNumber");
            this.documentNumber = Optional.ofNullable(documentNumber);
            return this;
        }

        /**
         * The document's document number
         */
        public Builder documentNumber(Optional<String> documentNumber) {
            Utils.checkNotNull(documentNumber, "documentNumber");
            this.documentNumber = documentNumber;
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
         * The document's issuing authority
         */
        public Builder issuingAuthority(String issuingAuthority) {
            Utils.checkNotNull(issuingAuthority, "issuingAuthority");
            this.issuingAuthority = issuingAuthority;
            return this;
        }
        
        public Documents build() {
            return new Documents(
                documentType,
                documentTitle,
                documentNumber,
                expirationDate,
                issuingAuthority);
        }
    }
}

