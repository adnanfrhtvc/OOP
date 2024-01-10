package org.example.Week11.Task6;

public class LatteBuilder implements CoffeeBuilder{
    Coffee coffee;

    public LatteBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Latte");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Medium");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Chocolate");
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
