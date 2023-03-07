package com.fabiankevin.designpatterns.creational.abstractfactory.local;

import com.fabiankevin.designpatterns.creational.abstractfactory.BasicCoffee;
import com.fabiankevin.designpatterns.creational.abstractfactory.Coffee;
import com.fabiankevin.designpatterns.creational.abstractfactory.CoffeeFactory;

public class LocalCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee brewCoffee(String coffeeType) {
        return switch (coffeeType) {
            case "americano" -> new AmericanoLocalCoffee();
            case "mocha" -> new MochaLocalCoffee();
            default -> new BasicCoffee();
        };
    }
}
