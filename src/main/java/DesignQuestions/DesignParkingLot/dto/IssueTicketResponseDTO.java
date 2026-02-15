package DesignQuestions.DesignParkingLot.dto;

public class IssueTicketResponseDTO {

    private int ticketId;
    private String parkingFloorNumber;
    private String parkingSlotNumber;

    private ResponseStatus responseStatus;
    private String message;

    public String getMessage() {
        return message;
    }

    public String getParkingFloorNumber() {
        return parkingFloorNumber;
    }

    public String getParkingSlotNumber() {
        return parkingSlotNumber;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setParkingFloorNumber(String parkingFloorNumber) {
        this.parkingFloorNumber = parkingFloorNumber;
    }

    public void setParkingSlotNumber(String parkingSlotNumber) {
        this.parkingSlotNumber = parkingSlotNumber;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
}
