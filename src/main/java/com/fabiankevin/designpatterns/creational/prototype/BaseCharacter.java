package com.fabiankevin.designpatterns.creational.prototype;

import lombok.Data;

@Data
public class BaseCharacter implements Character, BaseCharacterCloneable {
    private int health;
    private String name;
    private int level;

    public BaseCharacter(int health, String name, int level) {
        this.health = health;
        this.name = name;
        this.level = level;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getLevel() {
        return level;
    }

    public BaseCharacter clone() {
        try {
            return (BaseCharacter) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }


}
