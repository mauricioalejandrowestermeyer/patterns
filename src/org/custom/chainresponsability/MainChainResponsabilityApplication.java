package org.custom.chainresponsability;

public class MainChainResponsabilityApplication {

    public static void main(String[] args) {

        RequestHandler authenticationHandler = new AuthenticationHandler();
        RequestHandler applicationHandler = new ApplicationHandler();
        RequestHandler moduleHandler = new ModuleHandler();
        RequestHandler pageHandler = new PageHandler();
        authenticationHandler.setNextHandler(applicationHandler);
        applicationHandler.setNextHandler(moduleHandler);
        moduleHandler.setNextHandler(pageHandler);

        ResourceRequest resourceRequest = new ResourceRequest();
        resourceRequest.setUser("mwesterm");
        resourceRequest.setPassword("mwesterm");
        resourceRequest.setApplication("CLINIC");
        resourceRequest.setModule("URGENCIES");
        resourceRequest.setZulPage(".~my/page.zul");

        Response response = authenticationHandler.handle(resourceRequest);

        System.out.println("Estatus respuesta : " + response.isOk());
        System.out.println("Mensaje : " + response.getResponseText());
    }
}
