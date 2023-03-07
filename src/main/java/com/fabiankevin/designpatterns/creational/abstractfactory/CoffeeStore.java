package com.fabiankevin.designpatterns.creational.abstractfactory;

public class CoffeeStore {
    private final CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee getCoffee(String coffeeType){
        Coffee coffee = coffeeFactory.brewCoffee(coffeeType);
        coffee.brew();
        coffee.pour();

        return coffee;
    }
}
