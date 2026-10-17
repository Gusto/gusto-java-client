# BulkReportItemResult

A single report's outcome.


## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `reportType`                                                                                | [BulkReportItemResultReportType](../../models/components/BulkReportItemResultReportType.md) | :heavy_check_mark:                                                                          | Which report this entry refers to.                                                          |
| `fileType`                                                                                  | *String*                                                                                    | :heavy_check_mark:                                                                          | The report's output file type.                                                              |
| `status`                                                                                    | [BulkReportItemResultStatus](../../models/components/BulkReportItemResultStatus.md)         | :heavy_check_mark:                                                                          | The terminal state for this individual report.                                              |
| `error`                                                                                     | *Optional\<String>*                                                                         | :heavy_check_mark:                                                                          | A user-facing error message when status is `failed`. Null on success.                       |