package services;

import interfaces.Alarm;
import interfaces.Vehicle;

public class Car implements Vehicle, Alarm {

    private final String brand;

    public Car(String brand){
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp() {
        return "The motorbike is speeding up.";
    }

    @Override
    public String slowDown() {
        return "The motorbike is slowing down.";
    }
}
