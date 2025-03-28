# TimeOffPolicies
(*timeOffPolicies()*)

## Overview

### Available Operations

* [calculateAccruingTimeOffHours](#calculateaccruingtimeoffhours) - Calculate accruing time off hours
* [get](#get) - Get a time off policy
* [update](#update) - Update a time off policy
* [getAll](#getall) - Get all time off policies
* [create](#create) - Create a time off policy
* [addEmployees](#addemployees) - Add employees to a time off policy
* [removeEmployees](#removeemployees) - Remove employees from a time off policy
* [updateBalance](#updatebalance) - Update employee time off hour balances
* [deactivate](#deactivate) - Deactivate a time off policy

## calculateAccruingTimeOffHours

Returns a list of accruing time off for each time off policy associated with the employee.

Factors affecting the accrued hours:
  * the time off policy accrual method (whether they get pay per hour worked, per hour paid, with / without overtime, accumulate time off based on pay period / calendar year / anniversary)
  * how many hours of work during this pay period
  * how many hours of PTO / sick hours taken during this pay period (for per hour paid policies only)
  * company pay schedule frequency (for per pay period)

If none of the parameters is passed in, the accrued time off hour will be 0.

scope: `payrolls:read`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PostV1PayrollsPayrollIdCalculateAccruingTimeOffHoursRequestBody;
import com.gusto.embedded_api.models.operations.PostV1PayrollsPayrollIdCalculateAccruingTimeOffHoursResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PostV1PayrollsPayrollIdCalculateAccruingTimeOffHoursResponse res = sdk.timeOffPolicies().calculateAccruingTimeOffHours()
                .payrollId("<id>")
                .employeeId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PostV1PayrollsPayrollIdCalculateAccruingTimeOffHoursRequestBody.builder()
                    .regularHoursWorked(30.25)
                    .overtimeHoursWorked(10)
                    .doubleOvertimeHoursWorked(0)
                    .ptoHoursUsed(5.5)
                    .sickHoursUsed(0)
                    .build())
                .call();

        if (res.accruingTimeOffHourObject().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `payrollId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll                                                                                                                                                                                                      |
| `employeeId`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the employee                                                                                                                                                                                                     |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PostV1PayrollsPayrollIdCalculateAccruingTimeOffHoursRequestBody](../../models/operations/PostV1PayrollsPayrollIdCalculateAccruingTimeOffHoursRequestBody.md)                                                                | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostV1PayrollsPayrollIdCalculateAccruingTimeOffHoursResponse](../../models/operations/PostV1PayrollsPayrollIdCalculateAccruingTimeOffHoursResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## get

Get a time off policy

scope: `time_off_policies:read`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetTimeOffPoliciesTimeOffPolicyUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetTimeOffPoliciesTimeOffPolicyUuidResponse res = sdk.timeOffPolicies().get()
                .timeOffPolicyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        if (res.timeOffPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `timeOffPolicyUuid`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company time off policy                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetTimeOffPoliciesTimeOffPolicyUuidResponse](../../models/operations/GetTimeOffPoliciesTimeOffPolicyUuidResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## update

Update a time off policy

scope: `time_off_policies:write`

### Example Usage

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
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutTimeOffPoliciesTimeOffPolicyUuidResponse res = sdk.timeOffPolicies().update()
                .timeOffPolicyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PutTimeOffPoliciesTimeOffPolicyUuidRequestBody.builder()
                    .name("Hourly Vacation Policy")
                    .accrualMethod(AccrualMethod.PER_HOUR_PAID)
                    .accrualRate("4.0")
                    .accrualRateUnit("80.0")
                    .paidOutOnTermination(true)
                    .accrualWaitingPeriodDays(30L)
                    .carryoverLimitHours("200.0")
                    .maxAccrualHoursPerYear("120.0")
                    .maxHours("240.0")
                    .build())
                .call();

        if (res.timeOffPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `timeOffPolicyUuid`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company time off policy                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutTimeOffPoliciesTimeOffPolicyUuidRequestBody](../../models/operations/PutTimeOffPoliciesTimeOffPolicyUuidRequestBody.md)                                                                                                  | :heavy_check_mark:                                                                                                                                                                                                           | Can update any attributes of the time off policy except policy_type, is_active, complete & employees                                                                                                                         |

### Response

**[PutTimeOffPoliciesTimeOffPolicyUuidResponse](../../models/operations/PutTimeOffPoliciesTimeOffPolicyUuidResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## getAll

Get all time off policies for a company

scope: `time_off_policies:read`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetCompaniesCompanyUuidTimeOffPoliciesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetCompaniesCompanyUuidTimeOffPoliciesResponse res = sdk.timeOffPolicies().getAll()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        if (res.timeOffPolicyList().isPresent()) {
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

**[GetCompaniesCompanyUuidTimeOffPoliciesResponse](../../models/operations/GetCompaniesCompanyUuidTimeOffPoliciesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## create

Create a time off policy

scope: `time_off_policies:write`

### Example Usage

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
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PostCompaniesCompanyUuidTimeOffPoliciesResponse res = sdk.timeOffPolicies().create()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PostCompaniesCompanyUuidTimeOffPoliciesRequestBody.builder()
                    .name("Unlimited Vacation Policy")
                    .policyType("vacation")
                    .accrualMethod(PostCompaniesCompanyUuidTimeOffPoliciesAccrualMethod.UNLIMITED)
                    .build())
                .call();

        if (res.timeOffPolicy().isPresent()) {
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
| `requestBody`                                                                                                                                                                                                                | [PostCompaniesCompanyUuidTimeOffPoliciesRequestBody](../../models/operations/PostCompaniesCompanyUuidTimeOffPoliciesRequestBody.md)                                                                                          | :heavy_check_mark:                                                                                                                                                                                                           | Requires a policy name, a policy_type, and an accrual_method                                                                                                                                                                 |

### Response

**[PostCompaniesCompanyUuidTimeOffPoliciesResponse](../../models/operations/PostCompaniesCompanyUuidTimeOffPoliciesResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## addEmployees

Add employees to a time off policy. Employees are required to have at least one job to be added to a time off policy. Accepts starting balances for non-unlimited policies

scope: `time_off_policies:write`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBody;
import com.gusto.embedded_api.models.operations.PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesResponse res = sdk.timeOffPolicies().addEmployees()
                .timeOffPolicyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBody.builder()
                    .build())
                .call();

        if (res.timeOffPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `timeOffPolicyUuid`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company time off policy                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBody](../../models/operations/PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesRequestBody.md)                                                            | :heavy_check_mark:                                                                                                                                                                                                           | A list of employee objects containing the employee uuid                                                                                                                                                                      |

### Response

**[PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesResponse](../../models/operations/PutVersionTimeOffPoliciesTimeOffPolicyUuidAddEmployeesResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## removeEmployees

Remove employees from a time off policy

scope: `time_off_policies:write`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesRequestBody;
import com.gusto.embedded_api.models.operations.PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesResponse res = sdk.timeOffPolicies().removeEmployees()
                .timeOffPolicyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesRequestBody.builder()
                    .build())
                .call();

        if (res.timeOffPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `timeOffPolicyUuid`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company time off policy                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesRequestBody](../../models/operations/PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesRequestBody.md)                                                                | :heavy_check_mark:                                                                                                                                                                                                           | A list of employee objects containing the employee uuid                                                                                                                                                                      |

### Response

**[PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesResponse](../../models/operations/PutV1TimeOffPoliciesTimeOffPolicyUuidRemoveEmployeesResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## updateBalance

Updates time off hours balances for employees for a time off policy

scope: `time_off_policies:write`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBody;
import com.gusto.embedded_api.models.operations.PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceResponse res = sdk.timeOffPolicies().updateBalance()
                .timeOffPolicyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBody.builder()
                    .build())
                .call();

        if (res.timeOffPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `timeOffPolicyUuid`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company time off policy                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBody](../../models/operations/PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceRequestBody.md)                                                                      | :heavy_check_mark:                                                                                                                                                                                                           | A list of employee objects containing the employee uuid and time off hours balance                                                                                                                                           |

### Response

**[PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceResponse](../../models/operations/PutVersionTimeOffPoliciesTimeOffPolicyUuidBalanceResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## deactivate

Deactivate a time off policy

scope: `time_off_policies:write`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutV1TimeOffPoliciesTimeOffPolicyUuidDeactivateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutV1TimeOffPoliciesTimeOffPolicyUuidDeactivateResponse res = sdk.timeOffPolicies().deactivate()
                .timeOffPolicyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        if (res.timeOffPolicy().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `timeOffPolicyUuid`                                                                                                                                                                                                          | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company time off policy                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[PutV1TimeOffPoliciesTimeOffPolicyUuidDeactivateResponse](../../models/operations/PutV1TimeOffPoliciesTimeOffPolicyUuidDeactivateResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |