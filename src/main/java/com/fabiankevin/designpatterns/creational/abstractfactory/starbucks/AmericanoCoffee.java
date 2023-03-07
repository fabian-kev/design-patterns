package com.fabiankevin.designpatterns.creational.abstractfactory.starbucks;

import com.fabiankevin.designpatterns.creational.abstractfactory.Coffee;

public class AmericanoCoffee implements Coffee {

    @Override
    public void brew() {
        System.out.println("Brewing americano starbucks coffee");
    }

    @Override
    public void pour() {
        System.out.println("pouring americano starbucks coffee");
    }
}
