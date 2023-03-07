package com.fabiankevin.designpatterns.behavioral.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;
    private final PaymentStrategy paymentStrategy;
    public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice().doubleValue();
        }
        return total;
    }


    public void pay() {
        double total = calculateTotal();
        paymentStrategy.pay(BigDecimal.valueOf(total));
    }
}