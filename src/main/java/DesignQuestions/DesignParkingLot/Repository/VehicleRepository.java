package DesignQuestions.DesignParkingLot.Repository;

import DesignQuestions.DesignParkingLot.model.Vehicle;

import java.util.*;

public class VehicleRepository {

    private Map<String, Vehicle> vehicleMap  = new HashMap<>();
    private static int counter = 0;


    public Vehicle save(Vehicle vehicle){
        vehicle.setId(counter++);
        vehicleMap.put(vehicle.getVehicleNumber(),  vehicle);
        return  vehicle;
    }

    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber){

        if(vehicleMap.containsKey(vehicleNumber)){
            return Optional.of(vehicleMap.get(vehicleNumber));
        }
        else{
            return Optional.empty();
        }

    }
}
