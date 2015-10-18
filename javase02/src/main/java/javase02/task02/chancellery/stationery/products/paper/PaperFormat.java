package javase02.task02.chancellery.stationery.products.paper;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public enum PaperFormat {
    A5(210, 148),
    A4(297, 210),
    A2(594, 420);

    private final double length;
    private final double width;

    PaperFormat(double length, double width) {
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
