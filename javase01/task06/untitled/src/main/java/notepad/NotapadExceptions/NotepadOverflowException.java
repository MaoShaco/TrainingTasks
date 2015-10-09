package notepad.NotapadExceptions;

/**
 * Created by Mao Shaco on 10/9/2015.
 */
public class NotepadOverflowException extends NotepadException {

    public NotepadOverflowException() {
        super("All notes are filled");
    }

    public NotepadOverflowException(int notepadSize) {
        super("Notepad is full " + notepadSize + " notes are filled");
    }
}
