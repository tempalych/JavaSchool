package com.sbt.generics;

/**
 * Created by artem on 04.04.17.
 */
public class OrderPair<K,V> implements Pair<K,V> {
    private K key;
    private V value;

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;

    }

    public OrderPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

}
