package com.fabiankevin.designpatterns.structrural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Image {
    private String name;
    private int size;
}
