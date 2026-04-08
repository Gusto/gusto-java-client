# WireInRequests

## Overview

### Available Operations

* [get](#get) - Get a single Wire In Request
* [submit](#submit) - Submit a wire in request
* [list](#list) - Get all Wire In Requests for a company

## get

Fetch a Wire In Request.

scope: `payrolls:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-wire_in_requests-wire_in_request_uuid" method="get" path="/v1/wire_in_requests/{wire_in_request_uuid}" example="example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetWireInRequestsWireInRequestUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetWireInRequestsWireInRequestUuidResponse res = sdk.wireInRequests().get()
                .wireInRequestUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        if (res.wireInRequest().isPresent()) {
            System.out.println(res.wireInRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `wireInRequestUuid`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the Wire In Request                                                                                                                                                                                              |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetWireInRequestsWireInRequestUuidResponse](../../models/operations/GetWireInRequestsWireInRequestUuidResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## submit

Submit a wire in request for a payment

scope: `payrolls:run`

### Example Usage: Basic

<!-- UsageSnippet language="java" operationID="put-wire_in_requests-wire_in_request_uuid" method="put" path="/v1/wire_in_requests/{wire_in_request_uuid}" example="Basic" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutWireInRequestsWireInRequestUuidRequestBody;
import com.gusto.embedded_api.models.operations.PutWireInRequestsWireInRequestUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutWireInRequestsWireInRequestUuidResponse res = sdk.wireInRequests().submit()
                .wireInRequestUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PutWireInRequestsWireInRequestUuidRequestBody.builder()
                    .dateSent("<value>")
                    .bankName("<value>")
                    .amountSent("<value>")
                    .build())
                .call();

        if (res.wireInRequest().isPresent()) {
            System.out.println(res.wireInRequest().get());
        }
    }
}
```
### Example Usage: Example

<!-- UsageSnippet language="java" operationID="put-wire_in_requests-wire_in_request_uuid" method="put" path="/v1/wire_in_requests/{wire_in_request_uuid}" example="Example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutWireInRequestsWireInRequestUuidRequestBody;
import com.gusto.embedded_api.models.operations.PutWireInRequestsWireInRequestUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutWireInRequestsWireInRequestUuidResponse res = sdk.wireInRequests().submit()
                .wireInRequestUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PutWireInRequestsWireInRequestUuidRequestBody.builder()
                    .dateSent("2024-06-10T00:00:00Z")
                    .bankName("Chase")
                    .amountSent("314500")
                    .additionalNotes("Wire for 2024-06-15 payroll.")
                    .build())
                .call();

        if (res.wireInRequest().isPresent()) {
            System.out.println(res.wireInRequest().get());
        }
    }
}
```
### Example Usage: Nested

<!-- UsageSnippet language="java" operationID="put-wire_in_requests-wire_in_request_uuid" method="put" path="/v1/wire_in_requests/{wire_in_request_uuid}" example="Nested" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutWireInRequestsWireInRequestUuidRequestBody;
import com.gusto.embedded_api.models.operations.PutWireInRequestsWireInRequestUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutWireInRequestsWireInRequestUuidResponse res = sdk.wireInRequests().submit()
                .wireInRequestUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PutWireInRequestsWireInRequestUuidRequestBody.builder()
                    .dateSent("<value>")
                    .bankName("<value>")
                    .amountSent("<value>")
                    .build())
                .call();

        if (res.wireInRequest().isPresent()) {
            System.out.println(res.wireInRequest().get());
        }
    }
}
```
### Example Usage: Resource

<!-- UsageSnippet language="java" operationID="put-wire_in_requests-wire_in_request_uuid" method="put" path="/v1/wire_in_requests/{wire_in_request_uuid}" example="Resource" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutWireInRequestsWireInRequestUuidRequestBody;
import com.gusto.embedded_api.models.operations.PutWireInRequestsWireInRequestUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutWireInRequestsWireInRequestUuidResponse res = sdk.wireInRequests().submit()
                .wireInRequestUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PutWireInRequestsWireInRequestUuidRequestBody.builder()
                    .dateSent("<value>")
                    .bankName("<value>")
                    .amountSent("<value>")
                    .build())
                .call();

        if (res.wireInRequest().isPresent()) {
            System.out.println(res.wireInRequest().get());
        }
    }
}
```
### Example Usage: example

<!-- UsageSnippet language="java" operationID="put-wire_in_requests-wire_in_request_uuid" method="put" path="/v1/wire_in_requests/{wire_in_request_uuid}" example="example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutWireInRequestsWireInRequestUuidRequestBody;
import com.gusto.embedded_api.models.operations.PutWireInRequestsWireInRequestUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutWireInRequestsWireInRequestUuidResponse res = sdk.wireInRequests().submit()
                .wireInRequestUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PutWireInRequestsWireInRequestUuidRequestBody.builder()
                    .dateSent("<value>")
                    .bankName("<value>")
                    .amountSent("<value>")
                    .build())
                .call();

        if (res.wireInRequest().isPresent()) {
            System.out.println(res.wireInRequest().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `wireInRequestUuid`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the Wire In Request                                                                                                                                                                                              |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutWireInRequestsWireInRequestUuidRequestBody](../../models/operations/PutWireInRequestsWireInRequestUuidRequestBody.md)                                                                                                    | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutWireInRequestsWireInRequestUuidResponse](../../models/operations/PutWireInRequestsWireInRequestUuidResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## list

Fetches all Wire In Requests for a company.

scope: `payrolls:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-companies-company_uuid-wire_in_request_uuid" method="get" path="/v1/companies/{company_uuid}/wire_in_requests" example="Example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetCompaniesCompanyUuidWireInRequestUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetCompaniesCompanyUuidWireInRequestUuidResponse res = sdk.wireInRequests().list()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        if (res.wireInRequestList().isPresent()) {
            System.out.println(res.wireInRequestList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetCompaniesCompanyUuidWireInRequestUuidResponse](../../models/operations/GetCompaniesCompanyUuidWireInRequestUuidResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |