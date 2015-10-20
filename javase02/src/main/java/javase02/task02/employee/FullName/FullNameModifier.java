package javase02.task02.employee.FullName;

import javase02.task02.pattern.Modifier;
import javase02.task05.education.positinons.Person;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class FullNameModifier implements Modifier<Person> {

    private FullName fullName;

    public FullNameModifier(FullName fullName) {
        this.fullName = fullName;
    }

    public void modify(Person person) {
        person.getFullName().rename(fullName.getName(), fullName.getSurName());
    }
}
