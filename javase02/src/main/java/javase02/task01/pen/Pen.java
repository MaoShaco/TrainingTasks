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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;

        Pen pen = (Pen) o;

        if (penCase != null ? !penCase.equals(pen.penCase) : pen.penCase != null) return false;
        return !(rod != null ? !rod.equals(pen.rod) : pen.rod != null);

    }

    @Override
    public int hashCode() {
        int result = penCase != null ? penCase.hashCode() : 0;
        result = 31 * result + (rod != null ? rod.hashCode() : 0);
        return result;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PenCase)) return false;

        PenCase penCase = (PenCase) o;

        return CaseMaterial == penCase.CaseMaterial;

    }

    @Override
    public int hashCode() {
        return CaseMaterial != null ? CaseMaterial.hashCode() : 0;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rod)) return false;

        Rod rod = (Rod) o;

        return rodColor == rod.rodColor;

    }

    @Override
    public int hashCode() {
        return rodColor != null ? rodColor.hashCode() : 0;
    }
}
