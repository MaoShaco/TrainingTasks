package task02.chancellery.stationery.products.wrting.hullable.pen.corrector;


import task02.chancellery.stationery.products.wrting.WritingColor;
import task02.chancellery.stationery.products.wrting.hullable.HullMaterial;
import task02.chancellery.stationery.products.wrting.hullable.pen.Pen;
import task02.chancellery.stationery.products.wrting.hullable.pen.PenMechanism;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class CorrectionPen extends Pen {

    public CorrectionPen() {
        super("DefaultProducer", 0, WritingColor.WHITE, HullMaterial.Plastic, PenMechanism.Static);
    }

    public CorrectionPen(String producer, double cost) {
        super(producer, cost, WritingColor.WHITE, HullMaterial.Plastic, PenMechanism.Static);
    }

    @Override
    public String toString() {
        return "Correction" +
                super.toString();
    }
}
