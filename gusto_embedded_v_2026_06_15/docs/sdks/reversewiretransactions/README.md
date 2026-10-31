# ReverseWireTransactions

## Overview

### Available Operations

* [getReverseWireTransactions](#getreversewiretransactions) - Get all reverse wire transactions for a company

## getReverseWireTransactions

Returns a paginated list of reverse wire (drawdown) transactions for a company. Reverse wires are debit transactions initiated by Gusto to pull funds from a partner's bank account to cover payroll or contractor payment obligations. Pagination is returned via the `x-page`, `x-per-page`, `x-total-count`, and `x-total-pages` response headers.

scope: `reverse_wire_transactions:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-reverse-wire-transactions" method="get" path="/v1/companies/{company_uuid}/reverse_wire_transactions" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2026_06_15.GustoEmbedded;
import com.gusto.embedded_api_v_2026_06_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetReverseWireTransactionsRequest;
import com.gusto.embedded_api_v_2026_06_15.models.operations.GetReverseWireTransactionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetReverseWireTransactionsRequest req = GetReverseWireTransactionsRequest.builder()
                .companyUuid("<id>")
                .build();

        GetReverseWireTransactionsResponse res = sdk.reverseWireTransactions().getReverseWireTransactions()
                .request(req)
                .call();

        if (res.reverseWireTransactionList().isPresent()) {
            System.out.println(res.reverseWireTransactionList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetReverseWireTransactionsRequest](../../models/operations/GetReverseWireTransactionsRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetReverseWireTransactionsResponse](../../models/operations/GetReverseWireTransactionsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |