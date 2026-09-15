# Reports

## Overview

### Available Operations

* [postV1BulkReports](#postv1bulkreports) - Create a bulk report batch
* [getV1BulkReportsRequestUuid](#getv1bulkreportsrequestuuid) - Get a bulk report batch
* [postV1CompaniesCompanyIdReportsEmployeesAnnualFicaWage](#postv1companiescompanyidreportsemployeesannualficawage) - Create an employees annual FICA wage report
* [createCustom](#createcustom) - Create a custom report
* [postPayrollsPayrollUuidReportsGeneralLedger](#postpayrollspayrolluuidreportsgeneralledger) - Create a general ledger report
* [getReportsRequestUuid](#getreportsrequestuuid) - Get a report
* [getTemplate](#gettemplate) - Get a report template

## postV1BulkReports

Triggers asynchronous generation of up to 25 reports across companies the partner is mapped to. Each `batch` item is a `custom_report` (same parameters as [create a custom report](https://docs.gusto.com/embedded-payroll/reference/post-companies-company_uuid-reports)) or a `general_ledger` report (same parameters as [create a general ledger report](https://docs.gusto.com/embedded-payroll/reference/post-payrolls-payroll_uuid-reports-general_ledger)), keyed by `company_uuid` and `report_type`. Items are validated synchronously; if any is invalid, the entire batch is rejected.

Poll the [bulk report GET endpoint](https://docs.gusto.com/embedded-payroll/reference/get-v1-bulk_reports-request_uuid) with the returned `uuid` for status and the report URL, which is valid for 10 minutes.

📘 System Access Authentication

This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access)

scope: `company_reports:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="post-v1-bulk_reports" method="post" path="/v1/bulk_reports" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.*;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.*;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        PostV1BulkReportsResponse res = sdk.reports().postV1BulkReports()
                .security(PostV1BulkReportsSecurity.builder()
                    .systemAccessAuth(System.getenv().getOrDefault("SYSTEM_ACCESS_AUTH", ""))
                    .build())
                .xGustoAPIVersion(PostV1BulkReportsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .bulkReportBody(BulkReportBody.builder()
                    .batch(List.of(
                        BulkReportCustomReportItem.builder()
                            .companyUuid("12345678-abcd-ef12-3456-7890abcdef12")
                            .reportType(ReportType.CUSTOM_REPORT)
                            .columns(List.of(
                                Columns.EMPLOYEE_FIRST_NAME))
                            .fileType(FileType.CSV)
                            .groupings(List.of(
                                Groupings.EMPLOYEE))
                            .customName("Q1 Payroll Export")
                            .dateFilterType(DateFilterType.CHECK_DATE)
                            .startDate(LocalDate.parse("2026-01-01"))
                            .endDate(LocalDate.parse("2026-03-31"))
                            .paymentMethod(PaymentMethod.CHECK)
                            .employmentType(EmploymentType.EXEMPT)
                            .employmentStatus(EmploymentStatus.ACTIVE_FULL_TIME)
                            .build(),
                        BulkReportGeneralLedgerItem.builder()
                            .companyUuid("12345678-abcd-ef12-3456-7890abcdef12")
                            .reportType(BulkReportGeneralLedgerItemReportType.GENERAL_LEDGER)
                            .payrollUuid("7b1d0df1-6403-4a06-8768-c1dd7d24d27a")
                            .aggregation(Aggregation.DEFAULT)
                            .build()))
                    .build())
                .call();

        if (res.createBulkReport().isPresent()) {
            System.out.println(res.createBulkReport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Example                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `security`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | [com.gusto.embedded_api.models.operations.PostV1BulkReportsSecurity](../../models/operations/PostV1BulkReportsSecurity.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | The security requirements to use for the request.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | [Optional\<PostV1BulkReportsHeaderXGustoAPIVersion>](../../models/operations/PostV1BulkReportsHeaderXGustoAPIVersion.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used.                                                                                                                                                                                                                                                                                                                                                                                                         |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| `bulkReportBody`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | [BulkReportBody](../../models/components/BulkReportBody.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | N/A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | {<br/>"batch": [<br/>{<br/>"company_uuid": "12345678-abcd-ef12-3456-7890abcdef12",<br/>"report_type": "custom_report",<br/>"columns": [<br/>"employee_first_name"<br/>],<br/>"groupings": [<br/>"employee"<br/>],<br/>"file_type": "csv",<br/>"custom_name": "Q1 Payroll Export",<br/>"with_totals": false,<br/>"start_date": "2026-01-01",<br/>"end_date": "2026-03-31",<br/>"date_filter_type": "check_date",<br/>"payment_method": "check",<br/>"employment_type": "exempt",<br/>"employment_status": "active_full_time"<br/>},<br/>{<br/>"company_uuid": "12345678-abcd-ef12-3456-7890abcdef12",<br/>"report_type": "general_ledger",<br/>"payroll_uuid": "7b1d0df1-6403-4a06-8768-c1dd7d24d27a",<br/>"aggregation": "default"<br/>}<br/>]<br/>} |

### Response

**[PostV1BulkReportsResponse](../../models/operations/PostV1BulkReportsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## getV1BulkReportsRequestUuid

Get a bulk report batch's status and results given the `request_uuid`. While in progress, only batch metadata is returned; once complete, it also includes a signed `report_url` (a zip of all generated reports, valid for 10 minutes) and a per-company breakdown.

Reports containing PHI are inaccessible with `company_reports:read:tier_2_only` data scope.

📘 System Access Authentication

This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access)

scope: `company_reports:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-bulk_reports-request_uuid" method="get" path="/v1/bulk_reports/{request_uuid}" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        GetV1BulkReportsRequestUuidResponse res = sdk.reports().getV1BulkReportsRequestUuid()
                .security(GetV1BulkReportsRequestUuidSecurity.builder()
                    .systemAccessAuth(System.getenv().getOrDefault("SYSTEM_ACCESS_AUTH", ""))
                    .build())
                .xGustoAPIVersion(GetV1BulkReportsRequestUuidHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestUuid("<id>")
                .call();

        if (res.bulkReport().isPresent()) {
            System.out.println(res.bulkReport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                   | [com.gusto.embedded_api.models.operations.GetV1BulkReportsRequestUuidSecurity](../../models/operations/GetV1BulkReportsRequestUuidSecurity.md)                                                                               | :heavy_check_mark:                                                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                                                            |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1BulkReportsRequestUuidHeaderXGustoAPIVersion>](../../models/operations/GetV1BulkReportsRequestUuidHeaderXGustoAPIVersion.md)                                                                                 | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the bulk report batch.                                                                                                                                                                                           |

### Response

**[GetV1BulkReportsRequestUuidResponse](../../models/operations/GetV1BulkReportsRequestUuidResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## postV1CompaniesCompanyIdReportsEmployeesAnnualFicaWage

Generates a report containing annual FICA (Federal Insurance Contributions Act) wage data for all employees in a company over a specified year range.

This report provides detailed wage information subject to Social Security and Medicare taxes, useful for benefits integrations that need to verify employee earnings for compliance and benefit calculations.

The report is generated asynchronously. After making this request, you will receive a `request_uuid` which can be used to poll the [Get a report](ref:get-v1-reports-request_uuid) endpoint to check the status and retrieve the report when complete.

scope: `company_reports:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="post-v1-companies-company_id-reports-employees_annual_fica_wage" method="post" path="/v1/companies/{company_id}/reports/employees_annual_fica_wage" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostV1CompaniesCompanyIdReportsEmployeesAnnualFicaWageResponse res = sdk.reports().postV1CompaniesCompanyIdReportsEmployeesAnnualFicaWage()
                .xGustoAPIVersion(PostV1CompaniesCompanyIdReportsEmployeesAnnualFicaWageHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .companyId("<id>")
                .requestBody(PostV1CompaniesCompanyIdReportsEmployeesAnnualFicaWageRequestBody.builder()
                    .startYear(2023L)
                    .endYear(2024L)
                    .build())
                .call();

        if (res.employeesAnnualFicaWageReportAcceptance().isPresent()) {
            System.out.println(res.employeesAnnualFicaWageReportAcceptance().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<PostV1CompaniesCompanyIdReportsEmployeesAnnualFicaWageHeaderXGustoAPIVersion>](../../models/operations/PostV1CompaniesCompanyIdReportsEmployeesAnnualFicaWageHeaderXGustoAPIVersion.md)                           | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `requestBody`                                                                                                                                                                                                                | [PostV1CompaniesCompanyIdReportsEmployeesAnnualFicaWageRequestBody](../../models/operations/PostV1CompaniesCompanyIdReportsEmployeesAnnualFicaWageRequestBody.md)                                                            | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostV1CompaniesCompanyIdReportsEmployeesAnnualFicaWageResponse](../../models/operations/PostV1CompaniesCompanyIdReportsEmployeesAnnualFicaWageResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## createCustom

Create a custom report for a company. This endpoint initiates creating a custom report with custom columns, groupings, and filters. The `request_uuid` in the response can then be used to poll for the status and report URL upon completion using the [report GET endpoint](https://docs.gusto.com/embedded-payroll/reference/get-reports-request_uuid). This URL is valid for 10 minutes.

scope: `company_reports:write`

### Example Usage: Basic

<!-- UsageSnippet language="java" operationID="post-companies-company_uuid-reports" method="post" path="/v1/companies/{company_uuid}/reports" example="Basic" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.*;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.PostCompaniesCompanyUuidReportsHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.PostCompaniesCompanyUuidReportsResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostCompaniesCompanyUuidReportsResponse res = sdk.reports().createCustom()
                .xGustoAPIVersion(PostCompaniesCompanyUuidReportsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .companyUuid("<id>")
                .createReportBody(CreateReportBody.builder()
                    .columns(List.of(
                        CreateReportBodyColumns.TOTAL_TIME_OFF_EARNINGS))
                    .fileType(CreateReportBodyFileType.JSON)
                    .groupings(List.of())
                    .startDate(LocalDate.parse("2024-01-01"))
                    .endDate(LocalDate.parse("2024-04-01"))
                    .dismissedStartDate(LocalDate.parse("2024-01-01"))
                    .dismissedEndDate(LocalDate.parse("2024-04-01"))
                    .build())
                .call();

        if (res.createReport().isPresent()) {
            System.out.println(res.createReport().get());
        }
    }
}
```
### Example Usage: Example

<!-- UsageSnippet language="java" operationID="post-companies-company_uuid-reports" method="post" path="/v1/companies/{company_uuid}/reports" example="Example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.*;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.PostCompaniesCompanyUuidReportsHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.PostCompaniesCompanyUuidReportsResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostCompaniesCompanyUuidReportsResponse res = sdk.reports().createCustom()
                .xGustoAPIVersion(PostCompaniesCompanyUuidReportsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .companyUuid("<id>")
                .createReportBody(CreateReportBody.builder()
                    .columns(List.of(
                        CreateReportBodyColumns.TOTAL_TIME_OFF_EARNINGS))
                    .fileType(CreateReportBodyFileType.JSON)
                    .groupings(List.of())
                    .startDate(LocalDate.parse("2024-01-01"))
                    .endDate(LocalDate.parse("2024-04-01"))
                    .dismissedStartDate(LocalDate.parse("2024-01-01"))
                    .dismissedEndDate(LocalDate.parse("2024-04-01"))
                    .build())
                .call();

        if (res.createReport().isPresent()) {
            System.out.println(res.createReport().get());
        }
    }
}
```
### Example Usage: Nested

<!-- UsageSnippet language="java" operationID="post-companies-company_uuid-reports" method="post" path="/v1/companies/{company_uuid}/reports" example="Nested" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.*;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.PostCompaniesCompanyUuidReportsHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.PostCompaniesCompanyUuidReportsResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostCompaniesCompanyUuidReportsResponse res = sdk.reports().createCustom()
                .xGustoAPIVersion(PostCompaniesCompanyUuidReportsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .companyUuid("<id>")
                .createReportBody(CreateReportBody.builder()
                    .columns(List.of(
                        CreateReportBodyColumns.TOTAL_TIME_OFF_EARNINGS))
                    .fileType(CreateReportBodyFileType.JSON)
                    .groupings(List.of())
                    .startDate(LocalDate.parse("2024-01-01"))
                    .endDate(LocalDate.parse("2024-04-01"))
                    .dismissedStartDate(LocalDate.parse("2024-01-01"))
                    .dismissedEndDate(LocalDate.parse("2024-04-01"))
                    .build())
                .call();

        if (res.createReport().isPresent()) {
            System.out.println(res.createReport().get());
        }
    }
}
```
### Example Usage: Resource

<!-- UsageSnippet language="java" operationID="post-companies-company_uuid-reports" method="post" path="/v1/companies/{company_uuid}/reports" example="Resource" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.*;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.PostCompaniesCompanyUuidReportsHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.PostCompaniesCompanyUuidReportsResponse;
import java.lang.Exception;
import java.time.LocalDate;
import java.util.List;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostCompaniesCompanyUuidReportsResponse res = sdk.reports().createCustom()
                .xGustoAPIVersion(PostCompaniesCompanyUuidReportsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .companyUuid("<id>")
                .createReportBody(CreateReportBody.builder()
                    .columns(List.of(
                        CreateReportBodyColumns.TOTAL_TIME_OFF_EARNINGS))
                    .fileType(CreateReportBodyFileType.JSON)
                    .groupings(List.of())
                    .startDate(LocalDate.parse("2024-01-01"))
                    .endDate(LocalDate.parse("2024-04-01"))
                    .dismissedStartDate(LocalDate.parse("2024-01-01"))
                    .dismissedEndDate(LocalDate.parse("2024-04-01"))
                    .build())
                .call();

        if (res.createReport().isPresent()) {
            System.out.println(res.createReport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<PostCompaniesCompanyUuidReportsHeaderXGustoAPIVersion>](../../models/operations/PostCompaniesCompanyUuidReportsHeaderXGustoAPIVersion.md)                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `createReportBody`                                                                                                                                                                                                           | [CreateReportBody](../../models/components/CreateReportBody.md)                                                                                                                                                              | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostCompaniesCompanyUuidReportsResponse](../../models/operations/PostCompaniesCompanyUuidReportsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## postPayrollsPayrollUuidReportsGeneralLedger

Create a general ledger report for a payroll. The report can be aggregated by different dimensions such as job or department.

Use the `request_uuid` in the response with the [report GET endpoint](../reference/get-reports-request_uuid) to poll for the status and report URL upon completion. The retrieved report will be generated in a JSON format.

scope: `company_reports:write`

### Example Usage: Basic

<!-- UsageSnippet language="java" operationID="post-payrolls-payroll_uuid-reports-general_ledger" method="post" path="/v1/payrolls/{payroll_uuid}/reports/general_ledger" example="Basic" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.GeneralLedgerReportBody;
import com.gusto.embedded_api.models.components.GeneralLedgerReportBodyAggregation;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.PostPayrollsPayrollUuidReportsGeneralLedgerHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.PostPayrollsPayrollUuidReportsGeneralLedgerResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostPayrollsPayrollUuidReportsGeneralLedgerResponse res = sdk.reports().postPayrollsPayrollUuidReportsGeneralLedger()
                .xGustoAPIVersion(PostPayrollsPayrollUuidReportsGeneralLedgerHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .payrollUuid("<id>")
                .generalLedgerReportBody(GeneralLedgerReportBody.builder()
                    .aggregation(GeneralLedgerReportBodyAggregation.DEFAULT)
                    .build())
                .call();

        if (res.generalLedgerReport().isPresent()) {
            System.out.println(res.generalLedgerReport().get());
        }
    }
}
```
### Example Usage: Example

<!-- UsageSnippet language="java" operationID="post-payrolls-payroll_uuid-reports-general_ledger" method="post" path="/v1/payrolls/{payroll_uuid}/reports/general_ledger" example="Example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.GeneralLedgerReportBody;
import com.gusto.embedded_api.models.components.GeneralLedgerReportBodyAggregation;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.PostPayrollsPayrollUuidReportsGeneralLedgerHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.PostPayrollsPayrollUuidReportsGeneralLedgerResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostPayrollsPayrollUuidReportsGeneralLedgerResponse res = sdk.reports().postPayrollsPayrollUuidReportsGeneralLedger()
                .xGustoAPIVersion(PostPayrollsPayrollUuidReportsGeneralLedgerHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .payrollUuid("<id>")
                .generalLedgerReportBody(GeneralLedgerReportBody.builder()
                    .aggregation(GeneralLedgerReportBodyAggregation.DEFAULT)
                    .build())
                .call();

        if (res.generalLedgerReport().isPresent()) {
            System.out.println(res.generalLedgerReport().get());
        }
    }
}
```
### Example Usage: Nested

<!-- UsageSnippet language="java" operationID="post-payrolls-payroll_uuid-reports-general_ledger" method="post" path="/v1/payrolls/{payroll_uuid}/reports/general_ledger" example="Nested" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.GeneralLedgerReportBody;
import com.gusto.embedded_api.models.components.GeneralLedgerReportBodyAggregation;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.PostPayrollsPayrollUuidReportsGeneralLedgerHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.PostPayrollsPayrollUuidReportsGeneralLedgerResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostPayrollsPayrollUuidReportsGeneralLedgerResponse res = sdk.reports().postPayrollsPayrollUuidReportsGeneralLedger()
                .xGustoAPIVersion(PostPayrollsPayrollUuidReportsGeneralLedgerHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .payrollUuid("<id>")
                .generalLedgerReportBody(GeneralLedgerReportBody.builder()
                    .aggregation(GeneralLedgerReportBodyAggregation.DEFAULT)
                    .build())
                .call();

        if (res.generalLedgerReport().isPresent()) {
            System.out.println(res.generalLedgerReport().get());
        }
    }
}
```
### Example Usage: Resource

<!-- UsageSnippet language="java" operationID="post-payrolls-payroll_uuid-reports-general_ledger" method="post" path="/v1/payrolls/{payroll_uuid}/reports/general_ledger" example="Resource" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.GeneralLedgerReportBody;
import com.gusto.embedded_api.models.components.GeneralLedgerReportBodyAggregation;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.PostPayrollsPayrollUuidReportsGeneralLedgerHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.PostPayrollsPayrollUuidReportsGeneralLedgerResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostPayrollsPayrollUuidReportsGeneralLedgerResponse res = sdk.reports().postPayrollsPayrollUuidReportsGeneralLedger()
                .xGustoAPIVersion(PostPayrollsPayrollUuidReportsGeneralLedgerHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .payrollUuid("<id>")
                .generalLedgerReportBody(GeneralLedgerReportBody.builder()
                    .aggregation(GeneralLedgerReportBodyAggregation.DEFAULT)
                    .build())
                .call();

        if (res.generalLedgerReport().isPresent()) {
            System.out.println(res.generalLedgerReport().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<PostPayrollsPayrollUuidReportsGeneralLedgerHeaderXGustoAPIVersion>](../../models/operations/PostPayrollsPayrollUuidReportsGeneralLedgerHeaderXGustoAPIVersion.md)                                                 | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `payrollUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll                                                                                                                                                                                                      |
| `generalLedgerReportBody`                                                                                                                                                                                                    | [GeneralLedgerReportBody](../../models/components/GeneralLedgerReportBody.md)                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostPayrollsPayrollUuidReportsGeneralLedgerResponse](../../models/operations/PostPayrollsPayrollUuidReportsGeneralLedgerResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## getReportsRequestUuid

Get a company's report given the `request_uuid`. The response will include the report request's status and, if complete, the report URL.

Reports containing PHI are inaccessible with `company_reports:read:tier_2_only` data scope

scope: `company_reports:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-reports-request_uuid" method="get" path="/v1/reports/{request_uuid}" example="Example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.operations.GetReportsRequestUuidHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.GetReportsRequestUuidResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetReportsRequestUuidResponse res = sdk.reports().getReportsRequestUuid()
                .xGustoAPIVersion(GetReportsRequestUuidHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestUuid("<id>")
                .call();

        if (res.report().isPresent()) {
            System.out.println(res.report().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetReportsRequestUuidHeaderXGustoAPIVersion>](../../models/operations/GetReportsRequestUuidHeaderXGustoAPIVersion.md)                                                                                             | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the request to generate a document. Generate document endpoints return request_uuids to be used with the GET generated document endpoint.                                                                        |

### Response

**[GetReportsRequestUuidResponse](../../models/operations/GetReportsRequestUuidResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## getTemplate

Get a company's report template. The only supported report type is `payroll_journal`. The resulting columns and groupings from this endpoint can be used as a guidance to create the report using the POST create report endpoint.

scope: `company_reports:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-companies-company_uuid-report-templates-report_type" method="get" path="/v1/companies/{company_uuid}/report_templates/{report_type}" example="Example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api.models.operations.GetCompaniesCompanyUuidReportTemplatesReportTypeHeaderXGustoAPIVersion;
import com.gusto.embedded_api.models.operations.GetCompaniesCompanyUuidReportTemplatesReportTypeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetCompaniesCompanyUuidReportTemplatesReportTypeResponse res = sdk.reports().getTemplate()
                .xGustoAPIVersion(GetCompaniesCompanyUuidReportTemplatesReportTypeHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .companyUuid("<id>")
                .reportType("<value>")
                .call();

        if (res.reportTemplate().isPresent()) {
            System.out.println(res.reportTemplate().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetCompaniesCompanyUuidReportTemplatesReportTypeHeaderXGustoAPIVersion>](../../models/operations/GetCompaniesCompanyUuidReportTemplatesReportTypeHeaderXGustoAPIVersion.md)                                       | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `reportType`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The report type                                                                                                                                                                                                              |

### Response

**[GetCompaniesCompanyUuidReportTemplatesReportTypeResponse](../../models/operations/GetCompaniesCompanyUuidReportTemplatesReportTypeResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |