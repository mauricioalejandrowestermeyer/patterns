package org.custom.abstractfactory;

public interface AbstractMachineFactory {

    AbstractMachine createMachine();

    boolean createMainEngine();

    boolean createPowerSupply();
}