package note;

/**
 * Created by Mao Shaco on 10/4/2015.
 */

/**
 * Class for saving data in String value with property
 * <b>NoteField</b>.
 * Extends Note {@link Note}
 */
public class SimpleNote extends Note<String> {

    /**
     * Creating new instance of Note
     *
     * @param noteField in String value with information for property NoteField
     * @see SimpleNote#SimpleNote(String)
     */
    public SimpleNote(String noteField) {
        super(noteField);
    }
}
