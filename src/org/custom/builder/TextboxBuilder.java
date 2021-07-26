package org.custom.builder;

public class TextboxBuilder implements Input {

    private Textbox textbox;

    public TextboxBuilder() {
        reset();
    }

    private void reset() {
        textbox = new Textbox();
    }

    public Textbox getTextbox() {
        Textbox lastInput = textbox;
        reset();
        return lastInput;
    }

    @Override
    public void buildUpperLabel(String label) {
        textbox.setLabel(label);
    }

    @Override
    public void setMaxLength(long length) {
        textbox.setLength(length);
    }

    @Override
    public void setValue(Object value) {
        if (String.class.isInstance(value)) {
            textbox.setValue((String)value);
        }
    }

    @Override
    public void setWidth(long width) {
        textbox.setWidth(width);
    }

    @Override
    public void setHeight(long height) {
        textbox.setHeight(height);
    }
}
