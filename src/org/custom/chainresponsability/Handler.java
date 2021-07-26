package org.custom.chainresponsability;

public interface Handler {

    void setNextHandler(Handler handler);

    Response handle(ResourceRequest request);
}
