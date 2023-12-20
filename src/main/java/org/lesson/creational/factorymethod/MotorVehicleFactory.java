package org.lesson.creational.factorymethod;

public abstract class MotorVehicleFactory {
    public MotorVehicle create() {
        MotorVehicle motorVehicle = createMotorVehicle();
        motorVehicle.build();
        return motorVehicle;
    }

    protected abstract MotorVehicle createMotorVehicle();


    //This is also ture for factory method but breaks open close principle
    public static MotorVehicle getInstance(String vehicleName) {
        MotorVehicle motorVehicle = null;
        if ("Bike".equalsIgnoreCase(vehicleName)) {
            motorVehicle = new Bike();
        } else if ("Car".equalsIgnoreCase(vehicleName)) {
            motorVehicle = new Car();
        } else if ("Bus".equalsIgnoreCase(vehicleName)) {
            motorVehicle = new Bus();
        }
        if(motorVehicle ==null){
            throw new RuntimeException("Cannot initialize vehicle");
        }
        return motorVehicle;
    }
}
