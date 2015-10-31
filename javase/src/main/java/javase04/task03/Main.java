package javase04.task03;

import org.apache.commons.io.IOUtils;

import java.io.*;

/**
 * Created by Mao Shaco on 10/31/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        OutputStream out = new FileOutputStream("UTF8-UTF16.txt");
        InputStream in = new FileInputStream("Main.java");

        try {
            IOUtils.write(IOUtils.toString(in,"UTF-8"), out, "UTF-16");
        } finally {
            IOUtils.closeQuietly(in);
            IOUtils.closeQuietly(out);
        }
    }
}
