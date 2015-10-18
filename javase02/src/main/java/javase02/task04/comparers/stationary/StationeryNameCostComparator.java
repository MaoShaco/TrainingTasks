package javase02.task04.comparers.stationary;

import javase02.task02.chancellery.stationery.StationeryItem;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public class StationeryNameCostComparator implements StationeryComparator {
    public int compare(StationeryItem stationeryItemA, StationeryItem stationeryItemB) {
        /*if (stationeryItemA.getName().compareTo(stationeryItemB.getName()) != 0)
            return stationeryItemA.getName().compareTo(stationeryItemB.getName());
        else
            return Double.compare(stationeryItemA.getCostPerItem(), stationeryItemB.getCostPerItem());*/
        return stationeryItemA.getName().compareTo(stationeryItemB.getName()) != 0 ?
                stationeryItemA.getName().compareTo(stationeryItemB.getName()) :
                Double.compare(stationeryItemA.getCostPerItem(), stationeryItemB.getCostPerItem());
    }
}
