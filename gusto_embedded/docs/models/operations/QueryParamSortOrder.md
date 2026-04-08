# QueryParamSortOrder

A string indicating whether to sort resulting events in ascending (asc) or descending (desc) chronological order. Events are sorted by their `timestamp`. Defaults to asc if left empty.

## Example Usage

```java
import com.gusto.embedded_api.models.operations.QueryParamSortOrder;

QueryParamSortOrder value = QueryParamSortOrder.ASC;
```


## Values

| Name   | Value  |
| ------ | ------ |
| `ASC`  | asc    |
| `DESC` | desc   |