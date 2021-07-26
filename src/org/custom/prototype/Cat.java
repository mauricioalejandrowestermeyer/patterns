package org.custom.prototype;

public class Cat extends Mascot {

    private boolean isFat;

    public boolean isFat() {
        return isFat;
    }

    public void setFat(boolean fat) {
        isFat = fat;
    }

    public Cat() {
        this.evil = true;
    }

    public Cat(Mascot mascot) {
        super(mascot);
        if (null!=mascot && mascot.getClass().isAssignableFrom(Cat.class)) {
            this.isFat = true;
            this.evil = true;
        }
    }

    @Override
    public Mascot aberration(Mascot mascot) {
        return new Cat(mascot);
    }

    @Override
    public void setEvil(boolean evil) {
        this.evil = true;
    }
}
