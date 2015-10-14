package javase02.task01.pen;


/**
 * Created by Mao Shaco on 10/14/2015.
 */


public class Pen {
    private PenCase penCase;
    private Rod rod;

    public Pen() {
        this.penCase = new PenCase();
        this.rod = new Rod();
    }

    public Pen(CaseMaterial caseMaterial, RodColor rodColor) {
        this.penCase = new PenCase(caseMaterial);
        this.rod = new Rod(rodColor);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class PenCase {
    private CaseMaterial CaseMaterial;

    public PenCase() {
        this.CaseMaterial = CaseMaterial.Plastic;
    }

    public PenCase(CaseMaterial caseMaterial) {
        this.CaseMaterial = caseMaterial;
    }
}

class Rod {
    private RodColor rodColor;

    public Rod() {
        this.rodColor = RodColor.Blue;
    }

    public Rod(RodColor rodColor) {
        this.rodColor = rodColor;
    }
}
