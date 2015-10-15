package task02;

import task02.chancellery.stationery.StationeryItem;
import task02.chancellery.stationery.products.corrector.Eraser;
import task02.chancellery.stationery.products.paper.officePaper.notebook.NoteBook;
import task02.chancellery.stationery.products.wrting.hullable.pen.Pen;
import task02.chancellery.stationery.products.wrting.hullable.pen.corrector.CorrectionPen;
import task02.employee.Employee;
import task02.pattern.Repository;

/**
 * Created by Mao Shaco on 10/14/2015.
 */
public class RepositoryInspector {
    public static void main(String[] Args) {
        Repository<Employee> theTeam = new Repository();
        theTeam.add(new Employee());
        theTeam.add(new Employee());
        theTeam.get(0).addStationeryItem(new Pen());
        theTeam.get(0).addStationeryItem(new CorrectionPen());
        theTeam.get(0).addStationeryItem(new NoteBook());
        theTeam.get(0).addStationeryItem(new Eraser());
        theTeam.get(0).showStationeryItems(System.out);
    }
}
