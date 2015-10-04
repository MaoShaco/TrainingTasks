package notepad;

import note.Note;

/**
 * Created by Mao Shaco on 10/4/2015.
 */
public interface Notepad {
    void addNote(Note note);
    void deleteNote(int number);
    void editNote(int number, Note note);
    void showNotes();
}
