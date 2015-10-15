package task02.chancellery.stationery.products.corrector;

import task02.chancellery.stationery.StationeryItem;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Eraser extends StationeryItem {
    private double Rigidity;

    public Eraser() {
        super();
        this.Rigidity = 0.4;
    }

    public Eraser(String producer, double cost, double rigidity) {
        super(producer, cost);
        Rigidity = rigidity;
    }

    public double getRigidity() {
        return Rigidity;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Eraser{" +
                "Rigidity=" + Rigidity +
                '}';
    }
}
