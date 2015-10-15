package task02.chancellery.stationery.products.paper.officePaper;

import task02.chancellery.stationery.products.paper.PaperFormat;
import task02.chancellery.stationery.products.paper.PaperItem;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class PaperPack extends PaperItem {

    private PaperFormat paperFormat;
    private int count;

    public PaperPack() {
        super();
        this.paperFormat = PaperFormat.A4;
        this.count = 500;
    }

    public PaperPack(String producer, double cost, double paperDensity, PaperFormat paperFormat, int count) {
        super(producer, cost, paperDensity);
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
        return new PaperPack(getProducer(), getCost(), getPaperDensity(), getPaperFormat(), count);
    }
}
