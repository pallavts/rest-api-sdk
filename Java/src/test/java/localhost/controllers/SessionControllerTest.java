/*
 * ThoughtSpotPublicRESTAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package localhost.controllers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import io.apimatic.core.testing.TestHelper;
import java.util.LinkedHashMap;
import java.util.Map;
import localhost.ThoughtSpotPublicRESTAPIClient;
import localhost.exceptions.ApiException;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SessionControllerTest extends BaseControllerTest {

    /**
     * Client instance.
     */
    private static ThoughtSpotPublicRESTAPIClient client;
    
    /**
     * Controller instance (for all tests).
     */
    private static SessionController controller;

    /**
     * Setup test class.
     */
    @BeforeClass
    public static void setUpClass() {
        client = createConfiguration();
        controller = client.getSessionController();
    }

    /**
     * Tear down test class.
     */
    @AfterClass
    public static void tearDownClass() {
        controller = null;
    }

    /**
     * You can programmatically create login session for a user in ThoughtSpot using this endpoint.
     * You can create session by either providing userName and password as inputs in this request
     * body or by including "Authorization" header with the token generated through the endpoint
     * /tspublic/rest/v2/session/gettoken. userName and password input is given precedence over
     * "Authorization" header, when both are included in the request.
     * @throws Throwable exception if occurs.
     */
    @Test
    public void testTestRestapiV2Login() throws Exception {
        // Parameters for the API call
        String userName = null;
        String password = null;
        Boolean rememberMe = null;

        // Set callback and perform API call
        try {
            controller.restapiV2Login(userName, password, rememberMe);
        } catch (ApiException e) {
            // Empty block
        }

        // Test whether the response is null
        assertNotNull("Response is null", 
                httpResponse.getResponse());
        // Test response code
        assertEquals("Status is not 200", 
                200, httpResponse.getResponse().getStatusCode());

        // Test headers
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        
        assertTrue("Headers do not match", TestHelper.areHeadersProperSubsetOf(
                headers, httpResponse.getResponse().getHeaders().asSimpleMap(), true));

    }

}
