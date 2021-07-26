package org.custom.singleton;

public class ServerProperties {

    private static ServerProperties serverProperties;

    public static long startup;

    public static String serverType;

    private ServerProperties() {

        startup = 99999L;
        serverType = "Eureka";
    }

    public static ServerProperties getInstance() {

        if (null==serverProperties) {
            serverProperties = new ServerProperties();
        }
        return serverProperties;
    }
}
