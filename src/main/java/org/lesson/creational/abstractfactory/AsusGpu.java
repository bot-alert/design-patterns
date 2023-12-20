package org.lesson.creational.abstractfactory;

public class AsusGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Assembling Asus GPU");
    }
}
