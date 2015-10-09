package notepad.NotapadExceptions;

/**
 * Created by Mao Shaco on 10/9/2015.
 */
public abstract class NotepadException extends Exception {
    public NotepadException(String reason) {
        super(reason);
    }
}
