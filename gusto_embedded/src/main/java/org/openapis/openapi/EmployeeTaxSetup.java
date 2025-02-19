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
import org.openapis.openapi.models.components.EmployeeFederalTax;
import org.openapis.openapi.models.components.EmployeeStateTax;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.errors.APIException;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.GetV1EmployeesEmployeeIdFederalTaxesRequest;
import org.openapis.openapi.models.operations.GetV1EmployeesEmployeeIdFederalTaxesRequestBuilder;
import org.openapis.openapi.models.operations.GetV1EmployeesEmployeeIdFederalTaxesResponse;
import org.openapis.openapi.models.operations.GetV1EmployeesEmployeeIdStateTaxesRequest;
import org.openapis.openapi.models.operations.GetV1EmployeesEmployeeIdStateTaxesRequestBuilder;
import org.openapis.openapi.models.operations.GetV1EmployeesEmployeeIdStateTaxesResponse;
import org.openapis.openapi.models.operations.PutV1EmployeesEmployeeIdFederalTaxesRequest;
import org.openapis.openapi.models.operations.PutV1EmployeesEmployeeIdFederalTaxesRequestBody;
import org.openapis.openapi.models.operations.PutV1EmployeesEmployeeIdFederalTaxesRequestBuilder;
import org.openapis.openapi.models.operations.PutV1EmployeesEmployeeIdFederalTaxesResponse;
import org.openapis.openapi.models.operations.PutV1EmployeesEmployeeIdStateTaxesRequest;
import org.openapis.openapi.models.operations.PutV1EmployeesEmployeeIdStateTaxesRequestBody;
import org.openapis.openapi.models.operations.PutV1EmployeesEmployeeIdStateTaxesRequestBuilder;
import org.openapis.openapi.models.operations.PutV1EmployeesEmployeeIdStateTaxesResponse;
import org.openapis.openapi.models.operations.SDKMethodInterfaces.*;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.Hook.AfterErrorContextImpl;
import org.openapis.openapi.utils.Hook.AfterSuccessContextImpl;
import org.openapis.openapi.utils.Hook.BeforeRequestContextImpl;
import org.openapis.openapi.utils.SerializedBody;
import org.openapis.openapi.utils.Utils.JsonShape;
import org.openapis.openapi.utils.Utils; 

public class EmployeeTaxSetup implements
            MethodCallGetV1EmployeesEmployeeIdFederalTaxes,
            MethodCallPutV1EmployeesEmployeeIdFederalTaxes,
            MethodCallGetV1EmployeesEmployeeIdStateTaxes,
            MethodCallPutV1EmployeesEmployeeIdStateTaxes {

    private final SDKConfiguration sdkConfiguration;

    EmployeeTaxSetup(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get an employee's federal taxes
     * Get attributes relevant for an employee's federal taxes.
     * 
     *  scope: `employee_federal_taxes:read`
     * @return The call builder
     */
    public GetV1EmployeesEmployeeIdFederalTaxesRequestBuilder getFederalTaxes() {
        return new GetV1EmployeesEmployeeIdFederalTaxesRequestBuilder(this);
    }

    /**
     * Get an employee's federal taxes
     * Get attributes relevant for an employee's federal taxes.
     * 
     *  scope: `employee_federal_taxes:read`
     * @param employeeUuid The UUID of the employee
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1EmployeesEmployeeIdFederalTaxesResponse getFederalTaxes(
            String employeeUuid) throws Exception {
        return getFederalTaxes(employeeUuid, Optional.empty());
    }
    
    /**
     * Get an employee's federal taxes
     * Get attributes relevant for an employee's federal taxes.
     * 
     *  scope: `employee_federal_taxes:read`
     * @param employeeUuid The UUID of the employee
     * @param xGustoAPIVersion
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1EmployeesEmployeeIdFederalTaxesResponse getFederalTaxes(
            String employeeUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetV1EmployeesEmployeeIdFederalTaxesRequest request =
            GetV1EmployeesEmployeeIdFederalTaxesRequest
                .builder()
                .employeeUuid(employeeUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetV1EmployeesEmployeeIdFederalTaxesRequest.class,
                _baseUrl,
                "/v1/employees/{employee_uuid}/federal_taxes",
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
                      "get-v1-employees-employee_id-federal_taxes", 
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
                            "get-v1-employees-employee_id-federal_taxes",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "get-v1-employees-employee_id-federal_taxes",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get-v1-employees-employee_id-federal_taxes",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetV1EmployeesEmployeeIdFederalTaxesResponse.Builder _resBuilder = 
            GetV1EmployeesEmployeeIdFederalTaxesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetV1EmployeesEmployeeIdFederalTaxesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                EmployeeFederalTax _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<EmployeeFederalTax>() {});
                _res.withEmployeeFederalTax(Optional.ofNullable(_out));
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
     * Update an employee's federal taxes
     * Update attributes relevant for an employee's federal taxes.
     * 
     * scope: `employee_federal_taxes:write`
     * @return The call builder
     */
    public PutV1EmployeesEmployeeIdFederalTaxesRequestBuilder updateFederalTaxes() {
        return new PutV1EmployeesEmployeeIdFederalTaxesRequestBuilder(this);
    }

    /**
     * Update an employee's federal taxes
     * Update attributes relevant for an employee's federal taxes.
     * 
     * scope: `employee_federal_taxes:write`
     * @param employeeUuid The UUID of the employee
     * @param requestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PutV1EmployeesEmployeeIdFederalTaxesResponse updateFederalTaxes(
            String employeeUuid,
            PutV1EmployeesEmployeeIdFederalTaxesRequestBody requestBody) throws Exception {
        return updateFederalTaxes(employeeUuid, Optional.empty(), requestBody);
    }
    
    /**
     * Update an employee's federal taxes
     * Update attributes relevant for an employee's federal taxes.
     * 
     * scope: `employee_federal_taxes:write`
     * @param employeeUuid The UUID of the employee
     * @param xGustoAPIVersion
     * @param requestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PutV1EmployeesEmployeeIdFederalTaxesResponse updateFederalTaxes(
            String employeeUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutV1EmployeesEmployeeIdFederalTaxesRequestBody requestBody) throws Exception {
        PutV1EmployeesEmployeeIdFederalTaxesRequest request =
            PutV1EmployeesEmployeeIdFederalTaxesRequest
                .builder()
                .employeeUuid(employeeUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                PutV1EmployeesEmployeeIdFederalTaxesRequest.class,
                _baseUrl,
                "/v1/employees/{employee_uuid}/federal_taxes",
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
                      "put-v1-employees-employee_id-federal_taxes", 
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
                            "put-v1-employees-employee_id-federal_taxes",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "put-v1-employees-employee_id-federal_taxes",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "put-v1-employees-employee_id-federal_taxes",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PutV1EmployeesEmployeeIdFederalTaxesResponse.Builder _resBuilder = 
            PutV1EmployeesEmployeeIdFederalTaxesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        PutV1EmployeesEmployeeIdFederalTaxesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                EmployeeFederalTax _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<EmployeeFederalTax>() {});
                _res.withEmployeeFederalTax(Optional.ofNullable(_out));
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
     * Get an employee's state taxes
     * Get attributes relevant for an employee's state taxes.
     * 
     * The data required to correctly calculate an employee's state taxes varies by both home and work location. This API returns information about each question that must be answered grouped by state. Mostly commonly, an employee lives and works in the same state and will only have questions for a single state. The response contains metadata about each question, the type of answer expected, and the current answer stored in Gusto for that question.
     * 
     * Answers are represented by an array. Today, this array can only be empty or contain exactly one element, but is designed to allow for forward compatibility with effective-dated fields. Until effective dated answers are supported, the `valid_from` and `valid_up_to` must always be `"2010-01-01"` and `null` respectively.
     * 
     * ## About filing new hire reports
     * Payroll Admins are responsible for filing a new hire report for each Employee. The `file_new_hire_report` question will only be listed if:
     * - the `employee.onboarding_status` is one of the following:
     *   - `admin_onboarding_incomplete`
     *   - `self_onboarding_awaiting_admin_review`
     * - that employee's work state requires filing a new hire report
     * 
     * scope: `employee_state_taxes:read`
     * 
     * @return The call builder
     */
    public GetV1EmployeesEmployeeIdStateTaxesRequestBuilder getStateTaxes() {
        return new GetV1EmployeesEmployeeIdStateTaxesRequestBuilder(this);
    }

    /**
     * Get an employee's state taxes
     * Get attributes relevant for an employee's state taxes.
     * 
     * The data required to correctly calculate an employee's state taxes varies by both home and work location. This API returns information about each question that must be answered grouped by state. Mostly commonly, an employee lives and works in the same state and will only have questions for a single state. The response contains metadata about each question, the type of answer expected, and the current answer stored in Gusto for that question.
     * 
     * Answers are represented by an array. Today, this array can only be empty or contain exactly one element, but is designed to allow for forward compatibility with effective-dated fields. Until effective dated answers are supported, the `valid_from` and `valid_up_to` must always be `"2010-01-01"` and `null` respectively.
     * 
     * ## About filing new hire reports
     * Payroll Admins are responsible for filing a new hire report for each Employee. The `file_new_hire_report` question will only be listed if:
     * - the `employee.onboarding_status` is one of the following:
     *   - `admin_onboarding_incomplete`
     *   - `self_onboarding_awaiting_admin_review`
     * - that employee's work state requires filing a new hire report
     * 
     * scope: `employee_state_taxes:read`
     * 
     * @param employeeUuid The UUID of the employee
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1EmployeesEmployeeIdStateTaxesResponse getStateTaxes(
            String employeeUuid) throws Exception {
        return getStateTaxes(employeeUuid, Optional.empty());
    }
    
    /**
     * Get an employee's state taxes
     * Get attributes relevant for an employee's state taxes.
     * 
     * The data required to correctly calculate an employee's state taxes varies by both home and work location. This API returns information about each question that must be answered grouped by state. Mostly commonly, an employee lives and works in the same state and will only have questions for a single state. The response contains metadata about each question, the type of answer expected, and the current answer stored in Gusto for that question.
     * 
     * Answers are represented by an array. Today, this array can only be empty or contain exactly one element, but is designed to allow for forward compatibility with effective-dated fields. Until effective dated answers are supported, the `valid_from` and `valid_up_to` must always be `"2010-01-01"` and `null` respectively.
     * 
     * ## About filing new hire reports
     * Payroll Admins are responsible for filing a new hire report for each Employee. The `file_new_hire_report` question will only be listed if:
     * - the `employee.onboarding_status` is one of the following:
     *   - `admin_onboarding_incomplete`
     *   - `self_onboarding_awaiting_admin_review`
     * - that employee's work state requires filing a new hire report
     * 
     * scope: `employee_state_taxes:read`
     * 
     * @param employeeUuid The UUID of the employee
     * @param xGustoAPIVersion
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetV1EmployeesEmployeeIdStateTaxesResponse getStateTaxes(
            String employeeUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion) throws Exception {
        GetV1EmployeesEmployeeIdStateTaxesRequest request =
            GetV1EmployeesEmployeeIdStateTaxesRequest
                .builder()
                .employeeUuid(employeeUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                GetV1EmployeesEmployeeIdStateTaxesRequest.class,
                _baseUrl,
                "/v1/employees/{employee_uuid}/state_taxes",
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
                      "get-v1-employees-employee_id-state_taxes", 
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
                            "get-v1-employees-employee_id-state_taxes",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "get-v1-employees-employee_id-state_taxes",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "get-v1-employees-employee_id-state_taxes",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetV1EmployeesEmployeeIdStateTaxesResponse.Builder _resBuilder = 
            GetV1EmployeesEmployeeIdStateTaxesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetV1EmployeesEmployeeIdStateTaxesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<EmployeeStateTax> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<EmployeeStateTax>>() {});
                _res.withEmployeeStateTaxesList(Optional.ofNullable(_out));
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
     * Update an employee's state taxes
     * Update attributes relevant for an employee's state taxes.
     * 
     * As described for the GET endpoint, the answers must be supplied in the effective-dated format, but currently only a single answer will be accepted - `valid_from` and `valid_up_to` must be `"2010-01-01"` and `null` respectively.
     * 
     * scope: `employee_state_taxes:write`
     * @return The call builder
     */
    public PutV1EmployeesEmployeeIdStateTaxesRequestBuilder updateStateTaxes() {
        return new PutV1EmployeesEmployeeIdStateTaxesRequestBuilder(this);
    }

    /**
     * Update an employee's state taxes
     * Update attributes relevant for an employee's state taxes.
     * 
     * As described for the GET endpoint, the answers must be supplied in the effective-dated format, but currently only a single answer will be accepted - `valid_from` and `valid_up_to` must be `"2010-01-01"` and `null` respectively.
     * 
     * scope: `employee_state_taxes:write`
     * @param employeeUuid The UUID of the employee
     * @param requestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PutV1EmployeesEmployeeIdStateTaxesResponse updateStateTaxes(
            String employeeUuid,
            PutV1EmployeesEmployeeIdStateTaxesRequestBody requestBody) throws Exception {
        return updateStateTaxes(employeeUuid, Optional.empty(), requestBody);
    }
    
    /**
     * Update an employee's state taxes
     * Update attributes relevant for an employee's state taxes.
     * 
     * As described for the GET endpoint, the answers must be supplied in the effective-dated format, but currently only a single answer will be accepted - `valid_from` and `valid_up_to` must be `"2010-01-01"` and `null` respectively.
     * 
     * scope: `employee_state_taxes:write`
     * @param employeeUuid The UUID of the employee
     * @param xGustoAPIVersion
     * @param requestBody
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public PutV1EmployeesEmployeeIdStateTaxesResponse updateStateTaxes(
            String employeeUuid,
            Optional<? extends VersionHeader> xGustoAPIVersion,
            PutV1EmployeesEmployeeIdStateTaxesRequestBody requestBody) throws Exception {
        PutV1EmployeesEmployeeIdStateTaxesRequest request =
            PutV1EmployeesEmployeeIdStateTaxesRequest
                .builder()
                .employeeUuid(employeeUuid)
                .xGustoAPIVersion(xGustoAPIVersion)
                .requestBody(requestBody)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                PutV1EmployeesEmployeeIdStateTaxesRequest.class,
                _baseUrl,
                "/v1/employees/{employee_uuid}/state_taxes",
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
                      "put-v1-employees-employee_id-state_taxes", 
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
                            "put-v1-employees-employee_id-state_taxes",
                            Optional.of(List.of()),
                            _hookSecuritySource),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl(
                            "put-v1-employees-employee_id-state_taxes",
                            Optional.of(List.of()), 
                            _hookSecuritySource),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl(
                            "put-v1-employees-employee_id-state_taxes",
                            Optional.of(List.of()),
                            _hookSecuritySource), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        PutV1EmployeesEmployeeIdStateTaxesResponse.Builder _resBuilder = 
            PutV1EmployeesEmployeeIdStateTaxesResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        PutV1EmployeesEmployeeIdStateTaxesResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<EmployeeStateTax> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<EmployeeStateTax>>() {});
                _res.withEmployeeStateTaxesList(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "404", "422", "4XX")) {
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
