/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package com.gusto.embedded_api.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gusto.embedded_api.models.components.PayScheduleObject;
import com.gusto.embedded_api.utils.Response;
import com.gusto.embedded_api.utils.Utils;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;

public class GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse implements Response {

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
    private Optional<? extends PayScheduleObject> payScheduleObject;

    @JsonCreator
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends PayScheduleObject> payScheduleObject) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(payScheduleObject, "payScheduleObject");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.payScheduleObject = payScheduleObject;
    }
    
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse(
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
    public Optional<PayScheduleObject> payScheduleObject() {
        return (Optional<PayScheduleObject>) payScheduleObject;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Example response
     */
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse withPayScheduleObject(PayScheduleObject payScheduleObject) {
        Utils.checkNotNull(payScheduleObject, "payScheduleObject");
        this.payScheduleObject = Optional.ofNullable(payScheduleObject);
        return this;
    }

    /**
     * Example response
     */
    public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse withPayScheduleObject(Optional<? extends PayScheduleObject> payScheduleObject) {
        Utils.checkNotNull(payScheduleObject, "payScheduleObject");
        this.payScheduleObject = payScheduleObject;
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
        GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse other = (GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.payScheduleObject, other.payScheduleObject);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            payScheduleObject);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "payScheduleObject", payScheduleObject);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends PayScheduleObject> payScheduleObject = Optional.empty();  
        
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
        public Builder payScheduleObject(PayScheduleObject payScheduleObject) {
            Utils.checkNotNull(payScheduleObject, "payScheduleObject");
            this.payScheduleObject = Optional.ofNullable(payScheduleObject);
            return this;
        }

        /**
         * Example response
         */
        public Builder payScheduleObject(Optional<? extends PayScheduleObject> payScheduleObject) {
            Utils.checkNotNull(payScheduleObject, "payScheduleObject");
            this.payScheduleObject = payScheduleObject;
            return this;
        }
        
        public GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse build() {
            return new GetV1CompaniesCompanyIdPaySchedulesPayScheduleIdResponse(
                contentType,
                statusCode,
                rawResponse,
                payScheduleObject);
        }
    }
}

