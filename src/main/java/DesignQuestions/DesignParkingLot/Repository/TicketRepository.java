package DesignQuestions.DesignParkingLot.Repository;

import DesignQuestions.DesignParkingLot.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketRepository {

    private List<Ticket> ticketList = new ArrayList<>();
    private int count=0;


    public Ticket save(Ticket ticket) {
        ticket.setId(count++);
        ticketList.add(ticket);
        return ticket;
    }
}
