/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.utils.SpeakeasyMetadata;
import com.gusto.embedded_api.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class Document {

    @SpeakeasyMetadata("multipartForm:name=fileName")
    private String fileName;

    @SpeakeasyMetadata("multipartForm:content")
    private byte[] content;

    @JsonCreator
    public Document(
            String fileName,
            byte[] content) {
        Utils.checkNotNull(fileName, "fileName");
        Utils.checkNotNull(content, "content");
        this.fileName = fileName;
        this.content = content;
    }

    @JsonIgnore
    public String fileName() {
        return fileName;
    }

    @JsonIgnore
    public byte[] content() {
        return content;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Document withFileName(String fileName) {
        Utils.checkNotNull(fileName, "fileName");
        this.fileName = fileName;
        return this;
    }

    public Document withContent(byte[] content) {
        Utils.checkNotNull(content, "content");
        this.content = content;
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
        Document other = (Document) o;
        return 
            Objects.deepEquals(this.fileName, other.fileName) &&
            Objects.deepEquals(this.content, other.content);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fileName,
            content);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Document.class,
                "fileName", fileName,
                "content", content);
    }
    
    public final static class Builder {
 
        private String fileName;
 
        private byte[] content;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fileName(String fileName) {
            Utils.checkNotNull(fileName, "fileName");
            this.fileName = fileName;
            return this;
        }

        public Builder content(byte[] content) {
            Utils.checkNotNull(content, "content");
            this.content = content;
            return this;
        }
        
        public Document build() {
            return new Document(
                fileName,
                content);
        }
    }
}

