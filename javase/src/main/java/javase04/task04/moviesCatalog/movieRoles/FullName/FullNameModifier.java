package javase04.task04.moviesCatalog.movieRoles.FullName;

import javase04.task04.moviesCatalog.movieRoles.Person;
import javase04.task04.pattern.Modifier;

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
