package org.custom.abstractfactory;

public class Car implements AbstractMachine {

    private boolean on;

    private boolean running;

    private boolean stopped;

    @Override
    public boolean start() {

        on = true;
        running = false;
        stopped = false;
        System.out.println("Encendiendo automovil... encendido.");
        return true;
    }

    @Override
    public void doMainJob() {

        stopped = false;
        running = true;
        System.out.println("Acelerando... alcanzado las 88 millas por hora...");
    }

    @Override
    public void sleep() {
        stopped = true;
        running = false;
        System.out.println("Automovil detenido, motor andando, freno de mano puesto...");
    }

    @Override
    public void resume() {
        running = true;
        stopped = false;
        System.out.println("Automovil detenido, motor andando, frento de mano quitado...");
    }

    @Override
    public boolean shutdown() {
        on = false;
        running = false;
        stopped = true;
        System.out.println("Detendiendo automovil, apagando vehiculo.");
        return true;
    }
}
