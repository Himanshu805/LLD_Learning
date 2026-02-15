package DesignQuestions.DesignParkingLot.model;

import java.util.Date;

public class Ticket extends BaseModel {

    private Date date;
    private Vehicle vehicle;
    private Gate gate;
    private ParkingSlot parkingSlot;
    private Operator operator;

    public Date getDate() {
        return date;
    }

    public Gate getGate() {
        return gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
