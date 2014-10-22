package it.pkg;
import it.pkg.configuration.JacksonObjectMappProvider;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.mvc.freemarker.FreemarkerMvcFeature;

public class ExampleApplication extends ResourceConfig
{
    public ExampleApplication()
    {
        this.packages(true, "it.pkg.presentation");
        this.register(JacksonObjectMappProvider.class);
        this.register(JacksonFeature.class);
        this.register(MultiPartFeature.class);
        this.register(FreemarkerMvcFeature.class);
        this.property(FreemarkerMvcFeature.TEMPLATES_BASE_PATH, this.getClass().getResource("/"));
    }
}
