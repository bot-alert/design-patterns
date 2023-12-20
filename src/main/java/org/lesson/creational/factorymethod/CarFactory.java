package org.lesson.creational.factorymethod;

public class CarFactory extends MotorVehicleFactory{
    @Override
    public MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
