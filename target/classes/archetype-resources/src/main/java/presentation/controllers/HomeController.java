#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.presentation.controllers;

import org.glassfish.jersey.server.mvc.Viewable;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HomeController
{
    @Context
    ServletContext context;

    @GET
    @Produces(MediaType.TEXT_HTML)
    public Viewable index()
    {
        Viewable viewable = new Viewable("/views/example/index.ftl", "Hello world");
        return viewable;
    }
}
