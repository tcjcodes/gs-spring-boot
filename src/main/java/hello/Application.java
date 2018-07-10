package hello;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }

    /**
     * Runs the whole application.
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*
     * Runs on startup
     */
    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}