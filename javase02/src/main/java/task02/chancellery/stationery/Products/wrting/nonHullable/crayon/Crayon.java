package task02.chancellery.stationery.products.wrting.nonHullable.crayon;

import task02.chancellery.stationery.products.wrting.WritingItem;

import java.awt.*;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Crayon extends WritingItem {
    private String[] possibleSurfaces;

    public Crayon(String producer, double cost, Color color, String[] possibleSurface) {
        super(producer, cost, color);
        this.possibleSurfaces = possibleSurface;
    }
}
