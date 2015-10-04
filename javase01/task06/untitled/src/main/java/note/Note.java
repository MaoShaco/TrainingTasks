package note;

/**
 * Created by Mao Shaco on 10/4/2015.
 */
public abstract class Note<Type> {

    protected Type NoteField;

    public Note(Type noteField) {
        this.NoteField = noteField;
    }

    public Type getNoteField() {
        return NoteField;
    }
}
