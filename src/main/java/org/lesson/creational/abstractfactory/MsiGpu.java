package org.lesson.creational.abstractfactory;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling Msi GPU");
    }
}
