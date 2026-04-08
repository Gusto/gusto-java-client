# CompanyForms

## Overview

### Available Operations

* [getAll](#getall) - Get all company forms
* [get](#get) - Get a company form
* [getPdf](#getpdf) - Get a company form pdf
* [sign](#sign) - Sign a company form

## getAll

Get a list of all company's forms

scope: `company_forms:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-company-forms" method="get" path="/v1/companies/{company_id}/forms" example="Example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1CompanyFormsResponse res = sdk.companyForms().getAll()
                .companyId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        if (res.formList().isPresent()) {
            System.out.println(res.formList().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `sortBy`                                                                                                                                                                                                                     | *Optional\<String>*                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                           | Sort company forms. Options: name, year, quarter, draft, document_content_type, created_at (optionally with :asc or :desc suffix)                                                                                            |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1CompanyFormsResponse](../../models/operations/GetV1CompanyFormsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Get a company form

scope: `company_forms:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-company-form" method="get" path="/v1/forms/{form_id}" example="Example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1CompanyFormResponse res = sdk.companyForms().get()
                .formId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        if (res.form().isPresent()) {
            System.out.println(res.form().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `formId`                                                                                                                                                                                                                     | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the form                                                                                                                                                                                                         |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1CompanyFormResponse](../../models/operations/GetV1CompanyFormResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getPdf

Get the link to the form PDF

scope: `company_forms:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-company-form-pdf" method="get" path="/v1/forms/{form_id}/pdf" example="Example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.operations.GetV1CompanyFormPdfResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1CompanyFormPdfResponse res = sdk.companyForms().getPdf()
                .formId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .call();

        if (res.formPdf().isPresent()) {
            System.out.println(res.formPdf().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `formId`                                                                                                                                                                                                                     | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the form                                                                                                                                                                                                         |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |

### Response

**[GetV1CompanyFormPdfResponse](../../models/operations/GetV1CompanyFormPdfResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## sign

Sign a company form. Company forms must be signed by the company signatory.

scope: `company_forms:sign`

### Example Usage: Basic

<!-- UsageSnippet language="java" operationID="put-v1-company-form-sign" method="put" path="/v1/forms/{form_id}/sign" example="Basic" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignRequestBody;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutV1CompanyFormSignResponse res = sdk.companyForms().sign()
                .formId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PutV1CompanyFormSignRequestBody.builder()
                    .signatureText("<value>")
                    .agree(true)
                    .build())
                .call();

        if (res.form().isPresent()) {
            System.out.println(res.form().get());
        }
    }
}
```
### Example Usage: Example

<!-- UsageSnippet language="java" operationID="put-v1-company-form-sign" method="put" path="/v1/forms/{form_id}/sign" example="Example" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignRequestBody;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutV1CompanyFormSignResponse res = sdk.companyForms().sign()
                .formId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PutV1CompanyFormSignRequestBody.builder()
                    .signatureText("Jane Smith")
                    .agree(true)
                    .signedByIpAddress("192.168.0.1")
                    .build())
                .call();

        if (res.form().isPresent()) {
            System.out.println(res.form().get());
        }
    }
}
```
### Example Usage: Nested

<!-- UsageSnippet language="java" operationID="put-v1-company-form-sign" method="put" path="/v1/forms/{form_id}/sign" example="Nested" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignRequestBody;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutV1CompanyFormSignResponse res = sdk.companyForms().sign()
                .formId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PutV1CompanyFormSignRequestBody.builder()
                    .signatureText("<value>")
                    .agree(true)
                    .build())
                .call();

        if (res.form().isPresent()) {
            System.out.println(res.form().get());
        }
    }
}
```
### Example Usage: Resource

<!-- UsageSnippet language="java" operationID="put-v1-company-form-sign" method="put" path="/v1/forms/{form_id}/sign" example="Resource" -->
```java
package hello.world;

import com.gusto.embedded_api.GustoEmbedded;
import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.models.errors.UnprocessableEntityErrorObject;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignRequestBody;
import com.gusto.embedded_api.models.operations.PutV1CompanyFormSignResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UnprocessableEntityErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PutV1CompanyFormSignResponse res = sdk.companyForms().sign()
                .formId("<id>")
                .xGustoAPIVersion(VersionHeader.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS06_MINUS15)
                .requestBody(PutV1CompanyFormSignRequestBody.builder()
                    .signatureText("<value>")
                    .agree(true)
                    .build())
                .call();

        if (res.form().isPresent()) {
            System.out.println(res.form().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `formId`                                                                                                                                                                                                                     | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the form                                                                                                                                                                                                         |
| `xGustoClientIp`                                                                                                                                                                                                             | *Optional\<String>*                                                                                                                                                                                                          | :heavy_minus_sign:                                                                                                                                                                                                           | Optional header to supply the IP address. This can be used to supply the IP address for signature endpoints instead of the signed_by_ip_address parameter.                                                                   |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<VersionHeader>](../../models/components/VersionHeader.md)                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `requestBody`                                                                                                                                                                                                                | [PutV1CompanyFormSignRequestBody](../../models/operations/PutV1CompanyFormSignRequestBody.md)                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PutV1CompanyFormSignResponse](../../models/operations/PutV1CompanyFormSignResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UnprocessableEntityErrorObject | 422                                          | application/json                             |
| models/errors/APIException                   | 4XX, 5XX                                     | \*/\*                                        |