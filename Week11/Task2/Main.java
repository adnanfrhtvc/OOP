package org.example.Week11.Task2;

public class Main {
    public static void main(String[] args) {
        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        PaymentFactory payPalFactory = new PayPalPaymentFactory();

        Payment creditCardPayment = creditCardFactory.createPayment();
        Payment payPalPayment = payPalFactory.createPayment();

        creditCardPayment.processPayment();
        payPalPayment.processPayment();
    }
}
