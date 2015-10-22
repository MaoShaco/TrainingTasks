package javase03.task01.dataTypes;

/**
 * Created by Mao Shaco on 10/23/2015.
 */
public class DateMessageType {

    private static final String datePattern = "^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4} : ([0-9]|0[0-9]|1[0-9]|2[0-3])-[0-5][0-9]$";

    private String date = "";

    private String message;

    public DateMessageType(String date, String message) {
        if (!date.matches(datePattern))
            throw new ExceptionInInitializerError("wrong date format, pattern is " + datePattern);
        this.date = date;
        this.message = message;
    }

    public DateMessageType(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return date + " - " +
                message;
    }
}
