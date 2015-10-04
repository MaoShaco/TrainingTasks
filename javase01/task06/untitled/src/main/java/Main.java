import note.SimpleNote;
import notepad.Notepad;
import notepad.SimpleNotepad;

/**
 * Created by Mao Shaco on 10/4/2015.
 */
public class Main {
    public static void main(String[] args){
        Notepad notepad = new SimpleNotepad(3);
        notepad.addNote(new SimpleNote("1"));
        notepad.addNote(new SimpleNote("2"));
        notepad.addNote(new SimpleNote("3"));
        notepad.addNote(new SimpleNote("4"));
        notepad.editNote(2, new SimpleNote("11124"));
        notepad.deleteNote(3);
        notepad.showNotes();
    }
}
