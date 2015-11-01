package javase04.task04.moviesCatalog.movieRoles.FullName;

import java.io.Serializable;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class FullName implements Serializable {
    private String name;
    private String surName;

    public FullName(){}

    public FullName(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {

        return surName;
    }
    public void rename(String name, String surName){
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "FullName {" +
                getName() +
                " " + getSurName() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FullName)) return false;

        FullName fullName = (FullName) o;

        if (name != null ? !name.equals(fullName.name) : fullName.name != null) return false;
        return !(surName != null ? !surName.equals(fullName.surName) : fullName.surName != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surName != null ? surName.hashCode() : 0);
        return result;
    }
}
