package javase04.task04.moviesCatalog.movieRoles;

import javase04.task04.moviesCatalog.movieRoles.FullName.FullName;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public abstract class Person {
    FullName fullName;

    public FullName getFullName() {
        return fullName;
    }

    public Person() {
        this.fullName = new FullName();
    }

    public Person(String name, String surName) {
        this.fullName = new FullName(name, surName);
    }

    public Person(FullName fullName) {
        this(fullName.getName(), fullName.getSurName());
    }
}
