package javase02.task07.vehicle.annotation;

import java.lang.annotation.*;

/**
 * Created by Mao Shaco on 10/21/2015.
 */
@Documented
@Inherited
@Target(value = ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface AtomicBoatSummary {
    String type() default "unknown";

    double speed() default 0;

}
