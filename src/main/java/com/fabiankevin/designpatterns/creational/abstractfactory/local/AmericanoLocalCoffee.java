package com.fabiankevin.designpatterns.creational.abstractfactory.local;

import com.fabiankevin.designpatterns.creational.abstractfactory.Coffee;

public class AmericanoLocalCoffee implements Coffee {

    @Override
    public void brew() {
        System.out.println("Brewing americano local coffee");
    }

    @Override
    public void pour() {
        System.out.println("pouring americano local coffee");
    }
}
