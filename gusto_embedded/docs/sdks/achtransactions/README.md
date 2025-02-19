# AchTransactions
(*achTransactions()*)

## Overview

### Available Operations

* [getAll](#getall) - Get all ACH transactions for a company

## getAll

Fetches all ACH transactions for a company.

scope: `ach_transactions:read`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.operations.GetAchTransactionsRequest;
import com.gusto.embedded_api.models.operations.GetAchTransactionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetAchTransactionsRequest req = GetAchTransactionsRequest.builder()
                .companyUuid("<id>")
                .build();

        GetAchTransactionsResponse res = sdk.achTransactions().getAll()
                .request(req)
                .call();

        if (res.achTransactionList().isPresent()) {
            // handle response
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

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |