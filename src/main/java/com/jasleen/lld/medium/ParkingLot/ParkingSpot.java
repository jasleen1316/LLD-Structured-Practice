package com.jasleen.lld.medium.ParkingLot;

public interface ParkingSpot {

    public boolean getAvailability();
    public Vehicle getAssignedVehicle();
    public void occupy(Vehicle vehicle);
    public void vacate();
    public int getSpotNumber();

}
