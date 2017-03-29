package com.map.homework;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by artem on 28.03.17.
 */
public class NaturalArray implements INaturalArray {

    List<Integer> list;

    public NaturalArray() {
        list = new ArrayList<Integer>();
    }

    @Override
    public boolean add(Integer value) {
        list.add(value);
        Collections.sort(list);
        return true;
    }

    @Override
    public Integer deleteMin() {
        if (list.size() > 0) {
            return list.remove(0);
        } else {
            return 0;
        }
    }
}
