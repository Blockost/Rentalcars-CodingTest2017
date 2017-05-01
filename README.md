# Rentalcars-CodingTest2017

## Getting started
### Using Maven

    $ mvn install
    $ mvn clean package
    $ java -jar target/Rentalcars-CodingTest2017-1.0.jar
    
or simply 

    mvn spring-boot:run
       
The RESTful web service should start in a second: 

      .   ____          _            __ _ _
     /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
    ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
     \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
      '  |____| .__|_| |_|_| |_\__, | / / / /
     =========|_|==============|___/=/_/_/_/
     :: Spring Boot ::        (v1.5.3.RELEASE)
    
    2017-05-01 00:04:42.707  INFO 30024 --- [           main] app.RESTApp                              : Starting RESTApp on blockost-Dell-EISTI with PID 30024 (/SharedFolders/Data/SharedDocuments/Dev/Rentalcars-CodingTest2017/target/classes started by blockost in /SharedFolders/Data/SharedDocuments/Dev/Rentalcars-CodingTest2017)
    2017-05-01 00:04:42.711  INFO 30024 --- [           main] app.RESTApp                              : No active profile set, falling back to default profiles: default
    2017-05-01 00:04:42.806  INFO 30024 --- [           main] ationConfigEmbeddedWebApplicationContext : Refreshing org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@6bef2a9d: startup date [Mon May 01 00:04:42 BST 2017]; root of context hierarchy
    2017-05-01 00:04:44.620  INFO 30024 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat initialized with port(s): 8080 (http)
    2017-05-01 00:04:44.640  INFO 30024 --- [           main] o.apache.catalina.core.StandardService   : Starting service Tomcat
    2017-05-01 00:04:44.641  INFO 30024 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet Engine: Apache Tomcat/8.5.14
    2017-05-01 00:04:44.758  INFO 30024 --- [ost-startStop-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
    2017-05-01 00:04:44.758  INFO 30024 --- [ost-startStop-1] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1957 ms
    2017-05-01 00:04:44.962  INFO 30024 --- [ost-startStop-1] o.s.b.w.servlet.ServletRegistrationBean  : Mapping servlet: 'dispatcherServlet' to [/]
    2017-05-01 00:04:44.971  INFO 30024 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'characterEncodingFilter' to: [/*]
    2017-05-01 00:04:44.972  INFO 30024 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'hiddenHttpMethodFilter' to: [/*]
    2017-05-01 00:04:44.972  INFO 30024 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'httpPutFormContentFilter' to: [/*]
    2017-05-01 00:04:44.975  INFO 30024 --- [ost-startStop-1] o.s.b.w.servlet.FilterRegistrationBean   : Mapping filter: 'requestContextFilter' to: [/*]
    2017-05-01 00:04:45.391  INFO 30024 --- [           main] s.w.s.m.m.a.RequestMappingHandlerAdapter : Looking for @ControllerAdvice: org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@6bef2a9d: startup date [Mon May 01 00:04:42 BST 2017]; root of context hierarchy
    2017-05-01 00:04:45.503  INFO 30024 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/vehicles/list],methods=[GET]}" onto public java.util.List<java.lang.String> controllers.VehiclesController.getVehicles()
    2017-05-01 00:04:45.504  INFO 30024 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/vehicles/suppliers],methods=[GET]}" onto public java.util.List<java.lang.String> controllers.VehiclesController.getHighestRatedSupplier()
    2017-05-01 00:04:45.505  INFO 30024 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/vehicles/scores],methods=[GET]}" onto public java.util.List<java.lang.String> controllers.VehiclesController.getVehiclesByScore()
    2017-05-01 00:04:45.505  INFO 30024 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/vehicles/specs],methods=[GET]}" onto public java.util.List<java.lang.String> controllers.VehiclesController.getVehiclesSpec()
    2017-05-01 00:04:45.507  INFO 30024 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error],produces=[text/html]}" onto public org.springframework.web.servlet.ModelAndView org.springframework.boot.autoconfigure.web.BasicErrorController.errorHtml(javax.servlet.http.HttpServletRequest,javax.servlet.http.HttpServletResponse)
    2017-05-01 00:04:45.508  INFO 30024 --- [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : Mapped "{[/error]}" onto public org.springframework.http.ResponseEntity<java.util.Map<java.lang.String, java.lang.Object>> org.springframework.boot.autoconfigure.web.BasicErrorController.error(javax.servlet.http.HttpServletRequest)
    2017-05-01 00:04:45.558  INFO 30024 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/webjars/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2017-05-01 00:04:45.558  INFO 30024 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2017-05-01 00:04:45.617  INFO 30024 --- [           main] o.s.w.s.handler.SimpleUrlHandlerMapping  : Mapped URL path [/**/favicon.ico] onto handler of type [class org.springframework.web.servlet.resource.ResourceHttpRequestHandler]
    2017-05-01 00:04:45.880  INFO 30024 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
    2017-05-01 00:04:45.957  INFO 30024 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
    2017-05-01 00:04:45.962  INFO 30024 --- [           main] app.RESTApp                              : Started RESTApp in 3.794 seconds (JVM running for 8.182)
    
### Routes

When the server is fully started, you can browse to `localhost:8080/vehicles/` and try these 4 routes:

- `/list`: Print a list of all the cars, in ascending price order
- `/specs`: Print the vehicles' specification
- `/suppliers`: Print out the highest rated supplier per car type, descending order
- `/scores`: Print out a list of vehicles, ordered by the sum of the scores in descending order
    
## Tools
- IntelliJ IDEA
- Apache Maven 3.3.9

## Dependencies
- [GSON](https://github.com/google/gson)
- [JUnit 4](https://mvnrepository.com/artifact/junit/junit/4.12)
- [Spring Boot](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-tools/spring-boot-maven-plugin)

Dependencies were managed via Maven. However, these libs will be included in this project if you don't want to use Maven.

