#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};
import ${package}.configuration.JacksonObjectMappProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.freemarker.FreemarkerMvcFeature;

public class ExampleApplication extends ResourceConfig
{
    public ExampleApplication()
    {
        this.packages(true, "${package}.presentation");
        this.register(JacksonObjectMappProvider.class);
        this.register(JacksonFeature.class);
        this.register(MultiPartFeature.class);
        this.register(FreemarkerMvcFeature.class);
        this.property(FreemarkerMvcFeature.TEMPLATES_BASE_PATH, this.getClass().getResource("/"));
    }
}
