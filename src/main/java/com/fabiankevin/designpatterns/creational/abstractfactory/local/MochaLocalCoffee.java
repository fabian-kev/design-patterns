package com.fabiankevin.designpatterns.creational.abstractfactory.local;

import com.fabiankevin.designpatterns.creational.abstractfactory.Coffee;

public class MochaLocalCoffee implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing mocha local coffee");
    }

    @Override
    public void pour() {
        System.out.println("Pouring mocha local coffee");
    }
}
