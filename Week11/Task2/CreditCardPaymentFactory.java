package org.example.Week11.Task2;

public class CreditCardPaymentFactory implements PaymentFactory{

    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}
