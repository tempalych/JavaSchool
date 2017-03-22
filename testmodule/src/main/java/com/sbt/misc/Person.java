package com.sbt.misc;

/**
 * Created by artem on 22.03.17.
 */
public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {
        if (this.man != person.man) {
            if (this.spouse != null) {
                this.divorce();
            }
            if (person.spouse != null) {
                person.divorce();
            }
            this.spouse = person;
            person.spouse = this;
            return true;
        } else {
            return false;
        }
    }

    public boolean divorce() {
        Person oldSpouse = this.spouse;
        this.spouse.spouse = null;
        this.spouse = null;
        return oldSpouse != this.spouse;
    }

    public String toString() {
        String spouseName;
        if (this.spouse != null) {
            spouseName = this.spouse.name;
        } else {
            spouseName = "No :(";
        }
        return "Name:" + this.name + "; Spouse: " + spouseName;
    }

}
