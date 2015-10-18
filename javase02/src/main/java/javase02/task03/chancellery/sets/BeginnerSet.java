package javase02.task03.chancellery.sets;

import javase02.task02.chancellery.stationery.StationeryItem;
import javase02.task02.chancellery.stationery.products.paper.officePaper.notebook.NoteBook;
import javase02.task02.chancellery.stationery.products.wrting.hullable.pen.Pen;

import java.util.List;
import java.util.Vector;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public class BeginnerSet implements EmployeeSet<StationeryItem> {
    private List<StationeryItem> beginnerStationary;

    public BeginnerSet() {
        this.beginnerStationary = new Vector<StationeryItem>();
        this.beginnerStationary.add(new Pen());
        this.beginnerStationary.add(new NoteBook());
    }

    public List<StationeryItem> getSet() {
        return beginnerStationary;
    }

    public void addToSet(StationeryItem item) {
        this.beginnerStationary.add(item);
    }

}
