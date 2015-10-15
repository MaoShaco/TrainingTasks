package task02.chancellery.stationery.products.wrting.hullable;

import task02.chancellery.stationery.products.wrting.WritingItem;

import java.awt.*;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class WritingHull extends WritingItem {
    private HullMaterial hullMaterial;
    public WritingHull(String producer, double cost, Color color, HullMaterial hullMaterial) {
        super(producer, cost, color);
        this.hullMaterial = hullMaterial;
    }
}
