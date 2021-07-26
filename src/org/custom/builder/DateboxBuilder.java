package org.custom.builder;

import java.time.LocalDate;

public class DateboxBuilder implements Input {

    private Datebox datebox;

    public DateboxBuilder() {
        reset();
    }

    private void reset() {
        datebox = new Datebox();
    }

    public Datebox getDatebox() {
        Datebox lastInput = datebox;
        reset();
        return lastInput;
    }

    @Override
    public void buildUpperLabel(String label) {
        datebox.setLabel(label);
    }

    @Override
    public void setValue(Object value) {
        if (LocalDate.class.isInstance(value)) {
            datebox.setValue((LocalDate) value);
        }
    }

    @Override
    public void setWidth(long width) {
        datebox.setWidth(width);
    }

    @Override
    public void setHeight(long height) {
        datebox.setHeight(height);
    }
}
