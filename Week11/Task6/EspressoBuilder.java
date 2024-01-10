package org.example.Week11.Task6;

public class EspressoBuilder implements CoffeeBuilder{
    private Coffee coffee;

    public EspressoBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public void buildType() {
        coffee.setType("Espresso");
    }

    @Override
    public void buildSize() {
        coffee.setSize("Small");
    }

    @Override
    public void buildToppings() {
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
