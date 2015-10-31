package javase04.task02;

import javase04.task01.util.JavaKeywordDictionary;
import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * Created by Mao Shaco on 10/31/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Writer out = new FileWriter("KeyWordsCountSymbolLike.txt");
        Reader in = new FileReader("Main.java");

        try {
            IOUtils.write(JavaKeywordDictionary.getKeywordCount(IOUtils.toString(in)).toString(), out);
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
    }
}
