package org.lesson.creational.factorymethod;

public class Main {

    public static void main(String[] args) {
        MotorVehicle car = new CarFactory().create();
        MotorVehicle bus = new BusFactory().create();
        MotorVehicle bike = new BikeFactory().create();



        MotorVehicle audi = MotorVehicleFactory.getInstance("Car");
        audi.build();
    }
}
