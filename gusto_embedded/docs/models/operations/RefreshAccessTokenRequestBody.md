# RefreshAccessTokenRequestBody


## Fields

| Field                                                        | Type                                                         | Required                                                     | Description                                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| `clientId`                                                   | *String*                                                     | :heavy_check_mark:                                           | Your client id                                               |
| `clientSecret`                                               | *String*                                                     | :heavy_check_mark:                                           | Your client secret                                           |
| `redirectUri`                                                | *Optional\<String>*                                          | :heavy_minus_sign:                                           | The redirect URI you set up via the Developer Portal         |
| `refreshToken`                                               | *String*                                                     | :heavy_check_mark:                                           | The `refresh_token` being exchanged for an access token code |
| `grantType`                                                  | *String*                                                     | :heavy_check_mark:                                           | this should be the literal string 'refresh_token'            |