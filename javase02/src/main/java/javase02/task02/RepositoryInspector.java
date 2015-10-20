package javase02.task02;

import javase02.task02.chancellery.stationery.products.wrting.WritingColor;
import javase02.task02.chancellery.stationery.products.wrting.hullable.HullMaterial;
import javase02.task02.chancellery.stationery.products.wrting.hullable.pen.Pen;
import javase02.task02.chancellery.stationery.products.wrting.hullable.pen.PenMechanism;
import javase02.task02.employee.Employee;
import javase02.task02.employee.FullName.FullName;
import javase02.task02.employee.FullName.FullNameModifier;
import javase02.task02.pattern.Modifier;
import javase02.task02.pattern.Repository;
import javase02.task03.chancellery.sets.BeginnerSet;
import javase02.task03.chancellery.sets.EmployeeSet;
import javase02.task04.comparers.stationary.StationeryComparator;
import javase02.task04.comparers.stationary.StationeryNameCostComparator;

/**
 * Created by Mao Shaco on 10/14/2015.
 */
public class RepositoryInspector {
    public static void main(String[] Args) {
        Repository<Employee> theTeam = new Repository();

        EmployeeSet beginnerStationery = new BeginnerSet();
        beginnerStationery.addToSet(new Pen("Pen", 20, 2, WritingColor.BLACK, HullMaterial.Plastic, PenMechanism.Static));
        theTeam.add(new Employee("Vova", "Ivanov", beginnerStationery.getSet()));
        Modifier mod = new FullNameModifier(new FullName("Lesha", "Krikov"));
        theTeam.edit(0, mod);
        StationeryComparator stationeryComparator = new StationeryNameCostComparator();
        theTeam.get(0).getStationeryItemRepository().sort(stationeryComparator);
        theTeam.showCollection(System.out);
        theTeam.get(0).showStationeryItems(System.out);
    }
}
