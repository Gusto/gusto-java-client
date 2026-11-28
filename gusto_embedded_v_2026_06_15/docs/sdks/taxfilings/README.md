# TaxFilings

## Overview

### Available Operations

* [getTaxFilings](#gettaxfilings) - Get all tax filings for a company
* [getTaxFiling](#gettaxfiling) - Get a tax filing for a company

## getTaxFilings

Fetches all tax filing obligations for a company.

scope: `tax_filings:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-tax-filings" method="get" path="/v1/companies/{company_uuid}/tax_filings" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2026_06_15.GustoEmbedded;
import com.gusto.embedded_api_v_2026_06_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2026_06_15.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetTaxFilingsRequest;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetTaxFilingsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetTaxFilingsRequest req = GetTaxFilingsRequest.builder()
                .companyUuid("<id>")
                .sortBy("period_start:asc")
                .build();

        GetTaxFilingsResponse res = sdk.taxFilings().getTaxFilings()
                .request(req)
                .call();

        if (res.taxFilingList().isPresent()) {
            System.out.println(res.taxFilingList().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetTaxFilingsRequest](../../models/operations/GetTaxFilingsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetTaxFilingsResponse](../../models/operations/GetTaxFilingsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## getTaxFiling

Fetches a single tax filing obligation for a company by UUID.

scope: `tax_filings:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-tax-filing" method="get" path="/v1/companies/{company_uuid}/tax_filings/{uuid}" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2026_06_15.GustoEmbedded;
import com.gusto.embedded_api_v_2026_06_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetTaxFilingHeaderXGustoAPIVersion;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetTaxFilingResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetTaxFilingResponse res = sdk.taxFilings().getTaxFiling()
                .xGustoAPIVersion(GetTaxFilingHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_SIX_MINUS06_MINUS15)
                .companyUuid("<id>")
                .uuid("3ed1e5d8-2fdf-462e-a315-75ac18749bb8")
                .call();

        if (res.taxFiling().isPresent()) {
            System.out.println(res.taxFiling().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetTaxFilingHeaderXGustoAPIVersion>](../../models/operations/GetTaxFilingHeaderXGustoAPIVersion.md)                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `uuid`                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the tax filing                                                                                                                                                                                                   |

### Response

**[GetTaxFilingResponse](../../models/operations/GetTaxFilingResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |