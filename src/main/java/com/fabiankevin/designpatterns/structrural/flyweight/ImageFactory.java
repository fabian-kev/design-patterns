package com.fabiankevin.designpatterns.structrural.flyweight;

import java.util.HashMap;

public class ImageFactory {
    private static HashMap<String, Image> imageHashMap = new HashMap<>();

    public Image getImage(String name, int size){
        String key = name + size;
        Image image = imageHashMap.get(key);

        if( image == null ){
            System.out.println("Creating image with name: "+name + " size: "+size);
            image = new Image(name, size);
            imageHashMap.put(key, image);
        }

        return image;
    }
}
