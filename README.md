Prerequisites:

- Maven on the command line: [Spring Maven Guide](https://spring.io/guides/gs/maven/)
- Java on the command line

To run the application, have Maven and Spring Boot put together an executable JAR:
```bash
mvn package && java -jar target/gs-spring-boot-0.1.0.jar
```
The Tomcat servlet container is embedded as the HTTP runtime, instead of deploying to an external instance.

Actuator methods can be used to check the health of the app, e.g. 
```bash
curl localhost:8080/actuator/health
```
More endpoints can be found in the [docs](https://docs.spring.io/spring-boot/docs/2.0.3.RELEASE/reference/htmlsingle/#production-ready-endpoints)

### Security
Managedb y Spring Security.
If Spring Security is on the classpath, then Spring Boot automatically secures all HTTP endpoints with "basic" authentication.