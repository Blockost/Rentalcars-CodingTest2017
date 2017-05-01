import helpers.FileHelper;
import models.Search;
import models.Vehicle;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by blockost on 01/05/17.
 */
public class SearchTest {
    private Search search;
    private List<Vehicle> vehicles;

    @Before
    public void init() {
        search = FileHelper.fromJson("data/vehicles.json");
    }

    @Test
    public void testVehicles() {
        assertEquals(31, search.getVehicles().size());
    }

    @Test
    public void testVehiclesByPriceASC() {
        vehicles = search.getVehiclesByPriceASC();
        assertEquals((Float) 120.16f, vehicles.get(0).getPrice());
        assertEquals((Float) 789.75f, vehicles.get(30).getPrice());
    }

    @Test
    public void testHighestRatedSupplier() {
        assertEquals(6, search.getHighestRatedSupplier().size());
    }


    @Test
    public void testVehiclesByScoreDESC() {
        vehicles = search.getVehiclesByScoreDESC();
        assertEquals((Float) 15.90f, vehicles.get(0).getSumScores());
        assertEquals((Float) 9.90f, vehicles.get(30).getSumScores());
    }
}
