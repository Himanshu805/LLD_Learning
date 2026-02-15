package DesignQuestions.DesignParkingLot.Strategy;

import DesignQuestions.DesignParkingLot.model.ParkingLot;
import DesignQuestions.DesignParkingLot.model.ParkingSlot;
import DesignQuestions.DesignParkingLot.model.VehicleType;

public interface ISlotAllocationStrategy {

    public ParkingSlot allocateSlot(ParkingLot parkingLot, VehicleType vehicleType);



}
