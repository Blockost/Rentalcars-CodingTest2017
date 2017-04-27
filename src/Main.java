/**
 * Created by blockost on 27/04/17.
 */

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        BufferedReader jsonBuffer = FileHelper.readFile("data/vehicles.json");

        if (jsonBuffer != null) {
            Gson gson = new Gson();
            JStructure jStructure = gson.fromJson(jsonBuffer, JStructure.class);

            List<Vehicle> vehicles = jStructure.getSearch().getVehicleList();
            vehicles.stream().forEach(System.out::println);
        }
    }
}
