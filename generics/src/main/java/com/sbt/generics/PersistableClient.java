package com.sbt.generics;

/**
 * Created by artem on 04.04.17.
 */
public class PersistableClient implements Persistable, ClientStorage {

    private String name;

    @Override
    public void saveToDB() {
        System.out.println("Saved to Database");
    }

    public PersistableClient(String name) {
        this.name = name;
    }

    @Override
    public String getClient() {
        return name;
    }
}
