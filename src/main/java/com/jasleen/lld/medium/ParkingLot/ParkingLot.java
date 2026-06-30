package com.jasleen.lld.medium.ParkingLot;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
    private List<Level> levels;
    private ParkingLotEntry entryGate;
    private ParkingLotExit exitGate;
    private Map<VehicleSize, PricingStrategy> pricingStrategies;
    private HashMap<String, Ticket> tickets;

    public ParkingLot(Map<VehicleSize, PricingStrategy> pricingStrategies, List<Level> levels){
        this.pricingStrategies = pricingStrategies;
        this.levels = levels;
        entryGate = new ParkingLotEntry();
        exitGate = new ParkingLotExit();
        tickets = new HashMap<>();
    }

    public void onVehicleEntered(Vehicle vehicle){

        Ticket ticket = entryGate.assignSpot(levels, vehicle);
        if(ticket != null) tickets.put(vehicle.getLincensePlateNumber(), ticket);

    }

    public void onVehicleExited(Vehicle vehicle){

        if(tickets.containsKey(vehicle.getLincensePlateNumber())){

            Ticket ticket = tickets.get(vehicle.getLincensePlateNumber());
            exitGate.processExit(ticket, Instant.now(), pricingStrategies);
            tickets.remove(vehicle.getLincensePlateNumber());
        }

    }
    

}
