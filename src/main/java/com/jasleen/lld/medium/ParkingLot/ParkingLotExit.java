package com.jasleen.lld.medium.ParkingLot;

import java.time.Instant;
import java.util.Map;

public class ParkingLotExit {

    public void processExit(Ticket ticket, Instant time, Map<VehicleSize, PricingStrategy> pricingStrategies){

        ticket.setExitTime(time);
        ticket.setPrice(pricingStrategies.get(ticket.getVehicle().getVehicleSize()).getPrice(ticket));
        ticket.getParkingSpot().vacate();
    }

}
