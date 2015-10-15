package task02.chancellery.stationery.Products.paper.OfficePaper;

import task02.chancellery.stationery.Products.paper.PaperItem;

import javax.swing.*;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class PaperPack extends PaperItem {

    private PaperFormat paperFormat;

    private int count;

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

    public PaperPack takeSheets(int count) {
        if (count < 1 && count > this.count)
            throw new IllegalArgumentException();
        this.count -= count;
        return new PaperPack(getProducer(), getCost(), getPaperDensity(), getPaperFormat(), count);
    }

    private class Converter {
        Sizes getFormatSizes(PaperFormat paperFormat) {

            switch (paperFormat) {
                case A2:
                    return new Sizes(594, 420);
                case A4:
                    return new Sizes(297, 210);
                default:
                    return new Sizes(297, 210);
            }

        }
    }

    private class Sizes {

        private double length;
        private double width;

        public Sizes(double length, double width) {
            this.length = length;
            this.width = width;
        }
    }
}
