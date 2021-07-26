package org.custom.factorymethod;

public class MainFactoryMethodApplication {

    public static void main(String[] args) {

        String transportType = args[0];
        Delivery delivery;
        if (transportType.equalsIgnoreCase("ship")) {
            delivery = new ShipDelivery();
        }
        else if (transportType.equalsIgnoreCase("truck")) {
            delivery = new TruckDelivery();
        }
        else {
            throw new UnsupportedOperationException();
        }
        delivery.callTransport();
        delivery.deliver();
    }
}
