package javase02.task02.chancellery.stationery.products.corrector;

import javase02.task02.chancellery.stationery.StationeryItem;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Eraser extends StationeryItem {
    private double Rigidity;

    public Eraser() {
        this("Eraser", 15, 1, 0.4);
    }

    public Eraser(String producer, double cost, int amount, double rigidity) {
        super(producer, cost, amount);
        Rigidity = rigidity;
    }

    public double getRigidity() {
        return Rigidity;
    }

    @Override
    public String toString() {
        return getName() +
                "{ cost = " + getCostPerItem() +
                ", amount = " + getAmount() +
                ", rigidity = " + getRigidity() +
                " }";
    }
}
