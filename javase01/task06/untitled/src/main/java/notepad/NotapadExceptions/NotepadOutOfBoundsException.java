package notepad.NotapadExceptions;

/**
 * Created by Mao Shaco on 10/9/2015.
 */
public class NotepadOutOfBoundsException extends NotepadException {
    public NotepadOutOfBoundsException() {
        super("Index out of bounds Exception");
    }

    public NotepadOutOfBoundsException(int index) {
        super("Couldn't edit/delete note " + index + " isn't exist");
    }

}
