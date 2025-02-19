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
import org.openapis.openapi.models.components.Form1099;
import org.openapis.openapi.models.components.FormPdf;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.errors.APIException;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.GetV1ContractorFormPdfRequest;
import org.openapis.openapi.models.operations.GetV1ContractorFormPdfRequestBuilder;
import org.openapis.openapi.models.operations.GetV1ContractorFormPdfResponse;
import org.openapis.openapi.models.operations.GetV1ContractorFormRequest;
import org.openapis.openapi.models.operations.GetV1ContractorFormRequestBuilder;
import org.openapis.openapi.models.operations.GetV1ContractorFormResponse;
import org.openapis.openapi.models.operations.GetV1ContractorFormsRequest;
import org.openapis.openapi.models.operations.GetV1ContractorFormsRequestBuilder;
import org.openapis.openapi.models.operations.GetV1ContractorFormsResponse;
import org.openapis.openapi.models.operations.PostV1SandboxGenerate1099Request;
import org.openapis.openapi.models.operations.PostV1SandboxGenerate1099RequestBody;
import org.openapis.openapi.models.operations.PostV1SandboxGenerate1099RequestBuilder;
import org.openapis.openapi.models.operations.PostV1SandboxGenerate1099Response;
import org.openapis.openapi.models.operations.SDKMethodInterfaces.*;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.Hook.AfterErrorContextImpl;
import org.openapis.openapi.utils.Hook.AfterSuccessContextImpl;
import org.openapis.openapi.utils.Hook.BeforeRequestContextImpl;
import org.openapis.openapi.utils.SerializedBody;
import org.openapis.openapi.utils.Utils.JsonShape;
import org.openapis.openapi.utils.Utils; 

public class ContractorForms implements
            MethodCallGetV1ContractorForms,
            MethodCallGetV1ContractorForm,
            MethodCallGetV1ContractorFormPdf,
            MethodCallPostV1SandboxGenerate1099 {

    private final SDKConfiguration sdkConfiguration;

    ContractorForms(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get all contractor forms
     * Get a list of all contractor's forms
     * 
     * scope: `contractor_forms:read`
     * @return The call builder
     */
    public GetV1ContractorFormsRequestBuilder list() {
        return new GetV1ContractorFormsRequestBuilder(this);
    }

    /**
     * Get all contractor forms
     * Get a list of all contractor's forms
     * 
     * scope: `contractor_forms:read`
     * @param contractorUuid The UUID of the contractor
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1ContractorFormsResponse list(
            String contractorUuid) throws Exception {
        return list(contractorUuid, Optional.empty());
    }
    
    /**
     * Get all contractor forms
     * Get a list of all contractor's forms
     * 
     * scope: `contractor_forms:read`
     * @param contractorUuid The UUID of the contractor
     * @param xGustoAPIVersion
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1ContractorFormsResponse list(
            String contractorUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetV1ContractorFormsRequest request =
            GetV1ContractorFormsRequest
                .builder()
                .contractorUuid(contractorUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetV1ContractorFormsRequest.class,
                _baseUrl,
                "/v1/contractors/{contractor_uuid}/forms",
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
                      "get-v1-contractor-forms", 
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
                            "get-v1-contractor-forms",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "get-v1-contractor-forms",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get-v1-contractor-forms",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetV1ContractorFormsResponse.Builder _resBuilder = 
            GetV1ContractorFormsResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetV1ContractorFormsResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<Form1099> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<Form1099>>() {});
                _res.withForm1099s(Optional.ofNullable(_out));
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
     * Get a contractor form
     * Get a contractor form
     * 
     * scope: `contractor_forms:read`
     * @return The call builder
     */
    public GetV1ContractorFormRequestBuilder get() {
        return new GetV1ContractorFormRequestBuilder(this);
    }

    /**
     * Get a contractor form
     * Get a contractor form
     * 
     * scope: `contractor_forms:read`
     * @param contractorUuid The UUID of the contractor
     * @param formId The UUID of the form
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1ContractorFormResponse get(
            String contractorUuid,
            String formId) throws Exception {
        return get(contractorUuid, formId, Optional.empty());
    }
    
    /**
     * Get a contractor form
     * Get a contractor form
     * 
     * scope: `contractor_forms:read`
     * @param contractorUuid The UUID of the contractor
     * @param formId The UUID of the form
     * @param xGustoAPIVersion
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1ContractorFormResponse get(
            String contractorUuid,
            String formId,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetV1ContractorFormRequest request =
            GetV1ContractorFormRequest
                .builder()
                .contractorUuid(contractorUuid)
                .formId(formId)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetV1ContractorFormRequest.class,
                _baseUrl,
                "/v1/contractors/{contractor_uuid}/forms/{form_id}",
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
                      "get-v1-contractor-form", 
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
                            "get-v1-contractor-form",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "get-v1-contractor-form",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get-v1-contractor-form",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetV1ContractorFormResponse.Builder _resBuilder = 
            GetV1ContractorFormResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetV1ContractorFormResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Form1099 _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Form1099>() {});
                _res.withForm1099(Optional.ofNullable(_out));
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
     * Get the contractor form pdf
     * Get the link to the form PDF
     * 
     * scope: `contractor_forms:read`
     * @return The call builder
     */
    public GetV1ContractorFormPdfRequestBuilder getPdf() {
        return new GetV1ContractorFormPdfRequestBuilder(this);
    }

    /**
     * Get the contractor form pdf
     * Get the link to the form PDF
     * 
     * scope: `contractor_forms:read`
     * @param contractorUuid The UUID of the contractor
     * @param formId The UUID of the form
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1ContractorFormPdfResponse getPdf(
            String contractorUuid,
            String formId) throws Exception {
        return getPdf(contractorUuid, formId, Optional.empty());
    }
    
    /**
     * Get the contractor form pdf
     * Get the link to the form PDF
     * 
     * scope: `contractor_forms:read`
     * @param contractorUuid The UUID of the contractor
     * @param formId The UUID of the form
     * @param xGustoAPIVersion
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1ContractorFormPdfResponse getPdf(
            String contractorUuid,
            String formId,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetV1ContractorFormPdfRequest request =
            GetV1ContractorFormPdfRequest
                .builder()
                .contractorUuid(contractorUuid)
                .formId(formId)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetV1ContractorFormPdfRequest.class,
                _baseUrl,
                "/v1/contractors/{contractor_uuid}/forms/{form_id}/pdf",
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
                      "get-v1-contractor-form-pdf", 
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
                            "get-v1-contractor-form-pdf",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "get-v1-contractor-form-pdf",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get-v1-contractor-form-pdf",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetV1ContractorFormPdfResponse.Builder _resBuilder = 
            GetV1ContractorFormPdfResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetV1ContractorFormPdfResponse _res = _resBuilder.build();
        
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
     * Generate a 1099 form [DEMO]
     * &gt; 🚧 Demo action
     * &gt;
     * &gt; This action is only available in the Demo environment
     * 
     * Generates a 1099 document for testing purposes.
     * 
     * scope: `contractors:write`
     * @return The call builder
     */
    public PostV1SandboxGenerate1099RequestBuilder generate1099() {
        return new PostV1SandboxGenerate1099RequestBuilder(this);
    }

    /**
     * Generate a 1099 form [DEMO]
     * &gt; 🚧 Demo action
     * &gt;
     * &gt; This action is only available in the Demo environment
     * 
     * Generates a 1099 document for testing purposes.
     * 
     * scope: `contractors:write`
     * @param requestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PostV1SandboxGenerate1099Response generate1099(
            PostV1SandboxGenerate1099RequestBody requestBody) throws Exception {
        return generate1099(Optional.empty(), requestBody);
    }
    
    /**
     * Generate a 1099 form [DEMO]
     * &gt; 🚧 Demo action
     * &gt;
     * &gt; This action is only available in the Demo environment
     * 
     * Generates a 1099 document for testing purposes.
     * 
     * scope: `contractors:write`
     * @param xGustoAPIVersion
     * @param requestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PostV1SandboxGenerate1099Response generate1099(
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PostV1SandboxGenerate1099RequestBody requestBody) throws Exception {
        PostV1SandboxGenerate1099Request request =
            PostV1SandboxGenerate1099Request
                .builder()
                .xGustoAPIVersion(xGustoAPIVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/v1/sandbox/generate_1099");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
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
                      "post-v1-sandbox-generate_1099", 
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
                            "post-v1-sandbox-generate_1099",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "post-v1-sandbox-generate_1099",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "post-v1-sandbox-generate_1099",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PostV1SandboxGenerate1099Response.Builder _resBuilder = 
            PostV1SandboxGenerate1099Response
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        PostV1SandboxGenerate1099Response _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                Form1099 _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<Form1099>() {});
                _res.withForm1099(Optional.ofNullable(_out));
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
