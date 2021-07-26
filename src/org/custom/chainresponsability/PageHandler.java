package org.custom.chainresponsability;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PageHandler extends RequestHandler {

    private static final String MESSAGE = "La pagina no existe o no está correctamente formateada";

    private static final String PATTERN = "\\.\\~[a-zA-Z0-9\\/]+\\.zul";

    @Override
    public Response handleRequest(ResourceRequest request) {

        return super.createResponse(Pattern.compile(PATTERN).matcher(request.getZulPage()).matches());
    }

    protected String getResponseMessage() {

        return MESSAGE;
    }
}
