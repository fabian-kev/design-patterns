package com.fabiankevin.designpatterns.structrural.flyweight;

public class ImageApp {
    public static void main(String[] args) {
        ImageFactory imageFactory = new ImageFactory();

        imageFactory.getImage("pic.png", 1234);
        imageFactory.getImage("pic2.png", 1234);
        imageFactory.getImage("pic.png", 1234);
        imageFactory.getImage("pic.png", 12345);

    }
}
