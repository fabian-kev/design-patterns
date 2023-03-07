package com.fabiankevin.designpatterns.creational.factory;

import lombok.Data;

@Data
public class ArabicaCoffee implements Coffee {
    @Override
    public String getBean() {
        return "arabica bean";
    }

    @Override
    public String getCharacteristic() {
        return "smoother";
    }
}
