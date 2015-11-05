package javase04.task04.moviesCatalog;

import javase04.task04.moviesCatalog.movieRoles.Actor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mao Shaco on 11/1/2015.
 */
public class Movie implements Serializable {
    private String name;
    private int year;
    private String country;
    private List<Actor> actorList;

    public Movie(String name, int year, String country) {
        this.name = name;
        this.year = year;
        this.country = country;
        this.actorList = new ArrayList<Actor>();
    }

    public List<Actor> getActorList() {
        return actorList;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", actorList=" + actorList +
                '}';
    }
}
