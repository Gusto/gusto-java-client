# PostV1CompaniesCompanyIdLocationsRequestBody

Create a company location.


## Fields

| Field                                                      | Type                                                       | Required                                                   | Description                                                |
| ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- | ---------------------------------------------------------- |
| `phoneNumber`                                              | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `street1`                                                  | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `street2`                                                  | *JsonNullable\<String>*                                    | :heavy_minus_sign:                                         | N/A                                                        |
| `city`                                                     | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `state`                                                    | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `zip`                                                      | *String*                                                   | :heavy_check_mark:                                         | N/A                                                        |
| `mailingAddress`                                           | *Optional\<Boolean>*                                       | :heavy_minus_sign:                                         | Specify if this location is the company's mailing address. |
| `filingAddress`                                            | *Optional\<Boolean>*                                       | :heavy_minus_sign:                                         | Specify if this location is the company's filing address.  |