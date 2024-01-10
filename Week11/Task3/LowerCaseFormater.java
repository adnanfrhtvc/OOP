package org.example.Week11.Task3;

public class LowerCaseFormater implements TextFormater{

    @Override
    public String formatText(String text) {
        System.out.println(text.toLowerCase());
        return text;
    }
}
