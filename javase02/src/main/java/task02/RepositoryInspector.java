package task02;

import task02.chancellery.stationery.BeginnerSet;
import task02.employee.Employee;
import task02.pattern.Repository;

/**
 * Created by Mao Shaco on 10/14/2015.
 */
public class RepositoryInspector {
    public static void main(String[] Args) {
        Repository<Employee> theTeam = new Repository();

        theTeam.add(new Employee("Vova", "Ivanov", new BeginnerSet().getBeginnerStationary()));
        theTeam.showCollection(System.out);
        theTeam.get(0).showStationeryItems(System.out);
    }
}
