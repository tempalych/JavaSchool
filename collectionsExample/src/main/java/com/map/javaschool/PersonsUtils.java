package com.map.javaschool;

import java.util.Date;
import java.util.List;

/**
 * Created by artem on 28.03.17.
 */
public class PersonsUtils {
    public static Integer getPersonsCount(List<Person> personList){

        personList.add(new Person("Yanis", new Date()));
        return personList.size();
    }
}
