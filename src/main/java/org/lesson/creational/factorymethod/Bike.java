package org.lesson.creational.factorymethod;

public class Bike implements MotorVehicle{
    @Override
    public void build() {
        System.out.println("Build Bike");
    }
}
