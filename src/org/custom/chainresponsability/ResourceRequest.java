package org.custom.chainresponsability;

public class ResourceRequest {

    private String user;

    private String password;

    private String application;

    private String module;


    private String zulPage;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getZulPage() {
        return zulPage;
    }

    public void setZulPage(String zulPage) {
        this.zulPage = zulPage;
    }
}
