package org.example.Week11.Task6;

public class Main {
    public static void main(String[] args) {
        CoffeeDirector coffeeDirector = new CoffeeDirector();

        CoffeeBuilder espressoBuilder = new EspressoBuilder();
        CoffeeBuilder latteBuilder = new LatteBuilder();
        CoffeeBuilder cappuccinoBuilder = new CappuccinoBuilder();


        coffeeDirector.constructCoffee(espressoBuilder);
        Coffee espresso = espressoBuilder.getCoffee();
        System.out.println("Espresso: " + espresso);

        coffeeDirector.constructCoffee(latteBuilder);
        Coffee latte = latteBuilder.getCoffee();
        System.out.println("Latte: " + latte);

        coffeeDirector.constructCoffee(cappuccinoBuilder);
        Coffee cappuccino = cappuccinoBuilder.getCoffee();
        System.out.println("Cappuccino: " + cappuccino);
    }
}
