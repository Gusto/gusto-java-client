/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.components.GeneratedDocument;
import org.openapis.openapi.utils.Response;
import org.openapis.openapi.utils.Utils;


public class GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Example response
     */
    private Optional<? extends GeneratedDocument> generatedDocument;

    @JsonCreator
    public GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends GeneratedDocument> generatedDocument) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(generatedDocument, "generatedDocument");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.generatedDocument = generatedDocument;
    }
    
    public GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Example response
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GeneratedDocument> generatedDocument() {
        return (Optional<GeneratedDocument>) generatedDocument;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse withGeneratedDocument(GeneratedDocument generatedDocument) {
        Utils.checkNotNull(generatedDocument, "generatedDocument");
        this.generatedDocument = Optional.ofNullable(generatedDocument);
        return this;
    }

    /**
     * Example response
     */
    public GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse withGeneratedDocument(Optional<? extends GeneratedDocument> generatedDocument) {
        Utils.checkNotNull(generatedDocument, "generatedDocument");
        this.generatedDocument = generatedDocument;
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
        GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse other = (GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.generatedDocument, other.generatedDocument);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            generatedDocument);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "generatedDocument", generatedDocument);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends GeneratedDocument> generatedDocument = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Example response
         */
        public Builder generatedDocument(GeneratedDocument generatedDocument) {
            Utils.checkNotNull(generatedDocument, "generatedDocument");
            this.generatedDocument = Optional.ofNullable(generatedDocument);
            return this;
        }

        /**
         * Example response
         */
        public Builder generatedDocument(Optional<? extends GeneratedDocument> generatedDocument) {
            Utils.checkNotNull(generatedDocument, "generatedDocument");
            this.generatedDocument = generatedDocument;
            return this;
        }
        
        public GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse build() {
            return new GetV1GeneratedDocumentsDocumentTypeRequestUuidResponse(
                contentType,
                statusCode,
                rawResponse,
                generatedDocument);
        }
    }
}

