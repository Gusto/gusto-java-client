# Locations
(*locations()*)

## Overview

### Available Operations

* [create](#create) - Create a company location
* [get](#get) - Get company locations
* [retrieve](#retrieve) - Get a location
* [update](#update) - Update a location
* [getMinimumWages](#getminimumwages) - Get minimum wages for a location

## create

Company locations represent all addresses associated with a company. These can be filing addresses, mailing addresses, and/or work locations; one address may serve multiple, or all, purposes.

Since all company locations are subsets of locations, retrieving or updating an individual record should be done via the locations endpoints.

scope: `companies:write`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PostV1CompaniesCompanyIdLocationsRequestBody;
import com.gusto.embedded_api.models.operations.PostV1CompaniesCompanyIdLocationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PostV1CompaniesCompanyIdLocationsResponse res = sdk.locations().create()
                .companyId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PostV1CompaniesCompanyIdLocationsRequestBody.builder()
                    .phoneNumber("8009360383")
                    .street1("425 2nd Street")
                    .city("San Francisco")
                    .state("CA")
                    .zip("94107")
                    .street2("Suite 602")
                    .build())
                .call();

        if (res.location().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PostV1CompaniesCompanyIdLocationsRequestBody](../../models/operations/PostV1CompaniesCompanyIdLocationsRequestBody.md)                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                           | Create a company location.                                                                                                                                                                                                   |

### Response

**[PostV1CompaniesCompanyIdLocationsResponse](../../models/operations/PostV1CompaniesCompanyIdLocationsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## get

Company locations represent all addresses associated with a company. These can be filing addresses, mailing addresses, and/or work locations; one address may serve multiple, or all, purposes.

Since all company locations are subsets of locations, retrieving or updating an individual record should be done via the locations endpoints.

scope: `companies:read`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyIdLocationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1CompaniesCompanyIdLocationsResponse res = sdk.locations().get()
                .companyId("<id>")
                .page(700347L)
                .per(558834L)
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        if (res.locationList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `page`                                                                                                                                                                                                                       | *Optional\<Long>*                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                           | The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.                                                                                                                       |
| `per`                                                                                                                                                                                                                        | *Optional\<Long>*                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                           | Number of objects per page. For majority of endpoints will default to 25                                                                                                                                                     |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1CompaniesCompanyIdLocationsResponse](../../models/operations/GetV1CompaniesCompanyIdLocationsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## retrieve

Get a location.

scope: `companies:read`


### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.GetV1LocationsLocationIdResponse;
import com.gusto.embedded_api.models.operations.XGustoAPIVersion;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1LocationsLocationIdResponse res = sdk.locations().retrieve()
                .xGustoAPIVersion(XGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .locationId("<id>")
                .call();

        if (res.location().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<XGustoAPIVersion>](../../models/operations/XGustoAPIVersion.md)                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `locationId`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the location                                                                                                                                                                                                     |

### Response

**[GetV1LocationsLocationIdResponse](../../models/operations/GetV1LocationsLocationIdResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## update

Update a location.

scope: `companies.write`


### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutV1LocationsLocationIdResponse res = sdk.locations().update()
                .xGustoAPIVersion(HeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .locationId("<id>")
                .requestBody(PutV1LocationsLocationIdRequestBody.builder()
                    .version("14302448d61342a1a25072fcb59df0b3")
                    .phoneNumber("8009360383")
                    .street1("300 3rd Street")
                    .street2("Apartment 318")
                    .city("San Francisco")
                    .zip("94107")
                    .filingAddress(true)
                    .build())
                .call();

        if (res.location().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<HeaderXGustoAPIVersion>](../../models/operations/HeaderXGustoAPIVersion.md)                                                                                                                                       | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `locationId`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the location                                                                                                                                                                                                     |
| `requestBody`                                                                                                                                                                                                                | [PutV1LocationsLocationIdRequestBody](../../models/operations/PutV1LocationsLocationIdRequestBody.md)                                                                                                                        | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutV1LocationsLocationIdResponse](../../models/operations/PutV1LocationsLocationIdResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404, 409, 422                                | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## getMinimumWages

Get minimum wages for a location

scope: `companies:read`


### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.GetV1LocationsLocationUuidMinimumWagesHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.GetV1LocationsLocationUuidMinimumWagesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1LocationsLocationUuidMinimumWagesResponse res = sdk.locations().getMinimumWages()
                .locationUuid("<id>")
                .xGustoAPIVersion(GetV1LocationsLocationUuidMinimumWagesHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .effectiveDate("2020-01-31")
                .call();

        if (res.minimumWageList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  | Example                                                                                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `locationUuid`                                                                                                                                                                                                               | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the location                                                                                                                                                                                                     |                                                                                                                                                                                                                              |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1LocationsLocationUuidMinimumWagesHeaderXGustoAPIVersion>](../../models/operations/GetV1LocationsLocationUuidMinimumWagesHeaderXGustoAPIVersion.md)                                                           | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |                                                                                                                                                                                                                              |
| `effectiveDate`                                                                                                                                                                                                              | *Optional\<String>*                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          | 2020-01-31                                                                                                                                                                                                                   |

### Response

**[GetV1LocationsLocationUuidMinimumWagesResponse](../../models/operations/GetV1LocationsLocationUuidMinimumWagesResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |