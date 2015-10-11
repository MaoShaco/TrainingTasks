package notepad;

import note.Note;
import note.SimpleNote;
import notepad.NotapadExceptions.NotepadOutOfBoundsException;
import notepad.NotapadExceptions.NotepadOverflowException;

import java.io.*;

/**
 * Created by Mao Shaco on 10/4/2015.
 */

/**
 * Class for saving data of Note type{@link Note}  with methods
 * <b>addNote</b>
 * <b>deleteNote</b>
 * <b>editNote</b>
 * <b>showNotes</b>
 * Implements Notepad {@link Notepad}
 */
public class SimpleNotepad implements Notepad {

    private boolean DynamicNotepad = true;
    private Note[] _notes;

    /**
     * Create new instance of Notepad
     *
     * @see SimpleNotepad#SimpleNotepad()
     * @see SimpleNotepad#SimpleNotepad(int)
     */
    /**
     * Create new instance of Notepad with Dynamic size
     */
    public SimpleNotepad() {
        int defaultSize = 20;
        _notes = new Note[defaultSize];
    }

    /**
     * Create static Notepad
     *
     * @param size amount of notes for notepad
     */
    public SimpleNotepad(int size) {
        DynamicNotepad = false;
        _notes = new SimpleNote[size];

    }

    /**
     * Add note to notepad
     * Throw NotepadOverflowException if notepad is static and all notes are filled
     *
     * @param newNote new note for notepad
     */
    public void addNote(Note newNote) throws NotepadOverflowException {
        for (int i = 0; i < _notes.length; i++) {
            if (_notes[i] == null) {
                _notes[i] = newNote;
                return;
            }
        }
        if (DynamicNotepad) {
            enlargeNotepad(_notes.length);
            addNote(newNote);
        }
        throw new NotepadOverflowException(_notes.length);
    }

    /**
     * Delete note at the position
     * Throw NotepadOutOfBoundsException if index for deleting out of notepad
     *
     * @param index position for deleting note
     */
    public void deleteNote(int index) throws NotepadOutOfBoundsException {
        if (!isRightBounds(index))
            throw new NotepadOutOfBoundsException(index);
        _notes[index - 1] = null;
        _notes = moveNotes(index);
    }

    /**
     * Replace new note on place of index note
     * Throw NotepadOutOfBoundsException if index for replacing out of notepad
     *
     * @param index index for replacing
     * @param note  new note for replacing
     */
    public void editNote(int index, Note note) throws NotepadOutOfBoundsException {
        if (!isRightBounds(index))
            throw new NotepadOutOfBoundsException(index);
        _notes[index - 1] = null;
        _notes[index - 1] = note;
    }

    /**
     * Output the structure of notepad (notes) into Stream
     *
     * @param outputStream stream for output
     */
    public void showNotes(PrintStream outputStream) {
        for (int i = 0; i < _notes.length; i++) {
            if (_notes[i] != null)
                outputStream.println((i + 1) + "\t" + _notes[i].getNoteField().toString());
        }
        outputStream.close();
    }

    private void enlargeNotepad(int size) {
        Note[] buffer = new SimpleNote[_notes.length];
        System.arraycopy(_notes, 0, buffer, 0, _notes.length);
        _notes = new SimpleNote[_notes.length + size + 1];
        System.arraycopy(buffer, 0, _notes, 0, buffer.length);
    }

    private Note[] moveNotes(int index) {
        Note[] copy = new SimpleNote[_notes.length];
        System.arraycopy(_notes, 0, copy, 0, index - 1);
        System.arraycopy(_notes, index, copy, index - 1, _notes.length - index);
        return copy;
    }

    private boolean isRightBounds(int index) {
        return index > 0 && index < _notes.length + 1;
    }
}
