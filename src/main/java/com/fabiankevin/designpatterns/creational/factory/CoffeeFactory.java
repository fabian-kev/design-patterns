package com.fabiankevin.designpatterns.creational.factory;

public class CoffeeFactory {
    public static Coffee getCoffee(String type){
        return switch (type) {
            case "arabica" -> new ArabicaCoffee();
            case "mocha" -> new MochaCoffee();
            default -> throw new RuntimeException("invalid coffee");
        };
    }
}
