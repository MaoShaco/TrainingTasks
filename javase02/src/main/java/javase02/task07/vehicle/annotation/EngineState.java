package javase02.task07.vehicle.annotation;

import java.lang.annotation.*;

/**
 * Created by Mao Shaco on 10/21/2015.
 */
@Inherited
@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface EngineState {
    boolean workable() default false;
}
