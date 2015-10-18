package javase02.task02;

import javase02.task02.chancellery.stationery.BeginnerSet;
import javase02.task02.employee.Employee;
import javase02.task02.employee.FullName.FullName;
import javase02.task02.employee.FullName.FullNameModifier;
import javase02.task02.pattern.Modifier;
import javase02.task02.pattern.Repository;

/**
 * Created by Mao Shaco on 10/14/2015.
 */
public class RepositoryInspector {
    public static void main(String[] Args) {
        Repository<Employee> theTeam = new Repository();

        theTeam.add(new Employee("Vova", "Ivanov", new BeginnerSet().getBeginnerStationary()));
        Modifier mod = new FullNameModifier(new FullName("Lesha", "Krikov"));
        theTeam.edit(0, mod);
        theTeam.showCollection(System.out);
        theTeam.get(0).showStationeryItems(System.out);
    }
}
