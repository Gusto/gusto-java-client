/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.openapis.openapi.utils.SpeakeasyMetadata;
import org.openapis.openapi.utils.Utils;

/**
 * PostV1CompaniesAttachmentRequestBody - The binary payload of the file and the company attachment category.
 */

public class PostV1CompaniesAttachmentRequestBody {

    /**
     * The binary payload of the file to be uploaded.
     */
    @SpeakeasyMetadata("multipartForm:file,name=document")
    private Document document;

    /**
     * The category of a company attachment.
     */
    @SpeakeasyMetadata("multipartForm:name=category")
    private Category category;

    @JsonCreator
    public PostV1CompaniesAttachmentRequestBody(
            Document document,
            Category category) {
        Utils.checkNotNull(document, "document");
        Utils.checkNotNull(category, "category");
        this.document = document;
        this.category = category;
    }

    /**
     * The binary payload of the file to be uploaded.
     */
    @JsonIgnore
    public Document document() {
        return document;
    }

    /**
     * The category of a company attachment.
     */
    @JsonIgnore
    public Category category() {
        return category;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The binary payload of the file to be uploaded.
     */
    public PostV1CompaniesAttachmentRequestBody withDocument(Document document) {
        Utils.checkNotNull(document, "document");
        this.document = document;
        return this;
    }

    /**
     * The category of a company attachment.
     */
    public PostV1CompaniesAttachmentRequestBody withCategory(Category category) {
        Utils.checkNotNull(category, "category");
        this.category = category;
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
        PostV1CompaniesAttachmentRequestBody other = (PostV1CompaniesAttachmentRequestBody) o;
        return 
            Objects.deepEquals(this.document, other.document) &&
            Objects.deepEquals(this.category, other.category);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            document,
            category);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostV1CompaniesAttachmentRequestBody.class,
                "document", document,
                "category", category);
    }
    
    public final static class Builder {
 
        private Document document;
 
        private Category category;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The binary payload of the file to be uploaded.
         */
        public Builder document(Document document) {
            Utils.checkNotNull(document, "document");
            this.document = document;
            return this;
        }

        /**
         * The category of a company attachment.
         */
        public Builder category(Category category) {
            Utils.checkNotNull(category, "category");
            this.category = category;
            return this;
        }
        
        public PostV1CompaniesAttachmentRequestBody build() {
            return new PostV1CompaniesAttachmentRequestBody(
                document,
                category);
        }
    }
}

