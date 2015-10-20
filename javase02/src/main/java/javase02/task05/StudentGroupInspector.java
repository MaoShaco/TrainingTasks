package javase02.task05;

import javase02.task02.pattern.Repository;
import javase02.task05.education.groups.SubjectGroup;
import javase02.task05.education.positinons.Student;
import javase02.task05.education.subjects.DoubleMark;
import javase02.task05.education.subjects.IntegerMark;
import javase02.task05.education.subjects.Mark;
import javase02.task05.education.subjects.Subject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public class StudentGroupInspector {
    public static void main(String[] args) {

        List<SubjectGroup> ls = new Vector<SubjectGroup>();

        SubjectGroup a = new SubjectGroup(Subject.ideology, new Mark<Long>().getClass());
        SubjectGroup d = new SubjectGroup(Subject.ideology, DoubleMark.class);

        ls.add(a);
        ls.add(d);
        Repository<Student> studentRepository = new Repository<Student>();
        studentRepository.add(new Student("Vadimka", "Gleif"));
        studentRepository.add(new Student("Vadimka", "Drugoi"));
        studentRepository.add(new Student("Vadimka", "Pugaet"));
        ls.get(0).enrollStudent(studentRepository.get(0), new Mark<Long>(5l));
        ls.get(0).enrollStudent(studentRepository.get(1), new Mark<Double>(5.7));
        ls.get(1).enrollStudent(studentRepository.get(2), new DoubleMark(5.5));

        for (Object student : ls.get(0).getStudentList()) {
            System.out.println(student);
        }

        System.out.println();

    }
}
