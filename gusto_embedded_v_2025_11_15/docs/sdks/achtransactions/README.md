# AchTransactions

## Overview

### Available Operations

* [getAll](#getall) - Get all ACH transactions for a company

## getAll

Fetches all ACH transactions for a company.

scope: `ach_transactions:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-ach-transactions" method="get" path="/v1/companies/{company_uuid}/ach_transactions" -->
```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.GustoEmbedded;
import org.openapis.openapi.models.errors.NotFoundErrorObject;
import org.openapis.openapi.models.operations.GetAchTransactionsRequest;
import org.openapis.openapi.models.operations.GetAchTransactionsResponse;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetAchTransactionsRequest req = GetAchTransactionsRequest.builder()
                .companyUuid("<id>")
                .build();

        GetAchTransactionsResponse res = sdk.achTransactions().getAll()
                .request(req)
                .call();

        if (res.achTransactionList().isPresent()) {
            System.out.println(res.achTransactionList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAchTransactionsRequest](../../models/operations/GetAchTransactionsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAchTransactionsResponse](../../models/operations/GetAchTransactionsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |