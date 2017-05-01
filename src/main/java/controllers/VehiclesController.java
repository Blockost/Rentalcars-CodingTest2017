package controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static app.RESTApp.search;

/**
 * Created by blockost on 30/04/17.
 */

@RestController
@RequestMapping("/vehicles")
public class VehiclesController {

    @RequestMapping(path = "/list", method = RequestMethod.GET)
    public List<String> getVehicles() {
        return search.getVehiclesByPriceASC()
            .stream()
            .map(v -> String.format("%s - %.2f", v.getName(), v.getPrice()))
            .collect(Collectors.toList());
    }

    @RequestMapping(path = "/specs", method = RequestMethod.GET)
    public List<String> getVehiclesSpec() {
        return search.getVehicles()
            .stream()
            .map(v -> v.getSpec())
            .collect(Collectors.toList());
    }

    @RequestMapping(path = "/suppliers", method = RequestMethod.GET)
    public List<String> getHighestRatedSupplier() {
        return search.getHighestRatedSupplier()
            .stream()
            .map(v -> String.format("%s - %s - %s - %.2f",
                v.getName(), v.getCarType(), v.getSupplier(), v.getRating()))
            .collect(Collectors.toList());
    }

    @RequestMapping(path = "/scores", method = RequestMethod.GET)
    public List<String> getVehiclesByScore() {
        return search.getVehiclesByScoreDESC()
            .stream()
            .map(v -> String.format("%s - %d - %.2f - %.2f",
                v.getName(), v.getScore(), v.getRating(), v.getSumScores()))
            .collect(Collectors.toList());
    }

}
