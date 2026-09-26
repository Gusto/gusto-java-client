# TaxPaymentLineItem

A single payroll tax liability rolled up into a tax payment


## Fields

| Field                                                     | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `payrollUuid`                                             | *String*                                                  | :heavy_check_mark:                                        | Unique identifier of the payroll this liability came from |
| `uniqueTaxId`                                             | *String*                                                  | :heavy_check_mark:                                        | Unique identifier of the tax type this liability is for   |
| `amount`                                                  | *String*                                                  | :heavy_check_mark:                                        | The amount of this liability included in the tax payment  |