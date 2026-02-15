package DesignQuestions.DesignParkingLot.Repository;

import DesignQuestions.DesignParkingLot.model.Gate;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GateRepository {

    private Map<Integer,Gate> gateMap;
    public GateRepository(
            Map<Integer,Gate> gateMap
    ){
        this.gateMap = gateMap;
    }


    public Optional<Gate> findByGateId(int gateId) {
        if ((gateMap.get(gateId) == null)) {
            return Optional.empty();
        }
        else{
            return Optional.of(gateMap.get(gateId));
        }
    }
}
