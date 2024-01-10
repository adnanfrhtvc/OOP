package org.example.Week11.Task6;

public class CappuccinoBuilder implements CoffeeBuilder{
    private Coffee coffee;

    public CappuccinoBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Cappuccino");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Large");
    }

    @Override
    public void buildToppings() {
        coffee.addTopping("Milk Foam");
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
