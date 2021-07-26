package org.custom.abstractfactory;

public interface AbstractMachine {

    boolean start();

    void doMainJob();

    void sleep();

    void resume();

    boolean shutdown();
}
