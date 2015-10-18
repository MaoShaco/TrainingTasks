package javase02.task02.chancellery.stationery.products.wrting.hullable.pen.correction;


import javase02.task02.chancellery.stationery.products.wrting.WritingColor;
import javase02.task02.chancellery.stationery.products.wrting.hullable.HullMaterial;
import javase02.task02.chancellery.stationery.products.wrting.hullable.pen.Pen;
import javase02.task02.chancellery.stationery.products.wrting.hullable.pen.PenMechanism;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class CorrectionPen extends Pen {

    public CorrectionPen() {
        this("Correction Pen", 100, 1);
    }

    public CorrectionPen(String name, double cost, int amount) {
        super(name, cost, amount, WritingColor.WHITE, HullMaterial.Plastic, PenMechanism.Static);
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
