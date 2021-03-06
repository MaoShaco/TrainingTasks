package javase02.task02.chancellery.stationery.products.wrting;

import javase02.task02.chancellery.stationery.StationeryItem;

import java.io.PrintStream;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class WritingItem extends StationeryItem {

    private WritingColor color;

    public WritingColor getColor() {
        return color;
    }

    public WritingItem(String name, double cost, int amount, WritingColor color) {
        super(name, cost, amount);
        this.color = color;
    }

    public void writeString(String string, PrintStream outputStream) {
        outputStream.println(getColor().getAnsiColor() + string + WritingColor.RESET.getAnsiColor());
    }
}
