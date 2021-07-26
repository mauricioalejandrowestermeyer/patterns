package org.custom.abstractfactory;

public class CarFactory implements AbstractMachineFactory {


    @Override
    public AbstractMachine createMachine() {
        System.out.println("Creando auto");
        return new Car();
    }

    @Override
    public boolean createMainEngine() {
        System.out.println("Creando motor de auto RT-5400 V8");
        return false;
    }

    @Override
    public boolean createPowerSupply() {
        System.out.println("Creando y ajustando tanque de plutonio desarmado.");
        return false;
    }
}
