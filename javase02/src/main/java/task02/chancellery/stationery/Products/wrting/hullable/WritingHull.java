package task02.chancellery.stationery.products.wrting.hullable;

import task02.chancellery.stationery.products.wrting.WritingColor;
import task02.chancellery.stationery.products.wrting.WritingItem;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class WritingHull extends WritingItem {
    public HullMaterial getHullMaterial() {
        return hullMaterial;
    }

    private HullMaterial hullMaterial;

    public WritingHull(String name, double cost, int amount, WritingColor color, HullMaterial hullMaterial) {
        super(name, cost, amount, color);
        this.hullMaterial = hullMaterial;
    }
}
