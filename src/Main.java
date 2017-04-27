/**
 * Created by blockost on 27/04/17.
 */

import com.google.gson.Gson;

import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader jsonBuffer = FileHelper.readFile("data/vehicles.json");

        if (jsonBuffer != null) {
            Gson gson = new Gson();
            JStructure jStructure = gson.fromJson(jsonBuffer, JStructure.class);

            Search search = jStructure.getSearch();

            System.out.println("/** Print a list of all the cars, in ascending price order ***/ \n");
            search.printVehiclesByPriceASC();

            System.out.println("\n\n/*** calculate the specification of the vehicles based on their SIPP ***/\n");
            search.printVehiclesSpec();

        }
    }
}
