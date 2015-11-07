package javase05.task02;

import java.io.*;
import java.util.Properties;

/**
 * Created by Mao Shaco on 11/8/2015.
 */
public class PropertyReader {
    private Properties props = new Properties();

    public String loadProperty(String propsFilePath) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(propsFilePath)))) {

            props.load(bis);
            return "Property file loaded successfully with PropertyReader";

        } catch (FileNotFoundException e) {
            return "Property file not loaded with PropertyReader " + e.getMessage();
        } catch (IOException e) {
            return "IO exception in PropertyReader appeared " + e.getMessage();
        }
    }

    public String getValue(String key) {

        try {
            if (!props.containsKey(key)) {
                System.err.println(String.format("Key <%s> not found", key));
            }
            return props.getProperty(key);

        } catch (IllegalArgumentException e) {
            System.err.println(String.format("Such key <%s> is undefined for this properties", key));
        }
        return null;
    }

}
