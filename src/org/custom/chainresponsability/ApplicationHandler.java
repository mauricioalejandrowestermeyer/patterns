package org.custom.chainresponsability;

import java.util.Arrays;
import java.util.List;

public class ApplicationHandler extends RequestHandler {

    private static final List<String> applications = Arrays.asList("CLINIC", "PMG", "CLINICALSHARE");

    private static final String MESSAGE = "La aplicacion no existe";

    @Override
    public Response handleRequest(ResourceRequest request) {

        return super.createResponse(applications.contains(request.getApplication()));
    }

    protected String getResponseMessage() {

        return MESSAGE;
    }
}
