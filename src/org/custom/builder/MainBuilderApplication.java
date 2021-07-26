package org.custom.builder;

public class MainBuilderApplication {

    public static void main(String[] args) {

        InputBuilder director = new InputBuilder();
        //generamos un intbox
        IntboxBuilder intboxBuilder = new IntboxBuilder();
        director.setInput(intboxBuilder);
        director.createIntbox();
        Intbox intbox = intboxBuilder.getIntbox();
        //generamos un datebox
        DateboxBuilder dateboxBuilder = new DateboxBuilder();
        director.setInput(dateboxBuilder);
        director.createDatebox();
        Datebox datebox = dateboxBuilder.getDatebox();
        //generamos un textbox
        TextboxBuilder textboxBuilder = new TextboxBuilder();
        director.setInput(textboxBuilder);
        director.createTextbox();
        Textbox textbox = textboxBuilder.getTextbox();

        //mostramos algunos atributos

        System.out.println(intbox.getLabel());
        System.out.println(datebox.getLabel());
        System.out.println(textbox.getLabel());
    }
}
