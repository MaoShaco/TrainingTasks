package notepad;

import note.Note;
import note.SimpleNote;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by Mao Shaco on 10/4/2015.
 */
public class SimpleNotepad implements Notepad {

    private Note[] _notes;

    public SimpleNotepad(int size) {
        _notes = new SimpleNote[size];
    }

    public void addNote(Note newNote) {
        for (int i = 0; i < _notes.length; i++) {
            if (_notes[i] == null) {
                _notes[i] = newNote;
                return;
            }
        }
        enlargeNotepad(_notes.length);
        addNote(newNote);
    }

    public void deleteNote(int index) {
        _notes[index - 1] = null;
        _notes = moveNotes(index);
    }

    public void editNote(int index, Note note) {
        _notes[index - 1] = null;
        _notes[index - 1] = note;
    }

    public void showNotes() {
        for (int i = 0; i < _notes.length; i++) {
            if (_notes[i] != null)
                System.out.println((i + 1) + "\t" + _notes[i].getNoteField());
        }
    }

    private void enlargeNotepad(int size) {
        Note[] buffer = new SimpleNote[_notes.length];
        System.arraycopy(_notes, 0, buffer, 0, _notes.length);
        _notes = new SimpleNote[_notes.length + size + 1];
        System.arraycopy(buffer, 0, _notes, 0, buffer.length);
    }

    private Note[] moveNotes(int index){
        Note[] copy = new SimpleNote[_notes.length];
        System.arraycopy(_notes, 0, copy, 0, index-1);
        System.arraycopy(_notes, index, copy, index-1, _notes.length-index-2);
        return copy;
    }
}
