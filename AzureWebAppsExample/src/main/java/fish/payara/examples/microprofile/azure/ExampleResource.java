/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fish.payara.examples.microprofile.azure;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * REST Web Service
 *
 * @author steve
 */
@Path("example")
@RequestScoped
public class ExampleResource {

    @Context
    private UriInfo context;
    
    /**
     * PUT method for updating or creating an instance of ExampleResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
    @Inject
    @ConfigProperty(name = "exampleproperty", defaultValue = "NotConfigured")
    String exampleProperty;

    /**
     * Creates a new instance of ExampleResource
     */
    public ExampleResource() {
    }

    /**
     * Retrieves representation of an instance of fish.payara.examples.microprofile.azure.ExampleResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        return "Example Config Property " + exampleProperty;
    }

}
