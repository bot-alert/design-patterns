package org.lesson.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("toyota", "242", "red", 140);
        Bus bus = new Bus("honda", "q45", "black", 80);

        car.clone();
        bus.clone();

    }
}
