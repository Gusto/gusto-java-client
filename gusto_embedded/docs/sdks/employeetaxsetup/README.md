# EmployeeTaxSetup
(*employeeTaxSetup()*)

## Overview

### Available Operations

* [getFederalTaxes](#getfederaltaxes) - Get an employee's federal taxes
* [updateFederalTaxes](#updatefederaltaxes) - Update an employee's federal taxes
* [getStateTaxes](#getstatetaxes) - Get an employee's state taxes
* [updateStateTaxes](#updatestatetaxes) - Update an employee's state taxes

## getFederalTaxes

Get attributes relevant for an employee's federal taxes.

 scope: `employee_federal_taxes:read`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1EmployeesEmployeeIdFederalTaxesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1EmployeesEmployeeIdFederalTaxesResponse res = sdk.employeeTaxSetup().getFederalTaxes()
                .employeeUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .call();

        if (res.employeeFederalTax().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `employeeUuid`                                                                                                                                                                                                               | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the employee                                                                                                                                                                                                     |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1EmployeesEmployeeIdFederalTaxesResponse](../../models/operations/GetV1EmployeesEmployeeIdFederalTaxesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateFederalTaxes

Update attributes relevant for an employee's federal taxes.

scope: `employee_federal_taxes:write`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutV1EmployeesEmployeeIdFederalTaxesRequestBody;
import com.gusto.embedded_api.models.operations.PutV1EmployeesEmployeeIdFederalTaxesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutV1EmployeesEmployeeIdFederalTaxesResponse res = sdk.employeeTaxSetup().updateFederalTaxes()
                .employeeUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(PutV1EmployeesEmployeeIdFederalTaxesRequestBody.builder()
                    .version("56a489ce86ed6c1b0f0cecc4050a0b01")
                    .filingStatus("Single")
                    .extraWithholding("0.0")
                    .twoJobs(true)
                    .dependentsAmount("0.0")
                    .otherIncome("0.0")
                    .deductions("0.0")
                    .w4DataType("rev_2020_w4")
                    .build())
                .call();

        if (res.employeeFederalTax().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `employeeUuid`                                                                                                                                                                                                               | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the employee                                                                                                                                                                                                     |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutV1EmployeesEmployeeIdFederalTaxesRequestBody](../../models/operations/PutV1EmployeesEmployeeIdFederalTaxesRequestBody.md)                                                                                                | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutV1EmployeesEmployeeIdFederalTaxesResponse](../../models/operations/PutV1EmployeesEmployeeIdFederalTaxesResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## getStateTaxes

Get attributes relevant for an employee's state taxes.

The data required to correctly calculate an employee's state taxes varies by both home and work location. This API returns information about each question that must be answered grouped by state. Mostly commonly, an employee lives and works in the same state and will only have questions for a single state. The response contains metadata about each question, the type of answer expected, and the current answer stored in Gusto for that question.

Answers are represented by an array. Today, this array can only be empty or contain exactly one element, but is designed to allow for forward compatibility with effective-dated fields. Until effective dated answers are supported, the `valid_from` and `valid_up_to` must always be `"2010-01-01"` and `null` respectively.

## About filing new hire reports
Payroll Admins are responsible for filing a new hire report for each Employee. The `file_new_hire_report` question will only be listed if:
- the `employee.onboarding_status` is one of the following:
  - `admin_onboarding_incomplete`
  - `self_onboarding_awaiting_admin_review`
- that employee's work state requires filing a new hire report

scope: `employee_state_taxes:read`


### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1EmployeesEmployeeIdStateTaxesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1EmployeesEmployeeIdStateTaxesResponse res = sdk.employeeTaxSetup().getStateTaxes()
                .employeeUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .call();

        if (res.employeeStateTaxesList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `employeeUuid`                                                                                                                                                                                                               | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the employee                                                                                                                                                                                                     |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1EmployeesEmployeeIdStateTaxesResponse](../../models/operations/GetV1EmployeesEmployeeIdStateTaxesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateStateTaxes

Update attributes relevant for an employee's state taxes.

As described for the GET endpoint, the answers must be supplied in the effective-dated format, but currently only a single answer will be accepted - `valid_from` and `valid_up_to` must be `"2010-01-01"` and `null` respectively.

scope: `employee_state_taxes:write`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.Answers;
import com.gusto.embedded_api.models.operations.PutV1EmployeesEmployeeIdStateTaxesRequestBody;
import com.gusto.embedded_api.models.operations.PutV1EmployeesEmployeeIdStateTaxesResponse;
import com.gusto.embedded_api.models.operations.Questions;
import com.gusto.embedded_api.models.operations.States;
import java.lang.Exception;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutV1EmployeesEmployeeIdStateTaxesResponse res = sdk.employeeTaxSetup().updateStateTaxes()
                .employeeUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(PutV1EmployeesEmployeeIdStateTaxesRequestBody.builder()
                    .states(List.of(
                        States.builder()
                            .state("CA")
                            .questions(List.of(
                                Questions.builder()
                                    .key("filing_status")
                                    .answers(List.of(
                                        Answers.builder()
                                            .value("M")
                                            .validFrom("2010-01-01")
                                            .validUpTo(JsonNullable.of(null))
                                            .build()))
                                    .build(),
                                Questions.builder()
                                    .key("withholding_allowance")
                                    .answers(List.of(
                                        Answers.builder()
                                            .value("2")
                                            .validFrom("2010-01-01")
                                            .validUpTo(JsonNullable.of(null))
                                            .build()))
                                    .build(),
                                Questions.builder()
                                    .key("additional_withholding")
                                    .answers(List.of(
                                        Answers.builder()
                                            .value("25.0")
                                            .validFrom("2010-01-01")
                                            .validUpTo(JsonNullable.of(null))
                                            .build()))
                                    .build(),
                                Questions.builder()
                                    .key("file_new_hire_report")
                                    .answers(List.of(
                                        Answers.builder()
                                            .value("true")
                                            .validFrom("2010-01-01")
                                            .validUpTo(JsonNullable.of(null))
                                            .build()))
                                    .build()))
                            .build()))
                    .build())
                .call();

        if (res.employeeStateTaxesList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `employeeUuid`                                                                                                                                                                                                               | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the employee                                                                                                                                                                                                     |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutV1EmployeesEmployeeIdStateTaxesRequestBody](../../models/operations/PutV1EmployeesEmployeeIdStateTaxesRequestBody.md)                                                                                                    | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutV1EmployeesEmployeeIdStateTaxesResponse](../../models/operations/PutV1EmployeesEmployeeIdStateTaxesResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |