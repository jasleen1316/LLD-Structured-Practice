package com.jasleen.lld.medium.ParkingLot;

import java.util.Map;

public class Level {

    private int levelNumber;
    private Map<VehicleSize, ParkingSpot[]> parkingSpots;

    public int getLevelNumber() {
        return levelNumber;
    }

    public Map<VehicleSize, ParkingSpot[]> getParkingSpots() {
        return parkingSpots;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public void setParkingSpots(Map<VehicleSize, ParkingSpot[]> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

}
