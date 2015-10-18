package javase02.task02.chancellery.stationery.products.paper.officePaper;

import javase02.task02.chancellery.stationery.products.paper.PaperFormat;
import javase02.task02.chancellery.stationery.products.paper.PaperItem;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class PaperPack extends PaperItem {

    private PaperFormat paperFormat;
    private int count;

    public PaperPack() {
        this("Paper Pack", 200, 1, 80, PaperFormat.A4, 500);
    }

    public PaperPack(String name, double cost, int amount, double paperDensity, PaperFormat paperFormat, int count) {
        super(name, cost, amount, paperDensity);
        this.paperFormat = paperFormat;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public PaperFormat getPaperFormat() {
        return paperFormat;
    }

    public double getLength() {
        return this.paperFormat.getLength();
    }

    public double getWidth() {
        return this.paperFormat.getWidth();
    }

    public PaperPack getSheets(int count) {
        if (count < 1 || count > this.count)
            throw new IllegalArgumentException();
        this.count -= count;
        return new PaperPack(getName(), getCostPerItem(), 1, getPaperDensity(), getPaperFormat(), count);
    }

    @Override
    public String toString() {
        return getName() +
                "{ cost = " + getCostPerItem() +
                ", amount = " + getAmount() +
                ", paperDensity = " + getPaperDensity() +
                ", paperFormat = " + getPaperFormat() +
                ", countSheets = " + getCount() +
                " }";
    }
}
