package org.custom.builder;

import java.time.LocalDate;

public class InputBuilder {

    private Input input;

    public void setInput(Input input) {
        this.input = input;
    }

    public void createTextbox() {

        input.setWidth(250);
        input.setHeight(25);
        input.setMaxLength(300);
        input.setValue("MyDefaultValue");
        input.buildUpperLabel("Mi Textbox");
    }

    public void createIntbox() {

        input.setWidth(200);
        input.setHeight(25);
        input.setMaxLength(17);
        input.setValue(0);
        input.buildUpperLabel("Mi Intbox");
    }

    public void createDatebox() {

        input.setWidth(100);
        input.setHeight(25);
        input.setValue(LocalDate.now());
        input.buildUpperLabel("Mi Datebox");
    }
}
