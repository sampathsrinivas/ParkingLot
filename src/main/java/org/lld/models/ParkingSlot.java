package org.lld.models;

import org.lld.models.enums.Status;

public class ParkingSlot {

    private Vehicle vehicle;

    private int spotNumber;

    private Status parkingSlotStatus;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Status getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(Status parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }


}
