# PayrollEmployeeCompensationsTypePaymentMethod

The employee's compensation payment method. Is *only* `Historical` when retrieving external payrolls initially run outside of Gusto, then put into Gusto.

## Example Usage

```java
import org.openapis.openapi.models.components.PayrollEmployeeCompensationsTypePaymentMethod;

PayrollEmployeeCompensationsTypePaymentMethod value = PayrollEmployeeCompensationsTypePaymentMethod.DIRECT_DEPOSIT;
```


## Values

| Name             | Value            |
| ---------------- | ---------------- |
| `DIRECT_DEPOSIT` | Direct Deposit   |
| `CHECK`          | Check            |
| `HISTORICAL`     | Historical       |