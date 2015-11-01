package javase04.task04.moviesCatalog.movieRoles;

import javase04.task04.moviesCatalog.movieRoles.FullName.FullName;

import java.io.Serializable;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public abstract class Person implements Serializable {
    FullName fullName;

    public Person(){}
    public FullName getFullName() {
        return fullName;
    }

    public Person(String name, String surName) {
        this.fullName = new FullName(name, surName);
    }
}
