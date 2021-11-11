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
}
