package org.custom.chainresponsability;

public abstract class RequestHandler implements Handler {

    protected Handler nextHandler;

    protected Response response;

    protected abstract String getResponseMessage();

    protected abstract Response handleRequest(ResourceRequest request);

    public Response getResponse() {

        return response;
    }

    @Override
    public void setNextHandler(Handler handler) {

        nextHandler = handler;
    }

    @Override
    public Response handle(ResourceRequest request) {

        Response response = handleRequest(request);
        if (response.isOk() && null!=nextHandler) {
            return nextHandler.handle(request);
        }
        else {
            return createResponse(response.isOk());
        }
    }

    protected Response createResponse(boolean ok) {

        response = new Response();
        response.setResponseText(ok? "Respuesta OK" : getResponseMessage());
        response.setOk(ok);
        return response;
    }
}
