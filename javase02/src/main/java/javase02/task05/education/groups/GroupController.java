package javase02.task05.education.groups;

import javase02.task05.education.positinons.Student;
import javase02.task05.education.subjects.DoubleMark;
import javase02.task05.education.subjects.IntegerMark;
import javase02.task05.education.subjects.Mark;
import javase02.task05.education.subjects.Subject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 10/20/2015.
 */
public class GroupController<Type1 extends Number, Type2 extends Number> {
    
    private Map<Subject, SubjectGroup<Mark<Type1>>> type1Groups = new HashMap();
    private Map<Subject, SubjectGroup<Mark<Type2>>> type2Groups = new HashMap();

    public void addSubjectGroupA(SubjectGroup<Mark<Type1>> group) {
        this.type1Groups.put(group.getSubject(), group);
    }

    public void addSubjectGroupB(SubjectGroup<Mark<Type2>> group) {
        this.type2Groups.put(group.getSubject(), group);
    }

    public void addStudentA(Subject subject, Student student, Mark<Type1> mark) {
        type1Groups.get(subject).enrollStudent(student, mark);
    }

    public void addStudentB(Subject subject, Student student, Mark<Type2> mark) {
        type2Groups.get(subject).enrollStudent(student, mark);
    }
}
