package task02.chancellery.stationery.products.wrting.hullable.marker;

import task02.chancellery.stationery.products.wrting.WritingColor;
import task02.chancellery.stationery.products.wrting.hullable.HullMaterial;
import task02.chancellery.stationery.products.wrting.hullable.WritingHull;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Marker extends WritingHull {
    private String markerType;

    public Marker() {
        super();
        this.markerType = "For metal";
    }

    public Marker(String producer, double cost, WritingColor color, HullMaterial hullMaterial, String markerType) {
        super(producer, cost, color, hullMaterial);
        this.markerType = markerType;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "markerType='" + markerType + '\'' +
                super.toString();
    }
}
