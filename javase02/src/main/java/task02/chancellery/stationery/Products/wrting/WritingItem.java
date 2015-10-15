package task02.chancellery.stationery.products.wrting;

import task02.chancellery.stationery.StationeryItem;

import java.io.PrintStream;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class WritingItem extends StationeryItem {

    private WritingColor color;

    public WritingColor getColor() {
        return color;
    }
    public WritingItem(){
        super();
        this.color = WritingColor.BLUE;
    }

    public WritingItem(String producer, double cost, WritingColor color) {
        super(producer, cost);
        this.color = color;
    }

    public void writeString(String string, PrintStream outputStream) {
        outputStream.println(getColor().getAnsiColor() + string + WritingColor.RESET.getAnsiColor());
    }
}
