# PayrollCancellations

## Overview

### Available Operations

* [postV1PayrollBatches](#postv1payrollbatches) - Create a payroll cancellation batch
* [getV1PayrollBatchesPayrollBatchUuid](#getv1payrollbatchespayrollbatchuuid) - Get a payroll cancellation batch

## postV1PayrollBatches

Cancels up to 100 payrolls across one or more companies the partner is mapped to, asynchronously.

The batch is processed asynchronously. Use the returned batch UUID to poll `GET /v1/payroll_batches/{payroll_batch_uuid}` for status and per-payroll results.

Each item carries the payroll `uuid` and the `company_uuid` that owns it. A payroll whose company is not mapped to the partner — or that doesn't exist — is recorded as a `not_found` exclusion rather than a hard error, so every requested UUID lands in either `results` or `exclusions`.

Idempotency is scoped per `(partner, idempotency_key)`. A duplicate POST with the same `idempotency_key` returns a 409 Conflict referencing the existing batch UUID — no duplicate processing occurs.

📘 System Access Authentication

This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access)

scope: `payroll_batches:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="post-v1-payroll_batches" method="post" path="/v1/payroll_batches" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2025_11_15.GustoEmbedded;
import com.gusto.embedded_api_v_2025_11_15.models.errors.PayrollBatchConflictError;
import com.gusto.embedded_api_v_2025_11_15.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api_v_2025_11_15.models.operations.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws PayrollBatchConflictError, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        PostV1PayrollBatchesResponse res = sdk.payrollCancellations().postV1PayrollBatches()
                .security(PostV1PayrollBatchesSecurity.builder()
                    .systemAccessAuth(System.getenv().getOrDefault("SYSTEM_ACCESS_AUTH", ""))
                    .build())
                .xGustoAPIVersion(PostV1PayrollBatchesHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .requestBody(PostV1PayrollBatchesRequestBody.builder()
                    .idempotencyKey("80a74f8b-2c16-45e5-9038-aa108849c6e6")
                    .batchAction(BatchAction.CANCEL)
                    .batch(List.of(
                        Batch.builder()
                            .entityType(EntityType.PAYROLL)
                            .uuid("f5ac6d4e-8400-4a52-a5cf-dea57b2ee65a")
                            .companyUuid("7cd3f4a2-0bf9-485a-bbc0-f6adbdf0246b")
                            .build()))
                    .build())
                .call();

        if (res.payrollBatch().isPresent()) {
            System.out.println(res.payrollBatch().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                   | [com.gusto.embedded_api_v_2025_11_15.models.operations.PostV1PayrollBatchesSecurity](../../models/operations/PostV1PayrollBatchesSecurity.md)                                                                                | :heavy_check_mark:                                                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                                                            |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<PostV1PayrollBatchesHeaderXGustoAPIVersion>](../../models/operations/PostV1PayrollBatchesHeaderXGustoAPIVersion.md)                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PostV1PayrollBatchesRequestBody](../../models/operations/PostV1PayrollBatchesRequestBody.md)                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostV1PayrollBatchesResponse](../../models/operations/PostV1PayrollBatchesResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/PayrollBatchConflictError | 409                                     | application/json                        |
| models/errors/UnprocessableEntityError  | 422                                     | application/json                        |
| models/errors/APIException              | 4XX, 5XX                                | \*/\*                                   |

## getV1PayrollBatchesPayrollBatchUuid

Returns the status and per-payroll results of a payroll cancellation batch.

Poll this endpoint until the batch `status` reaches a terminal value (`completed` or `failed`). Once terminal, the response includes the `results` array (one entry per authorized payroll, each with its own per-payroll `status` — `success` or `failed`) and the `exclusions` array (one entry per payroll that could not be processed). A cancel is atomic, so a per-payroll result is only ever `success` or `failed` — never `partial_success`.

Note that the top-level batch `status` (`pending` / `processing` / `completed` / `failed`) is the request lifecycle, distinct from the per-payroll `status` inside `results[]`. A `completed` batch does not imply every payroll was cancelled — inspect the array for per-payroll outcomes.

Results are stored in Redis with a limited TTL after completion. If the partner polls after results have expired, this endpoint returns 410 Gone — partners should re-submit a new batch.

📘 System Access Authentication

This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access)

scope: `payroll_batches:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-payroll_batches-payroll_batch_uuid" method="get" path="/v1/payroll_batches/{payroll_batch_uuid}" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2025_11_15.GustoEmbedded;
import com.gusto.embedded_api_v_2025_11_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2025_11_15.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        GetV1PayrollBatchesPayrollBatchUuidResponse res = sdk.payrollCancellations().getV1PayrollBatchesPayrollBatchUuid()
                .security(GetV1PayrollBatchesPayrollBatchUuidSecurity.builder()
                    .systemAccessAuth(System.getenv().getOrDefault("SYSTEM_ACCESS_AUTH", ""))
                    .build())
                .xGustoAPIVersion(GetV1PayrollBatchesPayrollBatchUuidHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .payrollBatchUuid("<id>")
                .call();

        if (res.payrollBatchResults().isPresent()) {
            System.out.println(res.payrollBatchResults().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                   | [com.gusto.embedded_api_v_2025_11_15.models.operations.GetV1PayrollBatchesPayrollBatchUuidSecurity](../../models/operations/GetV1PayrollBatchesPayrollBatchUuidSecurity.md)                                                  | :heavy_check_mark:                                                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                                                            |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1PayrollBatchesPayrollBatchUuidHeaderXGustoAPIVersion>](../../models/operations/GetV1PayrollBatchesPayrollBatchUuidHeaderXGustoAPIVersion.md)                                                                 | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `payrollBatchUuid`                                                                                                                                                                                                           | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the payroll cancellation batch returned by `POST /v1/payroll_batches`.                                                                                                                                           |

### Response

**[GetV1PayrollBatchesPayrollBatchUuidResponse](../../models/operations/GetV1PayrollBatchesPayrollBatchUuidResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404, 410                          | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |