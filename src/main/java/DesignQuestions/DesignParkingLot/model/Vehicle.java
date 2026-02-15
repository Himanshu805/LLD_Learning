package DesignQuestions.DesignParkingLot.model;

public class Vehicle extends BaseModel {
    private String vehicleNumber;
    private String owner;
    private VehicleType vehicleType;

    public String getOwner() {
        return owner;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
