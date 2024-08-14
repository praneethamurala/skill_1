package com.ridesharing;

public class CashFactory extends PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod() {
        return new Cash();
    }
}

}
