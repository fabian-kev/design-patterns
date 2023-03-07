package com.fabiankevin.designpatterns.behavioral.strategy;

import java.math.BigDecimal;

public class StrategyApp {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment("Kevin", "132", "12312312312312", "13/24");

        ShoppingCart cart = new ShoppingCart(creditCard);
        cart.addItem(Item.builder().price(BigDecimal.valueOf(232)).build());
        cart.addItem(Item.builder().price(BigDecimal.valueOf(111)).build());
        cart.addItem(Item.builder().price(BigDecimal.valueOf(222)).build());
        cart.addItem(Item.builder().price(BigDecimal.valueOf(333)).build());
        cart.addItem(Item.builder().price(BigDecimal.valueOf(444)).build());

        cart.pay();
    }
}
