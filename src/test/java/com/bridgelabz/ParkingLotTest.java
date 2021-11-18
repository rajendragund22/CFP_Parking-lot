package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {

    @Test
    public void givenVehicle_WhenPark_ShouldReturnTrue() throws ParkingLotException {
        ParkingLot parkingLot = new ParkingLot();
        Object vehicle = new Object();
        parkingLot.parkVehicle(vehicle);
        boolean isParked = parkingLot.isParked();
        Assert.assertTrue(isParked);
    }

    @Test
    public void givenVehicleIfParked_WhenUnParked_ShouldReturnTrue() throws ParkingLotException {
        ParkingLot parkingLot = new ParkingLot();
        Object vehicle = new Object();
        parkingLot.parkVehicle(vehicle);
        parkingLot.unParkVehicle(vehicle);
        boolean isUnParked = parkingLot.isUnParked();
        Assert.assertTrue(isUnParked);
    }

    @Test
    public void givenVehicle_WhenAlreadyParked_ShouldReturnFalse() throws ParkingLotException {
        ParkingLot parkingLot = new ParkingLot();
        Object vehicle = new Object();
        parkingLot.parkVehicle(vehicle);
        boolean parkingStatus = parkingLot.isUnParked();
        Assert.assertFalse(parkingStatus);
    }

    @Test
    public void givenVehicleIfParked_AndGivenDifferentVehicleToUnPark_ShouldReturnFalse() throws ParkingLotException {
        ParkingLot parkingLot = new ParkingLot();
        Object vehicle = new Object();
        parkingLot.parkVehicle(vehicle);
        boolean parkingStatus = parkingLot.isUnParked();
        Assert.assertFalse(parkingStatus);
    }

    @Test
    public void givenVehicleToPark_IfLotFull_ShouldThrowException() {
        ParkingLot parkingLot = new ParkingLot();
        Object vehicle = new Object();
        Object vehicle2 = new Object();
        try {
            parkingLot.parkVehicle(vehicle);
            parkingLot.parkVehicle(vehicle2);
        } catch (ParkingLotException e) {
            System.out.println(e.type);
            Assert.assertEquals(e.type, ParkingLotException.ExceptionType.LOT_FULL);
        }
    }

    @Test
    public void givenVehicleToUnPark_WhenNull_ShouldThrowException() {
        ParkingLot parkingLot = new ParkingLot();
        Object vehicle = new Object();
        try {
            parkingLot.parkVehicle(vehicle);
            parkingLot.unParkVehicle(null);
        } catch (ParkingLotException e) {
            System.out.println(e.type);
            Assert.assertEquals(e.type, ParkingLotException.ExceptionType.NO_SUCH_VEHICLE);
        }
    }
}
