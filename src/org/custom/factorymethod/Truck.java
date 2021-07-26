package org.custom.factorymethod;

public class Truck implements Transport {

    public void navigate() {

        System.out.println("I'm driving!!");
    }

    public void deliver() {

        System.out.println("The box is delivered");
    }
}
