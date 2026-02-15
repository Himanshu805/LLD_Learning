package DesignQuestions.DesignParkingLot.Controller;

import DesignQuestions.DesignParkingLot.Repository.GateRepository;
import DesignQuestions.DesignParkingLot.Repository.ParkingLotRepository;
import DesignQuestions.DesignParkingLot.Repository.TicketRepository;
import DesignQuestions.DesignParkingLot.Repository.VehicleRepository;
import DesignQuestions.DesignParkingLot.dto.IssueTicketRequestDTO;
import DesignQuestions.DesignParkingLot.dto.IssueTicketResponseDTO;
import DesignQuestions.DesignParkingLot.dto.ResponseStatus;
import DesignQuestions.DesignParkingLot.model.Ticket;
import DesignQuestions.DesignParkingLot.service.TicketService;

public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO issueTicketRequestDTO) {
        IssueTicketResponseDTO issueTicketResponseDTO = new IssueTicketResponseDTO();
        try {
            Ticket ticket = ticketService.issueTicket(issueTicketRequestDTO);

            // send the ticket response after create ticket
            issueTicketResponseDTO.setTicketId(ticket.getId());
            issueTicketResponseDTO.setParkingFloorNumber(ticket.getParkingSlot().getParkingFloorNumber());
            issueTicketResponseDTO.setParkingSlotNumber(ticket.getParkingSlot().getNumber());
            issueTicketResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            issueTicketResponseDTO.setMessage("Ticket issued successfully");
        }
        catch (Exception e){
            issueTicketResponseDTO.setMessage("Ticket issued failed");
            issueTicketResponseDTO.setResponseStatus(ResponseStatus.FAILED);

        }
        return issueTicketResponseDTO;
    }

}
