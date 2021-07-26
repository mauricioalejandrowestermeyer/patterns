package org.custom.factorymethod;

public class TruckDelivery extends Delivery {

    private Truck truck;

    public Truck callTransport() {
        truck = new Truck();
        return truck;
    }

    @Override
    void deliver() {
        truck.navigate();
        truck.deliver();
    }
}
