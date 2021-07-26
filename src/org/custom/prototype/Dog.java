package org.custom.prototype;

public class Dog extends Mascot {

    private boolean livesOutside;

    private boolean usesLeash;

    public Dog() {

    }

    public Dog(Mascot mascot) {
        super(mascot);
        if (null!=mascot && mascot.getClass().isAssignableFrom(Dog.class)) {
            this.livesOutside = true;
            this.usesLeash = true;
            this.evil = false;
        }
    }

    public boolean isUsesLeash() {
        return usesLeash;
    }

    public void setUsesLeash(boolean usesLeash) {
        this.usesLeash = usesLeash;
    }

    public boolean isLivesOutside() {
        return livesOutside;
    }

    public void setLivesOutside(boolean livesOutside) {
        this.livesOutside = livesOutside;
    }

    @Override
    public Mascot aberration(Mascot mascot) {

        return new Dog(mascot);
    }

    @Override
    public void setEvil(boolean evil) {
        this.evil = false;
    }
}
