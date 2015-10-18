package task02.chancellery.stationery;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class StationeryItem {

    private String name;
    private double cost;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public StationeryItem(String name, double cost, int amount) {
        this.name = name;
        this.cost = cost;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getCostPerItem() {
        return cost;
    }

    @Override
    public abstract String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StationeryItem)) return false;

        StationeryItem that = (StationeryItem) o;

        if (Double.compare(that.cost, cost) != 0) return false;
        return !(name != null ? !name.equals(that.name) : that.name != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
