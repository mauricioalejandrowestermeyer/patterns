package org.custom.abstractfactory;

public class PrinterFactory implements AbstractMachineFactory {

    @Override
    public AbstractMachine createMachine() {
        System.out.println("Creando impresora");
        return new Printer();
    }

    @Override
    public boolean createMainEngine() {
        System.out.println("Creando motor RPZ-5000 para impresora");
        return true;
    }

    @Override
    public boolean createPowerSupply() {
        System.out.println("Creando fuente de poder UOD083X de 1.21 gigawatts");
        return true;
    }
}