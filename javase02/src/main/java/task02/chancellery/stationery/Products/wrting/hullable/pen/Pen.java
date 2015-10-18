package task02.chancellery.stationery.products.wrting.hullable.pen;

import task02.chancellery.stationery.products.wrting.WritingColor;
import task02.chancellery.stationery.products.wrting.hullable.HullMaterial;
import task02.chancellery.stationery.products.wrting.hullable.WritingHull;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Pen extends WritingHull {
    public PenMechanism getPenMechanism() {
        return penMechanism;
    }

    private PenMechanism penMechanism;

    public Pen() {
        this("Pen", 25, 2, WritingColor.BLUE, HullMaterial.Plastic, PenMechanism.Automatic);
    }

    public Pen(String name, double cost, int amount, WritingColor color, HullMaterial hullMaterial, PenMechanism penMechanism) {
        super(name, cost, amount, color, hullMaterial);
        this.penMechanism = penMechanism;
    }

    @Override
    public String toString() {
        return getName() +
                "{ cost = " + getCostPerItem() +
                ", amount = " + getAmount() +
                ", color = " + getColor() +
                ", hullMaterial = " + getHullMaterial() +
                ", penMechanism = " + getPenMechanism() +
                " }";
    }
}
