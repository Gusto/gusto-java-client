# HolidayPayPolicies
(*holidayPayPolicies()*)

## Overview

### Available Operations

* [get](#get) - Get a company's holiday pay policy
* [create](#create) - Create a holiday pay policy for a company
* [update](#update) - Update a company's holiday pay policy
* [delete](#delete) - Delete a company's holiday pay policy
* [addEmployees](#addemployees) - Add employees to a company's holiday pay policy
* [removeEmployees](#removeemployees) - Remove employees from a company's holiday pay policy
* [previewPaidHolidays](#previewpaidholidays) - Preview a company's paid holidays

## get

Get a company's holiday pay policy

scope: `holiday_pay_policies:read`

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.operations.GetCompaniesCompanyUuidHolidayPayPolicyResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        SDK sdk = SDK.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetCompaniesCompanyUuidHolidayPayPolicyResponse res = sdk.holidayPayPolicies().get()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .call();

        if (res.holidayPayPolicy().isPresent()) {
            // handle response
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

**[GetCompaniesCompanyUuidHolidayPayPolicyResponse](../../models/operations/GetCompaniesCompanyUuidHolidayPayPolicyResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## create

Create a holiday pay policy for a company

scope: `holiday_pay_policies:write`

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.ChristmasDay;
import org.openapis.openapi.models.operations.FederalHolidays;
import org.openapis.openapi.models.operations.IndependenceDay;
import org.openapis.openapi.models.operations.MemorialDay;
import org.openapis.openapi.models.operations.MlkDay;
import org.openapis.openapi.models.operations.PostCompaniesCompanyUuidHolidayPayPolicyRequestBody;
import org.openapis.openapi.models.operations.PostCompaniesCompanyUuidHolidayPayPolicyResponse;
import org.openapis.openapi.models.operations.Thanksgiving;
import org.openapis.openapi.models.operations.VeteransDay;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        SDK sdk = SDK.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PostCompaniesCompanyUuidHolidayPayPolicyResponse res = sdk.holidayPayPolicies().create()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(PostCompaniesCompanyUuidHolidayPayPolicyRequestBody.builder()
                    .federalHolidays(FederalHolidays.builder()
                        .mlkDay(MlkDay.builder()
                            .selected(true)
                            .build())
                        .memorialDay(MemorialDay.builder()
                            .selected(true)
                            .build())
                        .independenceDay(IndependenceDay.builder()
                            .selected(true)
                            .build())
                        .veteransDay(VeteransDay.builder()
                            .selected(true)
                            .build())
                        .thanksgiving(Thanksgiving.builder()
                            .selected(true)
                            .build())
                        .christmasDay(ChristmasDay.builder()
                            .selected(true)
                            .build())
                        .build())
                    .build())
                .call();

        if (res.holidayPayPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PostCompaniesCompanyUuidHolidayPayPolicyRequestBody](../../models/operations/PostCompaniesCompanyUuidHolidayPayPolicyRequestBody.md)                                                                                        | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostCompaniesCompanyUuidHolidayPayPolicyResponse](../../models/operations/PostCompaniesCompanyUuidHolidayPayPolicyResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## update

Update a company's holiday pay policy

scope: `holiday_pay_policies:write`

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyChristmasDay;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyIndependenceDay;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyMemorialDay;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyMlkDay;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyRequestBody;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyResponse;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyThanksgiving;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyVeteransDay;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        SDK sdk = SDK.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutCompaniesCompanyUuidHolidayPayPolicyResponse res = sdk.holidayPayPolicies().update()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(PutCompaniesCompanyUuidHolidayPayPolicyRequestBody.builder()
                    .version("1b37938b017c7fd7116bada007072290")
                    .federalHolidays(PutCompaniesCompanyUuidHolidayPayPolicyFederalHolidays.builder()
                        .mlkDay(PutCompaniesCompanyUuidHolidayPayPolicyMlkDay.builder()
                            .selected(true)
                            .build())
                        .memorialDay(PutCompaniesCompanyUuidHolidayPayPolicyMemorialDay.builder()
                            .selected(true)
                            .build())
                        .independenceDay(PutCompaniesCompanyUuidHolidayPayPolicyIndependenceDay.builder()
                            .selected(true)
                            .build())
                        .veteransDay(PutCompaniesCompanyUuidHolidayPayPolicyVeteransDay.builder()
                            .selected(true)
                            .build())
                        .thanksgiving(PutCompaniesCompanyUuidHolidayPayPolicyThanksgiving.builder()
                            .selected(true)
                            .build())
                        .christmasDay(PutCompaniesCompanyUuidHolidayPayPolicyChristmasDay.builder()
                            .selected(true)
                            .build())
                        .build())
                    .build())
                .call();

        if (res.holidayPayPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutCompaniesCompanyUuidHolidayPayPolicyRequestBody](../../models/operations/PutCompaniesCompanyUuidHolidayPayPolicyRequestBody.md)                                                                                          | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutCompaniesCompanyUuidHolidayPayPolicyResponse](../../models/operations/PutCompaniesCompanyUuidHolidayPayPolicyResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## delete

Delete a company's holiday pay policy

scope: `holiday_pay_policies:write`

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.DeleteCompaniesCompanyUuidHolidayPayPolicyResponse;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        SDK sdk = SDK.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        DeleteCompaniesCompanyUuidHolidayPayPolicyResponse res = sdk.holidayPayPolicies().delete()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[DeleteCompaniesCompanyUuidHolidayPayPolicyResponse](../../models/operations/DeleteCompaniesCompanyUuidHolidayPayPolicyResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## addEmployees

Add employees to a company's holiday pay policy

scope: `holiday_pay_policies:write`

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyAddEmployees;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyAddRequestBody;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyAddResponse;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        SDK sdk = SDK.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutCompaniesCompanyUuidHolidayPayPolicyAddResponse res = sdk.holidayPayPolicies().addEmployees()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(PutCompaniesCompanyUuidHolidayPayPolicyAddRequestBody.builder()
                    .version("1b37938b017c7fd7116bada007072290")
                    .employees(List.of(
                        PutCompaniesCompanyUuidHolidayPayPolicyAddEmployees.builder()
                            .uuid("1ca3cd25-3eda-48c6-ac88-f0e7fb91a15a")
                            .build(),
                        PutCompaniesCompanyUuidHolidayPayPolicyAddEmployees.builder()
                            .uuid("fe977550-6621-4cfc-b4af-60b6af58c8ef")
                            .build()))
                    .build())
                .call();

        if (res.holidayPayPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutCompaniesCompanyUuidHolidayPayPolicyAddRequestBody](../../models/operations/PutCompaniesCompanyUuidHolidayPayPolicyAddRequestBody.md)                                                                                    | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutCompaniesCompanyUuidHolidayPayPolicyAddResponse](../../models/operations/PutCompaniesCompanyUuidHolidayPayPolicyAddResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## removeEmployees

Remove employees from a company's holiday pay policy

scope: `holiday_pay_policies:write`

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyRemoveEmployees;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyRemoveRequestBody;
import org.openapis.openapi.models.operations.PutCompaniesCompanyUuidHolidayPayPolicyRemoveResponse;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        SDK sdk = SDK.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutCompaniesCompanyUuidHolidayPayPolicyRemoveResponse res = sdk.holidayPayPolicies().removeEmployees()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(PutCompaniesCompanyUuidHolidayPayPolicyRemoveRequestBody.builder()
                    .version("1b37938b017c7fd7116bada007072290")
                    .employees(List.of(
                        PutCompaniesCompanyUuidHolidayPayPolicyRemoveEmployees.builder()
                            .uuid("1ca3cd25-3eda-48c6-ac88-f0e7fb91a15a")
                            .build(),
                        PutCompaniesCompanyUuidHolidayPayPolicyRemoveEmployees.builder()
                            .uuid("fe977550-6621-4cfc-b4af-60b6af58c8ef")
                            .build()))
                    .build())
                .call();

        if (res.holidayPayPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutCompaniesCompanyUuidHolidayPayPolicyRemoveRequestBody](../../models/operations/PutCompaniesCompanyUuidHolidayPayPolicyRemoveRequestBody.md)                                                                              | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutCompaniesCompanyUuidHolidayPayPolicyRemoveResponse](../../models/operations/PutCompaniesCompanyUuidHolidayPayPolicyRemoveResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## previewPaidHolidays

Preview a company's paid holidays

scope: `holiday_pay_policies:read`

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.GetCompaniesCompanyUuidPaidHolidaysRequestBody;
import org.openapis.openapi.models.operations.GetCompaniesCompanyUuidPaidHolidaysResponse;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        SDK sdk = SDK.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetCompaniesCompanyUuidPaidHolidaysResponse res = sdk.holidayPayPolicies().previewPaidHolidays()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(GetCompaniesCompanyUuidPaidHolidaysRequestBody.builder()
                    .year("2023")
                    .build())
                .call();

        if (res.paidHolidays().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [GetCompaniesCompanyUuidPaidHolidaysRequestBody](../../models/operations/GetCompaniesCompanyUuidPaidHolidaysRequestBody.md)                                                                                                  | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[GetCompaniesCompanyUuidPaidHolidaysResponse](../../models/operations/GetCompaniesCompanyUuidPaidHolidaysResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |