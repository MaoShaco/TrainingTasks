package javase02.task02.employee;

import javase02.task02.employee.FullName.FullName;
import javase02.task02.pattern.Repository;
import javase02.task02.chancellery.stationery.StationeryItem;
import javase02.task05.education.positinons.Person;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Employee extends Person {

    private Repository<StationeryItem> stationeryItemRepository;

    public List<StationeryItem> getStationeryItemRepository() {
        return stationeryItemRepository.getAll();
    }

    public Employee() {
        stationeryItemRepository = new Repository<StationeryItem>();
    }

    public Employee(List<StationeryItem> stationeryItems) {
        super();
        stationeryItemRepository = new Repository<StationeryItem>(stationeryItems);
    }

    public Employee(String name, String surName) {
        super(name, surName);
        stationeryItemRepository = new Repository<StationeryItem>();
    }

    public Employee(FullName fullName) {
        this(fullName.getName(), fullName.getSurName());
    }

    public Employee(String name, String surName, List<StationeryItem> stationeryItems) {
        this(name, surName);
        this.stationeryItemRepository = new Repository<StationeryItem>(stationeryItems);
    }

    public Employee(FullName fullName, List<StationeryItem> stationeryItems) {
        this(fullName.getName(), fullName.getSurName(), stationeryItems);
    }

    public void showStationeryItems(PrintStream outputStream) {
        this.stationeryItemRepository.showCollection(outputStream);
    }

/*
    public void addStationeryItem(StationeryItem stationeryItem) {
        this.stationeryItemRepository.add(stationeryItem);
    }

    public void removeStationeryItem(StationeryItem stationeryItem) {
        this.stationeryItemRepository.remove(stationeryItem);
    }

    public void removeStationeryItem(int itemId) {
        this.stationeryItemRepository.remove(itemId);
    }

    public StationeryItem getStationeryItem(StationeryItem stationeryItem) {
        return this.stationeryItemRepository.get(stationeryItem);
    }

    public StationeryItem getStationeryItem(int itemId) {
        return this.stationeryItemRepository.get(itemId);
    }

    public void showStationeryItems(PrintStream outputStream) {
        this.stationeryItemRepository.showCollection(outputStream);
    }

    public void sortStationeryItems(Comparator<StationeryItem> comparator) {
        this.stationeryItemRepository.sort(comparator);
    }*/

    @Override
    public String toString() {
        return "Employee {" +
                getFullName() +
                '}';
    }

}
