# TreasuryTippedOccupationCodes

## Overview

### Available Operations

* [getCompaniesCompanyUuidTreasuryTippedOccupationCodes](#getcompaniescompanyuuidtreasurytippedoccupationcodes) - Get Treasury Tipped Occupation Codes

## getCompaniesCompanyUuidTreasuryTippedOccupationCodes

Returns the full list of 71 U.S. Treasury Tipped Occupation Codes (TTOCs),
optionally filtered by category. Reference data; the response is identical
across companies and cached for one day (Cache-Control: max-age=86400).

scope: `jobs:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-companies-company_uuid-treasury_tipped_occupation_codes" method="get" path="/v1/companies/{company_uuid}/treasury_tipped_occupation_codes" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2026_06_15.GustoEmbedded;
import com.gusto.embedded_api_v_2026_06_15.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetCompaniesCompanyUuidTreasuryTippedOccupationCodesHeaderXGustoAPIVersion;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetCompaniesCompanyUuidTreasuryTippedOccupationCodesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetCompaniesCompanyUuidTreasuryTippedOccupationCodesResponse res = sdk.treasuryTippedOccupationCodes().getCompaniesCompanyUuidTreasuryTippedOccupationCodes()
                .xGustoAPIVersion(GetCompaniesCompanyUuidTreasuryTippedOccupationCodesHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_SIX_MINUS06_MINUS15)
                .companyUuid("<id>")
                .call();

        if (res.treasuryTippedOccupationCodeList().isPresent()) {
            System.out.println(res.treasuryTippedOccupationCodeList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                               | Type                                                                                                                                                                                                                                    | Required                                                                                                                                                                                                                                | Description                                                                                                                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                                      | [Optional\<GetCompaniesCompanyUuidTreasuryTippedOccupationCodesHeaderXGustoAPIVersion>](../../models/operations/GetCompaniesCompanyUuidTreasuryTippedOccupationCodesHeaderXGustoAPIVersion.md)                                          | :heavy_minus_sign:                                                                                                                                                                                                                      | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.            |
| `companyUuid`                                                                                                                                                                                                                           | *String*                                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                                      | The UUID of the company                                                                                                                                                                                                                 |
| `category`                                                                                                                                                                                                                              | *Optional\<String>*                                                                                                                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                                      | Optional category filter. One of: Beverage & Food Service, Entertainment & Events, Hospitality & Guest Services, Home Services, Personal Services, Personal Appearance & Wellness, Recreation & Instruction, Transportation & Delivery. |

### Response

**[GetCompaniesCompanyUuidTreasuryTippedOccupationCodesResponse](../../models/operations/GetCompaniesCompanyUuidTreasuryTippedOccupationCodesResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |