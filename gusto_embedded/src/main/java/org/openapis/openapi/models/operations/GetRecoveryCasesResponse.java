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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapis.openapi.models.components.RecoveryCase;
import org.openapis.openapi.utils.Response;
import org.openapis.openapi.utils.Utils;


public class GetRecoveryCasesResponse implements Response {

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
    private Optional<? extends List<RecoveryCase>> recoveryCaseList;

    @JsonCreator
    public GetRecoveryCasesResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<RecoveryCase>> recoveryCaseList) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(recoveryCaseList, "recoveryCaseList");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.recoveryCaseList = recoveryCaseList;
    }
    
    public GetRecoveryCasesResponse(
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
    public Optional<List<RecoveryCase>> recoveryCaseList() {
        return (Optional<List<RecoveryCase>>) recoveryCaseList;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetRecoveryCasesResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetRecoveryCasesResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetRecoveryCasesResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public GetRecoveryCasesResponse withRecoveryCaseList(List<RecoveryCase> recoveryCaseList) {
        Utils.checkNotNull(recoveryCaseList, "recoveryCaseList");
        this.recoveryCaseList = Optional.ofNullable(recoveryCaseList);
        return this;
    }

    /**
     * Example response
     */
    public GetRecoveryCasesResponse withRecoveryCaseList(Optional<? extends List<RecoveryCase>> recoveryCaseList) {
        Utils.checkNotNull(recoveryCaseList, "recoveryCaseList");
        this.recoveryCaseList = recoveryCaseList;
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
        GetRecoveryCasesResponse other = (GetRecoveryCasesResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.recoveryCaseList, other.recoveryCaseList);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            recoveryCaseList);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRecoveryCasesResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "recoveryCaseList", recoveryCaseList);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends List<RecoveryCase>> recoveryCaseList = Optional.empty();  
        
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
        public Builder recoveryCaseList(List<RecoveryCase> recoveryCaseList) {
            Utils.checkNotNull(recoveryCaseList, "recoveryCaseList");
            this.recoveryCaseList = Optional.ofNullable(recoveryCaseList);
            return this;
        }

        /**
         * Example response
         */
        public Builder recoveryCaseList(Optional<? extends List<RecoveryCase>> recoveryCaseList) {
            Utils.checkNotNull(recoveryCaseList, "recoveryCaseList");
            this.recoveryCaseList = recoveryCaseList;
            return this;
        }
        
        public GetRecoveryCasesResponse build() {
            return new GetRecoveryCasesResponse(
                contentType,
                statusCode,
                rawResponse,
                recoveryCaseList);
        }
    }
}

