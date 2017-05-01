package helpers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.JStructure;
import models.Search;
import models.Vehicle;

import java.io.*;

/**
 * Created by blockost on 27/04/17.
 */
public class FileHelper {

    public static BufferedReader readFile(String filepath) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(new File(filepath)), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.err.format("Cannot read file \n");
        } catch (FileNotFoundException e) {
            System.err.format("File '%s' not found \n", filepath);
        }

        return reader;
    }

    public static Search fromJson(String filepath) {
        Search search = null;

        BufferedReader jsonBuffer = FileHelper.readFile(filepath);

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
        }

        return search;
    }
}
