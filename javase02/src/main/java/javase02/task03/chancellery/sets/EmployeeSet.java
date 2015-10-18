package javase02.task03.chancellery.sets;

import java.util.List;

/**
 * Created by Mao Shaco on 10/18/2015.
 */
public interface EmployeeSet<Type> {
    List<Type> getSet();
    void addToSet(Type item);
}
