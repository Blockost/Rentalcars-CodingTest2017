package app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controllers.VehiclesController;
import helpers.FileHelper;
import helpers.VehicleDeserializer;
import models.JStructure;
import models.Search;
import models.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.BufferedReader;

/**
 * Created by blockost on 30/04/17.
 */

@SpringBootApplication
@ComponentScan(basePackageClasses = VehiclesController.class)
public class RESTApp {
    public static Search search;

    public static void main(String[] args) {

        BufferedReader jsonBuffer = FileHelper.readFile("data/vehicles.json");

        if (jsonBuffer != null) {

            // Prepare to build a GSON object
            GsonBuilder GSONBuilder = new GsonBuilder();
            // Register a special constructor for the models.Vehicle class
            // I need to register a specific custom constructor as GSON uses the
            // default (no parameter) constructor
            GSONBuilder.registerTypeAdapter(Vehicle.class, new VehicleDeserializer());

            // Create the JSON parser
            Gson gson = GSONBuilder.create();
            JStructure jStructure = gson.fromJson(jsonBuffer, JStructure.class);

            search = jStructure.getSearch();

            /** Finally, start RESTful web service **/
            SpringApplication.run(RESTApp.class, args);

        }
    }
}
