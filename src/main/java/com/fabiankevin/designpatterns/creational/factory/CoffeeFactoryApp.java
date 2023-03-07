package com.fabiankevin.designpatterns.creational.factory;

public class CoffeeFactoryApp {
    public static void main(String[] args) {
        Coffee mocha = CoffeeFactory.getCoffee("mocha");
        Coffee arabica = CoffeeFactory.getCoffee("arabica");

        System.out.println(mocha);
        System.out.println(arabica);

    }
}
