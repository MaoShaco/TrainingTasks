package task02.chancellery.stationery.products.wrting.hullable.marker;

import task02.chancellery.stationery.products.wrting.hullable.HullMaterial;
import task02.chancellery.stationery.products.wrting.hullable.WritingHull;

import java.awt.*;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Marker  extends WritingHull{
    private String markerType;
    public Marker(String producer, double cost, Color color, HullMaterial hullMaterial, String markerType) {
        super(producer, cost, color, hullMaterial);
        this.markerType = markerType;
    }
}
