package com.sbt.misc;

import java.util.*;

/**
 * Created by artem on 25.03.17.
 */
public class CollectionsHomeWork {
    public static void main(String[] args) {
        mostPopularWord();
        //sortedSet();
    }

    public static void mostPopularWord(){
        String text = "Sebastian Vettel is a German Formula One racing driver currently driving for Red Bull Racing";
        System.out.println(text);
        Set<String> set = new TreeSet<>();
        String[] strArr = text.toLowerCase().split(" ");

        int[] indexes = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (set.contains(strArr[i]))
            {
                indexes[i] ++;
            }
            else
            {
                set.add(strArr[i]);
            }
        }
        Arrays.sort(indexes);
        System.out.println(strArr[indexes.length-1]);

    }
}
