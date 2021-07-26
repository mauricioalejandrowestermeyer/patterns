package org.custom.chainresponsability;

public class AuthenticationHandler extends RequestHandler {

    private static final String MESSAGE = "Las credenciales no son validas";

    @Override
    public Response handleRequest(ResourceRequest request) {

        return super.createResponse(request.getUser()==request.getPassword());
    }

    protected String getResponseMessage() {

        return MESSAGE;
    }
}
