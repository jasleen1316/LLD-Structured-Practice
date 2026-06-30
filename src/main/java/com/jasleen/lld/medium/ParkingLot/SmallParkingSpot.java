package com.jasleen.lld.medium.ParkingLot;

import java.util.Objects;

public class SmallParkingSpot implements ParkingSpot{

    private int spotNumber;
    private Vehicle vehicle;

    @Override
    public boolean getAvailability() {
        return Objects.isNull(vehicle);
    }

    @Override
    public Vehicle getAssignedVehicle() {
        return vehicle;
    }

    @Override
    public void occupy(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void vacate() {
        vehicle = null;
    }

    @Override
    public int getSpotNumber() {
        return spotNumber;
    }

}
