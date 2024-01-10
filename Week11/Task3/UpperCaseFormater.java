package org.example.Week11.Task3;

public class UpperCaseFormater implements TextFormater{

    @Override
    public String formatText(String text) {
        System.out.println(text.toUpperCase());
        return text;
    }
}
