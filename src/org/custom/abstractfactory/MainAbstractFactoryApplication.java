package org.custom.abstractfactory;

public class MainAbstractFactoryApplication {

    private static AbstractMachineFactory factory;

    private static AbstractMachine machine;

    public static void main(String[] args) {

        //leemos el argumento
        String config = args[0];
        factory = FactoryDecider.decide(config);
        //hacemos que la fabrica fabrique una maquina. No sabemos como lo hace desde esta
        //parte de la aplicación por código, pero no nos interesa
        machine = factory.createMachine();

        //iniciamos, hacemos que la maquina haga su trabajo y luego la apagamos
        machine.start();
        machine.doMainJob();
        machine.sleep();
        machine.shutdown();
    }
}
