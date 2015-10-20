package javase02.task05;

import javase02.task02.pattern.Repository;
import javase02.task05.education.groups.GroupController;
import javase02.task05.education.groups.SubjectGroup;
import javase02.task05.education.positinons.Student;
import javase02.task05.education.subjects.DoubleMark;
import javase02.task05.education.subjects.IntegerMark;
import javase02.task05.education.subjects.Subject;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public class StudentGroupInspector {
    public static void main(String[] args) {
        GroupController<IntegerMark, DoubleMark> GC = new GroupController();

        SubjectGroup<IntegerMark> a = new SubjectGroup(Subject.ideology);

        Repository<Student> studentRepository = new Repository<Student>();
        studentRepository.add(new Student("Vadimka", "Gleif"));
        studentRepository.add(new Student("Vadimka", "Drugoi"));
        studentRepository.add(new Student("Vadimka", "Pugaet"));

        GC.addSubjectGroupA(a);
        GC.addStudent(Subject.ideology, studentRepository.get(2), new DoubleMark(5.0));
        GC.addStudent(Subject.ideology, studentRepository.get(0), new IntegerMark(5));
        GC.addStudent(Subject.ideology, studentRepository.get(1), new IntegerMark(5));

        System.out.println();

    }
}
