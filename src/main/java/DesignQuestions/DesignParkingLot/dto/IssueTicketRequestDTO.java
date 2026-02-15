package DesignQuestions.DesignParkingLot.dto;

import DesignQuestions.DesignParkingLot.model.VehicleType;

public class IssueTicketRequestDTO {

    private String vehicleNumber;
    private String ownerName;
    private int gateId;
    private VehicleType vehicleType;
    private int parkingLotId;

    public int getGateId() {
        return gateId;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
