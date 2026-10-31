# MemberPortalInvitations

## Overview

### Available Operations

* [postV1EmployeesEmployeeIdMemberPortalInvitations](#postv1employeesemployeeidmemberportalinvitations) - Create an employee member portal invitation
* [getV1EmployeesEmployeeIdMemberPortalInvitations](#getv1employeesemployeeidmemberportalinvitations) - Get an employee member portal invitation
* [deleteV1EmployeesEmployeeIdMemberPortalInvitations](#deletev1employeesemployeeidmemberportalinvitations) - Cancel an employee member portal invitation
* [postV1ContractorsContractorUuidMemberPortalInvitations](#postv1contractorscontractoruuidmemberportalinvitations) - Create a contractor member portal invitation
* [getV1ContractorsContractorUuidMemberPortalInvitations](#getv1contractorscontractoruuidmemberportalinvitations) - Get a contractor member portal invitation
* [deleteV1ContractorsContractorUuidMemberPortalInvitations](#deletev1contractorscontractoruuidmemberportalinvitations) - Cancel a contractor member portal invitation

## postV1EmployeesEmployeeIdMemberPortalInvitations

Generates a member portal invitation for the specified employee. If the employee already has an invitation and its token has expired, calling this endpoint regenerates the invitation and overrides the prior token.

scope: `member_portal_invitation:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="post-v1-employees-employee_id-member_portal_invitations" method="post" path="/v1/employees/{employee_id}/member_portal_invitations" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2025_11_15.GustoEmbedded;
import com.gusto.embedded_api_v_2025_11_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2025_11_15.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api_v_2025_11_15.models.operations.PostV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion;
import com.gusto.embedded_api_v_2025_11_15.models.operations.PostV1EmployeesEmployeeIdMemberPortalInvitationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostV1EmployeesEmployeeIdMemberPortalInvitationsResponse res = sdk.memberPortalInvitations().postV1EmployeesEmployeeIdMemberPortalInvitations()
                .xGustoAPIVersion(PostV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .employeeId("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<PostV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion>](../../models/operations/PostV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion.md)                                       | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `employeeId`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the employee                                                                                                                                                                                                     |

### Response

**[PostV1EmployeesEmployeeIdMemberPortalInvitationsResponse](../../models/operations/PostV1EmployeesEmployeeIdMemberPortalInvitationsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## getV1EmployeesEmployeeIdMemberPortalInvitations

Returns the current status of an employee's member portal invitation (`pending`, `sent`, `verified`, `complete`, or `cancelled`) along with an `expired` flag indicating whether the invitation can still be acted on by the employee.

scope: `member_portal_invitation:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-employees-employee_id-member_portal_invitations" method="get" path="/v1/employees/{employee_id}/member_portal_invitations" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2025_11_15.GustoEmbedded;
import com.gusto.embedded_api_v_2025_11_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2025_11_15.models.operations.GetV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion;
import com.gusto.embedded_api_v_2025_11_15.models.operations.GetV1EmployeesEmployeeIdMemberPortalInvitationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1EmployeesEmployeeIdMemberPortalInvitationsResponse res = sdk.memberPortalInvitations().getV1EmployeesEmployeeIdMemberPortalInvitations()
                .xGustoAPIVersion(GetV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .employeeId("<id>")
                .call();

        if (res.memberPortalInvitation().isPresent()) {
            System.out.println(res.memberPortalInvitation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion>](../../models/operations/GetV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion.md)                                         | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `employeeId`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the employee                                                                                                                                                                                                     |

### Response

**[GetV1EmployeesEmployeeIdMemberPortalInvitationsResponse](../../models/operations/GetV1EmployeesEmployeeIdMemberPortalInvitationsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## deleteV1EmployeesEmployeeIdMemberPortalInvitations

Cancels the member portal invitation for the specified employee.

Note: this endpoint does not cancel the employee's self-onboarding flow. If you want the company admin to take full control of onboarding the employee, cancel the self-onboarding request instead.

scope: `member_portal_invitation:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="delete-v1-employees-employee_id-member_portal_invitations" method="delete" path="/v1/employees/{employee_id}/member_portal_invitations" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2025_11_15.GustoEmbedded;
import com.gusto.embedded_api_v_2025_11_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2025_11_15.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api_v_2025_11_15.models.operations.DeleteV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion;
import com.gusto.embedded_api_v_2025_11_15.models.operations.DeleteV1EmployeesEmployeeIdMemberPortalInvitationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        DeleteV1EmployeesEmployeeIdMemberPortalInvitationsResponse res = sdk.memberPortalInvitations().deleteV1EmployeesEmployeeIdMemberPortalInvitations()
                .xGustoAPIVersion(DeleteV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .employeeId("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<DeleteV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion>](../../models/operations/DeleteV1EmployeesEmployeeIdMemberPortalInvitationsHeaderXGustoAPIVersion.md)                                   | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `employeeId`                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the employee                                                                                                                                                                                                     |

### Response

**[DeleteV1EmployeesEmployeeIdMemberPortalInvitationsResponse](../../models/operations/DeleteV1EmployeesEmployeeIdMemberPortalInvitationsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## postV1ContractorsContractorUuidMemberPortalInvitations

Generates a member portal invitation for the specified contractor. If the contractor already has an invitation and its token has expired, calling this endpoint regenerates the invitation and overrides the prior token.

scope: `member_portal_invitation:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="post-v1-contractors-contractor_uuid-member_portal_invitations" method="post" path="/v1/contractors/{contractor_uuid}/member_portal_invitations" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2025_11_15.GustoEmbedded;
import com.gusto.embedded_api_v_2025_11_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2025_11_15.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api_v_2025_11_15.models.operations.PostV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion;
import com.gusto.embedded_api_v_2025_11_15.models.operations.PostV1ContractorsContractorUuidMemberPortalInvitationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        PostV1ContractorsContractorUuidMemberPortalInvitationsResponse res = sdk.memberPortalInvitations().postV1ContractorsContractorUuidMemberPortalInvitations()
                .xGustoAPIVersion(PostV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .contractorUuid("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<PostV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion>](../../models/operations/PostV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion.md)                           | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `contractorUuid`                                                                                                                                                                                                             | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the contractor                                                                                                                                                                                                   |

### Response

**[PostV1ContractorsContractorUuidMemberPortalInvitationsResponse](../../models/operations/PostV1ContractorsContractorUuidMemberPortalInvitationsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |

## getV1ContractorsContractorUuidMemberPortalInvitations

Returns the current status of a contractor's member portal invitation (`pending`, `sent`, `verified`, `complete`, or `cancelled`) along with an `expired` flag indicating whether the invitation can still be acted on by the contractor.

scope: `member_portal_invitation:read`

### Example Usage

<!-- UsageSnippet language="java" operationID="get-v1-contractors-contractor_uuid-member_portal_invitations" method="get" path="/v1/contractors/{contractor_uuid}/member_portal_invitations" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2025_11_15.GustoEmbedded;
import com.gusto.embedded_api_v_2025_11_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2025_11_15.models.operations.GetV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion;
import com.gusto.embedded_api_v_2025_11_15.models.operations.GetV1ContractorsContractorUuidMemberPortalInvitationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1ContractorsContractorUuidMemberPortalInvitationsResponse res = sdk.memberPortalInvitations().getV1ContractorsContractorUuidMemberPortalInvitations()
                .xGustoAPIVersion(GetV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .contractorUuid("<id>")
                .call();

        if (res.memberPortalInvitation().isPresent()) {
            System.out.println(res.memberPortalInvitation().get());
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<GetV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion>](../../models/operations/GetV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion.md)                             | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `contractorUuid`                                                                                                                                                                                                             | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the contractor                                                                                                                                                                                                   |

### Response

**[GetV1ContractorsContractorUuidMemberPortalInvitationsResponse](../../models/operations/GetV1ContractorsContractorUuidMemberPortalInvitationsResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/NotFoundErrorObject | 404                               | application/json                  |
| models/errors/APIException        | 4XX, 5XX                          | \*/\*                             |

## deleteV1ContractorsContractorUuidMemberPortalInvitations

Cancels the member portal invitation for the specified contractor.

Note: this endpoint does not cancel the contractor's self-onboarding flow. If you want the company admin to take full control of onboarding the contractor, cancel the self-onboarding request instead.

scope: `member_portal_invitation:write`

### Example Usage

<!-- UsageSnippet language="java" operationID="delete-v1-contractors-contractor_uuid-member_portal_invitations" method="delete" path="/v1/contractors/{contractor_uuid}/member_portal_invitations" -->
```java
package hello.world;

import com.gusto.embedded_api_v_2025_11_15.GustoEmbedded;
import com.gusto.embedded_api_v_2025_11_15.models.errors.NotFoundErrorObject;
import com.gusto.embedded_api_v_2025_11_15.models.errors.UnprocessableEntityError;
import com.gusto.embedded_api_v_2025_11_15.models.operations.DeleteV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion;
import com.gusto.embedded_api_v_2025_11_15.models.operations.DeleteV1ContractorsContractorUuidMemberPortalInvitationsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws NotFoundErrorObject, UnprocessableEntityError, Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        DeleteV1ContractorsContractorUuidMemberPortalInvitationsResponse res = sdk.memberPortalInvitations().deleteV1ContractorsContractorUuidMemberPortalInvitations()
                .xGustoAPIVersion(DeleteV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .contractorUuid("<id>")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                  |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xGustoAPIVersion`                                                                                                                                                                                                           | [Optional\<DeleteV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion>](../../models/operations/DeleteV1ContractorsContractorUuidMemberPortalInvitationsHeaderXGustoAPIVersion.md)                       | :heavy_minus_sign:                                                                                                                                                                                                           | Determines the date-based API version associated with your API call. If none is provided, your application's [minimum API version](https://docs.gusto.com/embedded-payroll/docs/api-versioning#minimum-api-version) is used. |
| `contractorUuid`                                                                                                                                                                                                             | *String*                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                           | The UUID of the contractor                                                                                                                                                                                                   |

### Response

**[DeleteV1ContractorsContractorUuidMemberPortalInvitationsResponse](../../models/operations/DeleteV1ContractorsContractorUuidMemberPortalInvitationsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/NotFoundErrorObject      | 404                                    | application/json                       |
| models/errors/UnprocessableEntityError | 422                                    | application/json                       |
| models/errors/APIException             | 4XX, 5XX                               | \*/\*                                  |