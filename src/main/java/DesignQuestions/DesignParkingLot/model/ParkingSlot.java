package DesignQuestions.DesignParkingLot.model;

public class ParkingSlot extends BaseModel {

    private String number;
    private VehicleType vehicleType;
    private ParkingSlotStatus parkingSlotStatus;
    private String parkingFloorNumber;

    public ParkingSlot(String slotNumber, VehicleType vehicleType, ParkingSlotStatus parkingSlotStatus, String parkingFloorNumber) {
        super();
        this.parkingSlotStatus = parkingSlotStatus;
        this.number = slotNumber;
        this.vehicleType = vehicleType;
        this.parkingFloorNumber = parkingFloorNumber;
    }

    public String getNumber() {
        return number;
    }

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getParkingFloorNumber() {
        return parkingFloorNumber;
    }


    public void setNumber(String number) {
        this.number = number;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setParkingFloorNumber(String parkingFloorNumber) {
        this.parkingFloorNumber = parkingFloorNumber;
    }
}
