package org.example.Week11.Task6;

public class CoffeeDirector {
    public void constructCoffee(CoffeeBuilder builder){
        builder.buildType();
        builder.buildSize();
        builder.buildToppings();
    }
}
