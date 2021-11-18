package com.bridgelabz;

public interface IParkingLot {
    void parkVehicle(Object vehicle) throws ParkingLotException;

    void unParkVehicle(Object vehicle) throws ParkingLotException;

    boolean isParked();

    boolean isUnParked();
}