/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.APIException;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyIdFederalTaxDetailsRequest;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyIdFederalTaxDetailsRequestBuilder;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyIdFederalTaxDetailsResponse;
import com.gusto.embedded_api.models.operations.PutV1CompaniesCompanyIdFederalTaxDetailsRequest;
import com.gusto.embedded_api.models.operations.PutV1CompaniesCompanyIdFederalTaxDetailsRequestBody;
import com.gusto.embedded_api.models.operations.PutV1CompaniesCompanyIdFederalTaxDetailsRequestBuilder;
import com.gusto.embedded_api.models.operations.PutV1CompaniesCompanyIdFederalTaxDetailsResponse;
import com.gusto.embedded_api.models.operations.SDKMethodInterfaces.*;
import com.gusto.embedded_api.utils.HTTPClient;
import com.gusto.embedded_api.utils.HTTPRequest;
import com.gusto.embedded_api.utils.Hook.AfterErrorContextImpl;
import com.gusto.embedded_api.utils.Hook.AfterSuccessContextImpl;
import com.gusto.embedded_api.utils.Hook.BeforeRequestContextImpl;
import com.gusto.embedded_api.utils.SerializedBody;
import com.gusto.embedded_api.utils.Utils.JsonShape;
import com.gusto.embedded_api.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class FederalTaxDetails implements
            MethodCallGetV1CompaniesCompanyIdFederalTaxDetails,
            MethodCallPutV1CompaniesCompanyIdFederalTaxDetails {

    private final SDKConfiguration sdkConfiguration;

    FederalTaxDetails(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get Federal Tax Details
     * 
     * <p>Fetches attributes relevant for a company's federal taxes.
     * 
     * <p>scope: `company_federal_taxes:read`
     * 
     * @return The call builder
     */
    public GetV1CompaniesCompanyIdFederalTaxDetailsRequestBuilder get() {
        return new GetV1CompaniesCompanyIdFederalTaxDetailsRequestBuilder(this);
    }

    /**
     * Get Federal Tax Details
     * 
     * <p>Fetches attributes relevant for a company's federal taxes.
     * 
     * <p>scope: `company_federal_taxes:read`
     * 
     * @param companyId The UUID of the company
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1CompaniesCompanyIdFederalTaxDetailsResponse get(
            String companyId) throws Exception {
        return get(companyId, Optional.empty());
    }
    
    /**
     * Get Federal Tax Details
     * 
     * <p>Fetches attributes relevant for a company's federal taxes.
     * 
     * <p>scope: `company_federal_taxes:read`
     * 
     * @param companyId The UUID of the company
     * @param xGustoAPIVersion 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1CompaniesCompanyIdFederalTaxDetailsResponse get(
            String companyId,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetV1CompaniesCompanyIdFederalTaxDetailsRequest request =
            GetV1CompaniesCompanyIdFederalTaxDetailsRequest
                .builder()
                .companyId(companyId)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetV1CompaniesCompanyIdFederalTaxDetailsRequest.class,
                _baseUrl,
                "/v1/companies/{company_id}/federal_tax_details",
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
                      _baseUrl,
                      "get-v1-companies-company_id-federal_tax_details", 
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
                            _baseUrl,
                            "get-v1-companies-company_id-federal_tax_details",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "get-v1-companies-company_id-federal_tax_details",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "get-v1-companies-company_id-federal_tax_details",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetV1CompaniesCompanyIdFederalTaxDetailsResponse.Builder _resBuilder = 
            GetV1CompaniesCompanyIdFederalTaxDetailsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetV1CompaniesCompanyIdFederalTaxDetailsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.gusto.embedded_api.models.components.FederalTaxDetails _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.gusto.embedded_api.models.components.FederalTaxDetails>() {});
                _res.withFederalTaxDetails(Optional.ofNullable(_out));
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
     * Update Federal Tax Details
     * 
     * <p>Updates attributes relevant for a company's federal taxes.
     * This information is required is to onboard a company for use with Gusto Embedded Payroll.
     * 
     * <p>scope: `company_federal_taxes:write`
     * 
     * @return The call builder
     */
    public PutV1CompaniesCompanyIdFederalTaxDetailsRequestBuilder update() {
        return new PutV1CompaniesCompanyIdFederalTaxDetailsRequestBuilder(this);
    }

    /**
     * Update Federal Tax Details
     * 
     * <p>Updates attributes relevant for a company's federal taxes.
     * This information is required is to onboard a company for use with Gusto Embedded Payroll.
     * 
     * <p>scope: `company_federal_taxes:write`
     * 
     * @param companyId The UUID of the company
     * @param requestBody Attributes related to federal tax details that can be updated via this endpoint include:
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PutV1CompaniesCompanyIdFederalTaxDetailsResponse update(
            String companyId,
            PutV1CompaniesCompanyIdFederalTaxDetailsRequestBody requestBody) throws Exception {
        return update(companyId, Optional.empty(), requestBody);
    }
    
    /**
     * Update Federal Tax Details
     * 
     * <p>Updates attributes relevant for a company's federal taxes.
     * This information is required is to onboard a company for use with Gusto Embedded Payroll.
     * 
     * <p>scope: `company_federal_taxes:write`
     * 
     * @param companyId The UUID of the company
     * @param xGustoAPIVersion 
     * @param requestBody Attributes related to federal tax details that can be updated via this endpoint include:
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PutV1CompaniesCompanyIdFederalTaxDetailsResponse update(
            String companyId,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutV1CompaniesCompanyIdFederalTaxDetailsRequestBody requestBody) throws Exception {
        PutV1CompaniesCompanyIdFederalTaxDetailsRequest request =
            PutV1CompaniesCompanyIdFederalTaxDetailsRequest
                .builder()
                .companyId(companyId)
                .xGustoAPIVersion(xGustoAPIVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                PutV1CompaniesCompanyIdFederalTaxDetailsRequest.class,
                _baseUrl,
                "/v1/companies/{company_id}/federal_tax_details",
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
                      _baseUrl,
                      "put-v1-companies-company_id-federal_tax_details", 
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
                            _baseUrl,
                            "put-v1-companies-company_id-federal_tax_details",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "put-v1-companies-company_id-federal_tax_details",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "put-v1-companies-company_id-federal_tax_details",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PutV1CompaniesCompanyIdFederalTaxDetailsResponse.Builder _resBuilder = 
            PutV1CompaniesCompanyIdFederalTaxDetailsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        PutV1CompaniesCompanyIdFederalTaxDetailsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                com.gusto.embedded_api.models.components.FederalTaxDetails _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<com.gusto.embedded_api.models.components.FederalTaxDetails>() {});
                _res.withFederalTaxDetails(Optional.ofNullable(_out));
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

}
