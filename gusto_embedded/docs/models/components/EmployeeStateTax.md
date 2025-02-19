# EmployeeStateTax

Example response


## Fields

| Field                                                                                  | Type                                                                                   | Required                                                                               | Description                                                                            |
| -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| `employeeUuid`                                                                         | *String*                                                                               | :heavy_check_mark:                                                                     | The employee's uuid                                                                    |
| `state`                                                                                | *String*                                                                               | :heavy_check_mark:                                                                     | Two letter US state abbreviation                                                       |
| `fileNewHireReport`                                                                    | *JsonNullable\<Boolean>*                                                               | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `isWorkState`                                                                          | *Optional\<Boolean>*                                                                   | :heavy_minus_sign:                                                                     | N/A                                                                                    |
| `questions`                                                                            | List\<[EmployeeStateTaxQuestion](../../models/components/EmployeeStateTaxQuestion.md)> | :heavy_check_mark:                                                                     | N/A                                                                                    |