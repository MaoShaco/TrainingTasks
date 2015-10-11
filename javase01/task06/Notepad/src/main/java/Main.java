import note.SimpleNote;
import notepad.NotapadExceptions.NotepadException;
import notepad.Notepad;
import notepad.SimpleNotepad;

//import java.io.FileNotFoundException;

/**
 * Created by Mao Shaco on 10/4/2015.
 */
public class Main {
    public static void main(String[] args) /*throws FileNotFoundException*/ {
        Notepad notepad = new SimpleNotepad(3);

        //File file = new File("notepad.txt");
        //PrintStream writer = new PrintStream(file);

        try {
            notepad.addNote(new SimpleNote("1"));
            notepad.addNote(new SimpleNote("2"));
            notepad.addNote(new SimpleNote("3"));
            notepad.editNote(1, new SimpleNote("11124"));
            notepad.deleteNote(3);
            notepad.showNotes(System.out);

        } catch (NotepadException e) {
            e.printStackTrace();
        }


    }
}
