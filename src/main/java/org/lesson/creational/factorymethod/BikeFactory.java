package org.lesson.creational.factorymethod;

public class BikeFactory extends MotorVehicleFactory {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new Bike();
    }
}
