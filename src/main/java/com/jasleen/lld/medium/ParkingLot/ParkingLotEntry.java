package com.jasleen.lld.medium.ParkingLot;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class ParkingLotEntry {

    public Ticket assignSpot(List<Level> levels, Vehicle vehicle){
        VehicleSize vehicleSize = vehicle.getVehicleSize();
        ParkingSpot[] spots = null;
        Ticket ticket = null;
        for(Level currLevel: levels){
            spots = currLevel.getParkingSpots().get(vehicle.getVehicleSize());

            if(Objects.isNull(spots) || spots.length == 0) continue;

            for (ParkingSpot spot : spots) {
                if (spot.getAvailability()) {
                    ticket = new Ticket(vehicle, spot, Instant.now());
                    spot.occupy(vehicle);
                    return ticket;
                }
            }

        }


        return ticket;
    }

}
