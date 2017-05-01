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


    public List<Vehicle> getHighestRatedSupplier() {

        Map<String, Optional<Vehicle>> vehiclesPerCarType = VehicleList.stream()
            .collect(Collectors.groupingBy(Vehicle::getCarType,
                Collectors.maxBy(Comparator.comparing(Vehicle::getRating))));

        return vehiclesPerCarType.values()
            .stream()
            .filter(v -> v.isPresent())
            .map(v -> v.get())
            .sorted(Comparator.comparing(Vehicle::getRating).reversed())
            .collect(Collectors.toList());
    }


    public List<Vehicle> getVehiclesByScore() {
        VehicleList.sort(Comparator.comparing(Vehicle::getSumScores).reversed());
        return VehicleList;
    }

}