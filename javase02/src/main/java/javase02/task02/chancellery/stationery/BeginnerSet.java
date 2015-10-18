package javase02.task02.chancellery.stationery;

import javase02.task02.chancellery.stationery.products.corrector.Eraser;
import javase02.task02.chancellery.stationery.products.paper.officePaper.PaperPack;
import javase02.task02.chancellery.stationery.products.paper.officePaper.notebook.NoteBook;
import javase02.task02.chancellery.stationery.products.wrting.hullable.pen.Pen;
import javase02.task02.chancellery.stationery.products.wrting.hullable.pen.correction.CorrectionPen;
import javase02.task02.chancellery.stationery.products.wrting.nonHullable.crayon.Crayon;

import java.util.List;
import java.util.Vector;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public class BeginnerSet {
    private List<StationeryItem> beginnerStationary;

    public BeginnerSet() {
        this.beginnerStationary  = new Vector<StationeryItem>();
        this.beginnerStationary.add(new Pen());
        this.beginnerStationary.add(new CorrectionPen());
        this.beginnerStationary.add(new PaperPack());
        this.beginnerStationary.add(new Eraser());
        this.beginnerStationary.add(new NoteBook());
        this.beginnerStationary.add(new Crayon());
    }

    public List<StationeryItem> getBeginnerStationary() {
        return beginnerStationary;
    }

}
