package javase02.task05.education.subjects;

/**
 * Created by Mao Shaco on 10/20/2015.
 */
public class Mark<Type extends Number> {

    private Type markField;

    public Mark() {

    }

    public Type getMarkField() {
        return markField;
    }

    public Mark(Type markField) {
        this.markField = markField;
    }
}
