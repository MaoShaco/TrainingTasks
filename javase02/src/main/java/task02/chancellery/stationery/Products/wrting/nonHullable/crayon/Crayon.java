package task02.chancellery.stationery.products.wrting.nonHullable.crayon;

import task02.chancellery.stationery.products.wrting.WritingColor;
import task02.chancellery.stationery.products.wrting.WritingItem;

import java.util.Arrays;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Crayon extends WritingItem {
    private String[] possibleSurfaces;

    public Crayon() {
        super();
        this.possibleSurfaces = new String[]{"Board", "Wall"};
    }

    public Crayon(String producer, double cost, WritingColor color, String[] possibleSurface) {
        super(producer, cost, color);
        this.possibleSurfaces = possibleSurface;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Crayon{" +
                "possibleSurfaces=" + Arrays.toString(possibleSurfaces) +
                super.toString();
    }
}
