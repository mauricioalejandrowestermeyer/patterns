package org.custom.prototype;

public abstract class Mascot {

    private int age;

    private String name;

    protected boolean evil;

    public Mascot() {

    }

    public Mascot(Mascot mascot) {
        if (null!=mascot) {
            this.age = mascot.age;
            this.name = mascot.name;
        }
    }

    public abstract Mascot aberration(Mascot mascot);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEvil() {
        return evil;
    }

    abstract void setEvil(boolean evil);
}
