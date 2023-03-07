package com.fabiankevin.designpatterns.creational.abstractfactory.starbucks;

import com.fabiankevin.designpatterns.creational.abstractfactory.Coffee;

public class MochaCoffee implements Coffee {
    @Override
    public void brew() {
        System.out.println("Brewing mocha coffee");
    }

    @Override
    public void pour() {
        System.out.println("Pouring mocha coffee");
    }
}
