package javase04.task03;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by Mao Shaco on 10/31/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        OutputStream ous = new FileOutputStream("UTF8-UTF16.txt");
        OutputStreamWriter out = new OutputStreamWriter(ous, Charset.forName("UTF-16"));

        Reader in = new FileReader("Main.java");

        try {
            IOUtils.write(IOUtils.toString(in), out);
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
    }
}
