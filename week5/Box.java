package org.example.week5;

import java.util.ArrayList;

public class Box implements ToBeStored{
    private ArrayList<ToBeStored> items;
    private double maxWeight;
    private double currentWeight;
    Box(double maxWeight){
        this.maxWeight=maxWeight;
        this.currentWeight=0;
        this.items=new ArrayList<>();
    }
    @Override
    public double weight(){
        return this.currentWeight;
    }
    public void add(ToBeStored item){
        if(currentWeight>maxWeight){
            System.out.println("Too much weight");
        }
        else{
        items.add(item);
        currentWeight+=item.weight();
        }
    }
    public String toString(){
        return "Box: "+items.size()+" things, total weight "+ currentWeight+" kg";
    }
}
