package org.example.Week11.Task2;

public class PayPalPayment implements Payment{

    @Override
    public void processPayment() {
        System.out.println("Pay Pal Payment");
    }
}
