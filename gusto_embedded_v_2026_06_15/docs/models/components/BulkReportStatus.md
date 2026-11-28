# BulkReportStatus

Overall batch status. `pending`/`processing` while in progress; once finished, `success` (all reports succeeded), `partial_success` (some succeeded, some failed), or `failed` (none succeeded).

## Example Usage

```java
import com.gusto.embedded_api_v_2026_06_15.models.components.BulkReportStatus;

BulkReportStatus value = BulkReportStatus.PENDING;
```


## Values

| Name              | Value             |
| ----------------- | ----------------- |
| `PENDING`         | pending           |
| `PROCESSING`      | processing        |
| `SUCCESS`         | success           |
| `PARTIAL_SUCCESS` | partial_success   |
| `FAILED`          | failed            |