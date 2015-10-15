package task02.chancellery.stationery.products.wrting;

import task02.chancellery.stationery.StationeryItem;

import java.awt.*;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class WritingItem extends StationeryItem {

    private Color color;

    public Color getColor() {
        return color;
    }

    public WritingItem(String producer, double cost, Color color) {
        super(producer, cost);
        this.color = color;
    }

}
