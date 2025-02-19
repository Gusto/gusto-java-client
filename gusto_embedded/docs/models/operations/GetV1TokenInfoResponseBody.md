# GetV1TokenInfoResponseBody

Example response


## Fields

| Field                                                                | Type                                                                 | Required                                                             | Description                                                          |
| -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- | -------------------------------------------------------------------- |
| `scope`                                                              | *String*                                                             | :heavy_check_mark:                                                   | Space delimited string of accessible scopes.                         |
| `resource`                                                           | [Optional\<Resource>](../../models/operations/Resource.md)           | :heavy_check_mark:                                                   | Information about the token resource.                                |
| `resourceOwner`                                                      | [Optional\<ResourceOwner>](../../models/operations/ResourceOwner.md) | :heavy_check_mark:                                                   | Information about the token owner                                    |