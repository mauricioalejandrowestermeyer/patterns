package org.custom.abstractfactory;

public class Printer implements AbstractMachine {

    private boolean on;

    private boolean waiting;

    private boolean printing;

    @Override
    public boolean start() {
        on = true;
        waiting = true;
        System.out.println("Encendiendo impresora... encendida.");
        return true;
    }

    @Override
    public void doMainJob() {
        if (on && waiting) {
            printing = true;
            System.out.println("Imprimiendo 200 hojas a todo color.");
        }
    }

    @Override
    public void sleep() {
        System.out.println("Impresora en modo reposo");
        waiting = false;
    }

    @Override
    public void resume() {
        System.out.println("Impresora saliendo de modo reposo");
        waiting = true;
    }

    @Override
    public boolean shutdown() {
        on = false;
        System.out.println("Apagando impresora... apagada");
        return true;
    }
}
