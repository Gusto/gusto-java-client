/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api;

import com.fasterxml.jackson.core.type.TypeReference;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.APIException;
import com.gusto.embedded_api.models.operations.GetV1CompaniesAttachmentUrlRequest;
import com.gusto.embedded_api.models.operations.GetV1CompaniesAttachmentUrlRequestBuilder;
import com.gusto.embedded_api.models.operations.GetV1CompaniesAttachmentUrlResponse;
import com.gusto.embedded_api.models.operations.GetV1CompaniesAttachmentUrlResponseBody;
import com.gusto.embedded_api.models.operations.SDKMethodInterfaces.*;
import com.gusto.embedded_api.utils.HTTPClient;
import com.gusto.embedded_api.utils.HTTPRequest;
import com.gusto.embedded_api.utils.Hook.AfterErrorContextImpl;
import com.gusto.embedded_api.utils.Hook.AfterSuccessContextImpl;
import com.gusto.embedded_api.utils.Hook.BeforeRequestContextImpl;
import com.gusto.embedded_api.utils.Utils;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Optional; 

public class CompanyAttachment implements
            MethodCallGetV1CompaniesAttachmentUrl {

    private final SDKConfiguration sdkConfiguration;

    CompanyAttachment(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get a temporary url to download the Company Attachment file
     * 
     * <p>Retrieve a temporary url to download a attachment file uploaded
     * by the company.
     * 
     * <p>scope: `company_attachments:read`
     * 
     * @return The call builder
     */
    public GetV1CompaniesAttachmentUrlRequestBuilder getDownloadUrl() {
        return new GetV1CompaniesAttachmentUrlRequestBuilder(this);
    }

    /**
     * Get a temporary url to download the Company Attachment file
     * 
     * <p>Retrieve a temporary url to download a attachment file uploaded
     * by the company.
     * 
     * <p>scope: `company_attachments:read`
     * 
     * @param companyId The UUID of the company
     * @param companyAttachmentUuid The UUID of the company attachment
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1CompaniesAttachmentUrlResponse getDownloadUrl(
            String companyId,
            String companyAttachmentUuid) throws Exception {
        return getDownloadUrl(companyId, companyAttachmentUuid, Optional.empty());
    }
    
    /**
     * Get a temporary url to download the Company Attachment file
     * 
     * <p>Retrieve a temporary url to download a attachment file uploaded
     * by the company.
     * 
     * <p>scope: `company_attachments:read`
     * 
     * @param companyId The UUID of the company
     * @param companyAttachmentUuid The UUID of the company attachment
     * @param xGustoAPIVersion 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1CompaniesAttachmentUrlResponse getDownloadUrl(
            String companyId,
            String companyAttachmentUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetV1CompaniesAttachmentUrlRequest request =
            GetV1CompaniesAttachmentUrlRequest
                .builder()
                .companyId(companyId)
                .companyAttachmentUuid(companyAttachmentUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetV1CompaniesAttachmentUrlRequest.class,
                _baseUrl,
                "/v1/companies/{company_id}/attachments/{company_attachment_uuid}/download_url",
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
                      "get-v1-companies-attachment-url", 
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
                            "get-v1-companies-attachment-url",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            _baseUrl,
                            "get-v1-companies-attachment-url",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            _baseUrl,
                            "get-v1-companies-attachment-url",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetV1CompaniesAttachmentUrlResponse.Builder _resBuilder = 
            GetV1CompaniesAttachmentUrlResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetV1CompaniesAttachmentUrlResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                GetV1CompaniesAttachmentUrlResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<GetV1CompaniesAttachmentUrlResponseBody>() {});
                _res.withObject(Optional.ofNullable(_out));
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

}
