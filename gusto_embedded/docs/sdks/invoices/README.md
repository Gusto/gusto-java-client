# Invoices
(*invoices()*)

## Overview

### Available Operations

* [get](#get) - Retrieve invoicing data for companies

## get

Retrieve data for active companies used to calculate invoices for Gusto Embedded Payroll. A company is considered active for an invoice period if they are an active partner managed company, have run payroll or created contractor payments since becoming a partner managed company, and are not suspended at any point during the invoice period.  This endpoint forces pagination, with 100 results returned at a time. You can learn more about our pagination here: [pagination guide](https://docs.gusto.com/embedded-payroll/docs/pagination) 

> 📘 System Access Authentication
>
> This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access)

scope: `invoices:read`

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.GetInvoicesInvoicePeriodRequest;
import org.openapis.openapi.models.operations.GetInvoicesInvoicePeriodResponse;
import org.openapis.openapi.models.operations.GetInvoicesInvoicePeriodSecurity;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        SDK sdk = SDK.builder()
            .build();

        GetInvoicesInvoicePeriodRequest req = GetInvoicesInvoicePeriodRequest.builder()
                .invoicePeriod("2020-01")
                .build();

        GetInvoicesInvoicePeriodResponse res = sdk.invoices().get()
                .request(req)
                .security(GetInvoicesInvoicePeriodSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .call();

        if (res.invoiceData().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                              | Type                                                                                                                                   | Required                                                                                                                               | Description                                                                                                                            |
| -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                              | [GetInvoicesInvoicePeriodRequest](../../models/operations/GetInvoicesInvoicePeriodRequest.md)                                          | :heavy_check_mark:                                                                                                                     | The request object to use for the request.                                                                                             |
| `security`                                                                                                                             | [org.openapis.openapi.models.operations.GetInvoicesInvoicePeriodSecurity](../../models/operations/GetInvoicesInvoicePeriodSecurity.md) | :heavy_check_mark:                                                                                                                     | The security requirements to use for the request.                                                                                      |

### Response

**[GetInvoicesInvoicePeriodResponse](../../models/operations/GetInvoicesInvoicePeriodResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |