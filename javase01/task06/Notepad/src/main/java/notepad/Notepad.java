package notepad;

import note.Note;
import notepad.NotapadExceptions.NotepadOutOfBoundsException;
import notepad.NotapadExceptions.NotepadOverflowException;

import java.io.PrintStream;

/**
 * Created by Mao Shaco on 10/4/2015.
 */

/**
 * Interface for Notepad data of Note type{@link Note}  with methods
 * <b>addNote</b>
 * <b>deleteNote</b>
 * <b>editNote</b>
 * <b>showNotes</b>
 */
public interface Notepad {
    /**
     * Append Note to the end of notepad
     *
     * @param note note which will be added to notepad
     */
    void addNote(Note note) throws NotepadOverflowException;

    /**
     * Delete note at index position
     *
     * @param index position for deleting
     */
    void deleteNote(int index) throws NotepadOutOfBoundsException;

    /**
     * Replace new note on place of index note
     *
     * @param index index for replacing
     * @param note  new note for replacing
     */
    void editNote(int index, Note note) throws NotepadOutOfBoundsException;

    /**
     * Output the structure of notepad (notes) into Stream
     *
     * @param outputStream stream for output
     */
    void showNotes(PrintStream outputStream);
}
