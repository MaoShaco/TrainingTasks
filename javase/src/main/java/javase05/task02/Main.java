package javase05.task02;

/**
 * Created by Mao Shaco on 11/8/2015.
 */
public class Main {
    public static void main(String[] args) {
        PropertyReader propsReader = new PropertyReader();

        System.out.println(propsReader.loadProperty("problem.properties"));

        System.out.println(propsReader.loadProperty(".\\src\\main\\resources\\example.properties"));

        System.out.println(propsReader.getValue("problem"));
        System.out.println(propsReader.getValue("superKey"));
        System.out.println(propsReader.getValue("key"));
        System.out.println(propsReader.getValue("megaKey"));
    }
}
