package com.map.javaschool;

import java.util.*;

/**
 * Created by artem on 28.03.17.
 */
public class Main {
    public static void main(String[] args) {
//
//        List<String> stringList = new ArrayList<String>(Arrays.asList("2", "1"));
//        System.out.println(stringList);
//        Collections.sort(stringList);
//        System.out.println(stringList);

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("John Connor", new Date()));
        persons.add(new Person("Henry Ford", new Date()));
        persons.add(new Person("John Lennon", new Date()));

//        Collections.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

//        System.out.println(persons.toString());


        // Unmodifiable Collection
        //System.out.println(PersonsUtils.getPersonsCount(Collections.unmodifiableList(persons)));
        List<Person> newPersonList = new ArrayList(persons);

        newPersonList.toString();
    }

}
