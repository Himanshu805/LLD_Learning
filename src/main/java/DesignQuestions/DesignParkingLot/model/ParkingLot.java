package DesignQuestions.DesignParkingLot.model;

import DesignQuestions.DesignParkingLot.Strategy.ISlotAllocationStrategy;
import DesignQuestions.DesignParkingLot.Strategy.RandomSlotAllocationStrategy;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot extends BaseModel {

    private String name;
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gatesList;
    private String address;
    private ISlotAllocationStrategy slotAllocationStrategy;

    public ParkingLot(String lot1, List<ParkingFloor> parkingFloors, List<Gate> gatesList,String hyderabad, RandomSlotAllocationStrategy randomSlotAllocationStrategy) {
        super();
        this.name = lot1;
        this.parkingFloors = parkingFloors;
        this.gatesList = gatesList;
        this.address = hyderabad;
        this.slotAllocationStrategy = randomSlotAllocationStrategy;
    }


    public String getAddress() {
        return address;
    }

    public List<Gate> getGatesList() {
        return gatesList;
    }

    public String getName() {
        return name;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public ISlotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGatesList(List<Gate> gatesList) {
        this.gatesList = gatesList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public void setSlotAllocationStrategy(ISlotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }


}
