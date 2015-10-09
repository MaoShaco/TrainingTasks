package notepad.NotapadExceptions;

/**
 * Created by Mao Shaco on 10/9/2015.
 */

/**
 * Abstract class for prototyping Exceptions which could be thrown by notepad {@link notepad.Notepad}
 * Extends Exception {@link Exception}
 */
public abstract class NotepadException extends Exception {
    /**
     * Prototype Creating new instance of NotepadException
     *
     * @param reason string value for output the reason of NotepadException
     */
    public NotepadException(String reason) {
        super(reason);
    }
}
