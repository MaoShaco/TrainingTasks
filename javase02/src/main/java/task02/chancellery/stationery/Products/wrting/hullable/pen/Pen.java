package task02.chancellery.stationery.products.wrting.hullable.pen;

import task02.chancellery.stationery.products.wrting.WritingColor;
import task02.chancellery.stationery.products.wrting.hullable.HullMaterial;
import task02.chancellery.stationery.products.wrting.hullable.WritingHull;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Pen extends WritingHull {
    private PenMechanism penMechanism;

    public Pen() {
        super();
        this.penMechanism = PenMechanism.Automatic;
    }

    public Pen(String producer, double cost, WritingColor color, HullMaterial hullMaterial, PenMechanism penMechanism) {
        super(producer, cost, color, hullMaterial);
        this.penMechanism = penMechanism;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "penMechanism=" + penMechanism + '\'' +
                super.toString();
    }
}
