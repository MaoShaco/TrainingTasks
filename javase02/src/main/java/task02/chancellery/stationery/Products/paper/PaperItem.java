package task02.chancellery.stationery.Products.paper;

import task02.chancellery.stationery.StationeryItem;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class PaperItem extends StationeryItem {

    private double paperDensity;

    public double getPaperDensity() {
        return paperDensity;
    }

    public PaperItem(String producer, double cost, double paperDensity) {
        super(producer, cost);
        this.paperDensity = paperDensity;
    }
}

