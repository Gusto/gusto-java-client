# Type

The payment method type. If type is Check, split_by and splits do not need to be populated. If type is Direct Deposit, split_by and splits are required.

## Example Usage

```java
import org.openapis.openapi.models.operations.Type;

Type value = Type.CHECK;
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `CHECK`          | Check            |
| `DIRECT_DEPOSIT` | Direct Deposit   |