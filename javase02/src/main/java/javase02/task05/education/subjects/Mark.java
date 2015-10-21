package javase02.task05.education.subjects;

/**
 * Created by Mao Shaco on 10/20/2015.
 */
public class Mark<Type extends Number> implements Comparable<Mark> {

    private Type markField;

    public Mark() {
    }

    public Type getMarkField() {
        return markField;
    }

    public Mark(Type markField) {
        this.markField = markField;
    }

    @Override
    public String toString() {
        return "Mark {" +
                "markField = " + markField.toString() +
                '}';
    }

    public int compareTo(Mark o) {
        return Double.compare(o.markField.doubleValue(), this.markField.doubleValue());
    }
}
