package com.sbt.misc;

import org.omg.CORBA.PERSIST_STORE;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Артем on 21.03.2017.
 */
public class Test {
    public static void main(String[] args) {
        // Ленивое сравнение - вычисляет до тех пор, пока не станет ясен результат всего выражения
        String test = null;
        if ((test == null) || test.startsWith("123")) {
            System.out.println("ok");
        }

        // Java 7 позволяет задавать число с подчеркиванием - для удобства
        long z = 123_334;
        System.out.println(Long.toString(z));

        // В тип byte не влезет больше 128
        // Переполнение не является exception - лишние биты выкидываются
        byte a = 100;
        byte b = 100;
        //byte c = a + b;
        byte d = (byte) (a + b);
        //byte b += a;

        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
        System.out.println(MICROS_PER_DAY);
        System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);

        System.out.println("=====INFINITY====");
        // Double и Float можно делить на 0
        System.out.println(-1D / 0);
        System.out.println(1F / 0);
        //System.out.println(1 / 0); // Exception

        // Infinity = Infinity
        float f1 = Float.POSITIVE_INFINITY;
        float f2 = Float.POSITIVE_INFINITY;
        if (f1 == f2) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

        // Обертки
        // У примитивных типов нет значения null, у объектов - есть
        System.out.println("====Обертки====");
        //Long sum = 0L;
        long sum = 0L;
        long start = System.nanoTime();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += 1L; // Операция для long работает гораздо быстрее, чем для Long
        }
        long end = System.nanoTime();
        System.out.println(sum);
        System.out.println((end - start) / 1000000);

        System.out.println("====NULLS====");
        if (null == null) {
            System.out.println("null == null");
        }
        if (null != null) {
            System.out.println("null != null");
        }

        Long a1 = 1L;
        Long a2 = 1L;
        if (a1 == a2) {
            System.out.println("1=1");
        }

        System.out.println("=====Person=====");
        Person jack = new Person(true, "Jack");
        Person tom = new Person(true, "Tom");
        Person sara = new Person(false, "Sara");
        Person kate = new Person(false, "Kate");

        System.out.println("jack+sara=" + jack.marry(sara));
        System.out.println("tom+kate=" + tom.marry(kate));
        System.out.println("jack+kate=" + jack.marry(kate));
        System.out.println("jack+tom=" + jack.marry(tom));

        System.out.println("=====Collections=====");
        ArrayList<Person> list = new ArrayList();
        list.add(jack);
        list.add(tom);
        list.add(sara);
        list.add(kate);

//        for (Person person : list) {
//            System.out.println(person.toString());
//        }

        list.forEach(e -> System.out.println(e.toString()));

    }
}
