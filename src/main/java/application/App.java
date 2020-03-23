package application;

import interfaces.Vehicle;
import services.Car;
import services.Motorbike;

public class App {
    public static void main(String[] args) {
        Car anadol = new Car("Anadol");

        System.out.println(anadol.getBrand());
        System.out.println(anadol.speedUp());
        System.out.println(anadol.slowDown());
        System.out.println(anadol.turnAlarmOn());
        System.out.println(anadol.turnAlarmOff());

        System.out.println(Vehicle.getHorsePower(2500, 480));

        Vehicle kuba = new Motorbike("Kuba");

        System.out.println(kuba.getBrand());
        System.out.println(kuba.speedUp());
        System.out.println(kuba.slowDown());

        System.out.println(Vehicle.getHorsePower(500, 180));
    }
}
