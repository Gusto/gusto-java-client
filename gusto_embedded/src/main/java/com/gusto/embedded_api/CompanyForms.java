/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.Form;
import com.gusto.embedded_api.models.components.FormPdf;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.APIException;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormPdfRequest;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormPdfRequestBuilder;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormPdfResponse;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormRequest;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormRequestBuilder;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormResponse;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormsRequest;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormsRequestBuilder;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormsResponse;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignRequest;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignRequestBody;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignRequestBuilder;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignResponse;
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

public class CompanyForms implements
            MethodCallGetV1CompanyForms,
            MethodCallGetV1CompanyForm,
            MethodCallGetV1CompanyFormPdf,
            MethodCallPutV1CompanyFormSign {

    private final SDKConfiguration sdkConfiguration;

    CompanyForms(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get all company forms
     * 
     * <p>Get a list of all company's forms
     * 
     * <p>scope: `company_forms:read`
     * 
     * @return The call builder
     */
    public GetV1CompanyFormsRequestBuilder getAll() {
        return new GetV1CompanyFormsRequestBuilder(this);
    }

    /**
     * Get all company forms
     * 
     * <p>Get a list of all company's forms
     * 
     * <p>scope: `company_forms:read`
     * 
     * @param companyId The UUID of the company
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1CompanyFormsResponse getAll(
            String companyId) throws Exception {
        return getAll(companyId, Optional.empty());
    }
    
    /**
     * Get all company forms
     * 
     * <p>Get a list of all company's forms
     * 
     * <p>scope: `company_forms:read`
     * 
     * @param companyId The UUID of the company
     * @param xGustoAPIVersion 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1CompanyFormsResponse getAll(
            String companyId,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetV1CompanyFormsRequest request =
            GetV1CompanyFormsRequest
                .builder()
                .companyId(companyId)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetV1CompanyFormsRequest.class,
                _baseUrl,
                "/v1/companies/{company_id}/forms",
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
                      "get-v1-company-forms", 
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
                            "get-v1-company-forms",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "get-v1-company-forms",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "get-v1-company-forms",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetV1CompanyFormsResponse.Builder _resBuilder = 
            GetV1CompanyFormsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetV1CompanyFormsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<Form> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<Form>>() {});
                _res.withFormList(Optional.ofNullable(_out));
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
     * Get a company form
     * 
     * <p>Get a company form
     * 
     * <p>scope: `company_forms:read`
     * 
     * @return The call builder
     */
    public GetV1CompanyFormRequestBuilder get() {
        return new GetV1CompanyFormRequestBuilder(this);
    }

    /**
     * Get a company form
     * 
     * <p>Get a company form
     * 
     * <p>scope: `company_forms:read`
     * 
     * @param formId The UUID of the form
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1CompanyFormResponse get(
            String formId) throws Exception {
        return get(formId, Optional.empty());
    }
    
    /**
     * Get a company form
     * 
     * <p>Get a company form
     * 
     * <p>scope: `company_forms:read`
     * 
     * @param formId The UUID of the form
     * @param xGustoAPIVersion 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1CompanyFormResponse get(
            String formId,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetV1CompanyFormRequest request =
            GetV1CompanyFormRequest
                .builder()
                .formId(formId)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetV1CompanyFormRequest.class,
                _baseUrl,
                "/v1/forms/{form_id}",
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
                      "get-v1-company-form", 
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
                            "get-v1-company-form",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "get-v1-company-form",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "get-v1-company-form",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetV1CompanyFormResponse.Builder _resBuilder = 
            GetV1CompanyFormResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetV1CompanyFormResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Form _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Form>() {});
                _res.withForm(Optional.ofNullable(_out));
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
     * Get a company form pdf
     * 
     * <p>Get the link to the form PDF
     * 
     * <p>scope: `company_forms:read`
     * 
     * @return The call builder
     */
    public GetV1CompanyFormPdfRequestBuilder getPdf() {
        return new GetV1CompanyFormPdfRequestBuilder(this);
    }

    /**
     * Get a company form pdf
     * 
     * <p>Get the link to the form PDF
     * 
     * <p>scope: `company_forms:read`
     * 
     * @param formId The UUID of the form
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1CompanyFormPdfResponse getPdf(
            String formId) throws Exception {
        return getPdf(formId, Optional.empty());
    }
    
    /**
     * Get a company form pdf
     * 
     * <p>Get the link to the form PDF
     * 
     * <p>scope: `company_forms:read`
     * 
     * @param formId The UUID of the form
     * @param xGustoAPIVersion 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1CompanyFormPdfResponse getPdf(
            String formId,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetV1CompanyFormPdfRequest request =
            GetV1CompanyFormPdfRequest
                .builder()
                .formId(formId)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetV1CompanyFormPdfRequest.class,
                _baseUrl,
                "/v1/forms/{form_id}/pdf",
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
                      "get-v1-company-form-pdf", 
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
                            "get-v1-company-form-pdf",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "get-v1-company-form-pdf",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "get-v1-company-form-pdf",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetV1CompanyFormPdfResponse.Builder _resBuilder = 
            GetV1CompanyFormPdfResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetV1CompanyFormPdfResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                FormPdf _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<FormPdf>() {});
                _res.withFormPdf(Optional.ofNullable(_out));
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
     * Sign a company form
     * 
     * <p>Sign a company form. Company forms must be signed by the company signatory.
     * 
     * <p>scope: `company_forms:sign`
     * 
     * @return The call builder
     */
    public PutV1CompanyFormSignRequestBuilder sign() {
        return new PutV1CompanyFormSignRequestBuilder(this);
    }

    /**
     * Sign a company form
     * 
     * <p>Sign a company form. Company forms must be signed by the company signatory.
     * 
     * <p>scope: `company_forms:sign`
     * 
     * @param formId The UUID of the form
     * @param requestBody 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PutV1CompanyFormSignResponse sign(
            String formId,
            PutV1CompanyFormSignRequestBody requestBody) throws Exception {
        return sign(formId, Optional.empty(), Optional.empty(), requestBody);
    }
    
    /**
     * Sign a company form
     * 
     * <p>Sign a company form. Company forms must be signed by the company signatory.
     * 
     * <p>scope: `company_forms:sign`
     * 
     * @param formId The UUID of the form
     * @param xGustoClientIp Optional header to supply the IP address. This can be used to supply the IP address for signature endpoints instead of the signed_by_ip_address parameter.
     * @param xGustoAPIVersion 
     * @param requestBody 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PutV1CompanyFormSignResponse sign(
            String formId,
            Optional<String> xGustoClientIp,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutV1CompanyFormSignRequestBody requestBody) throws Exception {
        PutV1CompanyFormSignRequest request =
            PutV1CompanyFormSignRequest
                .builder()
                .formId(formId)
                .xGustoClientIp(xGustoClientIp)
                .xGustoAPIVersion(xGustoAPIVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                PutV1CompanyFormSignRequest.class,
                _baseUrl,
                "/v1/forms/{form_id}/sign",
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
                      "put-v1-company-form-sign", 
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
                            "put-v1-company-form-sign",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "put-v1-company-form-sign",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "put-v1-company-form-sign",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PutV1CompanyFormSignResponse.Builder _resBuilder = 
            PutV1CompanyFormSignResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        PutV1CompanyFormSignResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Form _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Form>() {});
                _res.withForm(Optional.ofNullable(_out));
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
