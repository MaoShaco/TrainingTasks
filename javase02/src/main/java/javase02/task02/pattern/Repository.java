package javase02.task02.pattern;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class Repository<Type> {
    private List<Type> Collection;

    public Repository() {
        Collection = new Vector<Type>();
    }

    public Repository(List<Type> collection) {
        Collection = collection;
    }

    public void add(Type object) {
        this.Collection.add(object);
    }

    public void remove(int id) {
        this.Collection.remove(id);
    }

    public void remove(Type object) {
        this.Collection.remove(object);
    }

    public Type get(int id) {
        return this.Collection.get(id);
    }

    public Type get(Type object) {
        return get(this.Collection.indexOf(object));
    }

    public List<Type> getAll() {
        return this.Collection;
    }

    public void edit(int id, Modifier modifier) {
        modifier.modify(this.Collection.get(id));
    }

    public void edit(Type object, Modifier modifier) {
        modifier.modify(get(object));
    }

    public void showCollection(PrintStream outputStream) {
        for (Type object : Collection) {
            outputStream.println(object.toString());
        }
    }
    public void sort(Comparator<Type> comparator){
        this.Collection.sort(comparator);
    }
}
