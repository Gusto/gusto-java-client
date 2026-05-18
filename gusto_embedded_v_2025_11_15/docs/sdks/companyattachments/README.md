# CompanyAttachments

## Overview

### Available Operations

* [getDetails](#getdetails) - Get Company Attachment Details
* [getList](#getlist) - Get List of Company Attachments
* [create](#create) - Create Company Attachment and Upload File

## getDetails

Retrieve the detail of an attachment uploaded by the company.

### Related guides
- [Manage company attachments](doc:manage-company-attachments)

scope: `company_attachments:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-companies-attachment" method="get" path="/v1/companies/{company_id}/attachments/{company_attachment_uuid}" -->
```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.GustoEmbedded;
import org.openapis.openapi.models.errors.NotFoundErrorObject;
import org.openapis.openapi.models.operations.GetV1CompaniesAttachmentHeaderXGustoAPIVersion;
import org.openapis.openapi.models.operations.GetV1CompaniesAttachmentResponse;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1CompaniesAttachmentResponse res = sdk.companyAttachments().getDetails()
                .xGustoAPIVersion(GetV1CompaniesAttachmentHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .companyId("<id>")
                .companyAttachmentUuid("<id>")
                .call();

        if (res.companyAttachment().isPresent()) {
            System.out.println(res.companyAttachment().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1CompaniesAttachmentHeaderXGustoAPIVersion>](../../models/operations/GetV1CompaniesAttachmentHeaderXGustoAPIVersion.md)                                                                                       | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `companyAttachmentUuid`                                                                                                                                                                                                      | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company attachment                                                                                                                                                                                           |

### Response

**[GetV1CompaniesAttachmentResponse](../../models/operations/GetV1CompaniesAttachmentResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## getList

Retrieve a list of all the attachments uploaded by the company.

### Related guides
- [Manage company attachments](doc:manage-company-attachments)

scope: `company_attachments:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-companies-attachments" method="get" path="/v1/companies/{company_id}/attachments" -->
```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.GustoEmbedded;
import org.openapis.openapi.models.errors.NotFoundErrorObject;
import org.openapis.openapi.models.operations.GetV1CompaniesAttachmentsHeaderXGustoAPIVersion;
import org.openapis.openapi.models.operations.GetV1CompaniesAttachmentsResponse;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1CompaniesAttachmentsResponse res = sdk.companyAttachments().getList()
                .xGustoAPIVersion(GetV1CompaniesAttachmentsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .companyId("<id>")
                .call();

        if (res.companyAttachments().isPresent()) {
            System.out.println(res.companyAttachments().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1CompaniesAttachmentsHeaderXGustoAPIVersion>](../../models/operations/GetV1CompaniesAttachmentsHeaderXGustoAPIVersion.md)                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |

### Response

**[GetV1CompaniesAttachmentsResponse](../../models/operations/GetV1CompaniesAttachmentsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## create

Upload a file and create a company attachment. We recommend uploading PDF files for optimal compatibility. However, the following file types are allowed: .qbb, .qbm, .gif, .jpg, .png, .pdf, .xls, .xlsx, .doc and .docx.

### Related guides
- [Manage company attachments](doc:manage-company-attachments)

scope: `company_attachments:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="post-v1-companies-attachment" method="post" path="/v1/companies/{company_id}/attachments" -->
```java
package hello.world;

import java.io.FileInputStream;
import java.lang.Exception;
import org.openapis.openapi.GustoEmbedded;
import org.openapis.openapi.models.components.*;
import org.openapis.openapi.models.errors.NotFoundErrorObject;
import org.openapis.openapi.models.errors.UnprocessableEntityError;
import org.openapis.openapi.models.operations.PostV1CompaniesAttachmentHeaderXGustoAPIVersion;
import org.openapis.openapi.models.operations.PostV1CompaniesAttachmentResponse;
import org.openapis.openapi.utils.Utils;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostV1CompaniesAttachmentResponse res = sdk.companyAttachments().create()
                .xGustoAPIVersion(PostV1CompaniesAttachmentHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .companyId("<id>")
                .companyAttachmentCreateRequestBody(CompanyAttachmentCreateRequestBody.builder()
                    .document(CompanyAttachmentCreateRequestBodyDocument.builder()
                        .fileName("example.file")
                        .content(Utils.readBytesAndClose(new FileInputStream("example.file")))
                        .build())
                    .category(CompanyAttachmentCreateRequestBodyCategory.GEP_NOTICE)
                    .build())
                .call();

    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<PostV1CompaniesAttachmentHeaderXGustoAPIVersion>](../../models/operations/PostV1CompaniesAttachmentHeaderXGustoAPIVersion.md)                                                                                     | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `companyId`                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the company                                                                                                                                                                                                      |
| `companyAttachmentCreateRequestBody`                                                                                                                                                                                         | [CompanyAttachmentCreateRequestBody](../../models/components/CompanyAttachmentCreateRequestBody.md)                                                                                                                          | :heavy_check_mark:                                                                                                                                                                                                           | N/A                                                                                                                                                                                                                          |

### Response

**[PostV1CompaniesAttachmentResponse](../../models/operations/PostV1CompaniesAttachmentResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |