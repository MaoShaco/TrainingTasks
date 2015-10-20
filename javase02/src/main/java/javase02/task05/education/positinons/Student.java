package javase02.task05.education.positinons;

import javase02.task02.employee.FullName.FullName;

import javase02.task05.education.subjects.Mark;
import javase02.task05.education.subjects.Subject;

import java.util.*;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public class Student extends Person {

    private Map<Subject, Mark> recordBook;

    public Student() {
    }

    public Student(String name, String surName) {
        super(name, surName);
    }

    public Student(FullName fullName) {
        super(fullName);
    }

    public void enrollGroup(Subject subject,  Mark mark) {
        if (recordBook == null)
            this.recordBook = new HashMap<Subject, Mark>();
        this.recordBook.put(subject, mark);
    }

    public Mark<Number> getSubjectMark(Subject subject) {
        return this.recordBook.get(subject);
    }

    @Override
    public String toString() {
        return "Student {" +
                getFullName() +
                '}';
    }
}
