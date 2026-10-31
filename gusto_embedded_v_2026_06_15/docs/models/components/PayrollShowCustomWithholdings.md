# PayrollShowCustomWithholdings

The one-time custom withholding overrides applied to this payroll for this employee.
`federal` is null when no federal one-time override is set; `state` is an empty
array when no state one-time overrides are set.



## Fields

| Field                                                                                           | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `federal`                                                                                       | [JsonNullable\<PayrollShowFederal>](../../models/components/PayrollShowFederal.md)              | :heavy_minus_sign:                                                                              | Federal one-time custom withholding override applied to this payroll.                           |
| `state`                                                                                         | List\<[PayrollShowState](../../models/components/PayrollShowState.md)>                          | :heavy_minus_sign:                                                                              | State one-time custom withholding overrides applied to this payroll, one entry per state field. |