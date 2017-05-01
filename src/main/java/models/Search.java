package models;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by blockost on 27/04/17.
 */
public class Search {

    private List<Vehicle> VehicleList;

    public Search(List<Vehicle> VehicleList) {
        this.VehicleList = VehicleList;
    }


    public List<Vehicle> getVehicles() {
        return VehicleList;
    }

    public List<Vehicle> getVehiclesByPriceASC() {
        VehicleList.sort(Comparator.comparing(Vehicle::getPrice));
        return VehicleList;
    }

    //TODO Check function's expected behaviour
    public List<Vehicle> getHighestRatedSupplier() {

        /*VehicleList.sort(Comparator
            .comparing(Vehicle::getCarType)
            .thenComparing(Comparator.comparing(Vehicle::getRating).reversed()));*/

        //VehicleList.sort(Comparator.comparing(Vehicle::getRating).reversed());

        Map<String, Optional<Vehicle>> vehiclesPerCarType = VehicleList.stream()
            .collect(Collectors.groupingBy(Vehicle::getCarType,
                Collectors.maxBy(Comparator.comparing(Vehicle::getRating))));

        return VehicleList;
    }


    public List<Vehicle> getVehiclesByScore() {
        VehicleList.sort(Comparator.comparing(Vehicle::getSumScores).reversed());
        return VehicleList;
    }

}