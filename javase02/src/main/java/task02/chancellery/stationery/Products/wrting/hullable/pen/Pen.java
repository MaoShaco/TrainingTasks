package task02.chancellery.stationery.products.wrting.hullable.pen;

import task02.chancellery.stationery.products.wrting.hullable.HullMaterial;
import task02.chancellery.stationery.products.wrting.hullable.WritingHull;

import java.awt.*;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Pen extends WritingHull {
    private PenMechanism penMechanism;
    public Pen(String producer, double cost, Color color, HullMaterial hullMaterial, PenMechanism penMechanism) {
        super(producer, cost, color, hullMaterial);
        this.penMechanism = penMechanism;
    }
}
