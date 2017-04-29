import java.util.Comparator;
import java.util.List;

/**
 * Created by blockost on 27/04/17.
 */
public class Search {

    private List<Vehicle> VehicleList;

    public Search(List<Vehicle> VehicleList) {
        this.VehicleList = VehicleList;
    }

    public void printVehiclesByPriceASC() {
        VehicleList.sort(Comparator.comparing(Vehicle::getPrice));
        VehicleList.forEach(v ->
            System.out.format("%s - %.2f \n", v.getName(), v.getPrice()));
    }

    public void printVehiclesSpec() {
        VehicleList.forEach(v -> System.out.println(v.getSpec()));
    }
}