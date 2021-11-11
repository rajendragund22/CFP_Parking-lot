package com.bridgelabz;

/**
 * purpose- to perform Parking lot system
 *
 * @author Rajendra Gund
 * @version 1.0
 * @since 11/11/2021
 */
public class ParkingLotSystem {
    Object vehicle = null;

    public boolean park(Object vehicle) {
        if (this.vehicle != null)
            return false;
        this.vehicle = vehicle;
        return true;
    }

    public boolean unParkVehicle(Object vehicle) {
        if (this.vehicle.equals(vehicle)) {
            this.vehicle = null;
            return true;
        }
        return false;
    }

}