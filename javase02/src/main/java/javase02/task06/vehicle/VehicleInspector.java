package javase02.task06.vehicle;

import javase02.task07.vehicle.annotation.AtomicBoatSummary;

import java.lang.annotation.Annotation;
import java.util.Arrays;

/**
 * Created by Mao Shaco on 10/21/2015.
 */
public class VehicleInspector {
    public static void main(String[] args) {

        Class<?> annotationBoat;
        try {
            annotationBoat = Class.forName("javase02.task06.vehicle.AtomicBoat");

            if (!(annotationBoat.isAnnotationPresent(AtomicBoatSummary.class))) {
                System.out.println("");
                return;
            }

            Annotation[] annotations = annotationBoat.getAnnotations();

            AtomicBoat atomicBoat = new AtomicBoat();

            System.out.println(atomicBoat.getState() + "\n" + Arrays.toString(annotations));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
