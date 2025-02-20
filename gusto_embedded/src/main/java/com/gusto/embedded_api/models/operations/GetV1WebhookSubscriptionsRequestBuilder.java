/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.gusto.embedded_api.models.operations;

import com.gusto.embedded_api.models.components.VersionHeader;
import com.gusto.embedded_api.utils.Utils;
import java.util.Optional;

public class GetV1WebhookSubscriptionsRequestBuilder {

    private GetV1WebhookSubscriptionsSecurity security;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetV1WebhookSubscriptions sdk;

    public GetV1WebhookSubscriptionsRequestBuilder(SDKMethodInterfaces.MethodCallGetV1WebhookSubscriptions sdk) {
        this.sdk = sdk;
    }

    public GetV1WebhookSubscriptionsRequestBuilder security(GetV1WebhookSubscriptionsSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }
                
    public GetV1WebhookSubscriptionsRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public GetV1WebhookSubscriptionsRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public GetV1WebhookSubscriptionsResponse call() throws Exception {

        return sdk.listSubscriptions(
            security,
            xGustoAPIVersion);
    }
}
