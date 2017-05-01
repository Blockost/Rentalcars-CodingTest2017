package helpers;

import com.google.gson.*;
import models.Vehicle;

import java.lang.reflect.Type;

/**
 * Created by blockost on 29/04/17.
 */
public class VehicleDeserializer implements JsonDeserializer<Vehicle> {

    @Override
    public Vehicle deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {

        JsonObject json = ((JsonObject) jsonElement);
        String sipp = json.get("sipp").getAsString();
        String name = json.get("name").getAsString();
        Float price = json.get("price").getAsFloat();
        String supplier = json.get("supplier").getAsString();
        Float rating = json.get("rating").getAsFloat();

        return new Vehicle(sipp, name, price, supplier, rating);
    }
}
