package javase02.task05.education.positinons;

import javase02.task05.education.subjects.Mark;
import javase02.task05.education.subjects.Subject;

import java.util.*;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public class Student extends Person {

    private Map<Subject, Mark> recordBook;

    public Student(String name, String surName) {
        super(name, surName);
        this.recordBook = new HashMap<Subject, Mark>();
    }

    public void enrollGroup(Subject subject, Mark mark) {
        this.recordBook.put(subject, mark);
    }

    public Mark<Number> getSubjectMark(Subject subject) {
        return this.recordBook.get(subject);
    }

    private List sortHashMapByValuesD(Map passedMap) {

        List list = new ArrayList(passedMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Subject, Mark>>() {
            public int compare(Map.Entry<Subject, Mark> o1, Map.Entry<Subject, Mark> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        return list;
    }

    public String getRecordBookFromBest() {
        return sortHashMapByValuesD(this.recordBook).toString();
    }

    @Override
    public String toString() {
        return "Student {" +
                getFullName() +
                getRecordBookFromBest() +
                '}';
    }
}
