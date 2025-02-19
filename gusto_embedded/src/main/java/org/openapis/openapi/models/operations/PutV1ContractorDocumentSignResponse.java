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
import org.openapis.openapi.models.components.DocumentSigned;
import org.openapis.openapi.utils.Response;
import org.openapis.openapi.utils.Utils;


public class PutV1ContractorDocumentSignResponse implements Response {

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
    private Optional<? extends DocumentSigned> documentSigned;

    @JsonCreator
    public PutV1ContractorDocumentSignResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends DocumentSigned> documentSigned) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(documentSigned, "documentSigned");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.documentSigned = documentSigned;
    }
    
    public PutV1ContractorDocumentSignResponse(
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
    public Optional<DocumentSigned> documentSigned() {
        return (Optional<DocumentSigned>) documentSigned;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public PutV1ContractorDocumentSignResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PutV1ContractorDocumentSignResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PutV1ContractorDocumentSignResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public PutV1ContractorDocumentSignResponse withDocumentSigned(DocumentSigned documentSigned) {
        Utils.checkNotNull(documentSigned, "documentSigned");
        this.documentSigned = Optional.ofNullable(documentSigned);
        return this;
    }

    /**
     * Example response
     */
    public PutV1ContractorDocumentSignResponse withDocumentSigned(Optional<? extends DocumentSigned> documentSigned) {
        Utils.checkNotNull(documentSigned, "documentSigned");
        this.documentSigned = documentSigned;
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
        PutV1ContractorDocumentSignResponse other = (PutV1ContractorDocumentSignResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.documentSigned, other.documentSigned);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            documentSigned);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1ContractorDocumentSignResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "documentSigned", documentSigned);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends DocumentSigned> documentSigned = Optional.empty();  
        
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
        public Builder documentSigned(DocumentSigned documentSigned) {
            Utils.checkNotNull(documentSigned, "documentSigned");
            this.documentSigned = Optional.ofNullable(documentSigned);
            return this;
        }

        /**
         * Example response
         */
        public Builder documentSigned(Optional<? extends DocumentSigned> documentSigned) {
            Utils.checkNotNull(documentSigned, "documentSigned");
            this.documentSigned = documentSigned;
            return this;
        }
        
        public PutV1ContractorDocumentSignResponse build() {
            return new PutV1ContractorDocumentSignResponse(
                contentType,
                statusCode,
                rawResponse,
                documentSigned);
        }
    }
}

