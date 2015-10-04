import java.util.List;
import java.util.Vector;

import static java.lang.Math.tan;

/**
 * Created by Mao Shaco on 10/4/2015.
 */
public class Main {
    public static void main(String[] args) {
        float a = 0;
        float b = 5;
        float h = 0.2f;
        doTaskAboutFunction(a, b, h);
    }

    private static void doTaskAboutFunction(float start, float end, float step) {
        float size = (end - start) / step;
        if (size == (int) size) {
            List argumentFunctionList = new Vector<Pair<Float, Float>>();
            doFunctionOnInterval(argumentFunctionList, start, end, step);
            showTable(argumentFunctionList);
        } else
            System.out.println("Bad step for such interval");
    }

    private static void showTable(List<Pair<Float, Float>> argumentFunctionList) {
        System.out.println("  X\t\t|\t  Y");
        for (Pair<Float, Float> duo : argumentFunctionList) {
            System.out.format("%.2f", duo.getLeft());
            System.out.print("\t|\t");
            System.out.format("%.2f%n", duo.getRight());
        }
    }

    private static void doFunctionOnInterval(List argumentFunctionList, float start, float end, float step) {
        for (float x = start; x < end; x += step)
            argumentFunctionList.add(new Pair<Float, Float>(x, returnFunctionY(x)));
    }

    private static float returnFunctionY(float x) {
        //f(x) = tx(2x) - 3;
        return (float) (tan(2 * x) - 3);
    }
}
