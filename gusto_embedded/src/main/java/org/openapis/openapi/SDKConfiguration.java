/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi;

import java.lang.String;
import java.util.Optional;
import org.openapis.openapi.hooks.SDKHooks;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.Hook.SdkInitData;
import org.openapis.openapi.utils.Hooks;
import org.openapis.openapi.utils.RetryConfig;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    
    public HTTPClient defaultClient;
    
    public String serverUrl;
    
    public String resolvedServerUrl() {
        return serverUrl;
    }
    public String server;
    private static final String LANGUAGE = "java";
    public static final String OPENAPI_DOC_VERSION = "2024-04-01";
    public static final String SDK_VERSION = "0.0.2";
    public static final String GEN_VERSION = "2.517.3";
    private static final String BASE_PACKAGE = "org.openapis.openapi";
    public static final String USER_AGENT = 
            String.format("speakeasy-sdk/%s %s %s %s %s", 
                LANGUAGE, SDK_VERSION, GEN_VERSION, OPENAPI_DOC_VERSION, BASE_PACKAGE);

    private Hooks _hooks = createHooks();

    private static Hooks createHooks() {
        Hooks hooks = new Hooks();
        return hooks;
    }
    
    public Hooks hooks() {
        return _hooks;
    }

    public void setHooks(Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(resolvedServerUrl(), defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    
    
    public Optional<RetryConfig> retryConfig = Optional.empty();
}
