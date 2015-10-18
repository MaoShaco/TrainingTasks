package task02.chancellery.stationery.products.paper.convert;

import task02.chancellery.stationery.products.paper.PaperFormat;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public enum ConvertFormat {
    C5(162, 229),
    C4(229, 324),
    C3(324, 458);

    private final double length;
    private final double width;

    ConvertFormat(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
