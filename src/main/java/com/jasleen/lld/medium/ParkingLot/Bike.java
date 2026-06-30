package com.jasleen.lld.medium.ParkingLot;

public class Bike implements Vehicle{

    private String licensePlateNumber;
    private VehicleSize vehicleSize = VehicleSize.SMALL;

    public Bike(String licensePlateNumber){
        this.licensePlateNumber = licensePlateNumber;
    }

    @Override
    public String getLincensePlateNumber() {
        return licensePlateNumber;
    }

    @Override
    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }
}
