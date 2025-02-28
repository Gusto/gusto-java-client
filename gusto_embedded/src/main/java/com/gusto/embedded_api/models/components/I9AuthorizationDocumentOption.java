/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.components;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;
/**
 * I9AuthorizationDocumentOption - An employee's I-9 verification document option based on the authorization status
 */

public class I9AuthorizationDocumentOption {

    /**
     * The document option's section in the list of acceptable documents on the Form I-9
     */
    @JsonProperty("section")
    private Section section;

    /**
     * The document option's description
     */
    @JsonProperty("description")
    private String description;

    /**
     * The document option's document type
     */
    @JsonProperty("document_type")
    private String documentType;

    /**
     * The document option's document titles
     */
    @JsonProperty("document_title")
    private List<String> documentTitle;

    /**
     * Whether the document is a common choice for I-9 verification
     */
    @JsonProperty("common_choice")
    private boolean commonChoice;

    @JsonCreator
    public I9AuthorizationDocumentOption(
            @JsonProperty("section") Section section,
            @JsonProperty("description") String description,
            @JsonProperty("document_type") String documentType,
            @JsonProperty("document_title") List<String> documentTitle,
            @JsonProperty("common_choice") boolean commonChoice) {
        Utils.checkNotNull(section, "section");
        Utils.checkNotNull(description, "description");
        Utils.checkNotNull(documentType, "documentType");
        Utils.checkNotNull(documentTitle, "documentTitle");
        Utils.checkNotNull(commonChoice, "commonChoice");
        this.section = section;
        this.description = description;
        this.documentType = documentType;
        this.documentTitle = documentTitle;
        this.commonChoice = commonChoice;
    }

    /**
     * The document option's section in the list of acceptable documents on the Form I-9
     */
    @JsonIgnore
    public Section section() {
        return section;
    }

    /**
     * The document option's description
     */
    @JsonIgnore
    public String description() {
        return description;
    }

    /**
     * The document option's document type
     */
    @JsonIgnore
    public String documentType() {
        return documentType;
    }

    /**
     * The document option's document titles
     */
    @JsonIgnore
    public List<String> documentTitle() {
        return documentTitle;
    }

    /**
     * Whether the document is a common choice for I-9 verification
     */
    @JsonIgnore
    public boolean commonChoice() {
        return commonChoice;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The document option's section in the list of acceptable documents on the Form I-9
     */
    public I9AuthorizationDocumentOption withSection(Section section) {
        Utils.checkNotNull(section, "section");
        this.section = section;
        return this;
    }

    /**
     * The document option's description
     */
    public I9AuthorizationDocumentOption withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
        return this;
    }

    /**
     * The document option's document type
     */
    public I9AuthorizationDocumentOption withDocumentType(String documentType) {
        Utils.checkNotNull(documentType, "documentType");
        this.documentType = documentType;
        return this;
    }

    /**
     * The document option's document titles
     */
    public I9AuthorizationDocumentOption withDocumentTitle(List<String> documentTitle) {
        Utils.checkNotNull(documentTitle, "documentTitle");
        this.documentTitle = documentTitle;
        return this;
    }

    /**
     * Whether the document is a common choice for I-9 verification
     */
    public I9AuthorizationDocumentOption withCommonChoice(boolean commonChoice) {
        Utils.checkNotNull(commonChoice, "commonChoice");
        this.commonChoice = commonChoice;
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
        I9AuthorizationDocumentOption other = (I9AuthorizationDocumentOption) o;
        return 
            Objects.deepEquals(this.section, other.section) &&
            Objects.deepEquals(this.description, other.description) &&
            Objects.deepEquals(this.documentType, other.documentType) &&
            Objects.deepEquals(this.documentTitle, other.documentTitle) &&
            Objects.deepEquals(this.commonChoice, other.commonChoice);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            section,
            description,
            documentType,
            documentTitle,
            commonChoice);
    }
    
    @Override
    public String toString() {
        return Utils.toString(I9AuthorizationDocumentOption.class,
                "section", section,
                "description", description,
                "documentType", documentType,
                "documentTitle", documentTitle,
                "commonChoice", commonChoice);
    }
    
    public final static class Builder {
 
        private Section section;
 
        private String description;
 
        private String documentType;
 
        private List<String> documentTitle;
 
        private Boolean commonChoice;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The document option's section in the list of acceptable documents on the Form I-9
         */
        public Builder section(Section section) {
            Utils.checkNotNull(section, "section");
            this.section = section;
            return this;
        }

        /**
         * The document option's description
         */
        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }

        /**
         * The document option's document type
         */
        public Builder documentType(String documentType) {
            Utils.checkNotNull(documentType, "documentType");
            this.documentType = documentType;
            return this;
        }

        /**
         * The document option's document titles
         */
        public Builder documentTitle(List<String> documentTitle) {
            Utils.checkNotNull(documentTitle, "documentTitle");
            this.documentTitle = documentTitle;
            return this;
        }

        /**
         * Whether the document is a common choice for I-9 verification
         */
        public Builder commonChoice(boolean commonChoice) {
            Utils.checkNotNull(commonChoice, "commonChoice");
            this.commonChoice = commonChoice;
            return this;
        }
        
        public I9AuthorizationDocumentOption build() {
            return new I9AuthorizationDocumentOption(
                section,
                description,
                documentType,
                documentTitle,
                commonChoice);
        }
    }
}

