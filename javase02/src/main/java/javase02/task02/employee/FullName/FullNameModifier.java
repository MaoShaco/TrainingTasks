package javase02.task02.employee.FullName;

import javase02.task02.employee.Employee;
import javase02.task02.pattern.Modifier;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class FullNameModifier implements Modifier<Employee> {

    private FullName fullName;

    public FullNameModifier(FullName fullName){
        this.fullName = fullName;
    }
    public Employee modify(Employee employee) {
        return new Employee(this.fullName, employee.getStationeryRepository());
    }
}
