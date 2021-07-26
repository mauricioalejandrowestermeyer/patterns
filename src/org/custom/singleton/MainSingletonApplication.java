package org.custom.singleton;

import com.sun.security.ntlm.Server;

public class MainSingletonApplication {

    public static void main(String[] args) {

        ServerProperties serverProperties = ServerProperties.getInstance();
        System.out.println("Se ha seleccionado un servidor " + serverProperties.serverType + " con un inicio de " + serverProperties.startup + " ms.");
    }
}
