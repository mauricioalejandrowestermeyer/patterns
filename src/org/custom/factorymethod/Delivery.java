package org.custom.factorymethod;

public abstract class Delivery {

    protected boolean wasDelivered;

    abstract Transport callTransport();

    abstract void deliver();
}
