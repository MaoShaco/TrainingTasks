package notepad;

import note.Note;
import notepad.NotapadExceptions.NotepadOutOfBoundsException;
import notepad.NotapadExceptions.NotepadOverflowException;

import java.io.PrintStream;

/**
 * Created by Mao Shaco on 10/4/2015.
 */
public interface Notepad {
    void addNote(Note note) throws NotepadOverflowException;

    void deleteNote(int number) throws NotepadOutOfBoundsException;

    void editNote(int number, Note note) throws NotepadOutOfBoundsException;

    void showNotes(PrintStream outputStream);
}
