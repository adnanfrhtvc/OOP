package org.example.week5;

public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;
    Book(String writer, String name, double weight){
        this.writer=writer;
        this.name=name;
        this.weight=weight;
    }

    @Override
    public String toString(){
        return writer+" : "+name;
}

    @Override
    public double weight() {
        return this.weight;
    }
}
