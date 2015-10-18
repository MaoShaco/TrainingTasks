package task02.chancellery.stationery.products.paper.officePaper.notebook;

import task02.chancellery.stationery.products.paper.PaperFormat;
import task02.chancellery.stationery.products.paper.officePaper.PaperPack;

/**
 * Created by Mao Shaco on 10/15/2015.
 */
public class NoteBook extends PaperPack {
    private String signature;
    private NotebookType notebookType;

    public NoteBook() {
        this("NoteBook", 20, 2, 80, PaperFormat.A5, 48, "<EPAM>", NotebookType.Cell);
    }

    public NoteBook(String name, double cost, int amount, double paperDensity, PaperFormat paperFormat, int count, String signature, NotebookType notebookType) {
        super(name, cost, amount, paperDensity, paperFormat, count);
        this.signature = signature;
        this.notebookType = notebookType;
    }

    public String getSignature() {
        return signature;
    }

    public NotebookType getNotebookType() {
        return notebookType;
    }

    @Override
    public String toString() {
        return getName() +
                "{ cost = " + getCostPerItem() +
                ", amount = " + getAmount() +
                ", paperDensity = " + getPaperDensity() +
                ", paperFormat = " + getPaperFormat() +
                ", countSheets = " + getCount() +
                ", signature = " + getSignature() +
                ", noteBookType = " + getNotebookType() +
                " }";
    }
}
