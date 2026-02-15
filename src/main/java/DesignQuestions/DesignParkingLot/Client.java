package DesignQuestions.DesignParkingLot;

import DesignQuestions.DesignParkingLot.Controller.TicketController;
import DesignQuestions.DesignParkingLot.Repository.GateRepository;
import DesignQuestions.DesignParkingLot.Repository.ParkingLotRepository;
import DesignQuestions.DesignParkingLot.Repository.TicketRepository;
import DesignQuestions.DesignParkingLot.Repository.VehicleRepository;
import DesignQuestions.DesignParkingLot.Strategy.RandomSlotAllocationStrategy;
import DesignQuestions.DesignParkingLot.dto.IssueTicketRequestDTO;
import DesignQuestions.DesignParkingLot.dto.IssueTicketResponseDTO;
import DesignQuestions.DesignParkingLot.model.*;
import DesignQuestions.DesignParkingLot.service.TicketService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {

    public static void main(String[] args) {

         Map<Integer, Gate> gateMap  = new HashMap<>();
         gateMap.put(0, new Gate( "Gate_0", GateType.ENTRY, new Operator("Operator_1")));
         gateMap.put(1, new Gate( "Gate_1", GateType.EXIT, new Operator("Operator_2")));

         List<Gate> gateList = new ArrayList<>();
         gateList.add(gateMap.get(0));
         gateList.add(gateMap.get(1));

        List<ParkingSlot> parkingSlotList = new ArrayList<>();
        parkingSlotList.add(new ParkingSlot("parking_slot_1", VehicleType.TWO_WHEELER, ParkingSlotStatus.EMPTY, "0"));
        parkingSlotList.add(new ParkingSlot("parking_slot_2", VehicleType.FOUR_WHEELER, ParkingSlotStatus.UNDER_MAINTENANCE, "0"));

        List<ParkingFloor>  parkingFloorList = new ArrayList<>();
        parkingFloorList.add(new ParkingFloor("parking_floor_1", parkingSlotList));

         Map<Integer, ParkingLot> parkingLotMap = new HashMap<>();
         parkingLotMap.put(0, new ParkingLot("Lot_1", parkingFloorList,gateList,"Hyderabad", new RandomSlotAllocationStrategy()));


        TicketController ticketController = new TicketController(new TicketService(new GateRepository(gateMap), new VehicleRepository(), new ParkingLotRepository(parkingLotMap), new TicketRepository()));
        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setGateId(0);
        issueTicketRequestDTO.setParkingLotId(0);
        issueTicketRequestDTO.setOwnerName("KV");
        issueTicketRequestDTO.setVehicleType(VehicleType.TWO_WHEELER);

        // issue ticket
        IssueTicketResponseDTO issueTicketResponseDTO = ticketController.issueTicket(issueTicketRequestDTO);

        System.out.println(issueTicketResponseDTO.getTicketId()+ " "+ issueTicketResponseDTO.getMessage());
    }
}
