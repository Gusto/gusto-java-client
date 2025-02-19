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
import org.openapis.openapi.models.components.I9Authorization;
import org.openapis.openapi.utils.Response;
import org.openapis.openapi.utils.Utils;


public class PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse implements Response {

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
    private Optional<? extends I9Authorization> i9Authorization;

    @JsonCreator
    public PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends I9Authorization> i9Authorization) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(i9Authorization, "i9Authorization");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.i9Authorization = i9Authorization;
    }
    
    public PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse(
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
    public Optional<I9Authorization> i9Authorization() {
        return (Optional<I9Authorization>) i9Authorization;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse withI9Authorization(I9Authorization i9Authorization) {
        Utils.checkNotNull(i9Authorization, "i9Authorization");
        this.i9Authorization = Optional.ofNullable(i9Authorization);
        return this;
    }

    /**
     * Example response
     */
    public PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse withI9Authorization(Optional<? extends I9Authorization> i9Authorization) {
        Utils.checkNotNull(i9Authorization, "i9Authorization");
        this.i9Authorization = i9Authorization;
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
        PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse other = (PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.i9Authorization, other.i9Authorization);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            i9Authorization);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "i9Authorization", i9Authorization);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends I9Authorization> i9Authorization = Optional.empty();  
        
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
        public Builder i9Authorization(I9Authorization i9Authorization) {
            Utils.checkNotNull(i9Authorization, "i9Authorization");
            this.i9Authorization = Optional.ofNullable(i9Authorization);
            return this;
        }

        /**
         * Example response
         */
        public Builder i9Authorization(Optional<? extends I9Authorization> i9Authorization) {
            Utils.checkNotNull(i9Authorization, "i9Authorization");
            this.i9Authorization = i9Authorization;
            return this;
        }
        
        public PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse build() {
            return new PutV1EmployeesEmployeeIdI9AuthorizationEmployerSignResponse(
                contentType,
                statusCode,
                rawResponse,
                i9Authorization);
        }
    }
}

