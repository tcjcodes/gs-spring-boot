package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * Convenience annotation, includes
 * @Configuration: Source of bean definitions
 * @EnableAutoConfiguration: start adding beans based on classpath settings, other beans, and various property settings.
 * @EnableWebMvc: Flags this as a web app and activates key behaviors, like `Dispatcher Servlet`
 * @ComponentScan:  tells Spring to look for other components, configurations, and services in the hello package,
 * allowing it to find the controllers.
 */
@SpringBootApplication
public class Application {

    /**
     * Runs the whole application.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}