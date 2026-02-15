package DesignQuestions.DesignParkingLot.Strategy;

import DesignQuestions.DesignParkingLot.model.ParkingLot;
import DesignQuestions.DesignParkingLot.model.ParkingSlot;
import DesignQuestions.DesignParkingLot.model.VehicleType;

public class RandomSlotAllocationStrategy implements ISlotAllocationStrategy {

    @Override
    public ParkingSlot allocateSlot(ParkingLot parkingLot, VehicleType vehicleType) {
        return parkingLot.getParkingFloors().get(0).getParkingSlotList().get(0);
    }
}
