package org.custom.chainresponsability;

import java.util.Arrays;
import java.util.List;

public class ModuleHandler extends RequestHandler {

    private static final List<String> modules = Arrays.asList("URGENCIES", "HOSPITALIZATION", "REPORTS", "BILLING");

    private static final String MESSAGE = "El modulo no existe";

    @Override
    public Response handleRequest(ResourceRequest request) {

        return super.createResponse(modules.contains(request.getModule()));
    }

    protected String getResponseMessage() {

        return MESSAGE;
    }
}
