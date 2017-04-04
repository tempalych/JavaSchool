package com.map.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by artem on 28.03.17.
 */
public class NaturalArray implements INaturalArray {

    final List<Integer> list;

    public NaturalArray() {
        list = new ArrayList<>();
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
