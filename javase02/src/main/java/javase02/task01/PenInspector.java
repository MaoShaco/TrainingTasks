package javase02.task01;

/**
 * Created by Mao Shaco on 10/14/2015.
 */

import javase02.task01.pen.CaseMaterial;
import javase02.task01.pen.Pen;
import javase02.task01.pen.RodColor;

public class PenInspector {


    public static void main(String[] args) {
        Pen a = new Pen(CaseMaterial.Metal, RodColor.Black);
        System.out.println(a.toString());
    }
}
