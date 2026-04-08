# PayrollTypes

Comma-separated list of payroll types to include (regular, transition). Defaults to regular only.

## Example Usage

```java
import com.gusto.embedded_api.models.operations.PayrollTypes;

PayrollTypes value = PayrollTypes.REGULAR;
```


## Values

| Name                 | Value                |
| -------------------- | -------------------- |
| `REGULAR`            | regular              |
| `TRANSITION`         | transition           |
| `REGULAR_TRANSITION` | regular,transition   |