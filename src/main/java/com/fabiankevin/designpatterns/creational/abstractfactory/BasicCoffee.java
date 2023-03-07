package com.fabiankevin.designpatterns.creational.abstractfactory;

public class BasicCoffee implements Coffee{
    @Override
    public void brew() {
        System.out.println("Brewing basic coffee");
    }

    @Override
    public void pour() {
        System.out.println("Pouring basic coffee");
    }
}
