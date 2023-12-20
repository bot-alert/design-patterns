package org.lesson.creational.factorymethod;

public class Bus implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("Build Bus");
    }
}
