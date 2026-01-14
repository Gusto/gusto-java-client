# Payrolls

## Overview

### Available Operations

* [list](#list) - Get all payrolls for a company
* [createOffCycle](#createoffcycle) - Create an off-cycle payroll
* [getApprovedReversals](#getapprovedreversals) - Get approved payroll reversals
* [get](#get) - Get a single payroll
* [update](#update) - Update a payroll by ID
* [delete](#delete) - Delete a payroll
* [prepare](#prepare) - Prepare a payroll for update
* [getReceipt](#getreceipt) - Get a single payroll receipt
* [getBlockers](#getblockers) - Get all payroll blockers for a company
* [cancel](#cancel) - Cancel a payroll
* [getPayStub](#getpaystub) - Get an employee pay stub (pdf)
* [getPayStubs](#getpaystubs) - Get an employee's pay stubs
* [generatePrintableChecks](#generateprintablechecks) - Generate printable payroll checks (pdf)
* [getV1CompaniesCompanyIdPayrollsIdPartnerDisbursements](#getv1companiescompanyidpayrollsidpartnerdisbursements) - Get partner disbursements for a payroll
* [patchV1CompaniesCompanyIdPayrollsIdPartnerDisbursements](#patchv1companiescompanyidpayrollsidpartnerdisbursements) - Update partner disbursements for a payroll

## list

Returns a list of payrolls for a company. You can change the payrolls returned by updating the processing_status, payroll_types, start_date, & end_date params.

By default, will return processed, regular payrolls for the past 6 months.

Notes:
* Dollar amounts are returned as string representations of numeric decimals, are represented to the cent.
* end_date can be at most 3 months in the future and start_date and end_date can't be more than 1 year apart.

scope: `payrolls:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-companies-company_id-payrolls" method="get" path="/v1/companies/{company_id}/payrolls" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1CompaniesCompanyIdPayrollsRequest req = GetV1CompaniesCompanyIdPayrollsRequest.builder()
                .companyId("<id>")
                .startDate("2020-01-31")
                .endDate("2020-01-31")
                .dateFilterBy(DateFilterBy.CHECK_DATE)
                .sortOrder(SortOrder.ASC)
                .build();

        GetV1CompaniesCompanyIdPayrollsResponse res = sdk.payrolls().list()
                .request(req)
                .call();

        if (res.payrollList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                   | Type                                                                                                        | Required                                                                                                    | Description                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                   | [GetV1CompaniesCompanyIdPayrollsRequest](../../models/operations/GetV1CompaniesCompanyIdPayrollsRequest.md) | :heavy_check_mark:                                                                                          | The request object to use for the request.                                                                  |

### Response

**[GetV1CompaniesCompanyIdPayrollsResponse](../../models/operations/GetV1CompaniesCompanyIdPayrollsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## createOffCycle

Creates a new, unprocessed, off-cycle payroll.

## `off_cycle_reason`
By default:
- External benefits and deductions will be included when the `off_cycle_reason` is set to `Correction`.
- All benefits and deductions are blocked when the `off_cycle_reason` is set to `Bonus`.

These elections can be overridden with the `skip_regular_deductions` boolean.

scope: `payrolls:run`

### Example Usage

<!-- UsageSnippet language="java" operationID="post-v1-companies-company_id-payrolls" method="post" path="/v1/companies/{company_id}/payrolls" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PostV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.PostV1CompaniesCompanyIdPayrollsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostV1CompaniesCompanyIdPayrollsResponse res = sdk.payrolls().createOffCycle()
                .xGustoAPIVersion(PostV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .companyId("<id>")
                .call();

        if (res.payrollPrepared().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<PostV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion>](../../models/operations/PostV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion.md)                                                                       | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `requestBody`                                                                                                                                                                                                                | [Optional\<PostV1CompaniesCompanyIdPayrollsRequestBody>](../../models/operations/PostV1CompaniesCompanyIdPayrollsRequestBody.md)                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostV1CompaniesCompanyIdPayrollsResponse](../../models/operations/PostV1CompaniesCompanyIdPayrollsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404, 422                                     | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## getApprovedReversals

Returns all approved Payroll Reversals for a Company.

scope: `payrolls:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-companies-company_id-payroll_reversals" method="get" path="/v1/companies/{company_id}/payroll_reversals" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyIdPayrollReversalsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1CompaniesCompanyIdPayrollReversalsResponse res = sdk.payrolls().getApprovedReversals()
                .companyId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        if (res.payrollReversal().isPresent()) {
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

**[GetV1CompaniesCompanyIdPayrollReversalsResponse](../../models/operations/GetV1CompaniesCompanyIdPayrollReversalsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Returns a payroll. If payroll is calculated or processed, will return employee_compensations and totals. Results are paginated, with a maximum page size of 100 employee_compensations.

Notes:
* Hour and dollar amounts are returned as string representations of numeric decimals.
* Hours are represented to the thousands place; dollar amounts are represented to the cent.
* Every eligible compensation is returned for each employee. If no data has yet be inserted for a given field, it defaults to “0.00” (for fixed amounts) or “0.000” (for hours ).
* When include parameter with benefits value is passed, employee_benefits:read scope is required to return benefits
  * Benefits containing PHI are only visible with the `employee_benefits:read:phi` scope

scope: `payrolls:read`


### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-companies-company_id-payrolls-payroll_id" method="get" path="/v1/companies/{company_id}/payrolls/{payroll_id}" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyIdPayrollsPayrollIdRequest;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyIdPayrollsPayrollIdResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1CompaniesCompanyIdPayrollsPayrollIdRequest req = GetV1CompaniesCompanyIdPayrollsPayrollIdRequest.builder()
                .companyId("<id>")
                .payrollId("<id>")
                .build();

        GetV1CompaniesCompanyIdPayrollsPayrollIdResponse res = sdk.payrolls().get()
                .request(req)
                .call();

        if (res.payrollShow().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                     | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                     | [GetV1CompaniesCompanyIdPayrollsPayrollIdRequest](../../models/operations/GetV1CompaniesCompanyIdPayrollsPayrollIdRequest.md) | :heavy_check_mark:                                                                                                            | The request object to use for the request.                                                                                    |

### Response

**[GetV1CompaniesCompanyIdPayrollsPayrollIdResponse](../../models/operations/GetV1CompaniesCompanyIdPayrollsPayrollIdResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## update

This endpoint allows you to update information for one or more employees for a specific **unprocessed** payroll.  You can think of the **unprocessed**
payroll object as a template of fields that you can update.  You cannot modify the structure of the payroll object through this endpoint, only values
of the fields included in the payroll.  If you do not include specific employee compensations, fixed/hourly compensations, or deductions in your request body, they
will not be removed from the payroll. A maximum of 100 employee_compensations can be updated at a time. Only the employee compensation objects that were
inputted will be returned.

scope: `payrolls:write`


### Example Usage

<!-- UsageSnippet language="java" operationID="put-v1-companies-company_id-payrolls" method="put" path="/v1/companies/{company_id}/payrolls/{payroll_id}" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.PayrollUpdate;
import com.gusto.embedded_api.models.components.PayrollUpdateEmployeeCompensations;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.PutV1CompaniesCompanyIdPayrollsResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutV1CompaniesCompanyIdPayrollsResponse res = sdk.payrolls().update()
                .xGustoAPIVersion(PutV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .companyId("<id>")
                .payrollId("<id>")
                .payrollUpdate(PayrollUpdate.builder()
                    .employeeCompensations(List.of(
                        PayrollUpdateEmployeeCompensations.builder()
                            .build()))
                    .build())
                .call();

        if (res.payrollPrepared().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<PutV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion>](../../models/operations/PutV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion.md)                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `payrollId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll                                                                                                                                                                                                      |
| `payrollUpdate`                                                                                                                                                                                                              | [PayrollUpdate](../../models/components/PayrollUpdate.md)                                                                                                                                                                    | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutV1CompaniesCompanyIdPayrollsResponse](../../models/operations/PutV1CompaniesCompanyIdPayrollsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404, 422                                     | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## delete

This endpoint allows you to delete an **unprocessed** payroll.

By default the payroll and associated data is deleted synchronously. To request an asynchronous delete, use the `async=true` query parameter. In both cases validation of ability to delete will be performed and an Unprocessable Entity error will be returned if the payroll is not able to be deleted. A successful synchronous delete will return `204/No Content`. When a payroll has been enqueued for asynchronous deletion, `202/Accepted` will be returned.

scope: `payrolls:run`

### Example Usage

<!-- UsageSnippet language="java" operationID="delete-v1-companies-company_id-payrolls" method="delete" path="/v1/companies/{company_id}/payrolls/{payroll_id}" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.DeleteV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.DeleteV1CompaniesCompanyIdPayrollsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        DeleteV1CompaniesCompanyIdPayrollsResponse res = sdk.payrolls().delete()
                .companyId("<id>")
                .payrollId("<id>")
                .xGustoAPIVersion(DeleteV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `payrollId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll                                                                                                                                                                                                      |
| `async`                                                                                                                                                                                                                      | *Optional\<Boolean>*                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | When true, request an asynchronous delete of the payroll.                                                                                                                                                                    |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<DeleteV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion>](../../models/operations/DeleteV1CompaniesCompanyIdPayrollsHeaderXGustoAPIVersion.md)                                                                   | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[DeleteV1CompaniesCompanyIdPayrollsResponse](../../models/operations/DeleteV1CompaniesCompanyIdPayrollsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## prepare

This endpoint will build the payroll and get it ready for making updates. This includes adding/removing eligible employees from the Payroll and updating the check_date, payroll_deadline, and payroll_status_meta dates & times.
Results are paginated, with a maximum page size of 100 employee_compensations.

Notes:
 * Will null out calculated_at & totals if a payroll has already been calculated.
 * Will return the version param used for updating the payroll

scope: `payrolls:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="put-v1-companies-company_id-payrolls-payroll_id-prepare" method="put" path="/v1/companies/{company_id}/payrolls/{payroll_id}/prepare" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.operations.PutV1CompaniesCompanyIdPayrollsPayrollIdPrepareRequest;
import com.gusto.embedded_api.models.operations.PutV1CompaniesCompanyIdPayrollsPayrollIdPrepareResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutV1CompaniesCompanyIdPayrollsPayrollIdPrepareRequest req = PutV1CompaniesCompanyIdPayrollsPayrollIdPrepareRequest.builder()
                .companyId("<id>")
                .payrollId("<id>")
                .build();

        PutV1CompaniesCompanyIdPayrollsPayrollIdPrepareResponse res = sdk.payrolls().prepare()
                .request(req)
                .call();

        if (res.payrollPrepared().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                   | Type                                                                                                                                        | Required                                                                                                                                    | Description                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                                   | [PutV1CompaniesCompanyIdPayrollsPayrollIdPrepareRequest](../../models/operations/PutV1CompaniesCompanyIdPayrollsPayrollIdPrepareRequest.md) | :heavy_check_mark:                                                                                                                          | The request object to use for the request.                                                                                                  |

### Response

**[PutV1CompaniesCompanyIdPayrollsPayrollIdPrepareResponse](../../models/operations/PutV1CompaniesCompanyIdPayrollsPayrollIdPrepareResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getReceipt

Returns a payroll receipt.

Notes:
* Hour and dollar amounts are returned as string representations of numeric decimals.
* Dollar amounts are represented to the cent.
* If no data has yet be inserted for a given field, it defaults to "0.00" (for fixed amounts).

scope: `payrolls:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-payment-receipts-payrolls-payroll_uuid" method="get" path="/v1/payrolls/{payroll_uuid}/receipt" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.GetV1PaymentReceiptsPayrollsPayrollUuidHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.GetV1PaymentReceiptsPayrollsPayrollUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1PaymentReceiptsPayrollsPayrollUuidResponse res = sdk.payrolls().getReceipt()
                .payrollUuid("<id>")
                .xGustoAPIVersion(GetV1PaymentReceiptsPayrollsPayrollUuidHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        if (res.payrollReceipt().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `payrollUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1PaymentReceiptsPayrollsPayrollUuidHeaderXGustoAPIVersion>](../../models/operations/GetV1PaymentReceiptsPayrollsPayrollUuidHeaderXGustoAPIVersion.md)                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1PaymentReceiptsPayrollsPayrollUuidResponse](../../models/operations/GetV1PaymentReceiptsPayrollsPayrollUuidResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## getBlockers

Returns a list of reasons that prevent the company from running payrolls. See the [payroll blockers guide](https://docs.gusto.com/embedded-payroll/docs/payroll-blockers) for a complete list of reasons.

The list is empty if there are no payroll blockers.

scope: `payrolls:run`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-companies-payroll-blockers-company_uuid" method="get" path="/v1/companies/{company_uuid}/payrolls/blockers" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1CompaniesPayrollBlockersCompanyUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1CompaniesPayrollBlockersCompanyUuidResponse res = sdk.payrolls().getBlockers()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        if (res.payrollBlockerList().isPresent()) {
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

**[GetV1CompaniesPayrollBlockersCompanyUuidResponse](../../models/operations/GetV1CompaniesPayrollBlockersCompanyUuidResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## cancel

Transitions a `processed` payroll back to the `unprocessed` state. A payroll can be canceled if it meets both criteria:
- `processed` is `true`
- Current time is earlier than 4pm PT on the `payroll_deadline`

scope: `payrolls:run`


### Example Usage

<!-- UsageSnippet language="java" operationID="put-api-v1-companies-company_id-payrolls-payroll_id-cancel" method="put" path="/v1/companies/{company_id}/payrolls/{payroll_id}/cancel" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutApiV1CompaniesCompanyIdPayrollsPayrollIdCancelResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutApiV1CompaniesCompanyIdPayrollsPayrollIdCancelResponse res = sdk.payrolls().cancel()
                .companyId("<id>")
                .payrollId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        if (res.payroll().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `payrollId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[PutApiV1CompaniesCompanyIdPayrollsPayrollIdCancelResponse](../../models/operations/PutApiV1CompaniesCompanyIdPayrollsPayrollIdCancelResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## getPayStub

Get an employee's pay stub for the specified payroll. By default, an application/pdf response will be returned. No other content types are currently supported, but may be supported in the future.

scope: `pay_stubs:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-payrolls-payroll_uuid-employees-employee_uuid-pay_stub" method="get" path="/v1/payrolls/{payroll_id}/employees/{employee_id}/pay_stub" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubResponse res = sdk.payrolls().getPayStub()
                .xGustoAPIVersion(GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .payrollId("<id>")
                .employeeId("<id>")
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubHeaderXGustoAPIVersion>](../../models/operations/GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubHeaderXGustoAPIVersion.md)                               | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `payrollId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll                                                                                                                                                                                                      |
| `employeeId`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the employee                                                                                                                                                                                                     |

### Response

**[GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubResponse](../../models/operations/GetV1PayrollsPayrollUuidEmployeesEmployeeUuidPayStubResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## getPayStubs

Get an employee's pay stubs

scope: `pay_stubs:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-employees-employee_uuid-pay_stubs" method="get" path="/v1/employees/{employee_id}/pay_stubs" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.GetV1EmployeesEmployeeUuidPayStubsHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.GetV1EmployeesEmployeeUuidPayStubsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1EmployeesEmployeeUuidPayStubsResponse res = sdk.payrolls().getPayStubs()
                .xGustoAPIVersion(GetV1EmployeesEmployeeUuidPayStubsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .employeeId("<id>")
                .call();

        if (res.employeePayStubsList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1EmployeesEmployeeUuidPayStubsHeaderXGustoAPIVersion>](../../models/operations/GetV1EmployeesEmployeeUuidPayStubsHeaderXGustoAPIVersion.md)                                                                   | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `employeeId`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the employee                                                                                                                                                                                                     |
| `page`                                                                                                                                                                                                                       | *Optional\<Long>*                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                           | The page that is requested. When unspecified, will load all objects unless endpoint forces pagination.                                                                                                                       |
| `per`                                                                                                                                                                                                                        | *Optional\<Long>*                                                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                                                           | Number of objects per page. For majority of endpoints will default to 25                                                                                                                                                     |

### Response

**[GetV1EmployeesEmployeeUuidPayStubsResponse](../../models/operations/GetV1EmployeesEmployeeUuidPayStubsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## generatePrintableChecks

This endpoint initiates the generation of employee checks for the payroll specified by payroll_uuid. A generation status and corresponding request_uuid will be returned. Use the generated document GET endpoint with document_type: `printable_payroll_checks` and request_uuid to poll the check generation process and retrieve the generated check URL upon completion.

scope: `generated_documents:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="post-v1-payrolls-payroll_uuid-generated_documents-printable_payroll_checks" method="post" path="/v1/payrolls/{payroll_uuid}/generated_documents/printable_payroll_checks" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostV1PayrollsPayrollUuidGeneratedDocumentsPrintablePayrollChecksResponse res = sdk.payrolls().generatePrintableChecks()
                .payrollUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PostV1PayrollsPayrollUuidGeneratedDocumentsPrintablePayrollChecksRequestBody.builder()
                    .printingFormat(PrintingFormat.TOP)
                    .build())
                .call();

        if (res.payrollCheck().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `payrollUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PostV1PayrollsPayrollUuidGeneratedDocumentsPrintablePayrollChecksRequestBody](../../models/operations/PostV1PayrollsPayrollUuidGeneratedDocumentsPrintablePayrollChecksRequestBody.md)                                      | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostV1PayrollsPayrollUuidGeneratedDocumentsPrintablePayrollChecksResponse](../../models/operations/PostV1PayrollsPayrollUuidGeneratedDocumentsPrintablePayrollChecksResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## getV1CompaniesCompanyIdPayrollsIdPartnerDisbursements

Get partner disbursements for a specific payroll.

scope: `partner_disbursements:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-companies-company_id-payrolls-id-partner_disbursements" method="get" path="/v1/companies/{company_id}/payrolls/{id}/partner_disbursements" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsResponse res = sdk.payrolls().getV1CompaniesCompanyIdPayrollsIdPartnerDisbursements()
                .companyId("<id>")
                .id("<id>")
                .xGustoAPIVersion(GetV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        if (res.payrollPartnerDisbursements().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `id`                                                                                                                                                                                                                         | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsHeaderXGustoAPIVersion>](../../models/operations/GetV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsHeaderXGustoAPIVersion.md)                             | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsResponse](../../models/operations/GetV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## patchV1CompaniesCompanyIdPayrollsIdPartnerDisbursements

Update partner disbursements for a specific payroll.

scope: `partner_disbursements:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="patch-v1-companies-company_id-payrolls-id-partner_disbursements" method="patch" path="/v1/companies/{company_id}/payrolls/{id}/partner_disbursements" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PatchV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsResponse res = sdk.payrolls().patchV1CompaniesCompanyIdPayrollsIdPartnerDisbursements()
                .companyId("<id>")
                .id("<id>")
                .xGustoAPIVersion(PatchV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PatchV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsRequestBody.builder()
                    .disbursements(List.of(
                        PatchV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsDisbursements.builder()
                            .employeeUuid("1a2b3c4d-5e6f-7890-abcd-ef1234567890")
                            .build()))
                    .build())
                .call();

        if (res.payrollPartnerDisbursements().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `id`                                                                                                                                                                                                                         | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<PatchV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsHeaderXGustoAPIVersion>](../../models/operations/PatchV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsHeaderXGustoAPIVersion.md)                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [Optional\<PatchV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsRequestBody>](../../models/operations/PatchV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsRequestBody.md)                                               | :heavy_minus_sign:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PatchV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsResponse](../../models/operations/PatchV1CompaniesCompanyIdPayrollsIdPartnerDisbursementsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 404, 422                                     | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |