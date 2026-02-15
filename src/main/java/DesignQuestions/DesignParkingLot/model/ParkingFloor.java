package DesignQuestions.DesignParkingLot.model;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private String number;
    List<ParkingSlot> parkingSlotList;

    public ParkingFloor(String parkingFloor1, List<ParkingSlot> parkingSlotList) {
        super();
        this.number = parkingFloor1;
        this.parkingSlotList = parkingSlotList;
    }


    public String getNumber() {
        return number;
    }

    public List<ParkingSlot> getParkingSlotList() {
        return parkingSlotList;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setParkingSlotList(List<ParkingSlot> parkingSlotList) {
        this.parkingSlotList = parkingSlotList;
    }
}
