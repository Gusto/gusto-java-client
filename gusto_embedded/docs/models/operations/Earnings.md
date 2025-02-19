# Earnings

An array of earnings for the employee. Depends on your company selections, earnings includes wages, hours, bonuses, tips, commission and more.


## Fields

| Field                                                            | Type                                                             | Required                                                         | Description                                                      |
| ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- | ---------------------------------------------------------------- |
| `hours`                                                          | *Optional\<String>*                                              | :heavy_minus_sign:                                               | The hour of the compensation for the pay period.                 |
| `amount`                                                         | *Optional\<String>*                                              | :heavy_minus_sign:                                               | The amount of the earning.                                       |
| `earningId`                                                      | *Optional\<Long>*                                                | :heavy_minus_sign:                                               | The ID of the earning.                                           |
| `earningType`                                                    | [Optional\<EarningType>](../../models/operations/EarningType.md) | :heavy_minus_sign:                                               | The earning type for the compensation.                           |