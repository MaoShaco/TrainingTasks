package javase02.task04.comparers.stationary;

import javase02.task02.chancellery.stationery.StationeryItem;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public class StationeryNameComparator implements StationeryComparator {
    public int compare(StationeryItem stationeryItemA, StationeryItem stationeryItemB) {
        return stationeryItemA.getName().compareTo(stationeryItemB.getName());
    }
}
