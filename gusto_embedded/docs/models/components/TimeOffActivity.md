# TimeOffActivity

Representation of a Time Off Activity


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `policyUuid`                                                        | *Optional\<String>*                                                 | :heavy_minus_sign:                                                  | unique identifier of a time off policy                              |
| `timeOffType`                                                       | [Optional\<TimeOffType>](../../models/components/TimeOffType.md)    | :heavy_minus_sign:                                                  | Type of the time off activity                                       |
| `policyName`                                                        | *Optional\<String>*                                                 | :heavy_minus_sign:                                                  | The name of the time off policy for this activity                   |
| `eventType`                                                         | *Optional\<String>*                                                 | :heavy_minus_sign:                                                  | The type of the time off event/activity                             |
| `eventDescription`                                                  | *Optional\<String>*                                                 | :heavy_minus_sign:                                                  | A description for the time off event/activity                       |
| `effectiveTime`                                                     | *Optional\<String>*                                                 | :heavy_minus_sign:                                                  | The datetime of the time off activity                               |
| `balance`                                                           | *Optional\<String>*                                                 | :heavy_minus_sign:                                                  | The time off balance at the time of the activity                    |
| `balanceChange`                                                     | *Optional\<String>*                                                 | :heavy_minus_sign:                                                  | The amount the time off balance changed as a result of the activity |