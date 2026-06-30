package com.jasleen.lld.medium.ParkingLot;

import java.time.Instant;

public class Ticket {

    private int ticketNumber;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Instant entryTime;
    private Instant exitTime;
    private Double price;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot, Instant entryTime){
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
    }

    public Double getPrice() {
        return price;
    }

    public Instant getEntryTime() {
        return entryTime;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public Instant getExitTime() {
        return exitTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setEntryTime(Instant entryTime) {
        this.entryTime = entryTime;
    }

    public void setExitTime(Instant exitTime) {
        this.exitTime = exitTime;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
