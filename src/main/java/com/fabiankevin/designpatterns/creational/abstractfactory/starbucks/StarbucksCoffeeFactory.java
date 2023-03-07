package com.fabiankevin.designpatterns.creational.abstractfactory.starbucks;

import com.fabiankevin.designpatterns.creational.abstractfactory.BasicCoffee;
import com.fabiankevin.designpatterns.creational.abstractfactory.Coffee;
import com.fabiankevin.designpatterns.creational.abstractfactory.CoffeeFactory;

public class StarbucksCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee brewCoffee(String coffeeType) {
        return switch (coffeeType) {
            case "americano" -> new AmericanoCoffee();
            case "mocha" -> new MochaCoffee();
            default -> new BasicCoffee();
        };
    }
}
