
package cshu271.resource;

import cshu271.main.Main;
import org.glassfish.grizzly.http.server.HttpServer;
;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import junit.framework.TestCase;


public class MainTest extends TestCase {

    private HttpServer httpServer;
    
   private WebTarget target;

    public MainTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        
        //start the Grizzly2 web container 
        httpServer = Main.startServer();

        // create the client
        Client c = ClientBuilder.newClient();
        target = c.target(Main.BASE_URI);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();

        httpServer.stop();
    }

    /**
     * Test to see that the message "Got it!" is sent in the response.
     */
    public void testMyResource() {
//        String responseMsg = r.path("article").get(String.class);
//        assertEquals("Got it!", responseMsg);
    }

}
