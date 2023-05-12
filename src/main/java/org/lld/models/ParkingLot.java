package org.lld.models;

import org.lld.models.enums.Status;
import org.lld.models.enums.VehicleType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot extends BaseModel{

    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private int id;
    private String name;
    private String address;

    private Status parkingLotStatus;

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Status getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(Status parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public Map<VehicleType, Integer> getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Map<VehicleType, Integer> basePrice) {
        this.basePrice = basePrice;
    }

    private Map<VehicleType, Integer> basePrice = new HashMap<>();


}
