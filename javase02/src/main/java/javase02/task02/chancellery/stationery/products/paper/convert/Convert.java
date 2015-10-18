package javase02.task02.chancellery.stationery.products.paper.convert;

import javase02.task02.chancellery.stationery.products.paper.PaperItem;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Convert extends PaperItem {

    private ConvertFormat convertFormat;

    public Convert() {
        this("Convert", 10, 1, 80, ConvertFormat.C3);
    }

    public Convert(String name, double cost, int amount, double paperDensity, ConvertFormat convertFormat) {
        super(name, cost, amount, paperDensity);
        this.convertFormat = convertFormat;
    }

    public ConvertFormat getConvertFormat() {
        return convertFormat;
    }

    public double getLength() {
        return this.convertFormat.getLength();
    }

    public double getWidth() {
        return this.convertFormat.getWidth();
    }

    @Override
    public String toString() {
        return getName() +
                "{ cost = " + getCostPerItem() +
                ", amount = " + getAmount() +
                ", paperDensity = " + getPaperDensity() +
                ", convertFormat = " + getConvertFormat() +
                " }";
    }
}
