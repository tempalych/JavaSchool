package com.sbt.generics;

/**
 * Created by artem on 04.04.17.
 */
public class Utils {
    public static InvokeResult<Integer> ReturnInteger() {
        return new InvokeResult<>(1);
    }

    public static InvokeResult<String> ReturnString() {
        return new InvokeResult<>("MyStr");
    }

    public static <U> void paramEnvoke(U myParam) {
        System.out.println(myParam.toString());
    }

    public static <U extends Number> void paramEnvokeBounded(U myParam) {
        System.out.println(myParam.toString());
    }

    public static <U extends ClientStorage & Persistable> U getPersistableClient(U persistableClient){
        return persistableClient;
    }
}
