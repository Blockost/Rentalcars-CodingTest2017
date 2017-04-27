import java.util.List;

/**
 * Created by blockost on 27/04/17.
 */
public class Search {

    private List<Vehicle> VehicleList;

    public Search(List<Vehicle> VehicleList) {
        this.VehicleList = VehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return VehicleList;
    }
}