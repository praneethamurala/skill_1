package com.ridesharing;

public class CreditCardFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCard();
    }

}
