package DesignQuestions.DesignParkingLot.service;

import DesignQuestions.DesignParkingLot.Repository.GateRepository;
import DesignQuestions.DesignParkingLot.Repository.ParkingLotRepository;
import DesignQuestions.DesignParkingLot.Repository.TicketRepository;
import DesignQuestions.DesignParkingLot.Repository.VehicleRepository;
import DesignQuestions.DesignParkingLot.dto.IssueTicketRequestDTO;
import DesignQuestions.DesignParkingLot.model.*;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private final GateRepository gateRepository;
    private final VehicleRepository vehicleRepository;
    private final ParkingLotRepository parkingLotRepository;
    private final TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository,
                         VehicleRepository vehicleRepository,
                         ParkingLotRepository parkingLotRepository,
                         TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;

    }


    public Ticket issueTicket(IssueTicketRequestDTO issueTicketRequestDTO) {

        int gateId = issueTicketRequestDTO.getGateId();

        //step 1.  find the gate by id , if not exist return invalid gateId

        Optional<Gate> gateOptional = gateRepository.findByGateId(gateId);

        Gate gate = null;
        if (gateOptional.isPresent()) {
            gate = gateOptional.get();
        } else {
            System.out.println("Invalid Gate Id");
        }

        // step 2 : get the vehicle details if exist already in db
        Optional<Vehicle> vehicleOptional = vehicleRepository.findByVehicleNumber(issueTicketRequestDTO.getVehicleNumber());

        Vehicle vehicle = null;
        if (vehicleOptional.isPresent()) {
            vehicle = vehicleOptional.get();
        } else {
            // create a new Vehicle Entry in repository
            Vehicle newVehicle = new Vehicle();
            newVehicle.setVehicleNumber(issueTicketRequestDTO.getVehicleNumber());
            newVehicle.setOwner(issueTicketRequestDTO.getOwnerName());
            newVehicle.setVehicleType(issueTicketRequestDTO.getVehicleType());
            newVehicle.setCreatedAt(new Date());
            newVehicle.setUpdatedAt(new Date());

            // save the new vehicle
            vehicle = vehicleRepository.save(newVehicle);
        }

        // step 3: check the parkingLotId whether exist or not
        Optional<ParkingLot> parkingLotOptional = parkingLotRepository.findByParkingLotId(issueTicketRequestDTO.getParkingLotId());
        ParkingLot parkingLot = null;
        if (parkingLotOptional.isPresent()) {
            parkingLot = parkingLotOptional.get();

        } else {
            System.out.println("Invalid Parking Lot");
        }

        // assign the parking slot
        ParkingSlot parkingSlot = parkingLot.getSlotAllocationStrategy().allocateSlot(parkingLot, vehicle.getVehicleType());

        if (parkingSlot == null) {
            System.out.println("Invalid Parking Slot");
        }

        Ticket ticket = new Ticket();
        ticket.setGate(gate);
        ticket.setVehicle(vehicle);
        ticket.setParkingSlot(parkingSlot);
        ticket.setDate(new Date());
        ticket.setOperator(gate.getOperator());

        return ticketRepository.save(ticket);
    }


}
