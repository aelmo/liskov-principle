package com.liskov.liskovprinciple.liskovPrinciple;

public class Car extends Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Car");
    }
}
