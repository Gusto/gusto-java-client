# GetV1PartnerManagedCompaniesCompanyUuidMigrationReadinessResponseBody

Example response


## Fields

| Field                                                  | Type                                                   | Required                                               | Description                                            |
| ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ | ------------------------------------------------------ |
| `readyToMigrate`                                       | *Optional\<Boolean>*                                   | :heavy_minus_sign:                                     | Indicates if the company is ready to be migrated.      |
| `companyUuid`                                          | *Optional\<String>*                                    | :heavy_minus_sign:                                     | The company UUID                                       |
| `errors`                                               | List\<[Errors](../../models/operations/Errors.md)>     | :heavy_minus_sign:                                     | N/A                                                    |
| `warnings`                                             | List\<[Warnings](../../models/operations/Warnings.md)> | :heavy_minus_sign:                                     | N/A                                                    |