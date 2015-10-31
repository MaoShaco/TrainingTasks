Кирилица
package javase02.task05;

import javase02.task02.employee.FullName.FullName;
import javase02.task02.employee.FullName.FullNameModifier;
import javase02.task02.pattern.Repository;
import javase02.task05.education.groups.SubjectGroup;
import javase02.task05.education.positinons.Student;
import javase02.task05.education.subjects.DoubleMark;
import javase02.task05.education.subjects.IntegerMark;
import javase02.task05.education.subjects.Subject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public class StudentGroupInspector {
    public static void main(String[] args) {

        List<SubjectGroup> ls = new Vector();
        ls.add(new SubjectGroup(Subject.ideology));
        ls.add(new SubjectGroup(Subject.mathematics));

        Repository<Student> studentRepository = new Repository<Student>();
        studentRepository.add(new Student("Vadimka", "Gleif"));
        studentRepository.add(new Student("Vadimka", "Drugoi"));
        studentRepository.add(new Student("Vadimka", "Pugaet"));
        studentRepository.edit(studentRepository.get(0), new FullNameModifier(new FullName("Andrei", "Nekrashevich")));

        ls.get(0).enrollStudent(studentRepository.get(0), new DoubleMark(9.0));
        ls.get(1).enrollStudent(studentRepository.get(0), new IntegerMark(10));

        studentRepository.showCollection(System.out);

        /*for (Object student : ls.get(0).getStudentList()) {
            System.out.println(student);
        }*/

        System.out.println();

    }
}
