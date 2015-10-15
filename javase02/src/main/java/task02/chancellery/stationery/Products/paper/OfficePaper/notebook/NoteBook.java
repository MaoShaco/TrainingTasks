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
        super();
        this.signature = "<EPAM>";
        this.notebookType = NotebookType.Cell;
    }

    public NoteBook(String producer, double cost, double paperDensity, PaperFormat paperFormat, int count, String signature, NotebookType notebookType) {
        super(producer, cost, paperDensity, paperFormat, count);
        this.signature = signature;
        this.notebookType = notebookType;
    }

    public String getSignature() {
        return signature;
    }

    public NotebookType getNotebookType() {
        return notebookType;
    }
}
