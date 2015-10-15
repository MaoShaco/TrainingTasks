package task02.chancellery.stationery;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class StationeryItem {
    private double cost;

    public StationeryItem(){
        this.cost = 0;
    }

    public StationeryItem(double cost){
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
