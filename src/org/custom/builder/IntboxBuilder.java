package org.custom.builder;

public class IntboxBuilder implements Input {

    private Intbox intbox;

    public IntboxBuilder() {
        reset();
    }

    private void reset() {
        intbox = new Intbox();
    }

    public Intbox getIntbox() {
        Intbox lastInput = intbox;
        reset();
        return lastInput;
    }

    @Override
    public void buildUpperLabel(String label) {
        intbox.setLabel(label);
    }

    @Override
    public void setMaxLength(long length) {
        intbox.setLength(length);
    }

    @Override
    public void setValue(Object value) {
        if (Integer.class.isInstance(value)) {
            intbox.setValue((Integer)value);
        }
    }

    @Override
    public void setWidth(long width) {
        intbox.setWidth(width);
    }

    @Override
    public void setHeight(long height) {
        intbox.setHeight(height);
    }

}
