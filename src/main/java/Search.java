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

    public void printHighestRatedSupplier() {
        VehicleList.sort(Comparator
            .comparing(Vehicle::getCarType)
            .thenComparing(Comparator.comparing(Vehicle::getRating).reversed()));

        VehicleList.forEach(v -> System.out.format("%s - %s - %s - %.2f\n",
            v.getName(), v.getCarType(), v.getSupplier(), v.getRating()));
    }

    public void printVehiclesByScore() {
        VehicleList.sort(Comparator.comparing(Vehicle::getSumScores).reversed());

        VehicleList.forEach(v -> System.out.format("%s - %d - %.2f - %.2f\n",
            v.getName(), v.getScore(), v.getRating(), v.getSumScores()));
    }


}