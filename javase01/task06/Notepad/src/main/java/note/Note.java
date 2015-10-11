package note;

/**
 * Created by Mao Shaco on 10/4/2015.
 */

/**
 * Abstract class for prototyping Generic saving data with property
 * <b>NoteField</b>.
 */
public abstract class Note<Type> {
    /**
     * Property NoteField.
     */
    protected Type NoteField;

    /**
     * Prototype Creating new instance of Note
     *
     * @param noteField Field with information for property NoteField
     * @see Note#Note(Type)
     */
    public Note(Type noteField) {
        this.NoteField = noteField;
    }

    /**
     * Prototype Getter for NoteField
     * which could be set only using Constructor {@link Note#Note(Type) }
     *
     * @return Get field of property NoteField
     */
    public Type getNoteField() {
        return NoteField;
    }
}
