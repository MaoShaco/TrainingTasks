package javase04.task04.moviesCatalog.movieRoles;

import javase04.task04.moviesCatalog.movieRoles.FullName.FullName;

import java.io.Serializable;

/**
 * Created by Mao Shaco on 11/1/2015.
 */
public class Actor extends Person implements Serializable {

    public Actor(){}
    public Actor(String name, String surName) {
        super(name, surName);
    }

    @Override
    public String toString() {
        return this.fullName.toString();
    }
}
