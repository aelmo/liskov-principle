package com.liskov.liskovprinciple.liskovPrinciple;

public class Driver {

    private final Vehicle vehicle;

    // Can receive either Car or Motorcycle
    public Driver(final Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void Drive() {
        vehicle.startEngine();
    }
}
