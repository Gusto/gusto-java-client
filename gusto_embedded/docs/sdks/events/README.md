# Events
(*events()*)

## Overview

### Available Operations

* [get](#get) - Get all events

## get

Fetch all events, going back up to 30 days, that your partner application has the required scopes for. Note that a partner does NOT have to have verified webhook subscriptions in order to utilize this endpoint.

> 📘 System Access Authentication
>
> This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access).

scope: `events:read`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.SortOrder;
import com.gusto.embedded_api.models.operations.GetEventsRequest;
import com.gusto.embedded_api.models.operations.GetEventsResponse;
import com.gusto.embedded_api.models.operations.GetEventsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        GetEventsRequest req = GetEventsRequest.builder()
                .sortOrder(SortOrder.ASC)
                .build();

        GetEventsResponse res = sdk.events().get()
                .request(req)
                .security(GetEventsSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .call();

        if (res.eventList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [GetEventsRequest](../../models/operations/GetEventsRequest.md)                                            | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |
| `security`                                                                                                 | [com.gusto.embedded_api.models.operations.GetEventsSecurity](../../models/operations/GetEventsSecurity.md) | :heavy_check_mark:                                                                                         | The security requirements to use for the request.                                                          |

### Response

**[GetEventsResponse](../../models/operations/GetEventsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |