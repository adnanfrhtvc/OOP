package org.example.Week11.Task6;

import java.util.ArrayList;
import java.util.List;

public class Coffee {
    private String type;
    private String size;
    private List<String> toppings;
    public Coffee() {
        this.toppings = new ArrayList<>();
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }
    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", toppings=" + toppings +
                '}';
    }

}
