/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.I9AuthorizationDocument;
import com.gusto.embedded_api.utils.Response;
import com.gusto.embedded_api.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse implements Response {

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
    private Optional<? extends List<I9AuthorizationDocument>> i9AuthorizationDocumentsObject;

    @JsonCreator
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<I9AuthorizationDocument>> i9AuthorizationDocumentsObject) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(i9AuthorizationDocumentsObject, "i9AuthorizationDocumentsObject");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.i9AuthorizationDocumentsObject = i9AuthorizationDocumentsObject;
    }
    
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse(
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
    public Optional<List<I9AuthorizationDocument>> i9AuthorizationDocumentsObject() {
        return (Optional<List<I9AuthorizationDocument>>) i9AuthorizationDocumentsObject;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse withI9AuthorizationDocumentsObject(List<I9AuthorizationDocument> i9AuthorizationDocumentsObject) {
        Utils.checkNotNull(i9AuthorizationDocumentsObject, "i9AuthorizationDocumentsObject");
        this.i9AuthorizationDocumentsObject = Optional.ofNullable(i9AuthorizationDocumentsObject);
        return this;
    }

    /**
     * Example response
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse withI9AuthorizationDocumentsObject(Optional<? extends List<I9AuthorizationDocument>> i9AuthorizationDocumentsObject) {
        Utils.checkNotNull(i9AuthorizationDocumentsObject, "i9AuthorizationDocumentsObject");
        this.i9AuthorizationDocumentsObject = i9AuthorizationDocumentsObject;
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
        PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse other = (PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.i9AuthorizationDocumentsObject, other.i9AuthorizationDocumentsObject);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            i9AuthorizationDocumentsObject);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "i9AuthorizationDocumentsObject", i9AuthorizationDocumentsObject);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends List<I9AuthorizationDocument>> i9AuthorizationDocumentsObject = Optional.empty();  
        
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
        public Builder i9AuthorizationDocumentsObject(List<I9AuthorizationDocument> i9AuthorizationDocumentsObject) {
            Utils.checkNotNull(i9AuthorizationDocumentsObject, "i9AuthorizationDocumentsObject");
            this.i9AuthorizationDocumentsObject = Optional.ofNullable(i9AuthorizationDocumentsObject);
            return this;
        }

        /**
         * Example response
         */
        public Builder i9AuthorizationDocumentsObject(Optional<? extends List<I9AuthorizationDocument>> i9AuthorizationDocumentsObject) {
            Utils.checkNotNull(i9AuthorizationDocumentsObject, "i9AuthorizationDocumentsObject");
            this.i9AuthorizationDocumentsObject = i9AuthorizationDocumentsObject;
            return this;
        }
        
        public PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse build() {
            return new PutV1EmployeesEmployeeIdI9AuthorizationDocumentsResponse(
                contentType,
                statusCode,
                rawResponse,
                i9AuthorizationDocumentsObject);
        }
    }
}

