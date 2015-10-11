package notepad.NotapadExceptions;

/**
 * Created by Mao Shaco on 10/9/2015.
 */

/**
 * Class throw NotepadException which could be thrown by notepad {@link notepad.Notepad}
 * Extends NotepadException {@link NotepadException}
 */
public class NotepadOutOfBoundsException extends NotepadException {
    /**
     * Creating new instance of NotepadOutOfBoundsException
     *
     * @see NotepadOutOfBoundsException#NotepadOutOfBoundsException()
     * @see NotepadOutOfBoundsException#NotepadOutOfBoundsException(int)
     */

    /**
     * Creating new instance of NotepadOutOfBoundsException
     * with default reason
     */
    public NotepadOutOfBoundsException() {
        super("Index out of bounds Exception");
    }

    /**
     * Create new instance of NotepadOutOfBoundsException
     *
     * @param index position of notepad which tried be changed
     */
    public NotepadOutOfBoundsException(int index) {
        super("Couldn't edit/delete note " + index + " isn't exist");
    }

}
