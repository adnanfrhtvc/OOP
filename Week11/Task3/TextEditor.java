package org.example.Week11.Task3;

public class TextEditor {
    private TextFormater textFormater;
    void setFormater(TextFormater textFormater){
        this.textFormater=textFormater;
    }
    String formatText(String text){
        if(textFormater==null){
            throw new IllegalStateException();
        }
        return textFormater.formatText(text);
    }
}
