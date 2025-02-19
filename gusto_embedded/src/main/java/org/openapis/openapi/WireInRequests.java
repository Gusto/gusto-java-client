/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.components.WireInRequest;
import org.openapis.openapi.models.errors.APIException;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.GetCompaniesCompanyUuidWireInRequestUuidRequest;
import org.openapis.openapi.models.operations.GetCompaniesCompanyUuidWireInRequestUuidRequestBuilder;
import org.openapis.openapi.models.operations.GetCompaniesCompanyUuidWireInRequestUuidResponse;
import org.openapis.openapi.models.operations.GetWireInRequestsWireInRequestUuidRequest;
import org.openapis.openapi.models.operations.GetWireInRequestsWireInRequestUuidRequestBuilder;
import org.openapis.openapi.models.operations.GetWireInRequestsWireInRequestUuidResponse;
import org.openapis.openapi.models.operations.PutWireInRequestsWireInRequestUuidRequest;
import org.openapis.openapi.models.operations.PutWireInRequestsWireInRequestUuidRequestBody;
import org.openapis.openapi.models.operations.PutWireInRequestsWireInRequestUuidRequestBuilder;
import org.openapis.openapi.models.operations.PutWireInRequestsWireInRequestUuidResponse;
import org.openapis.openapi.models.operations.SDKMethodInterfaces.*;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.Hook.AfterErrorContextImpl;
import org.openapis.openapi.utils.Hook.AfterSuccessContextImpl;
import org.openapis.openapi.utils.Hook.BeforeRequestContextImpl;
import org.openapis.openapi.utils.SerializedBody;
import org.openapis.openapi.utils.Utils.JsonShape;
import org.openapis.openapi.utils.Utils; 

public class WireInRequests implements
            MethodCallGetWireInRequestsWireInRequestUuid,
            MethodCallPutWireInRequestsWireInRequestUuid,
            MethodCallGetCompaniesCompanyUuidWireInRequestUuid {

    private final SDKConfiguration sdkConfiguration;

    WireInRequests(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get a single Wire In Request
     * Fetch a Wire In Request.
     * 
     * scope: `payrolls:read`
     * @return The call builder
     */
    public GetWireInRequestsWireInRequestUuidRequestBuilder get() {
        return new GetWireInRequestsWireInRequestUuidRequestBuilder(this);
    }

    /**
     * Get a single Wire In Request
     * Fetch a Wire In Request.
     * 
     * scope: `payrolls:read`
     * @param wireInRequestUuid The UUID of the Wire In Request
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetWireInRequestsWireInRequestUuidResponse get(
            String wireInRequestUuid) throws Exception {
        return get(wireInRequestUuid, Optional.empty());
    }
    
    /**
     * Get a single Wire In Request
     * Fetch a Wire In Request.
     * 
     * scope: `payrolls:read`
     * @param wireInRequestUuid The UUID of the Wire In Request
     * @param xGustoAPIVersion
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetWireInRequestsWireInRequestUuidResponse get(
            String wireInRequestUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetWireInRequestsWireInRequestUuidRequest request =
            GetWireInRequestsWireInRequestUuidRequest
                .builder()
                .wireInRequestUuid(wireInRequestUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetWireInRequestsWireInRequestUuidRequest.class,
                _baseUrl,
                "/v1/wire_in_requests/{wire_in_request_uuid}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "get-wire_in_requests-wire_in_request_uuid", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get-wire_in_requests-wire_in_request_uuid",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "get-wire_in_requests-wire_in_request_uuid",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get-wire_in_requests-wire_in_request_uuid",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetWireInRequestsWireInRequestUuidResponse.Builder _resBuilder = 
            GetWireInRequestsWireInRequestUuidResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetWireInRequestsWireInRequestUuidResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                WireInRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<WireInRequest>() {});
                _res.withWireInRequest(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Submit a wire in request
     * Submit a wire in request for a payment
     * 
     * scope: `payrolls:run`
     * @return The call builder
     */
    public PutWireInRequestsWireInRequestUuidRequestBuilder submit() {
        return new PutWireInRequestsWireInRequestUuidRequestBuilder(this);
    }

    /**
     * Submit a wire in request
     * Submit a wire in request for a payment
     * 
     * scope: `payrolls:run`
     * @param wireInRequestUuid The UUID of the Wire In Request
     * @param requestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PutWireInRequestsWireInRequestUuidResponse submit(
            String wireInRequestUuid,
            PutWireInRequestsWireInRequestUuidRequestBody requestBody) throws Exception {
        return submit(wireInRequestUuid, Optional.empty(), requestBody);
    }
    
    /**
     * Submit a wire in request
     * Submit a wire in request for a payment
     * 
     * scope: `payrolls:run`
     * @param wireInRequestUuid The UUID of the Wire In Request
     * @param xGustoAPIVersion
     * @param requestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PutWireInRequestsWireInRequestUuidResponse submit(
            String wireInRequestUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutWireInRequestsWireInRequestUuidRequestBody requestBody) throws Exception {
        PutWireInRequestsWireInRequestUuidRequest request =
            PutWireInRequestsWireInRequestUuidRequest
                .builder()
                .wireInRequestUuid(wireInRequestUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                PutWireInRequestsWireInRequestUuidRequest.class,
                _baseUrl,
                "/v1/wire_in_requests/{wire_in_request_uuid}",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "PUT");
        Object _convertedRequest = Utils.convertToShape(
                request, 
                JsonShape.DEFAULT,
                new TypeReference<Object>() {});
        SerializedBody _serializedRequestBody = Utils.serializeRequestBody(
                _convertedRequest, 
                "requestBody",
                "json",
                false);
        if (_serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        _req.setBody(Optional.ofNullable(_serializedRequestBody));
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "put-wire_in_requests-wire_in_request_uuid", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "422", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "put-wire_in_requests-wire_in_request_uuid",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "put-wire_in_requests-wire_in_request_uuid",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "put-wire_in_requests-wire_in_request_uuid",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PutWireInRequestsWireInRequestUuidResponse.Builder _resBuilder = 
            PutWireInRequestsWireInRequestUuidResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        PutWireInRequestsWireInRequestUuidResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                WireInRequest _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<WireInRequest>() {});
                _res.withWireInRequest(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "422")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                UnprocessableEntityErrorObject _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<UnprocessableEntityErrorObject>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }



    /**
     * Get all Wire In Requests for a company
     * Fetches all Wire In Requests for a company.
     * 
     * scope: `payrolls:read`
     * @return The call builder
     */
    public GetCompaniesCompanyUuidWireInRequestUuidRequestBuilder list() {
        return new GetCompaniesCompanyUuidWireInRequestUuidRequestBuilder(this);
    }

    /**
     * Get all Wire In Requests for a company
     * Fetches all Wire In Requests for a company.
     * 
     * scope: `payrolls:read`
     * @param companyUuid The UUID of the company
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCompaniesCompanyUuidWireInRequestUuidResponse list(
            String companyUuid) throws Exception {
        return list(companyUuid, Optional.empty());
    }
    
    /**
     * Get all Wire In Requests for a company
     * Fetches all Wire In Requests for a company.
     * 
     * scope: `payrolls:read`
     * @param companyUuid The UUID of the company
     * @param xGustoAPIVersion
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetCompaniesCompanyUuidWireInRequestUuidResponse list(
            String companyUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetCompaniesCompanyUuidWireInRequestUuidRequest request =
            GetCompaniesCompanyUuidWireInRequestUuidRequest
                .builder()
                .companyUuid(companyUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetCompaniesCompanyUuidWireInRequestUuidRequest.class,
                _baseUrl,
                "/v1/companies/{company_uuid}/wire_in_requests",
                request, null);
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);
        _req.addHeaders(Utils.getHeadersFromMetadata(request, null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());
        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl(
                      "get-companies-company_uuid-wire_in_request_uuid", 
                      Optional.of(List.of()), 
                      _hookSecuritySource),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get-companies-company_uuid-wire_in_request_uuid",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "get-companies-company_uuid-wire_in_request_uuid",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get-companies-company_uuid-wire_in_request_uuid",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetCompaniesCompanyUuidWireInRequestUuidResponse.Builder _resBuilder = 
            GetCompaniesCompanyUuidWireInRequestUuidResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetCompaniesCompanyUuidWireInRequestUuidResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<WireInRequest> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<WireInRequest>>() {});
                _res.withWireInRequestList(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
