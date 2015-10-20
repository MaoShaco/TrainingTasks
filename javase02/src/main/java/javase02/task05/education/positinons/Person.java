package javase02.task05.education.positinons;

import javase02.task02.employee.FullName.FullName;

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
