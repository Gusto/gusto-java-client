# TaxPayments

## Overview

### Available Operations

* [getTaxPayments](#gettaxpayments) - Get all tax payments for a company
* [getTaxPayment](#gettaxpayment) - Get a tax payment for a company

## getTaxPayments

Fetches all tax payments Gusto has made (or scheduled) to tax agencies on behalf of a company.

scope: `tax_payments:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-tax-payments" method="get" path="/v1/companies/{company_uuid}/tax_payments" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2026_06_15.GustoEmbedded;
import com.gusto.embedded_api_v_2026_06_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2026_06_15.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetTaxPaymentsRequest;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetTaxPaymentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetTaxPaymentsRequest req = GetTaxPaymentsRequest.builder()
                .companyUuid("<id>")
                .sortBy("amount:asc")
                .build();

        GetTaxPaymentsResponse res = sdk.taxPayments().getTaxPayments()
                .request(req)
                .call();

        if (res.taxPaymentList().isPresent()) {
            System.out.println(res.taxPaymentList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetTaxPaymentsRequest](../../models/operations/GetTaxPaymentsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetTaxPaymentsResponse](../../models/operations/GetTaxPaymentsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## getTaxPayment

Fetches a single tax payment by UUID, including the payroll tax liabilities that make up the payment.

scope: `tax_payments:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-tax-payment" method="get" path="/v1/companies/{company_uuid}/tax_payments/{uuid}" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2026_06_15.GustoEmbedded;
import com.gusto.embedded_api_v_2026_06_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetTaxPaymentHeaderXGustoAPIVersion;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetTaxPaymentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetTaxPaymentResponse res = sdk.taxPayments().getTaxPayment()
                .xGustoAPIVersion(GetTaxPaymentHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_SIX_MINUS06_MINUS15)
                .companyUuid("<id>")
                .uuid("7cdc7492-54c4-4684-9729-2c5da517245b")
                .call();

        if (res.taxPayment().isPresent()) {
            System.out.println(res.taxPayment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetTaxPaymentHeaderXGustoAPIVersion>](../../models/operations/GetTaxPaymentHeaderXGustoAPIVersion.md)                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `uuid`                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the tax payment                                                                                                                                                                                                  |

### Response

**[GetTaxPaymentResponse](../../models/operations/GetTaxPaymentResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |