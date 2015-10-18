package javase02.task02.chancellery.stationery.products.wrting.nonHullable.crayon;

import javase02.task02.chancellery.stationery.products.wrting.WritingColor;
import javase02.task02.chancellery.stationery.products.wrting.WritingItem;

import java.util.Arrays;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Crayon extends WritingItem {
    public String[] getPossibleSurfaces() {
        return possibleSurfaces;
    }

    private String[] possibleSurfaces;

    public Crayon() {
        this("Crayon", 30.5, 1, WritingColor.WHITE, new String[]{"Board", "Wall"});
    }

    public Crayon(String name, double cost, int amount, WritingColor color, String[] possibleSurface) {
        super(name, cost, amount, color);
        this.possibleSurfaces = possibleSurface;
    }

    @Override
    public String toString() {
        return getName() +
                "{ cost = " + getCostPerItem() +
                ", amount = " + getAmount() +
                ", color = " + getColor() +
                ", possibleSurfaces = " + Arrays.toString(getPossibleSurfaces()) +
                " }";
    }

}
