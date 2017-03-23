package com.sbt.misc;

import java.util.*;

/**
 * Created by artem on 23.03.17.
 */
public class TestCollections {
    public static void main(String[] args) {
//        int[] i; // массив примитивов
//        Integer[] I; // массив объектов Integer
//        Person[] personArray; // массив Person
//        String[] cats = {"Tom", "Barsik", "Murzik"};

        String[][] dogs = {{"Sharik", "1"}, {"Bobik", "4"}, {"Barbos", "12"}};
        for (int j = 0; j < dogs.length; j++) {
            System.out.println(dogs[j][0] + ": " + dogs[j][1]);
        }


        //for (Object cat: cats) {System.out.println(cat);}
//        for (int j = 0; j < cats.length; j++) {
//            System.out.println(cats[j]);
//        }


        System.out.println("===========MAP============");
        LinkedHashMap map = new LinkedHashMap();
        map.put("key1", "Value1");
        map.put("key1", "Value2");
        map.put("key1", "Value3");
        System.out.println(map.get("key1"));
    }
}
