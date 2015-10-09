package notepad.NotapadExceptions;

/**
 * Created by Mao Shaco on 10/9/2015.
 */

/**
 * Class throw NotepadException which could be thrown by notepad {@link notepad.Notepad}
 * Extends NotepadException {@link NotepadException}
 */
public class NotepadOverflowException extends NotepadException {

    /**
     * Creating new instance of Note
     *
     * @see NotepadOverflowException#NotepadOverflowException()
     * @see NotepadOverflowException#NotepadOverflowException(int)
     */

    /**
     * Creating new instance of NotepadOverflowException
     * with default reason
     */
    public NotepadOverflowException() {
        super("All notes are filled");
    }

    /**
     * Create new instance of NotepadOverflowException
     *
     * @param notepadSize bound of notepad which tried be overflowed
     */
    public NotepadOverflowException(int notepadSize) {
        super("Notepad is full " + notepadSize + " notes are filled");
    }
}
