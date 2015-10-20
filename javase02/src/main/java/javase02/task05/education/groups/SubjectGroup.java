package javase02.task05.education.groups;

import javase02.task05.education.positinons.Student;
import javase02.task05.education.subjects.Mark;
import javase02.task05.education.subjects.Subject;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Mao Shaco on 10/20/2015.
 */
public class SubjectGroup<Type extends Mark> {

    private Subject subject;
    private Set<Student> studentList;
    private Class<?> markClass;

    public SubjectGroup(Subject subject, Class<? extends Mark> markClass) {
        this.markClass = markClass;
        this.subject = subject;
        this.studentList = new HashSet<Student>();
    }

    public void enrollStudent(Student student, Mark mark){
        if(!mark.getClass().equals(markClass))
            throw new ClassCastException();

        student.enrollGroup(subject, mark);
        this.studentList.add(student);
    }

    public Set<Student> getStudentList() {
        return studentList;
    }
    public Subject getSubject() {
        return subject;
    }

}
