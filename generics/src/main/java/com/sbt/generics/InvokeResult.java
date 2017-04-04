package com.sbt.generics;

/**
 * Created by artem on 04.04.17.
 */
public class InvokeResult<T> {
    T t;
    Boolean invokeResult;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Boolean getInvokeResult() {
        return invokeResult;
    }

    public InvokeResult(T t) {
        this.t = t;
    }

    public void setInvokeResult(Boolean invokeResult) {

        this.invokeResult = invokeResult;
    }
}
