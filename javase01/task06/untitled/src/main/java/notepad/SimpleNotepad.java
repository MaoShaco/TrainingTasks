package notepad;

import note.Note;
import note.SimpleNote;
import notepad.NotapadExceptions.NotepadOutOfBoundsException;
import notepad.NotapadExceptions.NotepadOverflowException;

import java.io.*;

/**
 * Created by Mao Shaco on 10/4/2015.
 */
public class SimpleNotepad implements Notepad {

    private boolean DynamicNotepad = true;
    private Note[] _notes;

    public SimpleNotepad() {
        int defaultSize = 20;
        _notes = new Note[defaultSize];
    }

    public SimpleNotepad(int size) {
        DynamicNotepad = false;
        _notes = new SimpleNote[size];

    }

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

    public void deleteNote(int index) throws NotepadOutOfBoundsException {
        if (!isRightBounds(index))
            throw new NotepadOutOfBoundsException(index);
        _notes[index - 1] = null;
        _notes = moveNotes(index);
    }

    public void editNote(int index, Note note) throws NotepadOutOfBoundsException {
        if (!isRightBounds(index))
            throw new NotepadOutOfBoundsException(index);
        _notes[index - 1] = null;
        _notes[index - 1] = note;
    }

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
