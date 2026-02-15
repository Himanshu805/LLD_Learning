package DesignQuestions.DesignParkingLot.Repository;

import DesignQuestions.DesignParkingLot.model.ParkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ParkingLotRepository {
    Map<Integer, ParkingLot> parkingLotMap ;

    public ParkingLotRepository( Map<Integer, ParkingLot> parkingLotMap) {
        this.parkingLotMap = parkingLotMap;

    }


    public Optional<ParkingLot> findByParkingLotId(Integer parkingLotId) {
        if (parkingLotMap.containsKey(parkingLotId)) {
            return Optional.of(parkingLotMap.get(parkingLotId));
        }
        return Optional.empty();
    }
}
