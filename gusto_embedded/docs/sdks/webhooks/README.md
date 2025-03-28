# Webhooks
(*webhooks()*)

## Overview

### Available Operations

* [createSubscription](#createsubscription) - Create a webhook subscription
* [listSubscriptions](#listsubscriptions) - List webhook subscriptions
* [updateSubscription](#updatesubscription) - Update a webhook subscription
* [getSubscription](#getsubscription) - Get a webhook subscription
* [deleteSubscription](#deletesubscription) - Delete a webhook subscription
* [verify](#verify) - Verify the webhook subscription
* [requestVerificationToken](#requestverificationtoken) - Request the webhook subscription verification_token

## createSubscription

Create a webhook subscription to receive events of the specified subscription_types whenever there is a state change.

> 📘 System Access Authentication
>
> This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access).

scope: `webhook_subscriptions:write`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        PostV1WebhookSubscriptionResponse res = sdk.webhooks().createSubscription()
                .security(PostV1WebhookSubscriptionSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PostV1WebhookSubscriptionRequestBody.builder()
                    .url("https://partner-app.com/subscriber")
                    .subscriptionTypes(List.of(
                        SubscriptionTypes.COMPANY,
                        SubscriptionTypes.EMPLOYEE))
                    .build())
                .call();

        if (res.webhookSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                   | [com.gusto.embedded_api.models.operations.PostV1WebhookSubscriptionSecurity](../../models/operations/PostV1WebhookSubscriptionSecurity.md)                                                                                   | :heavy_check_mark:                                                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                                                            |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PostV1WebhookSubscriptionRequestBody](../../models/operations/PostV1WebhookSubscriptionRequestBody.md)                                                                                                                      | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostV1WebhookSubscriptionResponse](../../models/operations/PostV1WebhookSubscriptionResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## listSubscriptions

Returns all webhook subscriptions associated with the provided Partner API token.

> 📘 System Access Authentication
>
> This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access).

scope: `webhook_subscriptions:read`

### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1WebhookSubscriptionsResponse;
import com.gusto.embedded_api.models.operations.GetV1WebhookSubscriptionsSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        GetV1WebhookSubscriptionsResponse res = sdk.webhooks().listSubscriptions()
                .security(GetV1WebhookSubscriptionsSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        if (res.webhookSubscriptionsList().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                   | [com.gusto.embedded_api.models.operations.GetV1WebhookSubscriptionsSecurity](../../models/operations/GetV1WebhookSubscriptionsSecurity.md)                                                                                   | :heavy_check_mark:                                                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                                                            |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1WebhookSubscriptionsResponse](../../models/operations/GetV1WebhookSubscriptionsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## updateSubscription

Updates the Webhook Subscription associated with the provided UUID.

> 📘 System Access Authentication
>
> This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access).

scope: `webhook_subscriptions:write`


### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        PutV1WebhookSubscriptionUuidResponse res = sdk.webhooks().updateSubscription()
                .security(PutV1WebhookSubscriptionUuidSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .webhookSubscriptionUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PutV1WebhookSubscriptionUuidRequestBody.builder()
                    .subscriptionTypes(List.of(
                        PutV1WebhookSubscriptionUuidSubscriptionTypes.COMPANY,
                        PutV1WebhookSubscriptionUuidSubscriptionTypes.EMPLOYEE))
                    .build())
                .call();

        if (res.webhookSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                   | [com.gusto.embedded_api.models.operations.PutV1WebhookSubscriptionUuidSecurity](../../models/operations/PutV1WebhookSubscriptionUuidSecurity.md)                                                                             | :heavy_check_mark:                                                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                                                            |
| `webhookSubscriptionUuid`                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The webhook subscription UUID.                                                                                                                                                                                               |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutV1WebhookSubscriptionUuidRequestBody](../../models/operations/PutV1WebhookSubscriptionUuidRequestBody.md)                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutV1WebhookSubscriptionUuidResponse](../../models/operations/PutV1WebhookSubscriptionUuidResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## getSubscription

Returns the Webhook Subscription associated with the provided UUID.

> 📘 System Access Authentication
>
> This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access).

scope: `webhook_subscriptions:read`


### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1WebhookSubscriptionUuidResponse;
import com.gusto.embedded_api.models.operations.GetV1WebhookSubscriptionUuidSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        GetV1WebhookSubscriptionUuidResponse res = sdk.webhooks().getSubscription()
                .security(GetV1WebhookSubscriptionUuidSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .webhookSubscriptionUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        if (res.webhookSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                   | [com.gusto.embedded_api.models.operations.GetV1WebhookSubscriptionUuidSecurity](../../models/operations/GetV1WebhookSubscriptionUuidSecurity.md)                                                                             | :heavy_check_mark:                                                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                                                            |
| `webhookSubscriptionUuid`                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The webhook subscription UUID.                                                                                                                                                                                               |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1WebhookSubscriptionUuidResponse](../../models/operations/GetV1WebhookSubscriptionUuidResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## deleteSubscription

Deletes the Webhook Subscription associated with the provided UUID.

> 📘 System Access Authentication
>
> This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access).

scope: `webhook_subscriptions:write`


### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.DeleteV1WebhookSubscriptionUuidResponse;
import com.gusto.embedded_api.models.operations.DeleteV1WebhookSubscriptionUuidSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        DeleteV1WebhookSubscriptionUuidResponse res = sdk.webhooks().deleteSubscription()
                .security(DeleteV1WebhookSubscriptionUuidSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .webhookSubscriptionUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                   | [com.gusto.embedded_api.models.operations.DeleteV1WebhookSubscriptionUuidSecurity](../../models/operations/DeleteV1WebhookSubscriptionUuidSecurity.md)                                                                       | :heavy_check_mark:                                                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                                                            |
| `webhookSubscriptionUuid`                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The webhook subscription UUID.                                                                                                                                                                                               |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[DeleteV1WebhookSubscriptionUuidResponse](../../models/operations/DeleteV1WebhookSubscriptionUuidResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## verify

When a webhook subscription is created, a `verification_token` is POSTed to the registered webhook subscription URL. This `verify` endpoint needs to be called with `verification_token` before webhook events can be sent to the registered webhook URL.

Use the /v1/webhook_subscriptions/{webhook_subscription_uuid}/request_verification_token API to resend the `verification_token` to the Subscriber.

> 📘 System Access Authentication
>
> This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access).

scope: `webhook_subscriptions:write`


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
            .build();

        PutV1VerifyWebhookSubscriptionUuidResponse res = sdk.webhooks().verify()
                .security(PutV1VerifyWebhookSubscriptionUuidSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .webhookSubscriptionUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .requestBody(PutV1VerifyWebhookSubscriptionUuidRequestBody.builder()
                    .verificationToken("asefasedfe23e234easd")
                    .build())
                .call();

        if (res.webhookSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                   | [com.gusto.embedded_api.models.operations.PutV1VerifyWebhookSubscriptionUuidSecurity](../../models/operations/PutV1VerifyWebhookSubscriptionUuidSecurity.md)                                                                 | :heavy_check_mark:                                                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                                                            |
| `webhookSubscriptionUuid`                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The webhook subscription UUID.                                                                                                                                                                                               |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutV1VerifyWebhookSubscriptionUuidRequestBody](../../models/operations/PutV1VerifyWebhookSubscriptionUuidRequestBody.md)                                                                                                    | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutV1VerifyWebhookSubscriptionUuidResponse](../../models/operations/PutV1VerifyWebhookSubscriptionUuidResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |

## requestVerificationToken

Request that the webhook subscription `verification_token` be POSTed to the Subscription URL.

> 📘 System Access Authentication
>
> This endpoint uses the [Bearer Auth scheme with the system-level access token in the HTTP Authorization header](https://docs.gusto.com/embedded-payroll/docs/system-access).

scope: `webhook_subscriptions:read`


### Example Usage

```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1WebhookSubscriptionVerificationTokenUuidResponse;
import com.gusto.embedded_api.models.operations.GetV1WebhookSubscriptionVerificationTokenUuidSecurity;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
            .build();

        GetV1WebhookSubscriptionVerificationTokenUuidResponse res = sdk.webhooks().requestVerificationToken()
                .security(GetV1WebhookSubscriptionVerificationTokenUuidSecurity.builder()
                    .systemAccessAuth("<YOUR_BEARER_TOKEN_HERE>")
                    .build())
                .webhookSubscriptionUuid("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FOUR_MINUS04_MINUS01)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `security`                                                                                                                                                                                                                   | [com.gusto.embedded_api.models.operations.GetV1WebhookSubscriptionVerificationTokenUuidSecurity](../../models/operations/GetV1WebhookSubscriptionVerificationTokenUuidSecurity.md)                                           | :heavy_check_mark:                                                                                                                                                                                                           | The security requirements to use for the request.                                                                                                                                                                            |
| `webhookSubscriptionUuid`                                                                                                                                                                                                    | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The webhook subscription UUID.                                                                                                                                                                                               |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1WebhookSubscriptionVerificationTokenUuidResponse](../../models/operations/GetV1WebhookSubscriptionVerificationTokenUuidResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |