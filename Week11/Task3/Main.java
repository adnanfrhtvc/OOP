package org.example.Week11.Task3;

public class Main {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();


        textEditor.setFormater(new UpperCaseFormater());
        String upperCaseText = textEditor.formatText("Hello, Strategy Pattern!");
        System.out.println("Upper Case: " + upperCaseText);

        textEditor.setFormater(new LowerCaseFormater());
        String lowerCaseText = textEditor.formatText("Hello, Strategy Pattern!");
        System.out.println("Lower Case: " + lowerCaseText);

        textEditor.setFormater(new CamelCaseFormater());
        String camelCaseText = textEditor.formatText("Hello, Strategy Pattern!");
        System.out.println("Camel Case: " + camelCaseText);
    }
}
