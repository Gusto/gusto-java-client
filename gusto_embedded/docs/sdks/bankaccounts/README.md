# BankAccounts
(*bankAccounts()*)

## Overview

### Available Operations

* [create](#create) - Create a company bank account
* [get](#get) - Get all company bank accounts
* [verify](#verify) - Verify a company bank account
* [createFromPlaidToken](#createfromplaidtoken) - Create a bank account from a plaid processor token

## create

This endpoint creates a new company bank account.

Upon being created, two verification deposits are automatically sent to the bank account, and the bank account's verification_status is 'awaiting_deposits'. 

When the deposits are successfully transferred, the verification_status changes to 'ready_for_verification', at which point the verify endpoint can be used to verify the bank account.
After successful verification, the bank account's verification_status is 'verified'.

scope: `company_bank_accounts:write`

> 🚧 Warning
>
> If a default bank account exists, it will be disabled and the new bank account will replace it as the company's default funding method.

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

        PostV1CompaniesCompanyIdBankAccountsResponse res = sdk.bankAccounts().create()
                .companyId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PostV1CompaniesCompanyIdBankAccountsRequestBody.builder()
                    .routingNumber("115092013")
                    .accountNumber("9775014007")
                    .accountType(AccountType.CHECKING)
                    .build())
                .call();

        if (res.companyBankAccount().isPresent()) {
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
| `requestBody`                                                                                                                                                                                                                | [PostV1CompaniesCompanyIdBankAccountsRequestBody](../../models/operations/PostV1CompaniesCompanyIdBankAccountsRequestBody.md)                                                                                                | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostV1CompaniesCompanyIdBankAccountsResponse](../../models/operations/PostV1CompaniesCompanyIdBankAccountsResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## get

Returns company bank accounts. Currently, we only support a single default bank account per company.

scope: `company_bank_accounts:read`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1CompaniesCompanyIdBankAccountsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        GetV1CompaniesCompanyIdBankAccountsResponse res = sdk.bankAccounts().get()
                .companyId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        if (res.companyBankAccountList().isPresent()) {
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

### Response

**[GetV1CompaniesCompanyIdBankAccountsResponse](../../models/operations/GetV1CompaniesCompanyIdBankAccountsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## verify

Verify a company bank account by confirming the two micro-deposits sent to the bank account. Note that the order of the two deposits specified in request parameters does not matter. There's a maximum of 5 verification attempts, after which we will automatically initiate a new set of micro-deposits and require the bank account to be verified with the new micro-deposits.

### Bank account verification in demo

We provide the endpoint `POST '/v1/companies/{company_id}/bank_accounts/{bank_account_uuid}/send_test_deposits'` to facilitate bank account verification in the demo environment. This endpoint simulates the micro-deposits transfer and returns them in the response. You can call this endpoint as many times as you wish to retrieve the values of the two micro deposits.

```
  POST '/v1/companies/89771af8-b964-472e-8064-554dfbcb56d9/bank_accounts/ade55e57-4800-4059-9ecd-fa29cfeb6dd2/send_test_deposits'

  {
    "deposit_1": 0.02,
    "deposit_2": 0.42
  }
```

scope: `company_bank_accounts:write`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody;
import com.gusto.embedded_api.models.operations.PutV1CompaniesCompanyIdBankAccountsVerifyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
            .build();

        PutV1CompaniesCompanyIdBankAccountsVerifyResponse res = sdk.bankAccounts().verify()
                .bankAccountUuid("<id>")
                .companyId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody.builder()
                    .deposit1(0.02)
                    .deposit2(0.42)
                    .build())
                .call();

        if (res.companyBankAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `bankAccountUuid`                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the bank account                                                                                                                                                                                                 |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody](../../models/operations/PutV1CompaniesCompanyIdBankAccountsVerifyRequestBody.md)                                                                                      | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutV1CompaniesCompanyIdBankAccountsVerifyResponse](../../models/operations/PutV1CompaniesCompanyIdBankAccountsVerifyResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## createFromPlaidToken

This endpoint creates a new **verified** bank account by using a plaid processor token to retrieve its information.

scope: `plaid_processor:write`

> 📘
> To create a token please use the [plaid api](https://plaid.com/docs/api/processors/#processortokencreate) and select "gusto" as processor.

> 🚧 Warning - Company Bank Accounts
>
> If a default company bank account exists, it will be disabled and the new bank account will replace it as the company's default funding method.

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

        PostV1PlaidProcessorTokenResponse res = sdk.bankAccounts().createFromPlaidToken()
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PostV1PlaidProcessorTokenRequestBody.builder()
                    .ownerType(OwnerType.COMPANY)
                    .ownerId("ef279fbd-0fc6-4cf1-a977-6939d621c429")
                    .processorToken("processor-sandbox-0asd1-a92nc")
                    .build())
                .call();

        if (res.oneOf().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PostV1PlaidProcessorTokenRequestBody](../../models/operations/PostV1PlaidProcessorTokenRequestBody.md)                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostV1PlaidProcessorTokenResponse](../../models/operations/PostV1PlaidProcessorTokenResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |