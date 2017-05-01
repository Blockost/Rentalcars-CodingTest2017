import models.Vehicle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by blockost on 29/04/17.
 */
public class VehicleTest {
    private Vehicle v1;
    private Vehicle v2;

    @Before
    public void init() {
        v1 = new Vehicle("ECMN", "Car Test 1", 209.3f, "Hertz", 9.8f);
        v2 = new Vehicle("FVAR", "Car Test 2", 158.8f, "Hertz", 6.5f);
    }


    @Test
    public void testCarSpec() {
        assertEquals("Car Test 1 - ECMN - Economy - 4 doors - Manual - Petrol - No AC",
            v1.getSpec());

        assertEquals("Car Test 2 - FVAR - Full size - Passenger van - Automatic - Petrol - AC",
            v2.getSpec());
    }
}
