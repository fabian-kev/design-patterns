package com.fabiankevin.designpatterns;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


class DesignPatternsApplicationTests {

    @Test
    void contextLoads() {
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(10);
//        System.out.println(numbers.size());
//        int x = numbers.get(1);
//        System.out.println(x);
//        String input = "Pencil";
//
//        System.out.println(input.indexOf("P"));

        StringBuilder builder = new StringBuilder("Java");
        String s2 = "Love";
        builder.append(s2);
        System.out.println(builder);
        builder.substring(4);

        System.out.println(builder);
    }


}
