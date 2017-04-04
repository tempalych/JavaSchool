package com.sbt.generics;

/**
 * Created by artem on 04.04.17.
 */
public class Box<T> {  // T - параметр типа
    /*
      E - элемент
      K - key
      V - value
      T - standart type
    */
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T getT() {

        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
