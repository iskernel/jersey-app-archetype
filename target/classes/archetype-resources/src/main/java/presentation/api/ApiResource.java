#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.presentation.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api")
public class ApiResource
{
    public static class ExamplePojo
    {
        private String name;
        private int age;

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = name;
        }

        public int getAge()
        {
            return age;
        }

        public void setAge(int age)
        {
            this.age = age;
        }
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt()
    {
        String word = "The bird is the word";
        return word;
    }

    @Path("/pojo")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ExamplePojo getAPojo()
    {
        ExamplePojo examplePojo = new ExamplePojo();
        examplePojo.setAge(24);
        examplePojo.setName("Hi, this is my archetype.");
        return examplePojo;
    }
}
