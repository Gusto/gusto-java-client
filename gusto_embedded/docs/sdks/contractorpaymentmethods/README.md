# ContractorPaymentMethods
(*contractorPaymentMethods()*)

## Overview

### Available Operations

* [createBankAccount](#createbankaccount) - Create a contractor bank account

## createBankAccount

Creates a contractor bank account.

Note: We currently only support one bank account per contractor. Using this endpoint on a contractor who already has a bank account will just replace it.

scope: `contractor_payment_methods:write`

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.SDK;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.models.errors.UnprocessableEntityErrorObject;
import org.openapis.openapi.models.operations.PostV1ContractorsContractorUuidBankAccountsAccountType;
import org.openapis.openapi.models.operations.PostV1ContractorsContractorUuidBankAccountsRequestBody;
import org.openapis.openapi.models.operations.PostV1ContractorsContractorUuidBankAccountsResponse;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        SDK sdk = SDK.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PostV1ContractorsContractorUuidBankAccountsResponse res = sdk.contractorPaymentMethods().createBankAccount()
                .contractorUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR0401)
                .requestBody(PostV1ContractorsContractorUuidBankAccountsRequestBody.builder()
                    .name("BoA Checking Account")
                    .routingNumber("266905059")
                    .accountNumber("5809431207")
                    .accountType(PostV1ContractorsContractorUuidBankAccountsAccountType.CHECKING)
                    .build())
                .call();

        if (res.contractorBankAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `contractorUuid`                                                                                                                                                                                                             | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the contractor                                                                                                                                                                                                   |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PostV1ContractorsContractorUuidBankAccountsRequestBody](../../models/operations/PostV1ContractorsContractorUuidBankAccountsRequestBody.md)                                                                                  | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostV1ContractorsContractorUuidBankAccountsResponse](../../models/operations/PostV1ContractorsContractorUuidBankAccountsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |