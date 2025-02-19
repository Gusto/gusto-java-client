# EmployeePayStub

The representation of an employee pay stub information.


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `uuid`                                                            | *String*                                                          | :heavy_check_mark:                                                | The UUID of the employee pay stub.                                |
| `checkDate`                                                       | *Optional\<String>*                                               | :heavy_minus_sign:                                                | The check date of the pay stub.                                   |
| `grossPay`                                                        | *Optional\<String>*                                               | :heavy_minus_sign:                                                | The gross pay amount for the pay stub.                            |
| `netPay`                                                          | *Optional\<String>*                                               | :heavy_minus_sign:                                                | The net pay amount for the pay stub.                              |
| `payrollUuid`                                                     | *Optional\<String>*                                               | :heavy_minus_sign:                                                | A unique identifier of the payroll to which the pay stub belongs. |
| `checkAmount`                                                     | *Optional\<String>*                                               | :heavy_minus_sign:                                                | The check amount for the pay stub.                                |