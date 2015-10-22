package javase03.task01.dataTypes;

/**
 * Created by Mao Shaco on 10/23/2015.
 */
public class Log<Type> {
    private Type logField;

    public Type getLogField() {
        return logField;
    }

    public Log(Type logField) {
        this.logField = logField;
    }

    @Override
    public String toString() {
        return "Log{" +
                logField.toString() +
                '}';
    }
}
