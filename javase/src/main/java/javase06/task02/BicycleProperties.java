package javase06.task02;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/11/2015.
 */
public class BicycleProperties {

    public Map<String, String> loadPropsInMap(InputStream inputStream) throws IOException {
        Map<String, String> propertyMap = new HashMap<>();
        String[] buff = IOUtils.toString(inputStream).split("\n");

        for (String string : buff) {

            if (!string.contains("=")) {
                propertyMap.put(string, null);
                continue;
            }

            String[] sd = string.split("=");
            propertyMap.put(sd[0].trim(), sd[1].trim());
        }

        return propertyMap;
    }
}
