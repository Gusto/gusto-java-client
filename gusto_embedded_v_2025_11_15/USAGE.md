<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import java.lang.Exception;
import org.openapis.openapi.GustoEmbedded;
import org.openapis.openapi.models.operations.GetV1TokenInfoResponse;
import org.openapis.openapi.models.operations.XGustoAPIVersion;

public class Application {

    public static void main(String[] args) throws Exception {

        GustoEmbedded sdk = GustoEmbedded.builder()
                .companyAccessAuth(System.getenv().getOrDefault("COMPANY_ACCESS_AUTH", ""))
            .build();

        GetV1TokenInfoResponse res = sdk.introspection().getInfo()
                .xGustoAPIVersion(XGustoAPIVersion.TWO_THOUSAND_AND_TWENTY_FIVE_MINUS11_MINUS15)
                .call();

        if (res.tokenInfo().isPresent()) {
            System.out.println(res.tokenInfo().get());
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->