package com.fabiankevin.designpatterns.creational.abstractfactory;

import com.fabiankevin.designpatterns.creational.abstractfactory.local.LocalCoffeeFactory;
import com.fabiankevin.designpatterns.creational.abstractfactory.starbucks.StarbucksCoffeeFactory;

public class CoffeeApp {
    public static void main(String[] args) {
        CoffeeFactory starbucksCoffeeFactory = new StarbucksCoffeeFactory();
        CoffeeStore starbucks = new CoffeeStore(starbucksCoffeeFactory);

        CoffeeFactory localCoffeeFactory = new LocalCoffeeFactory();
        CoffeeStore localCoffeeShop = new CoffeeStore(localCoffeeFactory);


        starbucks.getCoffee("mocha");
        localCoffeeShop.getCoffee("mocha");
    }
}
