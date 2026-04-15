# PaySchedulePreviewPayPeriod

A single pay period in a pay schedule preview, with check date, period boundaries, and payroll deadline.


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `checkDate`                                                                         | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)     | :heavy_check_mark:                                                                  | The date employees will be paid (check date).                                       |
| `startDate`                                                                         | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)     | :heavy_check_mark:                                                                  | The first day of the pay period.                                                    |
| `runPayrollBy`                                                                      | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)     | :heavy_check_mark:                                                                  | The deadline by which payroll must be run for this period to be paid on check_date. |
| `endDate`                                                                           | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)     | :heavy_check_mark:                                                                  | The last day of the pay period.                                                     |