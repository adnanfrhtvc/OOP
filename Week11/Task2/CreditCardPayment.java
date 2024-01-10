package org.example.Week11.Task2;

public class CreditCardPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("Credit Card Payment");
    }
}
