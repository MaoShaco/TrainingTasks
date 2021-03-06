package javase02.task02.chancellery.stationery.products.paper;

import javase02.task02.chancellery.stationery.StationeryItem;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class PaperItem extends StationeryItem {

    private double paperDensity;

    public double getPaperDensity() {
        return paperDensity;
    }

    public PaperItem(String producer, double cost, int amount, double paperDensity) {
        super(producer, cost, amount);
        this.paperDensity = paperDensity;
    }
}

