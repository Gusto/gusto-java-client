# PaymentStatus

The status of the ACH transaction

## Example Usage

```java
import com.gusto.embedded_api.models.components.PaymentStatus;

PaymentStatus value = PaymentStatus.UNSUBMITTED;
```


## Values

| Name          | Value         |
| ------------- | ------------- |
| `UNSUBMITTED` | unsubmitted   |
| `SUBMITTED`   | submitted     |
| `SUCCESSFUL`  | successful    |
| `FAILED`      | failed        |