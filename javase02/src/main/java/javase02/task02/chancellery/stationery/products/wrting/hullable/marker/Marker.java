package javase02.task02.chancellery.stationery.products.wrting.hullable.marker;

import javase02.task02.chancellery.stationery.products.wrting.WritingColor;
import javase02.task02.chancellery.stationery.products.wrting.hullable.HullMaterial;
import javase02.task02.chancellery.stationery.products.wrting.hullable.WritingHull;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Marker extends WritingHull {
    public String getMarkerType() {
        return markerType;
    }

    private String markerType;

    public Marker() {
        this("Marker", 70, 1, WritingColor.BLACK, HullMaterial.Plastic, "for white board");
    }

    public Marker(String name, double cost, int amount, WritingColor color, HullMaterial hullMaterial, String markerType) {
        super(name, cost, amount, color, hullMaterial);
        this.markerType = markerType;
    }

    @Override
    public String toString() {
        return getName() +
                "{ cost = " + getCostPerItem() +
                ", amount = " + getAmount() +
                ", color = " + getColor() +
                ", hullMaterial = " + getHullMaterial() +
                ", markerType = " + getMarkerType() +
                " }";
    }
}
