package ch.carve.os.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloResource {

    @Path("hello")
    @GET
    public String getHello() {
        return "Hello Openshift 2";
    }
}
