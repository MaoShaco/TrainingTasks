package javase04.task01.util;

import org.apache.axis2.util.JavaUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 10/31/2015.
 */
public class JavaKeywordDictionary {
    protected static String delims = "\\p{Punct}|\\p{Space}";

    public static Map<String, Integer> getKeywordCount(String text) {

        Map<String, Integer> keyCountDictionary = new HashMap<>();
        String[] subStrings = text.split(delims);
        for (String str : subStrings) {
            if (keyCountDictionary.containsKey(str))
                keyCountDictionary.put(str, keyCountDictionary.get(str) + 1);
            if (JavaUtils.isJavaKeyword(str))
                keyCountDictionary.putIfAbsent(str, 1);
        }
        return keyCountDictionary;
    }
}
