# TaxRequirements
(*taxRequirements()*)

## Overview

### Available Operations

* [get](#get) - Get State Tax Requirements
* [updateState](#updatestate) - Update State Tax Requirements
* [getAll](#getall) - Get All Tax Requirement States

## get

Get all tax requirements for a given state.

### Metadata Examples

```json select
{
  "type": "select",
  "options": [
    { "label": "Semiweekly",  value: "Semi-weekly" },
    { "label": "Monthly",  value: "Monthly" },
    { "label": "Quarterly",  value: "Quarterly" },
  ]
}
```
```json radio
{
  "type": "radio",
  "options": [
    { "label": "No, we cannot reimburse",  value: false, short_label: "Not Reimbursable" },
    { "label": "Yes, we can reimburse",  value: true, short_label: "Reimbursable" },
  ]
}
```
```json account_number
{
  "type": "account_number",
  "mask": "######-##',
  "prefix": null
}
```
```json tax_rate
{
  "type": "tax_rate",
  "validation": {
    "type": "min_max",
    "min": "0.0004",
    "max": "0.081"
  }
}
```

scope: `company_tax_requirements:read`


### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyUuidTaxRequirementsStateResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1CompaniesCompanyUuidTaxRequirementsStateResponse res = sdk.taxRequirements().get()
                .companyUuid("<id>")
                .state("Oklahoma")
                .scheduling(false)
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        if (res.taxRequirementsState().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `state`                                                                                                                                                                                                                      | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | 2-letter US state abbreviation                                                                                                                                                                                               |
| `scheduling`                                                                                                                                                                                                                 | *Optional\<Boolean>*                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | When true, return "new" requirement sets with valid `effective_from` dates that are available to save new effective dated values.                                                                                            |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1CompaniesCompanyUuidTaxRequirementsStateResponse](../../models/operations/GetV1CompaniesCompanyUuidTaxRequirementsStateResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateState

Update State Tax Requirements

scope: `company_tax_requirements:write`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.*;
import java.lang.Exception;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutV1CompaniesCompanyUuidTaxRequirementsStateResponse res = sdk.taxRequirements().updateState()
                .companyUuid("<id>")
                .state("Massachusetts")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody.builder()
                    .requirementSets(List.of(
                        RequirementSets.builder()
                            .key("registrations")
                            .effectiveFrom(JsonNullable.of(null))
                            .state("GA")
                            .requirements(List.of(
                                Requirements.builder()
                                    .key("71653ec0-00b5-4c66-a58b-22ecf21704c5")
                                    .value("1233214-AB")
                                    .build(),
                                Requirements.builder()
                                    .key("6c0911ab-5860-412e-bdef-6437cd881df5")
                                    .value("474747-22")
                                    .build()))
                            .build(),
                        RequirementSets.builder()
                            .key("taxrates")
                            .effectiveFrom("2022-01-01")
                            .state("GA")
                            .requirements(List.of(
                                Requirements.builder()
                                    .key("e0ac2284-8d30-4100-ae23-f85f9574868b")
                                    .value("0.05")
                                    .build()))
                            .build(),
                        RequirementSets.builder()
                            .key("depositschedules")
                            .effectiveFrom("2022-01-01")
                            .state("GA")
                            .requirements(List.of(
                                Requirements.builder()
                                    .key("6ddfcbeb-94d3-4003-bfc2-8c6e1ca9f70c")
                                    .value("Semi-weekly")
                                    .build()))
                            .build()))
                    .build())
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `state`                                                                                                                                                                                                                      | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | 2-letter US state abbreviation                                                                                                                                                                                               |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody](../../models/operations/PutV1CompaniesCompanyUuidTaxRequirementsStateRequestBody.md)                                                                              | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutV1CompaniesCompanyUuidTaxRequirementsStateResponse](../../models/operations/PutV1CompaniesCompanyUuidTaxRequirementsStateResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## getAll

Returns objects describing the states that have tax requirements for the company

scope: `company_tax_requirements:read`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyUuidTaxRequirementsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1CompaniesCompanyUuidTaxRequirementsResponse res = sdk.taxRequirements().getAll()
                .companyUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        if (res.responseBodies().isPresent()) {
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

**[GetV1CompaniesCompanyUuidTaxRequirementsResponse](../../models/operations/GetV1CompaniesCompanyUuidTaxRequirementsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |