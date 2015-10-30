package javase04.task01;

import org.apache.axis2.util.JavaUtils;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Mao Shaco on 10/31/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello task 01");
        InputStream in = new URL( "http://commons.apache.org" ).openStream();
        try {
            System.out.println( IOUtils.toString( in ) );
        } finally {
            IOUtils.closeQuietly(in);
        }
        System.out.println(JavaUtils.isJavaKeyword("true1"));
    }
}
