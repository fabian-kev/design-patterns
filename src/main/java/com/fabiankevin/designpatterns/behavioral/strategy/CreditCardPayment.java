package com.fabiankevin.designpatterns.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cvv;
    private String cardNumber;
    private String expiry;

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Customer: "+name + " Processing credit card payment amount of "+amount);
    }
}
