/**
 * Created by blockost on 27/04/17.
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader jsonBuffer = FileHelper.readFile("data/vehicles.json");

        if (jsonBuffer != null) {

            // Prepare to build a GSON object
            GsonBuilder GSONBuilder = new GsonBuilder();
            // Register a special constructor for the Vehicle class
            // I need to register a specific custom constructor as GSON uses the
            // default (no parameter) constructor
            GSONBuilder.registerTypeAdapter(Vehicle.class, new VehicleDeserializer());

            // Create the JSON parser
            Gson gson = GSONBuilder.create();
            JStructure jStructure = gson.fromJson(jsonBuffer, JStructure.class);

            Search search = jStructure.getSearch();

            System.out.println("/** Print a list of all the cars, in ascending price order ***/ \n");
            search.printVehiclesByPriceASC();

            System.out.println("\n\n/*** calculate the specification of the vehicles based on their SIPP ***/\n");
            search.printVehiclesSpec();

            System.out.println("\n\n/*** Print out the highest rated supplier per car type, descending order ***/\n");
            search.printHighestRatedSupplier();

            System.out.println("\n\n/*** list of vehicles, ordered by the sum of the scores in descending order ***/\n");
            search.printVehiclesByScore();

        }
    }
}
