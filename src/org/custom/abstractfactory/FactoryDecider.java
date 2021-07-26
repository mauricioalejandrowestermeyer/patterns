package org.custom.abstractfactory;

public class FactoryDecider {

    public static AbstractMachineFactory decide(String config) {

        if (config.equals("printer")) {
            //si es una impresora, asignamos la fabrica a una fabrica de impresonar
            return new PrinterFactory();
        }
        else if (config.equals("car")) {
            //si es un auto, asignamos la fabrica a una fabrica de autos
            return new CarFactory();
        }
        else {
            throw new UnsupportedOperationException("No se soporta el tipo indicado.");
        }
    }
}
