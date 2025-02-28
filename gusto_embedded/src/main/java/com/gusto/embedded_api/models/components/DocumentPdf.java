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

public class DocumentPdf {

    /**
     * the UUID of the document
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    private Optional<String> uuid;

    /**
     * the URL of the document
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("document_url")
    private Optional<String> documentUrl;

    @JsonCreator
    public DocumentPdf(
            @JsonProperty("uuid") Optional<String> uuid,
            @JsonProperty("document_url") Optional<String> documentUrl) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(documentUrl, "documentUrl");
        this.uuid = uuid;
        this.documentUrl = documentUrl;
    }
    
    public DocumentPdf() {
        this(Optional.empty(), Optional.empty());
    }

    /**
     * the UUID of the document
     */
    @JsonIgnore
    public Optional<String> uuid() {
        return uuid;
    }

    /**
     * the URL of the document
     */
    @JsonIgnore
    public Optional<String> documentUrl() {
        return documentUrl;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * the UUID of the document
     */
    public DocumentPdf withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = Optional.ofNullable(uuid);
        return this;
    }

    /**
     * the UUID of the document
     */
    public DocumentPdf withUuid(Optional<String> uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    /**
     * the URL of the document
     */
    public DocumentPdf withDocumentUrl(String documentUrl) {
        Utils.checkNotNull(documentUrl, "documentUrl");
        this.documentUrl = Optional.ofNullable(documentUrl);
        return this;
    }

    /**
     * the URL of the document
     */
    public DocumentPdf withDocumentUrl(Optional<String> documentUrl) {
        Utils.checkNotNull(documentUrl, "documentUrl");
        this.documentUrl = documentUrl;
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
        DocumentPdf other = (DocumentPdf) o;
        return 
            Objects.deepEquals(this.uuid, other.uuid) &&
            Objects.deepEquals(this.documentUrl, other.documentUrl);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            uuid,
            documentUrl);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DocumentPdf.class,
                "uuid", uuid,
                "documentUrl", documentUrl);
    }
    
    public final static class Builder {
 
        private Optional<String> uuid = Optional.empty();
 
        private Optional<String> documentUrl = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * the UUID of the document
         */
        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = Optional.ofNullable(uuid);
            return this;
        }

        /**
         * the UUID of the document
         */
        public Builder uuid(Optional<String> uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        /**
         * the URL of the document
         */
        public Builder documentUrl(String documentUrl) {
            Utils.checkNotNull(documentUrl, "documentUrl");
            this.documentUrl = Optional.ofNullable(documentUrl);
            return this;
        }

        /**
         * the URL of the document
         */
        public Builder documentUrl(Optional<String> documentUrl) {
            Utils.checkNotNull(documentUrl, "documentUrl");
            this.documentUrl = documentUrl;
            return this;
        }
        
        public DocumentPdf build() {
            return new DocumentPdf(
                uuid,
                documentUrl);
        }
    }
}

