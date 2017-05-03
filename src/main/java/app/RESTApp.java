package app;

import controllers.VehiclesController;
import helpers.FileHelper;
import models.Search;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by blockost on 30/04/17.
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = VehiclesController.class)
public class RESTApp {
    public static Search search;

    /**
     * Web service startup
     *
     * @param args
     */
    public static void main(String[] args) {

        search = FileHelper.fromJson("data/vehicles.json");

        if (search != null) {

            /** Finally, start RESTful web service **/
            SpringApplication.run(RESTApp.class, args);

        }
    }
}
