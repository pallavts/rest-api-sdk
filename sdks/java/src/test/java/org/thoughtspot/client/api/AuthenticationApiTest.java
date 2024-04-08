/*
 * ThoughtSpot Public REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.thoughtspot.client.api;

import org.thoughtspot.client.ApiException;
import org.thoughtspot.client.model.ErrorResponse;
import org.thoughtspot.client.model.GetFullAccessTokenRequest;
import org.thoughtspot.client.model.GetObjectAccessTokenRequest;
import org.thoughtspot.client.model.GetTokenResponse;
import org.thoughtspot.client.model.LoginRequest;
import org.thoughtspot.client.model.RevokeTokenRequest;
import org.thoughtspot.client.model.Token;
import org.thoughtspot.client.model.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Disabled
public class AuthenticationApiTest {

    private final AuthenticationApi api = new AuthenticationApi();

    /**
     *   Version: 9.0.0.cl or later    Gets session information for the currently logged-in user.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request. The data returned in the API response varies according to user&#39;s privilege and object access permissions.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentUserInfoTest() throws ApiException {
        User response = api.getCurrentUserInfo();
        // TODO: test validations
    }

    /**
     *  Get token for the currently logged-in user.    Version: 9.4.0.cl or later   Gets token details for the currently logged-in user.  You can use this endpoint to obtain the token associated with the user&#39;s session.  This API does not require any parameters to be passed in the request.    Any ThoughtSpot user can access this endpoint and send an API request.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrentUserTokenTest() throws ApiException {
        GetTokenResponse response = api.getCurrentUserToken();
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token and creates a full session in ThoughtSpot for a given user. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60; (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;api-authv2#bearerToken)), or by using the cluster’s &#x60;secret_key&#x60; (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).  To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page. For more information, see [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable).  **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request, &#x60;password&#x60; takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * &#x60;auto_create&#x60; * &#x60;username&#x60;  To assign privileges to the new user, specify the group name or GUID in &#x60;group_identifiers&#x60;.  To add the user to an Org, specify the Org ID in the &#x60;org_id&#x60; attribute.  **Note**: This feature is available only on clusters with trusted authentication enabled.  To provision a new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFullAccessTokenTest() throws ApiException {
        GetFullAccessTokenRequest getFullAccessTokenRequest = null;
        Token response = api.getFullAccessToken(getFullAccessTokenRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later   Gets an authentication token that provides access to a specific metadata object. By default, the token obtained from ThoughtSpot remains valid for 5 mins.  You can generate the token for a user by providing a &#x60;username&#x60; and &#x60;password&#x60; (for [Bearer token authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;api-authv2#bearerToken)), or by using the cluster’s &#x60;secret key&#x60; (for [Trusted authentication](https://developers.thoughtspot.com/docs/?pageid&#x3D;trusted-auth#trusted-auth-enable)).  To generate a &#x60;secret_key&#x60; on your cluster, the administrator must enable **Trusted authentication** in the **Develop** &gt; **Customizations** &gt; **Security Settings** page.  **Note**: When both &#x60;password&#x60; and &#x60;secret_key&#x60; are included in the API request,  &#x60;password&#x60; takes precedence.  #### Just-in-time provisioning  For just-in-time user creation and provisioning, use the following attributes.  * &#x60;auto_create&#x60; * &#x60;username&#x60;  To assign privileges to the new user, specify the group name or GUID in &#x60;group_identifiers&#x60;.  To add the user to an Org, send the &#x60;Org ID&#x60; in the API request.  **Note**: This feature is available only if Trusted authentication is enabled on your cluster.  To provision a new user and assign privileges, you need &#x60;ADMINISTRATION&#x60; (**Can administer ThoughtSpot**) privilege.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getObjectAccessTokenTest() throws ApiException {
        GetObjectAccessTokenRequest getObjectAccessTokenRequest = null;
        Token response = api.getObjectAccessToken(getObjectAccessTokenRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later    Creates a login session for a ThoughtSpot user with Basic authentication.  In Basic authentication method, REST clients log in to ThoughtSpot using &#x60;username&#x60; and &#x60;password&#x60; attributes. On a multi-tenant cluster with Orgs, users can pass the ID of the Org in the API request to log in to a specific Org context.  A successful login returns a session cookie that can be used in your subsequent API requests.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        LoginRequest loginRequest = null;
        api.login(loginRequest);
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later    Logs out a user from their current session.      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void logoutTest() throws ApiException {
        api.logout();
        // TODO: test validations
    }

    /**
     *   Version: 9.0.0.cl or later    Revokes the authentication token issued for current user session.  The token of your current session expires when you make a call to the &#x60;/api/rest/2.0/auth/token/revoke&#x60; endpoint. the users will not be able to access ThoughtSpot objects until a new token is obtained.  To restart your session, request for a new token from ThoughtSpot. See [Get Object Access Token](#/http/api-endpoints/authentication/get-object-access-token) and [Get Full Access Token](#/http/api-endpoints/authentication/get-full-access-token).      
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void revokeTokenTest() throws ApiException {
        RevokeTokenRequest revokeTokenRequest = null;
        api.revokeToken(revokeTokenRequest);
        // TODO: test validations
    }

}
