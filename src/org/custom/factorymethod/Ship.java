package org.custom.factorymethod;

public class Ship implements Transport {

    public void navigate() {

        System.out.println("I'm navigating through the sea!!");
    }

    public void deliver() {

        System.out.println("The container arrived");
    }
}
