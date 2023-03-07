package com.fabiankevin.designpatterns.creational.factory;

import lombok.Data;

@Data
public class MochaCoffee implements Coffee {
    @Override
    public String getBean() {
        return "mocha bean";
    }

    @Override
    public String getCharacteristic() {
        return "sweetness";
    }
}
