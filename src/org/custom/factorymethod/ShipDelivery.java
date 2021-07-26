package org.custom.factorymethod;

public class ShipDelivery extends Delivery {

    private Ship ship;

    public Ship callTransport() {
        ship = new Ship();
        return ship;
    }

    @Override
    void deliver() {
        ship.navigate();
        ship.deliver();
    }
}
