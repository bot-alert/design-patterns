package org.lesson.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        Company asus = new AsusManufacturer();
        Monitor asusMonitor = asus.createMonitor();
        asusMonitor.assemble();
        Gpu asusGpu = asus.createGpu();
        asusGpu.assemble();

        Company msi = new MsiManufacturer();
        Monitor msiMonitor = msi.createMonitor();
        msiMonitor.assemble();
        Gpu msiGpu = msi.createGpu();
        msiGpu.assemble();
    }
}
