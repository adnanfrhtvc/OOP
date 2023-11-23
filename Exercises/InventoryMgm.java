package org.example.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InventoryItem{
    private int id;
    private String name;
    private int quantity;
    private double price;
    InventoryItem(int id, String name, int quantity, double price){
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price=price;
    }
}
class InventoryManagementSystem{

    Optional<InventoryItem> findItemById(List<InventoryItem> items, int id){
        for(InventoryItem item : items){
            if(item.getId()==id){
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }
    double TotalInventoryValue(List<InventoryItem> items){
        double totalValue = 0;
        double totalQuantity=0;
        for(InventoryItem item : items){
            totalValue+=item.getPrice();
            totalQuantity+=item.getQuantity();
        }
        return totalValue*totalQuantity;
    }
    void displayItemDetails(Optional<InventoryItem> item){
        if(item.isPresent()){
            System.out.println(item);
        }
        else{
            System.out.println("Not found.");
        }
    }
}
class InventoryMgm {
    public static void main(String[] args) {
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem();

        List<InventoryItem> inventory = List.of(
                new InventoryItem(1, "ItemA", 10, 20.0),
                new InventoryItem(2, "ItemB", 5, 30.0),
                new InventoryItem(3, "ItemC", 15, 15.0)
        );

        int itemIdToFind = 2;
        Optional<InventoryItem> foundItem = inventoryManagementSystem.findItemById((List<InventoryItem>) inventory, itemIdToFind);
        System.out.println();
        inventoryManagementSystem.displayItemDetails(foundItem);
        System.out.println();

        System.out.println("Total value of inventory is: "+inventoryManagementSystem.TotalInventoryValue((List<InventoryItem>) inventory));
    }
}
