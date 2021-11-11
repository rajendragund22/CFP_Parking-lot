package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class ParkingLotTest {

    @Test
    public void givenVehicle_whenParked_shouldReturnTrue() {
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
        boolean isParkded = parkingLotSystem.park(new Object());
        Assert.assertTrue(isParkded);
    }

    @Test
    public void givenVehicleIfParked_WhenUnParked_ShouldReturnTrue() {
        ParkingLotSystem parkingLot = new ParkingLotSystem();
        Object vehicle = new Object();
        parkingLot.park(vehicle);
        boolean parkingStatus = parkingLot.unParkVehicle(vehicle);
        Assert.assertTrue(parkingStatus);
    }
}
