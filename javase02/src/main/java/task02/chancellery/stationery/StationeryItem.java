package task02.chancellery.stationery;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public abstract class StationeryItem {

    private String producer;
    private double cost;

    public StationeryItem() {
        this.producer = "DefaultProducer";
        this.cost = 0;
    }

    public StationeryItem(String producer, double cost) {
        this.producer = producer;
        this.cost = cost;
    }

    public String getProducer() {
        return producer;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "producer='" + producer + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StationeryItem)) return false;

        StationeryItem that = (StationeryItem) o;

        if (Double.compare(that.cost, cost) != 0) return false;
        return !(producer != null ? !producer.equals(that.producer) : that.producer != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = producer != null ? producer.hashCode() : 0;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
