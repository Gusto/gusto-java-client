# HistoricalEmployees
(*historicalEmployees()*)

## Overview

### Available Operations

* [update](#update) - Update a historical employee

## update

Update a historical employee, an employee that was previously dismissed from the company in the current year.

scope: `employees:manage`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.EmployeeStateTaxes;
import com.gusto.embedded_api.models.operations.Job;
import com.gusto.embedded_api.models.operations.PutV1HistoricalEmployeesHomeAddress;
import com.gusto.embedded_api.models.operations.PutV1HistoricalEmployeesRequestBody;
import com.gusto.embedded_api.models.operations.PutV1HistoricalEmployeesResponse;
import com.gusto.embedded_api.models.operations.Termination;
import com.gusto.embedded_api.models.operations.WorkAddress;
import java.lang.Exception;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutV1HistoricalEmployeesResponse res = sdk.historicalEmployees().update()
                .companyUuid("<id>")
                .historicalEmployeeUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(PutV1HistoricalEmployeesRequestBody.builder()
                    .version("db0edd04aaac4506f7edab03ac855d56")
                    .firstName("Soren")
                    .lastName("Kierkegaard")
                    .dateOfBirth("1995-05-05T00:00:00Z")
                    .ssn("123456294")
                    .workAddress(WorkAddress.builder()
                        .locationUuid("1da85d35-1910-4d5e-8e94-39e8cdfe8c9a")
                        .build())
                    .homeAddress(PutV1HistoricalEmployeesHomeAddress.builder()
                        .street1("300 3rd Street")
                        .city("San Francisco")
                        .state("CA")
                        .zip("94107")
                        .street2(JsonNullable.of(null))
                        .build())
                    .termination(Termination.builder()
                        .effectiveDate(LocalDate.parse("2022-09-15T00:00:00Z"))
                        .build())
                    .job(Job.builder()
                        .hireDate(LocalDate.parse("2018-05-09T00:00:00Z"))
                        .build())
                    .middleInitial("A")
                    .employeeStateTaxes(EmployeeStateTaxes.builder()
                        .wcCovered(true)
                        .wcClassCode("20992")
                        .build())
                    .build())
                .call();

        if (res.employee().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyUuid`                                                                                                                                                                                                                | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `historicalEmployeeUuid`                                                                                                                                                                                                     | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the historical employee                                                                                                                                                                                          |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutV1HistoricalEmployeesRequestBody](../../models/operations/PutV1HistoricalEmployeesRequestBody.md)                                                                                                                        | :heavy_check_mark:                                                                                                                                                                                                           | Update a historical employee.                                                                                                                                                                                                |

### Response

**[PutV1HistoricalEmployeesResponse](../../models/operations/PutV1HistoricalEmployeesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |