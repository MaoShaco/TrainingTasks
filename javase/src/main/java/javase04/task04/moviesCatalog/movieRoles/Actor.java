package javase04.task04.moviesCatalog.movieRoles;

import javase04.task04.moviesCatalog.movieRoles.FullName.FullName;

import java.io.Serializable;

/**
 * Created by Mao Shaco on 11/1/2015.
 */
public class Actor extends Person implements Serializable {
    public Actor() {
        this.fullName = new FullName();
    }

    public Actor(String name, String surName) {
        this.fullName = new FullName(name, surName);
    }

    public Actor(FullName fullName) {
        this(fullName.getName(), fullName.getSurName());
    }
}
