package com.sbt.generics;

import javax.rmi.CORBA.Util;
import java.util.*;

/**
 * Created by artem on 04.04.17.
 */
public class MainGenerics {

    public static void main(String[] args) {

//        List list = new ArrayList();
//        list.add("STRING");
//
//        Integer s = (Integer)list.get(0);
//        System.out.println(s);

        Box<String> stringBox = new Box<String>("STRING"); // Box<String> - аргумент типа
        Map<String, Box<Integer>> map = new HashMap<>();


        Pair<String, Integer> pair = new OrderPair<>("Key", 0);
        Pair<Box<String>, String> stringPair = new OrderPair<>(new Box<>("StringKey"), "StringValue");

        InvokeResult<String> invokeResult = Utils.ReturnString();

        Utils.<Box<String>>paramEnvoke(new Box<String>("MyString"));

        List<Object> list = new ArrayList<>();
        list.add(new Integer(1));

        Utils.paramEnvokeBounded(1);

        Utils.getPersistableClient(new PersistableClient("Client 1"));
    }

}
