package task02.chancellery.stationery.products.paper.convert;

import task02.chancellery.stationery.products.paper.PaperItem;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Convert extends PaperItem {
    private ConvertFormat convertFormat;

    public Convert(String producer, double cost, double paperDensity, ConvertFormat convertFormat) {
        super(producer, cost, paperDensity);
        this.convertFormat = convertFormat;
    }

    public ConvertFormat getPaperFormat() {
        return convertFormat;
    }

    public double getLength() {
        return this.convertFormat.getLength();
    }

    public double getWidth() {
        return this.convertFormat.getWidth();
    }
}
