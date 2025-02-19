/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.models.components.VersionHeader;
import org.openapis.openapi.utils.Utils;

public class PutV1VerifyWebhookSubscriptionUuidRequestBuilder {

    private PutV1VerifyWebhookSubscriptionUuidSecurity security;
    private String webhookSubscriptionUuid;
    private Optional<? extends VersionHeader> xGustoAPIVersion = Optional.empty();
    private PutV1VerifyWebhookSubscriptionUuidRequestBody requestBody;
    private final SDKMethodInterfaces.MethodCallPutV1VerifyWebhookSubscriptionUuid sdk;

    public PutV1VerifyWebhookSubscriptionUuidRequestBuilder(SDKMethodInterfaces.MethodCallPutV1VerifyWebhookSubscriptionUuid sdk) {
        this.sdk = sdk;
    }

    public PutV1VerifyWebhookSubscriptionUuidRequestBuilder security(PutV1VerifyWebhookSubscriptionUuidSecurity security) {
        Utils.checkNotNull(security, "security");
        this.security = security;
        return this;
    }

    public PutV1VerifyWebhookSubscriptionUuidRequestBuilder webhookSubscriptionUuid(String webhookSubscriptionUuid) {
        Utils.checkNotNull(webhookSubscriptionUuid, "webhookSubscriptionUuid");
        this.webhookSubscriptionUuid = webhookSubscriptionUuid;
        return this;
    }
                
    public PutV1VerifyWebhookSubscriptionUuidRequestBuilder xGustoAPIVersion(VersionHeader xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = Optional.of(xGustoAPIVersion);
        return this;
    }

    public PutV1VerifyWebhookSubscriptionUuidRequestBuilder xGustoAPIVersion(Optional<? extends VersionHeader> xGustoAPIVersion) {
        Utils.checkNotNull(xGustoAPIVersion, "xGustoAPIVersion");
        this.xGustoAPIVersion = xGustoAPIVersion;
        return this;
    }

    public PutV1VerifyWebhookSubscriptionUuidRequestBuilder requestBody(PutV1VerifyWebhookSubscriptionUuidRequestBody requestBody) {
        Utils.checkNotNull(requestBody, "requestBody");
        this.requestBody = requestBody;
        return this;
    }

    public PutV1VerifyWebhookSubscriptionUuidResponse call() throws Exception {

        return sdk.verify(
            security,
            webhookSubscriptionUuid,
            xGustoAPIVersion,
            requestBody);
    }
}
