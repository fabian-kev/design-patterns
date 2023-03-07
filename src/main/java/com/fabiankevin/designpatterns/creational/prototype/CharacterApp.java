package com.fabiankevin.designpatterns.creational.prototype;

public class CharacterApp {
    public static void main(String[] args) {
        BaseCharacter novice = new BaseCharacter(100, "Novice", 1);

        System.out.println(novice);
        BaseCharacter archer = novice.clone();
        archer.setLevel(10);
        archer.setName("Archer");

        System.out.println(archer);

        System.out.println(1 << 16);
    }
}
