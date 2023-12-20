package org.lesson.creational.factorymethod;

public class BusFactory extends MotorVehicleFactory {
    @Override
    public MotorVehicle createMotorVehicle() {
        return new Bus();
    }
}
