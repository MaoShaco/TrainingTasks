package task02.employee;

import task02.employee.FullName.FullName;
import task02.pattern.Repository;
import task02.chancellery.stationery.StationeryItem;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Employee {

    private FullName fullName;
    private Repository<StationeryItem> StationeryRepository;


    public FullName getFullName() {
        return fullName;
    }

    public Employee() {
        this.fullName = new FullName();
        StationeryRepository = new Repository();
    }

    public Employee(String name, String surName) {
        this();
        this.fullName = new FullName(name, surName);
    }

    public Employee(String name, String surName, List<StationeryItem> stationeryItems) {
        this(name, surName);
        this.StationeryRepository = new Repository<StationeryItem>(stationeryItems);
    }

    public Employee(FullName fullName) {
        this(fullName.getName(), fullName.getSurName());
    }

    public void addStationeryItem(StationeryItem stationeryItem) {
        this.StationeryRepository.add(stationeryItem);
    }

    public void removeStationeryItem(StationeryItem stationeryItem) {
        this.StationeryRepository.remove(stationeryItem);
    }

    public void removeStationeryItem(int itemId) {
        this.StationeryRepository.remove(itemId);
    }

    public StationeryItem getStationeryItem(StationeryItem stationeryItem) {
        return this.StationeryRepository.get(stationeryItem);
    }

    public StationeryItem getStationeryItem(int itemId) {
        return this.StationeryRepository.get(itemId);
    }

    public void showStationeryItems(PrintStream outputStream) {
        this.StationeryRepository.showCollection(outputStream);
    }

    @Override
    public String toString() {
        return "Employee {" +
                getFullName() +
                '}';
    }

}
